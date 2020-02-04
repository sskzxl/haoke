package com.ssk.haoke.center.ad.biz.apiimpl.query;

import org.springframework.stereotype.Service;
import com.ssk.haoke.center.ad.api.query.IAdQueryApi;
import com.ssk.haoke.center.ad.biz.service.IAdService;
import javax.annotation.Resource;
import com.ssk.haoke.center.ad.api.dto.request.AdReqDto;
import com.dtyunxi.rest.RestResponse;
import com.github.pagehelper.PageInfo;

/**
* 广告表服务实现类
*
* @author 代码生成器
*/
@Service
public class AdQueryApiImpl implements IAdQueryApi {

    @Resource
    private IAdService adService;

    @Override
    public RestResponse<AdReqDto> queryById(Long id){
        return new RestResponse(adService.queryById(id));
    }

    @Override
    public RestResponse<PageInfo<AdReqDto>> queryByPage(String filter,
                                                                  Integer pageNum,
                                                                  Integer pageSize){
        return new RestResponse(adService.queryByPage(filter, pageNum, pageSize));
    }

}
