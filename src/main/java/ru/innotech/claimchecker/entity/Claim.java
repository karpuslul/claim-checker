package ru.innotech.claimchecker.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.*;

@Entity
@Setter
@Getter
public class Claim implements Serializable {

    @Serial
    private static final long serialVersionUID = 2258649059439698747L;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;

    @NotNull
    private UUID claimId;

    @NotNull
    private String name;

    @NotNull
    private String inn;

    @NotNull
    private String kpp;

    @NotNull
    @OneToMany(mappedBy = "claim", fetch = LAZY, cascade = REMOVE)
    private Set<Organization> organizationList;

    @NotNull
    @OneToMany(mappedBy = "claim", fetch = LAZY, cascade = REMOVE)
    private Set<Branch> branches;
}
