package com.company.fastsbapi.dataobject.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;

/**
* Created by CodeGenerator on 2019/12/12.
*/
@Entity
@DynamicUpdate
@Data
@Table(name = "account_manager")
public class accountManager {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;

    private BigDecimal availBalance;

    private BigDecimal frozenBlance;

    private Integer accountType;

    private Integer coinType;

    private Date createTime;

    private Date updateTime;

}