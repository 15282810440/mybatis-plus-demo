package com.onfish.yshyheartbeatcollectionreport;

import com.onfish.yshyheartbeatcollectionreport.entity.TTxException;
import com.onfish.yshyheartbeatcollectionreport.service.ITTxExceptionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YshyHeartbeatCollectionReportApplicationTests {

    @Autowired
    private ITTxExceptionService itTxExceptionService;

    @Test
    public void contextLoads() {
//        TTxException tTxException = new TTxException();
//        tTxException.setGroupId("123131");
//        itTxExceptionService.save(tTxException);
    }

}
