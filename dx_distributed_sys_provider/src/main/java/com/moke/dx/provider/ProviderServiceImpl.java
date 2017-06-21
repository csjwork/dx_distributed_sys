package com.moke.dx.provider;

import com.moke.dx.common.pojo.req.ReqBasePojo;
import com.moke.dx.common.pojo.resp.RespBasePojo;
import com.moke.dx.service.firstcenter.IFirstService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * Created by moke on 6/14/17.
 */
@Service
public class ProviderServiceImpl implements IFirstService {

  @Override
  public RespBasePojo welcomeUserService(ReqBasePojo reqBasePojo) {

    RespBasePojo respBasePojo = new RespBasePojo();
    if (reqBasePojo != null && StringUtils.isNotEmpty(reqBasePojo.getAccessToken()) && StringUtils
        .isNotEmpty(reqBasePojo.getTimeStamp())) {

      respBasePojo.setStateCode("88888");
      respBasePojo.setStateMsg("success");
    } else {
      respBasePojo.setStateCode("50000");
      respBasePojo.setStateMsg("fail");
    }

    return respBasePojo;
  }

  @Override
  public RespBasePojo indexService(ReqBasePojo reqBasePojo) {
    RespBasePojo respBasePojo = new RespBasePojo();

    respBasePojo.setStateCode("0");
    respBasePojo.setStateMsg("java distributed as dubbox success");

    return respBasePojo;
  }
}
