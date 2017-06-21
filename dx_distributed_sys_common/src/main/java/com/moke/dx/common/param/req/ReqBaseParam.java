package com.moke.dx.common.param.req;

/**
 * Created by moke on 6/8/17.
 */
public class ReqBaseParam {

  private String accessToken;

  private String timeStamp;

  private String clientType;

  private String clientChannel;

  private String clientVer;

  private String deviceType;

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  public String getClientType() {
    return clientType;
  }

  public void setClientType(String clientType) {
    this.clientType = clientType;
  }

  public String getClientChannel() {
    return clientChannel;
  }

  public void setClientChannel(String clientChannel) {
    this.clientChannel = clientChannel;
  }

  public String getClientVer() {
    return clientVer;
  }

  public void setClientVer(String clientVer) {
    this.clientVer = clientVer;
  }

}
