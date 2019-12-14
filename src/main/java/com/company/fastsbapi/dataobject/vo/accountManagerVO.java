package com.company.fastsbapi.dataobject.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
* Created by CodeGenerator on 2019/12/12.
*/
@Data
public class accountManagerVO implements Serializable{

    private static final long serialVersionUID = 1038578395049741413L;

    private Integer id;

    @JsonProperty("int")
    private Integer int;

    @JsonProperty("user_id")
    private Integer userId;

    @JsonProperty("avail_balance")
    private BigDecimal availBalance;

    @JsonProperty("frozen_blance")
    private BigDecimal frozenBlance;

    @JsonProperty("account_type")
    private Integer accountType;

    @JsonProperty("coin_type")
    private Integer coinType;

    @JsonProperty("create_time")
    private Date createTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("create_time")
    private Date createTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("update_time")
    private Date updateTime;

}