package com.ssk.haoke.center.houseResources.api;

import com.ssk.haoke.center.houseResources.api.dto.request.HouseResourcesReqDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

/**
* 房源表服务接口
*
* @author 代码生成器
*/
@Api(tags = {"房源表服务"})
@FeignClient(name = "${haoke.center.houseResources.name:haoke-center-houseResources}", path = "/v1/houseresources", url = "${haoke.center.houseResources.api:}")
public interface IHouseResourcesApi {

    /**
    * 新增房源表
    *
    * @param addReqDto 房源表请求对象
    * @return 处理结果
    */
    @PostMapping("")
    @ApiOperation(value = "新增房源表", notes = "新增房源表")
    ResponseEntity<Long> addHouseResources(@RequestBody HouseResourcesReqDto addReqDto);

    /**
    * 修改房源表
    *
    * @param modifyReqDto 房源表请求对象
    * @return 处理结果
    */
    @PutMapping("")
    @ApiOperation(value = "修改房源表", notes = "修改房源表")
    ResponseEntity<Void> modifyHouseResources(@RequestBody HouseResourcesReqDto modifyReqDto);

    /**
    * 删除房源表
    *
    * @param ids        房源表删除数据ID
    * @param instanceId 实例ID
    * @return 处理结果
    */
    @DeleteMapping("/{ids}")
    @ApiOperation(value = "删除房源表", notes = "删除房源表")
    ResponseEntity<Void> removeHouseResources(@PathVariable("ids") String ids,
                                          @RequestParam("instanceId") Long instanceId);
}
