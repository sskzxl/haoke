package com.ssk.haoke.center.ad.biz.service.impl;

import org.springframework.stereotype.Service;
import com.ssk.haoke.center.ad.biz.service.IAdService;
import com.github.pagehelper.PageInfo;
import com.ssk.haoke.center.ad.dao.das.AdDas;
import com.dtyunxi.cube.commons.dto.DtoHelper;
import javax.annotation.Resource;
import com.ssk.haoke.center.ad.api.dto.request.AdReqDto;
import com.ssk.haoke.center.ad.dao.eo.AdEo;
import org.springframework.transaction.annotation.Transactional;
import com.alibaba.fastjson.JSON;
import com.dtyunxi.cube.utils.bean.CubeBeanUtils;
import java.util.ArrayList;
import java.util.List;

/**
* 广告表服务实现类
*
* @author 代码生成器
*/
@Service
public class AdServiceImpl implements IAdService {

    @Resource
    private AdDas adDas;

    @Override
    public Long addAd(AdReqDto addReqDto) {
        AdEo adEo = new AdEo();
        DtoHelper.dto2Eo(addReqDto, adEo);
        adDas.insert(adEo);
        return adEo.getId();
    }

    @Override
    public void modifyAd(AdReqDto modifyReqDto) {
        AdEo adEo = new AdEo();
        DtoHelper.dto2Eo(modifyReqDto, adEo);
        adDas.updateSelective(adEo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void removeAd(String ids,
                                   Long instanceId) {
        String[] removeIds = ids.split(",");
        for (String id : removeIds) {
            adDas.logicDeleteById(Long.valueOf(id));
        }
    }

    @Override
    public AdReqDto queryById(Long id) {
        AdEo adEo = adDas.selectByPrimaryKey(id);
        AdReqDto adReqDto = new AdReqDto();
        DtoHelper.eo2Dto(adEo, adReqDto);
        return adReqDto;
    }

    @Override
    public PageInfo<AdReqDto> queryByPage(String filter,
                                                    Integer pageNum,
                                                    Integer pageSize) {
        AdReqDto adReqDto = JSON.parseObject(filter, AdReqDto.class);
        AdEo adEo = new AdEo();
        DtoHelper.dto2Eo(adReqDto, adEo);
        PageInfo<AdEo> eoPageInfo = adDas.selectPage(adEo, pageNum, pageSize);

        PageInfo<AdReqDto> dtoPageInfo = new PageInfo();
        CubeBeanUtils.copyProperties(dtoPageInfo, eoPageInfo, "list", "navigatepageNums");
        List<AdReqDto> dtoList = new ArrayList<>();
        DtoHelper.eoList2DtoList(eoPageInfo.getList(), dtoList, AdReqDto.class);
        dtoPageInfo.setList(dtoList);
        return dtoPageInfo;
    }

}
