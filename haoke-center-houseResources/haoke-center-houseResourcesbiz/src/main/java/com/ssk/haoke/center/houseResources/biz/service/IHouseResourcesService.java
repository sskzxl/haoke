package com.ssk.haoke.center.houseResources.biz.service;

import com.ssk.haoke.center.houseResources.api.dto.request.HouseResourcesReqDto;
import com.github.pagehelper.PageInfo;

/**
* 房源表服务接口
*
* @author 代码生成器
*/
public interface IHouseResourcesService {

    /**
    * 新增房源表
    *
    * @param addReqDto 房源表请求对象
    * @return 新增房源表ID
    */
    Long addHouseResources(HouseResourcesReqDto addReqDto);

    /**
    * 修改房源表
    *
    * @param modifyReqDto 房源表请求对象
    */
    void modifyHouseResources(HouseResourcesReqDto modifyReqDto);

    /**
    * 删除房源表
    *
    * @param ids        房源表删除数据ID
    * @param instanceId 实例ID
    */
    void removeHouseResources(String ids,
                            Long instanceId);

    /**
    * 根据id查询房源表
    *
    * @param id 房源表id
    * @return   房源表数据
    */
    HouseResourcesReqDto queryById(Long id);

    /**
    * 房源表分页数据
    *
    * @param filter   房源表查询条件
    * @param pageNum  当前页
    * @param pageSize 页大小
    * @return 房源表分页数据
    */
    PageInfo<HouseResourcesReqDto> queryByPage(String filter,
                                             Integer pageNum,
                                             Integer pageSize);

}
