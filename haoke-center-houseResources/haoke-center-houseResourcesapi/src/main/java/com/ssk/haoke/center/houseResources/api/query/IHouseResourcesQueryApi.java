package com.ssk.haoke.center.houseResources.api.query;

import com.ssk.haoke.center.houseResources.api.dto.request.HouseResourcesReqDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import com.github.pagehelper.PageInfo;

/**
* 房源表服务接口
*
* @author 代码生成器
*/
@Api(tags = {"房源表服务"})
@FeignClient(name = "${haoke.center.houseResources.name:haoke-center-houseResources}", path = "/v1/houseresources", url = "${haoke.center.houseResources.api:}")
public interface IHouseResourcesQueryApi {

    /**
    * 根据id查询房源表
    *
    * @param id 房源表id
    * @return   房源表数据
    */
    @GetMapping("/{id}")
    @ApiOperation(value = "根据id查询房源表", notes = "根据id查询房源表")
    ResponseEntity<HouseResourcesReqDto> queryById(@PathVariable("id") Long id);

    /**
    * 房源表分页数据
    *
    * @param filter   房源表查询条件
    * @param pageNum  当前页
    * @param pageSize 页大小
    * @return 房源表分页数据
    */
    @GetMapping("/page")
    @ApiOperation(value = "房源表分页数据", notes = "根据filter查询条件查询房源表数据，filter=HouseResourcesReqDto")
    ResponseEntity<PageInfo<HouseResourcesReqDto>> queryByPage(@RequestParam("filter") String filter,
                                                           @RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                                           @RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize);

}
