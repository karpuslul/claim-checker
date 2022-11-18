package ru.innotech.claimchecker.service.impl;

import org.springframework.stereotype.Service;
import ru.innotech.claimchecker.entity.dto.PersonDTO;
import ru.innotech.claimchecker.service.PersonBlackListExternalService;

@Service
public class PersonBlackListExternalServiceImpl implements PersonBlackListExternalService {
    @Override
    public boolean check(PersonDTO person) {
        return true;
    }

}