package com.moke.dx.common.param.resp;

import java.util.HashMap;

/**
 * Created by moke on 6/8/17.
 */
public class RespBaseParam {

    private String stateCode = "0";

    private String stateMsg = "成功";

    private Object data = new HashMap<String, Object>();

    public String getStateCode() {

        return stateCode;
    }

    public void setStateCode(String stateCode) {

        this.stateCode = stateCode;
    }

    public String getStateMsg() {

        return stateMsg;
    }

    public void setStateMsg(String stateMsg) {
        this.stateMsg = stateMsg;
    }

    public Object getData() {

        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
