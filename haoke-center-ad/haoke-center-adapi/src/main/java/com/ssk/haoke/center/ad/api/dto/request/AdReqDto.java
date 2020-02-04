package com.ssk.haoke.center.ad.api.dto.request;

import java.util.Date;
import com.dtyunxi.dto.RequestDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
* 广告表Eo对象
*
* @author 代码生成器
*/
@ApiModel(value = "AdReqDto", description = "广告表Eo对象")
public class AdReqDto extends RequestDto{

    /**
    *  主键
    */
    @ApiModelProperty(name = "id", value = "主键")
    private Long id;

    /**
    *  广告类型
    */
    @ApiModelProperty(name = "type", value = "广告类型")
    private Integer type;

    /**
    *  描述
    */
    @ApiModelProperty(name = "title", value = "描述")
    private String title;

    /**
    *  图片URL地址
    */
    @ApiModelProperty(name = "url", value = "图片URL地址")
    private String url;

    /**
    *  
    */
    @ApiModelProperty(name = "created", value = "")
    private Date created;

    /**
    *  
    */
    @ApiModelProperty(name = "updated", value = "")
    private Date updated;

    public void setId(Long id){
    this.id = id;
    }
    public Long getId(){
    return this.id;
    }

    public void setType(Integer type){
    this.type = type;
    }
    public Integer getType(){
    return this.type;
    }

    public void setTitle(String title){
    this.title = title;
    }
    public String getTitle(){
    return this.title;
    }

    public void setUrl(String url){
    this.url = url;
    }
    public String getUrl(){
    return this.url;
    }

    public void setCreated(Date created){
    this.created = created;
    }
    public Date getCreated(){
    return this.created;
    }

    public void setUpdated(Date updated){
    this.updated = updated;
    }
    public Date getUpdated(){
    return this.updated;
    }

}