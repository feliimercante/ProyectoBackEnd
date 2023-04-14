package com.portfolio.fmo.repositories;

import com.portfolio.fmo.entities.Credencial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICredencialRepository extends JpaRepository<Credencial,Integer> {
    public Optional<Credencial> findByUsername(String username);

    public boolean existsByUsername(String username);
}

