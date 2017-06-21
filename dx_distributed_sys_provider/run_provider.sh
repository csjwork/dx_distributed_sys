#!/bin/bash
# 	running service shell
#		2014/02/02

# app home
APP_HOME="/data/project/my/dubbox/dubbox_distributed/dx_distributed_sys/dx_distributed_sys_provider/target/dx_distributed_sys_provider"

# main class
APP_MAINCLASS="com.maowu.service.Provider"

# classpath
CLASSPATH=$APP_HOME/classes
for i in "$APP_HOME"/lib/*.jar; do
   CLASSPATH="$CLASSPATH":"$i"
done
