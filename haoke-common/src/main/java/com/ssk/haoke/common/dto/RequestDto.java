package com.ssk.haoke.common.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class RequestDto implements Serializable {
    /**
     *
     */
    @ApiModelProperty(name = "extension", value = "拓展字段")
    private String extension;
}
