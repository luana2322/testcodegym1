package com.SpringBoot_ThaiNguyenBaoLuan.controller;

import com.SpringBoot_ThaiNguyenBaoLuan.model.Rental;
import com.SpringBoot_ThaiNguyenBaoLuan.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rentals")
public class RentalController {

    @Autowired
    private RentalService rentalService;

    @GetMapping
    public List<Rental> getAllRentals() {
        return rentalService.getAllRentals();
    }

    @GetMapping("/{id}")
    public Rental getRentalById(@PathVariable Long id) {
        return rentalService.getRentalById(id);
    }

    @PostMapping
    public Rental createRental(@RequestBody Rental rental) {
        return rentalService.createRental(rental);
    }

    @DeleteMapping("/{id}")
    public void deleteRental(@PathVariable Long id) {
        rentalService.deleteRental(id);
    }

    @GetMapping("/search")
    public List<Rental> searchRentals(@RequestParam String query) {
        return rentalService.search(query);
    }

}
