package com.company.fastsbapi.service.impl;

import com.company.fastsbapi.dataobject.model.accountManager;
import com.company.fastsbapi.dataobject.ro.accountManagerAddRO;
import com.company.fastsbapi.dataobject.ro.accountManagerUpdateRO;
import com.company.fastsbapi.repository.accountManagerRepository;
import com.company.fastsbapi.service.accountManagerService;
import com.company.fastsbapi.enums.ResultEnum;
import com.company.fastsbapi.exception.ServiceException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
* Created by CodeGenerator on 2019/12/12.
*/
@Service
@Transactional
@Slf4j
public class accountManagerServiceImpl implements accountManagerService {

    @Autowired
    private accountManagerRepository accountManagerRepository;

    @Override
    public void addaccountManager(accountManagerAddRO accountManagerAddRO) {
        accountManager accountManager = new accountManager();
        BeanUtils.copyProperties(accountManagerAddRO, accountManager);
        accountManagerRepository.save(accountManager);
    }

    @Override
    public void deleteaccountManager(Integer id) {
        accountManager accountManager = accountManagerRepository.getOne(id);
        if (accountManager == null) {
            log.error("【deleteaccountManager出错】id不存在,id:{}", id);
            throw new ServiceException(ResultEnum.ERROR_ID);
        }
        accountManagerRepository.delete(id);

    }

    @Override
    public void updateaccountManager(accountManagerUpdateRO accountManagerUpdateRO) {
        accountManager accountManager = accountManagerRepository.findOne(accountManagerUpdateRO.getId());
        if (accountManager == null) {
            log.error("【updateaccountManager出错】id不存在,id:{}", accountManagerUpdateRO.getId());
            throw new ServiceException(ResultEnum.ERROR_ID);
        }
        BeanUtils.copyProperties(accountManagerUpdateRO, accountManager);
        accountManagerRepository.save(accountManager);
    }

    @Override
    public accountManager findaccountManager(Integer id) {
        accountManager accountManager = accountManagerRepository.findOne(id);
        if (accountManager == null) {
            log.error("【findaccountManager出错】id不存在,id:{}", id);
            throw new ServiceException(ResultEnum.ERROR_ID);
        }
        return accountManager;
    }

    @Override
    public Page<accountManager> findaccountManagerPage(PageRequest pageRequest) {
        return accountManagerRepository.findAll(pageRequest);
    }

}