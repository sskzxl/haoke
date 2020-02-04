package com.ssk.haoke.center.user.biz.apiimpl.query;

import org.springframework.stereotype.Service;
import com.ssk.haoke.center.user.api.query.IUserQueryApi;
import com.ssk.haoke.center.user.biz.service.IUserService;
import javax.annotation.Resource;
import com.ssk.haoke.center.user.api.dto.request.UserReqDto;
import com.dtyunxi.rest.RestResponse;
import com.github.pagehelper.PageInfo;

/**
* 服务实现类
*
* @author 代码生成器
*/
@Service
public class UserQueryApiImpl implements IUserQueryApi {

    @Resource
    private IUserService userService;

    @Override
    public RestResponse<UserReqDto> queryById(Long id){
        return new RestResponse(userService.queryById(id));
    }

    @Override
    public RestResponse<PageInfo<UserReqDto>> queryByPage(String filter,
                                                                  Integer pageNum,
                                                                  Integer pageSize){
        return new RestResponse(userService.queryByPage(filter, pageNum, pageSize));
    }

}
