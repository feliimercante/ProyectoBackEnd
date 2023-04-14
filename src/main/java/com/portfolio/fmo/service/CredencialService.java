package com.portfolio.fmo.service;

import com.portfolio.fmo.entities.Credencial;
import com.portfolio.fmo.repositories.ICredencialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class CredencialService {
    @Autowired
    ICredencialRepository credencialRepository;

    public Optional<Credencial> getByUserName (String username){
        return credencialRepository.findByUsername(username);
    }

    public boolean existsUsername(String userName){
        return credencialRepository.existsByUsername(userName);
    }
}
