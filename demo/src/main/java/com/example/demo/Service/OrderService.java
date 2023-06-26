package com.example.demo.Service;

import ecpay.payment.integration.AllInOne;
import ecpay.payment.integration.domain.AioCheckOutALL;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public String ecpayCheckout(){
        AllInOne aio = new AllInOne("");

        AioCheckOutALL obj = new AioCheckOutALL();

        obj.setMerchantTradeNo("adda1234567891234567");
        obj.setMerchantTradeDate("2023/06/26 08:00:00");
        obj.setTotalAmount("100");
        obj.setTradeDesc("test Description");
        obj.setItemName("TestItem");
        obj.setNeedExtraPaidInfo("N");
        obj.setClientBackURL("http://192.168.1.37:8080/");
        obj.setReturnURL(" https://a58e-2001-b011-6c02-1d68-70da-af61-2601-1460.ngrok-free.app");

        String form = aio.aioCheckOut(obj,null);

        return form;
    }
}
