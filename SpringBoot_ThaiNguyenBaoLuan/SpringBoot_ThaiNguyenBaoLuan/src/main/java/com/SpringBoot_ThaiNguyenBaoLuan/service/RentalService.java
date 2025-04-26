package com.SpringBoot_ThaiNguyenBaoLuan.service;

import com.SpringBoot_ThaiNguyenBaoLuan.model.Rental;

import java.util.List;

public interface RentalService {
    List<Rental> getAllRentals();
    Rental getRentalById(Long id);
    Rental createRental(Rental rental);
    void deleteRental(Long id);
     List<Rental> search(String keyword) ;
}
