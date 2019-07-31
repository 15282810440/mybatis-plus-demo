package com.onfish.yshyheartbeatcollectionreport.controller;


import com.onfish.yshyheartbeatcollectionreport.base.BaseController;
import com.onfish.yshyheartbeatcollectionreport.entity.TTxException;
import com.onfish.yshyheartbeatcollectionreport.service.ITTxExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-07-31
 */
@RestController
@RequestMapping("//t-tx-exception")
public class TTxExceptionController extends BaseController<TTxException, ITTxExceptionService> {

    @Override
    @Autowired
    protected void setService(ITTxExceptionService itTxExceptionService) {
        service = itTxExceptionService;
    }

    @RequestMapping("/insert")
    public void insert(){
        TTxException tTxException = new TTxException();
        tTxException.setGroupId("123131");
        service.save(tTxException);
    }

}
