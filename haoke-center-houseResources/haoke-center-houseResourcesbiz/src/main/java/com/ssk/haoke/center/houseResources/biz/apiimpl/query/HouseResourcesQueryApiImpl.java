package com.ssk.haoke.center.houseResources.biz.apiimpl.query;

import org.springframework.stereotype.Service;
import com.ssk.haoke.center.houseResources.api.query.IHouseResourcesQueryApi;
import com.ssk.haoke.center.houseResources.biz.service.IHouseResourcesService;
import javax.annotation.Resource;
import com.ssk.haoke.center.houseResources.api.dto.request.HouseResourcesReqDto;
import com.dtyunxi.rest.RestResponse;
import com.github.pagehelper.PageInfo;

/**
* 房源表服务实现类
*
* @author 代码生成器
*/
@Service
public class HouseResourcesQueryApiImpl implements IHouseResourcesQueryApi {

    @Resource
    private IHouseResourcesService houseResourcesService;

    @Override
    public RestResponse<HouseResourcesReqDto> queryById(Long id){
        return new RestResponse(houseResourcesService.queryById(id));
    }

    @Override
    public RestResponse<PageInfo<HouseResourcesReqDto>> queryByPage(String filter,
                                                                  Integer pageNum,
                                                                  Integer pageSize){
        return new RestResponse(houseResourcesService.queryByPage(filter, pageNum, pageSize));
    }

}
