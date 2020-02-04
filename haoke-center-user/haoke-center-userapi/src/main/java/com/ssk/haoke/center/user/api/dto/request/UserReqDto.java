package com.ssk.haoke.center.user.api.dto.request;

import java.util.Date;
import com.dtyunxi.dto.RequestDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
* Eo对象
*
* @author 代码生成器
*/
@ApiModel(value = "UserReqDto", description = "Eo对象")
public class UserReqDto extends RequestDto{

    /**
    *  主键
    */
    @ApiModelProperty(name = "id", value = "主键")
    private Long id;

    /**
    *  
    */
    @ApiModelProperty(name = "username", value = "")
    private String username;

    /**
    *  
    */
    @ApiModelProperty(name = "password", value = "")
    private String password;

    /**
    *  
    */
    @ApiModelProperty(name = "mobile", value = "")
    private String mobile;

    /**
    *  
    */
    @ApiModelProperty(name = "weixin", value = "")
    private String weixin;

    /**
    *  
    */
    @ApiModelProperty(name = "address", value = "")
    private String address;

    /**
    *  
    */
    @ApiModelProperty(name = "userDetail", value = "")
    private String userDetail;

    /**
    *  
    */
    @ApiModelProperty(name = "status", value = "")
    private Integer status;

    /**
    *  
    */
    @ApiModelProperty(name = "type", value = "")
    private Integer type;

    /**
    *  
    */
    @ApiModelProperty(name = "avatar", value = "")
    private  avatar;

    public void setId(Long id){
    this.id = id;
    }
    public Long getId(){
    return this.id;
    }

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