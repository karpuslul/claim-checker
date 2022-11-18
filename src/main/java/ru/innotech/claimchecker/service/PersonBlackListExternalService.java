package ru.innotech.claimchecker.service;

import ru.innotech.claimchecker.entity.dto.PersonDTO;

public interface PersonBlackListExternalService {

    /**
     * Метод-заглушка внешнего сервиса проверки человека по черным спискам
     */
    boolean check(PersonDTO person);
}
