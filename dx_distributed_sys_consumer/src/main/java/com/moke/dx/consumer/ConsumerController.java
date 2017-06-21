package com.moke.dx.consumer;

import com.moke.dx.common.param.req.ReqBaseParam;
import com.moke.dx.common.param.resp.RespBaseParam;
import com.moke.dx.common.pojo.req.ReqBasePojo;
import com.moke.dx.common.pojo.resp.RespBasePojo;
import com.moke.dx.service.firstcenter.IFirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by moke on 6/14/17.
 */
@Controller
@RequestMapping(value = {"/","/mi/consumer"})
public class ConsumerController {

  @Autowired
  private IFirstService iFirstService;

  @RequestMapping(value = {"/","/index"}, method = {RequestMethod.POST,RequestMethod.GET})
  @ResponseBody
  public RespBaseParam index(ReqBaseParam reqBaseParam) {
    RespBaseParam respBaseParam = new RespBaseParam();

    ReqBasePojo reqBasePojo = new ReqBasePojo();
    RespBasePojo respBasePojo = iFirstService.indexService(reqBasePojo);

    respBaseParam.setStateCode(respBasePojo.getStateCode());
    respBaseParam.setStateMsg(respBasePojo.getStateMsg());
    respBaseParam.setData("dubbox");

    return respBaseParam;
  }


  @RequestMapping(value = "/welcome", method = {RequestMethod.POST})
  @ResponseBody
  public RespBaseParam welcomeUser(ReqBaseParam reqBaseParam) {

    RespBaseParam respBaseParam = new RespBaseParam();

    ReqBasePojo reqBasePojo = new ReqBasePojo();

    reqBasePojo.setAccessToken(reqBaseParam.getAccessToken());
    reqBasePojo.setTimeStamp(reqBaseParam.getTimeStamp());

    RespBasePojo respBasePojo = iFirstService.welcomeUserService(reqBasePojo);

    respBaseParam.setStateCode(respBasePojo.getStateCode());
    respBaseParam.setStateMsg(respBasePojo.getStateMsg());
    respBaseParam.setData("welcome vava");

    return respBaseParam;

  }
}
