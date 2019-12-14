package com.company.fastsbapi.controller;

import com.company.fastsbapi.dataobject.model.accountManager;
import com.company.fastsbapi.dataobject.ro.accountManagerAddRO;
import com.company.fastsbapi.dataobject.ro.accountManagerUpdateRO;
import com.company.fastsbapi.dataobject.vo.accountManagerVO;
import com.company.fastsbapi.dataobject.vo.ResultVO;
import com.company.fastsbapi.service.accountManagerService;
import com.company.fastsbapi.utils.ListBeanConvertUtil;
import com.company.fastsbapi.utils.ROValidUtil;
import com.company.fastsbapi.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
* Created by CodeGenerator on 2019/12/12.
*/
@RestController
@RequestMapping("/accountManager")
public class accountManagerController {

    @Autowired
    private accountManagerService accountManagerService;

    @PostMapping
    public ResultVO add(@Valid @RequestBody accountManagerAddRO accountManagerAddRO, BindingResult result) {
        ROValidUtil.valid(result);
        accountManagerService.addaccountManager(accountManagerAddRO);
        return ResultVOUtil.returnSuccess();
    }

    @DeleteMapping("/{id}")
    public ResultVO delete(@PathVariable Integer id) {
    accountManagerService.deleteaccountManager(id);
    return ResultVOUtil.returnSuccess();
    }

    @PutMapping
    public ResultVO update(@RequestBody accountManagerUpdateRO accountManagerUpdateRO) {
        accountManagerService.updateaccountManager(accountManagerUpdateRO);
        return ResultVOUtil.returnSuccess();
    }

    @GetMapping("/{id}")
    public ResultVO detail(@PathVariable Integer id) {
        accountManager accountManager = accountManagerService.findaccountManager(id);
        accountManagerVO accountManagerVO = new accountManagerVO();
        BeanUtils.copyProperties(accountManager, accountManagerVO);
        return ResultVOUtil.returnSuccess("accountManager", accountManagerVO);
    }

    @GetMapping
    public ResultVO list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageRequest pageRequest = new PageRequest(page, size);
        Page<accountManager> accountManagerPage = accountManagerService.findaccountManagerPage(pageRequest);
        List<accountManager> accountManagerList = accountManagerPage.getContent();
        List<accountManagerVO> accountManagerVOList = ListBeanConvertUtil.convert(accountManagerList, accountManagerVO.class);
        return ResultVOUtil.returnSuccess("accountManager_list", accountManagerVOList);
    }

}