package com.moke.dx.service.firstcenter;

import com.moke.dx.common.pojo.req.ReqBasePojo;
import com.moke.dx.common.pojo.resp.RespBasePojo;

/**
 * Created by moke on 6/8/17.
 */
public interface IFirstService {

    RespBasePojo welcomeUserService(ReqBasePojo reqBasePojo);

    RespBasePojo indexService(ReqBasePojo reqBasePojo);
}
