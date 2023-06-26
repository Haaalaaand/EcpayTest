package com.example.demo.Controller;

import com.example.demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;

@RestController
public class Controller {
    @Autowired
    OrderService orderService;

    @PostMapping("/ecpayCheckout")
    public String ecpaycheckout(){
        String aioCheckoutForm = orderService.ecpayCheckout();
        return aioCheckoutForm;
    }

}
