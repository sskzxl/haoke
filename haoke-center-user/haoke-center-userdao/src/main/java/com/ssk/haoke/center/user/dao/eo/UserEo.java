package com.ssk.haoke.center.user.dao.eo;

import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;
import com.dtyunxi.cube.framework.eo.CubeBaseEo;
import java.math.BigDecimal;

/**
* Eo对象
*
* @author 代码生成器
*/
@Table(name="tb_user")
public class UserEo extends CubeBaseEo{

    /**
     *  
     */
    @Column(name = "username")
    private String username;

    /**
     *  
     */
    @Column(name = "password")
    private String password;

    /**
     *  
     */
    @Column(name = "mobile")
    private String mobile;

    /**
     *  
     */
    @Column(name = "weixin")
    private String weixin;

    /**
     *  
     */
    @Column(name = "address")
    private String address;

    /**
     *  
     */
    @Column(name = "user_detail")
    private String userDetail;

    /**
     *  
     */
    @Column(name = "status")
    private Integer status;

    /**
     *  
     */
    @Column(name = "type")
    private Integer type;

    /**
     *  
     */
    @Column(name = "avatar")
    private  avatar;

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return this.username;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }

    public void setMobile(String mobile){
        this.mobile = mobile;
    }
    public String getMobile(){
        return this.mobile;
    }

    public void setWeixin(String weixin){
        this.weixin = weixin;
    }
    public String getWeixin(){
        return this.weixin;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

    public void setUserDetail(String userDetail){
        this.userDetail = userDetail;
    }
    public String getUserDetail(){
        return this.userDetail;
    }

    public void setStatus(Integer status){
        this.status = status;
    }
    public Integer getStatus(){
        return this.status;
    }

    public void setType(Integer type){
        this.type = type;
    }
    public Integer getType(){
        return this.type;
    }

    public void setAvatar( avatar){
        this.avatar = avatar;
    }
    public  getAvatar(){
        return this.avatar;
    }

}