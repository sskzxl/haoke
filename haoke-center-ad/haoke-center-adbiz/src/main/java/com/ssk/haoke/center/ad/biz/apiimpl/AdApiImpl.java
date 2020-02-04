package com.ssk.haoke.center.ad.biz.apiimpl;

import org.springframework.stereotype.Service;
import com.ssk.haoke.center.ad.api.IAdApi;
import com.ssk.haoke.center.ad.biz.service.IAdService;
import javax.annotation.Resource;
import com.dtyunxi.rest.RestResponse;
import com.ssk.haoke.center.ad.api.dto.request.AdReqDto;

/**
* 广告表服务实现类
*
* @author 代码生成器
*/
@Service
public class AdApiImpl implements IAdApi {

    @Resource
    private IAdService adService;

    @Override
    public RestResponse<Long> addAd(AdReqDto addReqDto) {
        return new RestResponse(adService.addAd(addReqDto));
    }

    @Override
    public RestResponse<Void> modifyAd(AdReqDto modifyReqDto) {
        adService.modifyAd(modifyReqDto);
        return RestResponse.VOID;
    }

    @Override
    public RestResponse<Void> removeAd(String ids,
                                                 Long instanceId) {
        adService.removeAd(ids, instanceId);
        return RestResponse.VOID;
    }
}
