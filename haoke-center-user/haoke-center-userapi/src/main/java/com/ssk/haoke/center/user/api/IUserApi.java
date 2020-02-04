package com.ssk.haoke.center.user.api;

import com.dtyunxi.rest.RestResponse;
import com.ssk.haoke.center.user.api.dto.request.UserReqDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

/**
* 服务接口
*
* @author 代码生成器
*/
@Api(tags = {"服务"})
@FeignClient(name = "${haoke.center.user.name:haoke-center-user}", path = "/v1/user", url = "${haoke.center.user.api:}")
public interface IUserApi {

    /**
    * 新增
    *
    * @param addReqDto 请求对象
    * @return 处理结果
    */
    @PostMapping("")
    @ApiOperation(value = "新增", notes = "新增")
    RestResponse<Long> addUser(@RequestBody UserReqDto addReqDto);

    /**
    * 修改
    *
    * @param modifyReqDto 请求对象
    * @return 处理结果
    */
    @PutMapping("")
    @ApiOperation(value = "修改", notes = "修改")
    RestResponse<Void> modifyUser(@RequestBody UserReqDto modifyReqDto);

    /**
    * 删除
    *
    * @param ids        删除数据ID
    * @param instanceId 实例ID
    * @return 处理结果
    */
    @DeleteMapping("/{ids}")
    @ApiOperation(value = "删除", notes = "删除")
    RestResponse<Void> removeUser(@PathVariable("ids") String ids,
                                          @RequestParam("instanceId") Long instanceId);
}
