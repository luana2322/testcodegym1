package com.SpringBoot_ThaiNguyenBaoLuan.repository;

import com.SpringBoot_ThaiNguyenBaoLuan.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalRepository extends JpaRepository<Rental,Long> {
    @Query("SELECT r FROM Rental r " +
            "WHERE LOWER(r.room.roomCode) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "OR LOWER(r.tenant.fullName) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "OR LOWER(r.tenant.phone) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Rental> searchByRoomCodeOrTenantNameOrPhone(@Param("keyword") String keyword);
}
