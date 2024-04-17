package com.bank.mobileapp.repository;

import com.bank.mobileapp.entity.WaterServiceCompany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface WaterServiceRepository extends JpaRepository<WaterServiceCompany, String> {
    @Transactional
    @Modifying
    @Query(value = "UPDATE waterCBA SET balanceAmt = 0.0, paid = true WHERE userid = ?1", nativeQuery = true)
    void updateUserBalance(Integer userId);

}
