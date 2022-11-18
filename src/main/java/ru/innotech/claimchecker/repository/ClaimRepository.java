package ru.innotech.claimchecker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.innotech.claimchecker.entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long> {
}
