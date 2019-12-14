package com.company.fastsbapi.dataobject.ro;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
* Created by CodeGenerator on 2019/12/12.
*/
@Data
public class accountManagerUpdateRO {

    private Integer id;

    @NotNull(message = "int不能为空")
    @JsonProperty("int")
    private Integer int;

    @NotNull(message = "user_id不能为空")
    @JsonProperty("user_id")
    private Integer userId;

    @NotNull(message = "avail_balance不能为空")
    @JsonProperty("avail_balance")
    private BigDecimal availBalance;

    @NotNull(message = "frozen_blance不能为空")
    @JsonProperty("frozen_blance")
    private BigDecimal frozenBlance;

    @NotNull(message = "account_type不能为空")
    @JsonProperty("account_type")
    private Integer accountType;

    @NotNull(message = "coin_type不能为空")
    @JsonProperty("coin_type")
    private Integer coinType;

    @NotNull(message = "create_time不能为空")
    @JsonProperty("create_time")
    private Date createTime;

}