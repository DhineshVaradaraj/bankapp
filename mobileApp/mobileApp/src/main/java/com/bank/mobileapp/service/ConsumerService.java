package com.bank.mobileapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;


@Service
public class ConsumerService {

    private int userId;
    @Autowired
    private WaterService waterService;
    @JmsListener(destination = "mobileapp")
    public void receiveMessage(String userId) {
        this.userId = Integer.parseInt(userId);
        waterService.transferMoney(this.userId);
    }



    public Integer getUser(){
        return userId;
    }
}

