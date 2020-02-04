package com.ssk.haoke.center.ad.api.query;

import com.dtyunxi.rest.RestResponse;
import com.ssk.haoke.center.ad.api.dto.request.AdReqDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import com.github.pagehelper.PageInfo;

/**
* 广告表服务接口
*
* @author 代码生成器
*/
@Api(tags = {"广告表服务"})
@FeignClient(name = "${haoke.center.ad.name:haoke-center-ad}", path = "/v1/ad", url = "${haoke.center.ad.api:}")
public interface IAdQueryApi {

    /**
    * 根据id查询广告表
    *
    * @param id 广告表id
    * @return   广告表数据
    */
    @GetMapping("/{id}")
    @ApiOperation(value = "根据id查询广告表", notes = "根据id查询广告表")
    RestResponse<AdReqDto> queryById(@PathVariable("id") Long id);

    /**
    * 广告表分页数据
    *
    * @param filter   广告表查询条件
    * @param pageNum  当前页
    * @param pageSize 页大小
    * @return 广告表分页数据
    */
    @GetMapping("/page")
    @ApiOperation(value = "广告表分页数据", notes = "根据filter查询条件查询广告表数据，filter=AdReqDto")
    RestResponse<PageInfo<AdReqDto>> queryByPage(@RequestParam("filter") String filter,
                                                           @RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                                           @RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize);

}
