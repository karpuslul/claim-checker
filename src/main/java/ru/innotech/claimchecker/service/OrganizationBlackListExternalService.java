package ru.innotech.claimchecker.service;

public interface OrganizationBlackListExternalService {

    /**
     * Метод-заглушка внешнего сервиса проверки организации по черным спискам
     */
    boolean check(String inn);
}
