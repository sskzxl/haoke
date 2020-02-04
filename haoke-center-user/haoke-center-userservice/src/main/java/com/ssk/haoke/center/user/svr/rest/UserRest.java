package com.ssk.haoke.center.user.svr.rest;

import com.dtyunxi.rest.RestResponse;
import com.ssk.haoke.center.user.api.IUserApi;
import com.ssk.haoke.center.user.api.dto.request.UserReqDto;
import com.ssk.haoke.center.user.api.query.IUserQueryApi;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
* Rest类
*
* @author 代码生成器
*/
@RestController
@RequestMapping("/v1/user")
public class UserRest implements IUserApi,IUserQueryApi {

    @Resource
    private IUserApi userApi;
    @Resource
    private IUserQueryApi userQueryApi;

    @Override
    public RestResponse<Long> addUser(@RequestBody UserReqDto addReqDto) {
        return userApi.addUser(addReqDto);
    }

    @Override
    public RestResponse<Void> modifyUser(@RequestBody UserReqDto modifyReqDto) {
        return userApi.modifyUser(modifyReqDto);
    }

    @Override
    public RestResponse<Void> removeUser(@PathVariable("ids") String ids,
                                          @RequestParam("instanceId") Long instanceId) {
        return userApi.removeUser(ids, instanceId);
    }

    @Override
    public RestResponse<UserReqDto> queryById(@PathVariable("id") Long id) {
        return userQueryApi.queryById(id);
    }

    @Override
    public RestResponse<PageInfo<UserReqDto>> queryByPage(@RequestParam("filter") String filter,
                                                           @RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                                           @RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
        return userQueryApi.queryByPage(filter, pageNum, pageSize);
    }


}