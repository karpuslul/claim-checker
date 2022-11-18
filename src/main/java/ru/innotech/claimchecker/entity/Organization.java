package ru.innotech.claimchecker.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Setter
@Getter
public class Organization implements Serializable {

    @Serial
    private static final long serialVersionUID = 2478649059439698742L;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;

    @NotNull
    private String name;

    @NotNull
    @Size(min = 12, max = 12)
    private String inn;

    @NotNull
    private String kpp;

    @NotNull
    private String legalAddress;

    @NotNull
    private String actualAddress;

    @ManyToOne
    private Claim claim;
}