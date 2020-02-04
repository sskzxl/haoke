package com.ssk.haoke.center.user.biz.apiimpl;

import org.springframework.stereotype.Service;
import com.ssk.haoke.center.user.api.IUserApi;
import com.ssk.haoke.center.user.biz.service.IUserService;
import javax.annotation.Resource;
import com.dtyunxi.rest.RestResponse;
import com.ssk.haoke.center.user.api.dto.request.UserReqDto;

/**
* 服务实现类
*
* @author 代码生成器
*/
@Service
public class UserApiImpl implements IUserApi {

    @Resource
    private IUserService userService;

    @Override
    public RestResponse<Long> addUser(UserReqDto addReqDto) {
        return new RestResponse(userService.addUser(addReqDto));
    }

    @Override
    public RestResponse<Void> modifyUser(UserReqDto modifyReqDto) {
        userService.modifyUser(modifyReqDto);
        return RestResponse.VOID;
    }

    @Override
    public RestResponse<Void> removeUser(String ids,
                                                 Long instanceId) {
        userService.removeUser(ids, instanceId);
        return RestResponse.VOID;
    }
}
