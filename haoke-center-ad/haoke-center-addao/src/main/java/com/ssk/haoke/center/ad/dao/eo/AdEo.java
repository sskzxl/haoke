package com.ssk.haoke.center.ad.dao.eo;

import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;
import com.dtyunxi.cube.framework.eo.CubeBaseEo;
import java.math.BigDecimal;

/**
* 广告表Eo对象
*
* @author 代码生成器
*/
@Table(name="tb_ad")
public class AdEo extends CubeBaseEo{

    /**
     *  广告类型
     */
    @Column(name = "type")
    private Integer type;

    /**
     *  描述
     */
    @Column(name = "title")
    private String title;

    /**
     *  图片URL地址
     */
    @Column(name = "url")
    private String url;

    /**
     *  
     */
    @Column(name = "created")
    private Date created;

    /**
     *  
     */
    @Column(name = "updated")
    private Date updated;

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