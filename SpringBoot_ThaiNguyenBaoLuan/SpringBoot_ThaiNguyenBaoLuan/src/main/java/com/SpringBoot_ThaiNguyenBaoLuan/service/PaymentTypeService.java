package com.SpringBoot_ThaiNguyenBaoLuan.service;

import com.SpringBoot_ThaiNguyenBaoLuan.model.PaymentType;

import java.util.List;

public interface PaymentTypeService {
    List<PaymentType> getAllPaymentTypes();
    PaymentType getPaymentTypeById(Long id);
    PaymentType createPaymentType(PaymentType paymentType);
    void deletePaymentType(Long id);
}
