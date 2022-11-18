package ru.innotech.claimchecker.service.impl;

import org.springframework.stereotype.Service;
import ru.innotech.claimchecker.service.MccCatalogExternalService;

import java.util.List;

@Service
public class MccCatalogExternalServiceImpl implements MccCatalogExternalService {

    @Override
    public List<String> getCatalog() {
        return List.of("Розничная торговля", "Организации общественного питания", "Оптовая торговля");
    }

}