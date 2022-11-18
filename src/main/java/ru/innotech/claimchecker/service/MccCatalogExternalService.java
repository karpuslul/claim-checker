package ru.innotech.claimchecker.service;

import java.util.List;

public interface MccCatalogExternalService {

    /**
     * Сервис-заглушка внешнего сервиса
     * Имитирует вызов внешнего сервиса, который отдает список видов деятельности
     *
     * @return фиксированный список видов деятельности
     */
    List<String> getCatalog();

}
