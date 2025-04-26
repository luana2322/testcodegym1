package com.SpringBoot_ThaiNguyenBaoLuan.repository;

import com.SpringBoot_ThaiNguyenBaoLuan.model.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentTypeRepository extends JpaRepository<PaymentType,Long> {
}
