package com.SpringBoot_ThaiNguyenBaoLuan.service.serviceImpl;


import com.SpringBoot_ThaiNguyenBaoLuan.model.Tenant;
import com.SpringBoot_ThaiNguyenBaoLuan.repository.TenantRepository;
import com.SpringBoot_ThaiNguyenBaoLuan.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantServiceImpl implements TenantService {

    @Autowired
    private TenantRepository tenantRepository;

    @Override
    public List<Tenant> getAllTenants() {
        return tenantRepository.findAll();
    }

    @Override
    public Tenant getTenantById(Long id) {
        return tenantRepository.findById(id).orElse(null);
    }

    @Override
    public Tenant createTenant(Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    @Override
    public void deleteTenant(Long id) {
        tenantRepository.deleteById(id);
    }
}