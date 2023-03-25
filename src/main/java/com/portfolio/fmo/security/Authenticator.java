package com.portfolio.fmo.security;

import com.portfolio.fmo.entities.Credencial;
import com.portfolio.fmo.service.CredencialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Objects;
import java.util.Optional;

public class Authenticator {
    @Autowired
    CredencialService service;

    public boolean authenticate(String username, String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (!service.existsUsername(username)) return false;

        Optional<Credencial> credencial = service.getByUserName(username);
        String password1 =  credencial.get().getPassword();

        return Objects.equals(password1, encoder.encode(password));
    }
}
