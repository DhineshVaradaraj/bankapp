package com.bank.mobileapp.service;
import com.bank.mobileapp.repository.WaterServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class WaterService {
@Autowired
    private WaterServiceRepository waterServiceRepository;

    public void transferMoney(Integer userId) {
        waterServiceRepository.updateUserBalance(userId);
    }
}
