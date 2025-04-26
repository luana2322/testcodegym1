package com.SpringBoot_ThaiNguyenBaoLuan.service.serviceImpl;


import com.SpringBoot_ThaiNguyenBaoLuan.model.PaymentType;
import com.SpringBoot_ThaiNguyenBaoLuan.repository.PaymentTypeRepository;
import com.SpringBoot_ThaiNguyenBaoLuan.service.PaymentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentTypeServiceImpl implements PaymentTypeService {

    @Autowired
    private PaymentTypeRepository paymentTypeRepository;

    @Override
    public List<PaymentType> getAllPaymentTypes() {
        return paymentTypeRepository.findAll();
    }

    @Override
    public PaymentType getPaymentTypeById(Long id) {
        return paymentTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PaymentType createPaymentType(PaymentType paymentType) {
        return paymentTypeRepository.save(paymentType);
    }

    @Override
    public void deletePaymentType(Long id) {
        paymentTypeRepository.deleteById(id);
    }
}
