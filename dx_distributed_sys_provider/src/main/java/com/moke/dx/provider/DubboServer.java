package com.moke.dx.provider;

import com.alibaba.dubbo.container.Main;

/**
 * Created by moke on 6/16/17.
 */
public class DubboServer {

  public void startUp(String args[]) {

    try {
      // 1. Start monitor config file
//            ConfigFileWatcher.start();

      // 2. Register server hook
            registerServerHook();

      // 3. Start Dubbo.Main
      Main.main(args);

    } catch (Throwable ex) {
      System.out.println("[DUBBOSERVER]  failed to start dubboserver...");
      ex.printStackTrace();
      System.out.close(); // flush log buffer to stout.log
      System.err.close(); // flush log buffer to stderr.log
      System.exit(-1);
    }
  }

  private void registerServerHook() {
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        try {
          // 1. Stop server
          System.out.println("[DubboServer] taserver stopped successfully.");

        } catch (Exception ex) {
          ex.printStackTrace();
          System.out.println("The exception occured at stopping taserver...");
        }
      }
    });
  }

}
