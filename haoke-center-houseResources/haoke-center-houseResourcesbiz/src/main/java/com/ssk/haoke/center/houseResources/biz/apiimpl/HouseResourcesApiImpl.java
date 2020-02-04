package com.ssk.haoke.center.houseResources.biz.apiimpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.ssk.haoke.center.houseResources.api.IHouseResourcesApi;
import com.ssk.haoke.center.houseResources.biz.service.IHouseResourcesService;
import javax.annotation.Resource;
import com.ssk.haoke.center.houseResources.api.dto.request.HouseResourcesReqDto;

/**
* 房源表服务实现类
*
* @author 代码生成器
*/
@Service
public class HouseResourcesApiImpl implements IHouseResourcesApi {

    @Resource
    private IHouseResourcesService houseResourcesService;

    @Override
    public ResponseEntity<Long> addHouseResources(HouseResourcesReqDto addReqDto) {
        return new ResponseEntity(houseResourcesService.addHouseResources(addReqDto), HttpStatus.OK);
    }

    @Override
    public ResponseEntity modifyHouseResources(HouseResourcesReqDto modifyReqDto) {
        houseResourcesService.modifyHouseResources(modifyReqDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> removeHouseResources(String ids,
                                                 Long instanceId) {
        houseResourcesService.removeHouseResources(ids, instanceId);
        return new ResponseEntity(HttpStatus.OK);
    }
}
