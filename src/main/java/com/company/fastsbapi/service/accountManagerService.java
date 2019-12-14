package com.company.fastsbapi.service;

import com.company.fastsbapi.dataobject.model.accountManager;
import com.company.fastsbapi.dataobject.ro.accountManagerAddRO;
import com.company.fastsbapi.dataobject.ro.accountManagerUpdateRO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
* Created by CodeGenerator on 2019/12/12.
*/
public interface accountManagerService {

    void addaccountManager(accountManagerAddRO accountManagerAddRO);

    void deleteaccountManager(Integer id);

    void updateaccountManager(accountManagerUpdateRO accountManagerUpdateRO);

    accountManager findaccountManager(Integer id);

    Page<accountManager> findaccountManagerPage(PageRequest pageRequest);

}