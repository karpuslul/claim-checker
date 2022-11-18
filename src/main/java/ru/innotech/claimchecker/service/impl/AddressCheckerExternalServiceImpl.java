package ru.innotech.claimchecker.service.impl;

import org.springframework.stereotype.Service;
import ru.innotech.claimchecker.service.AddressCheckerExternalService;

@Service
public class AddressCheckerExternalServiceImpl implements AddressCheckerExternalService {

    @Override
    public boolean check(String address) {
        return true;
    }

}
