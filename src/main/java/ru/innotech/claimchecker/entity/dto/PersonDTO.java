package ru.innotech.claimchecker.entity.dto;

import java.time.LocalDate;

public record PersonDTO(String fio,
                        String docSeries,
                        String docNumber,
                        LocalDate birthDate,
                        String issuedOrganization,
                        LocalDate issuedDate) {

}