package com.SpringBoot_ThaiNguyenBaoLuan.controller;

import com.SpringBoot_ThaiNguyenBaoLuan.model.PaymentType;
import com.SpringBoot_ThaiNguyenBaoLuan.service.PaymentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment-types")
public class PaymentTypeController {

    @Autowired
    private PaymentTypeService paymentTypeService;

    @GetMapping
    public List<PaymentType> getAllPaymentTypes() {
        return paymentTypeService.getAllPaymentTypes();
    }

    @GetMapping("/{id}")
    public PaymentType getPaymentTypeById(@PathVariable Long id) {
        return paymentTypeService.getPaymentTypeById(id);
    }

    @PostMapping
    public PaymentType createPaymentType(@RequestBody PaymentType paymentType) {
        return paymentTypeService.createPaymentType(paymentType);
    }

    @DeleteMapping("/{id}")
    public void deletePaymentType(@PathVariable Long id) {
        paymentTypeService.deletePaymentType(id);
    }
}
