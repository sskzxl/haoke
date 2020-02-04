package com.ssk.haoke.center.houseResources.dao.eo;

import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;
import java.math.BigDecimal;

/**
* 房源表Eo对象
*
* @author 代码生成器
*/
@Table(name="tb_house_resources")
public class HouseResourcesEo{

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     *  房源标题
     */
    @Column(name = "title")
    private String title;

    /**
     *  楼盘id
     */
    @Column(name = "estate_id")
    private Long estateId;

    /**
     *  楼号（栋）
     */
    @Column(name = "building_num")
    private String buildingNum;

    /**
     *  单元号
     */
    @Column(name = "building_unit")
    private String buildingUnit;

    /**
     *  门牌号
     */
    @Column(name = "building_floor_num")
    private String buildingFloorNum;

    /**
     *  租金
     */
    @Column(name = "rent")
    private Integer rent;

    /**
     *  租赁方式，1-整租，2-合租
     */
    @Column(name = "rent_method")
    private Integer rentMethod;

    /**
     *  支付方式，1-付一押一，2-付三押一，3-
付六押一，4-年付押一，5-其它
     */
    @Column(name = "payment_method")
    private Integer paymentMethod;

    /**
     *  户型，如：2室1厅1卫
     */
    @Column(name = "house_type")
    private String houseType;

    /**
     *  建筑面积
     */
    @Column(name = "covered_area")
    private String coveredArea;

    /**
     *  使用面积
     */
    @Column(name = "use_area")
    private String useArea;

    /**
     *  楼层，如：8/26
     */
    @Column(name = "floor")
    private String floor;

    /**
     *  朝向：东、南、西、北
     */
    @Column(name = "orientation")
    private String orientation;

    /**
     *  装修，1-精装，2-简装，3-毛坯
     */
    @Column(name = "decoration")
    private Integer decoration;

    /**
     *  配套设施， 如：1,2,3
     */
    @Column(name = "facilities")
    private String facilities;

    /**
     *  图片，最多5张
     */
    @Column(name = "pic")
    private String pic;

    /**
     *  描述
     */
    @Column(name = "house_desc")
    private String houseDesc;

    /**
     *  联系人
     */
    @Column(name = "contact")
    private String contact;

    /**
     *  手机号
     */
    @Column(name = "mobile")
    private String mobile;

    /**
     *  看房时间，1-上午，2-中午，3-下午，4-晚上，5-全
天
     */
    @Column(name = "time")
    private Integer time;

    /**
     *  物业费
     */
    @Column(name = "property_cost")
    private String propertyCost;

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