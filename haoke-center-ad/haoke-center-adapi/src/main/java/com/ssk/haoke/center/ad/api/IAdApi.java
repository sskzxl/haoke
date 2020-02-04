package com.ssk.haoke.center.ad.api;

import com.dtyunxi.rest.RestResponse;
import com.ssk.haoke.center.ad.api.dto.request.AdReqDto;
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
* 广告表服务接口
*
* @author 代码生成器
*/
@Api(tags = {"广告表服务"})
@FeignClient(name = "${haoke.center.ad.name:haoke-center-ad}", path = "/v1/ad", url = "${haoke.center.ad.api:}")
public interface IAdApi {

    /**
    * 新增广告表
    *
    * @param addReqDto 广告表请求对象
    * @return 处理结果
    */
    @PostMapping("")
    @ApiOperation(value = "新增广告表", notes = "新增广告表")
    RestResponse<Long> addAd(@RequestBody AdReqDto addReqDto);

    /**
    * 修改广告表
    *
    * @param modifyReqDto 广告表请求对象
    * @return 处理结果
    */
    @PutMapping("")
    @ApiOperation(value = "修改广告表", notes = "修改广告表")
    RestResponse<Void> modifyAd(@RequestBody AdReqDto modifyReqDto);

    /**
    * 删除广告表
    *
    * @param ids        广告表删除数据ID
    * @param instanceId 实例ID
    * @return 处理结果
    */
    @DeleteMapping("/{ids}")
    @ApiOperation(value = "删除广告表", notes = "删除广告表")
    RestResponse<Void> removeAd(@PathVariable("ids") String ids,
                                          @RequestParam("instanceId") Long instanceId);
}
