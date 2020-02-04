package com.ssk.haoke.center.houseResources.svr.rest;

import com.github.pagehelper.PageInfo;
import com.ssk.haoke.center.houseResources.api.IHouseResourcesApi;
import com.ssk.haoke.center.houseResources.api.dto.request.HouseResourcesReqDto;
import com.ssk.haoke.center.houseResources.api.query.IHouseResourcesQueryApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* 房源表Rest类
*
* @author 代码生成器
*/
@RestController
@RequestMapping("/v1/houseresources")
public class HouseResourcesRest implements IHouseResourcesApi,IHouseResourcesQueryApi {

    @Resource
    private IHouseResourcesApi houseResourcesApi;
    @Resource
    private IHouseResourcesQueryApi houseResourcesQueryApi;

    @Override
    public ResponseEntity<Long> addHouseResources(@RequestBody HouseResourcesReqDto addReqDto) {
        return houseResourcesApi.addHouseResources(addReqDto);
    }

    @Override
    public ResponseEntity<Void> modifyHouseResources(@RequestBody HouseResourcesReqDto modifyReqDto) {
        return houseResourcesApi.modifyHouseResources(modifyReqDto);
    }

    @Override
    public ResponseEntity<Void> removeHouseResources(@PathVariable("ids") String ids,
                                          @RequestParam("instanceId") Long instanceId) {
        return houseResourcesApi.removeHouseResources(ids, instanceId);
    }

    @Override
    public ResponseEntity<HouseResourcesReqDto> queryById(@PathVariable("id") Long id) {
        return houseResourcesQueryApi.queryById(id);
    }

    @Override
    public ResponseEntity<PageInfo<HouseResourcesReqDto>> queryByPage(@RequestParam("filter") String filter,
                                                           @RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                                           @RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
        return houseResourcesQueryApi.queryByPage(filter, pageNum, pageSize);
    }


}