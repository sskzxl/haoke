package com.ssk.haoke.center.ad.biz.service;

import com.ssk.haoke.center.ad.api.dto.request.AdReqDto;
import com.github.pagehelper.PageInfo;

/**
* 广告表服务接口
*
* @author 代码生成器
*/
public interface IAdService {

    /**
    * 新增广告表
    *
    * @param addReqDto 广告表请求对象
    * @return 新增广告表ID
    */
    Long addAd(AdReqDto addReqDto);

    /**
    * 修改广告表
    *
    * @param modifyReqDto 广告表请求对象
    */
    void modifyAd(AdReqDto modifyReqDto);

    /**
    * 删除广告表
    *
    * @param ids        广告表删除数据ID
    * @param instanceId 实例ID
    */
    void removeAd(String ids,
                            Long instanceId);

    /**
    * 根据id查询广告表
    *
    * @param id 广告表id
    * @return   广告表数据
    */
    AdReqDto queryById(Long id);

    /**
    * 广告表分页数据
    *
    * @param filter   广告表查询条件
    * @param pageNum  当前页
    * @param pageSize 页大小
    * @return 广告表分页数据
    */
    PageInfo<AdReqDto> queryByPage(String filter,
                                             Integer pageNum,
                                             Integer pageSize);

}
