package ru.innotech.claimchecker.service.impl;

import org.springframework.stereotype.Service;
import ru.innotech.claimchecker.service.OrganizationBlackListExternalService;

@Service
public class OrganizationBlackListExternalServiceImpl implements OrganizationBlackListExternalService {
    @Override
    public boolean check(String inn) {

        return true;
    }

}