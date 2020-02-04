package com.ssk.haoke.center.houseResources.biz.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.ssk.haoke.center.houseResources.api.dto.request.HouseResourcesReqDto;
import com.ssk.haoke.center.houseResources.biz.service.IHouseResourcesService;
import com.ssk.haoke.center.houseResources.dao.das.HouseResourcesDas;
import com.ssk.haoke.center.houseResources.dao.eo.HouseResourcesEo;
import com.ssk.haoke.center.houseResources.dao.mapper.HouseResourcesMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
* 房源表服务实现类
*
* @author 代码生成器
*/
@Service
public class HouseResourcesServiceImpl implements IHouseResourcesService {

    @Resource
    private HouseResourcesDas houseResourcesDas;
    @Resource
    private HouseResourcesMapper mapper;

    @Override
    public Long addHouseResources(HouseResourcesReqDto addReqDto) {
        HouseResourcesEo houseResourcesEo = new HouseResourcesEo();
        BeanUtils.copyProperties(addReqDto,houseResourcesEo);
        mapper.insert(houseResourcesEo);
        return houseResourcesEo.getId();
    }

    @Override
    public void modifyHouseResources(HouseResourcesReqDto modifyReqDto) {
        HouseResourcesEo houseResourcesEo = new HouseResourcesEo();
        BeanUtils.copyProperties(modifyReqDto, houseResourcesEo);
        mapper.updateById(houseResourcesEo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void removeHouseResources(String ids,
                                   Long instanceId) {
        String[] removeIds = ids.split(",");
        mapper.deleteBatchIds(CollectionUtils.arrayToList(removeIds));
    }

    @Override
    public HouseResourcesReqDto queryById(Long id) {
        HouseResourcesEo houseResourcesEo = mapper.selectById(id);
        HouseResourcesReqDto houseResourcesReqDto = new HouseResourcesReqDto();
        BeanUtils.copyProperties(houseResourcesEo, houseResourcesReqDto);
        return houseResourcesReqDto;
    }

    @Override
    public PageInfo<HouseResourcesReqDto> queryByPage(String filter,
                                                    Integer pageNum,
                                                    Integer pageSize) {
        HouseResourcesReqDto houseResourcesReqDto = JSON.parseObject(filter, HouseResourcesReqDto.class);
        HouseResourcesEo houseResourcesEo = new HouseResourcesEo();
        BeanUtils.copyProperties(houseResourcesReqDto, houseResourcesEo);
        QueryWrapper<HouseResourcesEo> wrapper = new QueryWrapper<>(houseResourcesEo);
        Page<HouseResourcesEo> eoPage = new Page<>();
        IPage<HouseResourcesEo> eoPageInfo = mapper.selectPage(eoPage, wrapper);
//        PageInfo<HouseResourcesEo> eoPageInfo = houseResourcesDas.selectPage(houseResourcesEo, pageNum, pageSize);

        PageInfo<HouseResourcesReqDto> dtoPageInfo = new PageInfo();
        BeanUtils.copyProperties(dtoPageInfo, eoPageInfo, "list", "navigatepageNums");
        List<HouseResourcesReqDto> dtoList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(eoPageInfo.getRecords())){
            eoPageInfo.getRecords().stream().forEach(e->{
                HouseResourcesReqDto reqDto = new HouseResourcesReqDto();
                BeanUtils.copyProperties(e,reqDto);
                dtoList.add(reqDto);
            });
        }
        dtoPageInfo.setList(dtoList);
        return dtoPageInfo;
    }

}
