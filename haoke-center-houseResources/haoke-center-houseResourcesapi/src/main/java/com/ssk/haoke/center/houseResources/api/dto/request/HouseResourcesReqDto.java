package com.ssk.haoke.center.houseResources.api.dto.request;

import java.util.Date;
import com.ssk.haoke.common.dto.RequestDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
* 房源表Eo对象
*
* @author 代码生成器
*/
@ApiModel(value = "HouseResourcesReqDto", description = "房源表Eo对象")
public class HouseResourcesReqDto extends RequestDto{

    /**
    *  主键
    */
    @ApiModelProperty(name = "id", value = "主键")
    private Long id;

    /**
    *  房源标题
    */
    @ApiModelProperty(name = "title", value = "房源标题")
    private String title;

    /**
    *  楼盘id
    */
    @ApiModelProperty(name = "estateId", value = "楼盘id")
    private Long estateId;

    /**
    *  楼号（栋）
    */
    @ApiModelProperty(name = "buildingNum", value = "楼号（栋）")
    private String buildingNum;

    /**
    *  单元号
    */
    @ApiModelProperty(name = "buildingUnit", value = "单元号")
    private String buildingUnit;

    /**
    *  门牌号
    */
    @ApiModelProperty(name = "buildingFloorNum", value = "门牌号")
    private String buildingFloorNum;

    /**
    *  租金
    */
    @ApiModelProperty(name = "rent", value = "租金")
    private Integer rent;

    /**
    *  租赁方式，1-整租，2-合租
    */
    @ApiModelProperty(name = "rentMethod", value = "租赁方式，1-整租，2-合租")
    private Integer rentMethod;

    /**
    *  支付方式，1-付一押一，2-付三押一，3-
付六押一，4-年付押一，5-其它
    */
    @ApiModelProperty(name = "paymentMethod", value = "支付方式，1-付一押一，2-付三押一，3-"+
"付六押一，4-年付押一，5-其它")
    private Integer paymentMethod;

    /**
    *  户型，如：2室1厅1卫
    */
    @ApiModelProperty(name = "houseType", value = "户型，如：2室1厅1卫")
    private String houseType;

    /**
    *  建筑面积
    */
    @ApiModelProperty(name = "coveredArea", value = "建筑面积")
    private String coveredArea;

    /**
    *  使用面积
    */
    @ApiModelProperty(name = "useArea", value = "使用面积")
    private String useArea;

    /**
    *  楼层，如：8/26
    */
    @ApiModelProperty(name = "floor", value = "楼层，如：8/26")
    private String floor;

    /**
    *  朝向：东、南、西、北
    */
    @ApiModelProperty(name = "orientation", value = "朝向：东、南、西、北")
    private String orientation;

    /**
    *  装修，1-精装，2-简装，3-毛坯
    */
    @ApiModelProperty(name = "decoration", value = "装修，1-精装，2-简装，3-毛坯")
    private Integer decoration;

    /**
    *  配套设施， 如：1,2,3
    */
    @ApiModelProperty(name = "facilities", value = "配套设施， 如：1,2,3")
    private String facilities;

    /**
    *  图片，最多5张
    */
    @ApiModelProperty(name = "pic", value = "图片，最多5张")
    private String pic;

    /**
    *  描述
    */
    @ApiModelProperty(name = "houseDesc", value = "描述")
    private String houseDesc;

    /**
    *  联系人
    */
    @ApiModelProperty(name = "contact", value = "联系人")
    private String contact;

    /**
    *  手机号
    */
    @ApiModelProperty(name = "mobile", value = "手机号")
    private String mobile;

    /**
    *  看房时间，1-上午，2-中午，3-下午，4-晚上，5-全
天
    */
    @ApiModelProperty(name = "time", value = "看房时间，1-上午，2-中午，3-下午，4-晚上，5-全 天")
    private Integer time;

    /**
    *  物业费
    */
    @ApiModelProperty(name = "propertyCost", value = "物业费")
    private String propertyCost;

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

    public void setTitle(String title){
    this.title = title;
    }
    public String getTitle(){
    return this.title;
    }

    public void setEstateId(Long estateId){
    this.estateId = estateId;
    }
    public Long getEstateId(){
    return this.estateId;
    }

    public void setBuildingNum(String buildingNum){
    this.buildingNum = buildingNum;
    }
    public String getBuildingNum(){
    return this.buildingNum;
    }

    public void setBuildingUnit(String buildingUnit){
    this.buildingUnit = buildingUnit;
    }
    public String getBuildingUnit(){
    return this.buildingUnit;
    }

    public void setBuildingFloorNum(String buildingFloorNum){
    this.buildingFloorNum = buildingFloorNum;
    }
    public String getBuildingFloorNum(){
    return this.buildingFloorNum;
    }

    public void setRent(Integer rent){
    this.rent = rent;
    }
    public Integer getRent(){
    return this.rent;
    }

    public void setRentMethod(Integer rentMethod){
    this.rentMethod = rentMethod;
    }
    public Integer getRentMethod(){
    return this.rentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod){
    this.paymentMethod = paymentMethod;
    }
    public Integer getPaymentMethod(){
    return this.paymentMethod;
    }

    public void setHouseType(String houseType){
    this.houseType = houseType;
    }
    public String getHouseType(){
    return this.houseType;
    }

    public void setCoveredArea(String coveredArea){
    this.coveredArea = coveredArea;
    }
    public String getCoveredArea(){
    return this.coveredArea;
    }

    public void setUseArea(String useArea){
    this.useArea = useArea;
    }
    public String getUseArea(){
    return this.useArea;
    }

    public void setFloor(String floor){
    this.floor = floor;
    }
    public String getFloor(){
    return this.floor;
    }

    public void setOrientation(String orientation){
    this.orientation = orientation;
    }
    public String getOrientation(){
    return this.orientation;
    }

    public void setDecoration(Integer decoration){
    this.decoration = decoration;
    }
    public Integer getDecoration(){
    return this.decoration;
    }

    public void setFacilities(String facilities){
    this.facilities = facilities;
    }
    public String getFacilities(){
    return this.facilities;
    }

    public void setPic(String pic){
    this.pic = pic;
    }
    public String getPic(){
    return this.pic;
    }

    public void setHouseDesc(String houseDesc){
    this.houseDesc = houseDesc;
    }
    public String getHouseDesc(){
    return this.houseDesc;
    }

    public void setContact(String contact){
    this.contact = contact;
    }
    public String getContact(){
    return this.contact;
    }

    public void setMobile(String mobile){
    this.mobile = mobile;
    }
    public String getMobile(){
    return this.mobile;
    }

    public void setTime(Integer time){
    this.time = time;
    }
    public Integer getTime(){
    return this.time;
    }

    public void setPropertyCost(String propertyCost){
    this.propertyCost = propertyCost;
    }
    public String getPropertyCost(){
    return this.propertyCost;
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