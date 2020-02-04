package com.ssk.haoke.center.ad.svr.rest;

import com.dtyunxi.rest.RestResponse;
import com.ssk.haoke.center.ad.api.IAdApi;
import com.ssk.haoke.center.ad.api.dto.request.AdReqDto;
import com.ssk.haoke.center.ad.api.query.IAdQueryApi;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
* 广告表Rest类
*
* @author 代码生成器
*/
@RestController
@RequestMapping("/v1/ad")
public class AdRest implements IAdApi,IAdQueryApi {

    @Resource
    private IAdApi adApi;
    @Resource
    private IAdQueryApi adQueryApi;

    @Override
    public RestResponse<Long> addAd(@RequestBody AdReqDto addReqDto) {
        return adApi.addAd(addReqDto);
    }

    @Override
    public RestResponse<Void> modifyAd(@RequestBody AdReqDto modifyReqDto) {
        return adApi.modifyAd(modifyReqDto);
    }

    @Override
    public RestResponse<Void> removeAd(@PathVariable("ids") String ids,
                                          @RequestParam("instanceId") Long instanceId) {
        return adApi.removeAd(ids, instanceId);
    }

    @Override
    public RestResponse<AdReqDto> queryById(@PathVariable("id") Long id) {
        return adQueryApi.queryById(id);
    }

    @Override
    public RestResponse<PageInfo<AdReqDto>> queryByPage(@RequestParam("filter") String filter,
                                                           @RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                                           @RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
        return adQueryApi.queryByPage(filter, pageNum, pageSize);
    }


}