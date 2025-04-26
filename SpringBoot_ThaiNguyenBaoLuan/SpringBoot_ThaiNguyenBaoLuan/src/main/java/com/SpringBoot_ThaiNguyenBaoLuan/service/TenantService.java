package com.SpringBoot_ThaiNguyenBaoLuan.service;

import com.SpringBoot_ThaiNguyenBaoLuan.model.Tenant;

import java.util.List;

public interface TenantService {
    List<Tenant> getAllTenants();
    Tenant getTenantById(Long id);
    Tenant createTenant(Tenant tenant);
    void deleteTenant(Long id);
}
