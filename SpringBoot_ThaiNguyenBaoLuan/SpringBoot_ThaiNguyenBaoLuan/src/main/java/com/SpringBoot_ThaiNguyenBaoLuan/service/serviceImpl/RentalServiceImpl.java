package com.SpringBoot_ThaiNguyenBaoLuan.service.serviceImpl;


import com.SpringBoot_ThaiNguyenBaoLuan.model.Rental;
import com.SpringBoot_ThaiNguyenBaoLuan.repository.RentalRepository;
import com.SpringBoot_ThaiNguyenBaoLuan.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalServiceImpl implements RentalService {

    @Autowired
    private RentalRepository rentalRepository;

    @Override
    public List<Rental> getAllRentals() {
        return rentalRepository.findAll();
    }

    @Override
    public Rental getRentalById(Long id) {
        return rentalRepository.findById(id).orElse(null);
    }

    @Override
    public Rental createRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    @Override
    public void deleteRental(Long id) {
        rentalRepository.deleteById(id);
    }
    @Override
    public List<Rental> search(String keyword) {
        return rentalRepository.searchByRoomCodeOrTenantNameOrPhone(keyword);
    }

}