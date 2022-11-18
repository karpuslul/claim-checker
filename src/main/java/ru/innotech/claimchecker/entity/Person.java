package ru.innotech.claimchecker.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 2123649059439698747L;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;

    @NotNull
    private String fio;

    @NotNull
    private String docSeries;

    @NotNull
    private String docNumber;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @NotNull
    private String issuedOrganization;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date issuedDate;

    @Enumerated(EnumType.STRING)
    private PositionEnum position;

}