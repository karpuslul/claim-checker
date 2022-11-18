package ru.innotech.claimchecker.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Setter
@Getter
public class Branch implements Serializable {

    @Serial
    private static final long serialVersionUID = 2478649439439698748L;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;

    @NotNull
    private String name;

    @NotNull
    private long cashFlow;

    @NotNull
    private String activityKind;

    @NotNull
    private String actualAddress;

    @NotNull
    private int equipmentCount;

    @ManyToOne
    private Claim claim;
}