package com.portfolio.fmo.controller;

import com.portfolio.fmo.dto.LoginResponse;
import com.portfolio.fmo.dto.LoginUsuario;
import com.portfolio.fmo.security.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
    @Autowired
    Authenticator authenticator;
    public ResponseEntity<LoginResponse> login(@RequestBody LoginUsuario loginUsuario){
        boolean auth = authenticator.authenticate(loginUsuario.getUserName(), loginUsuario.getPassword());
        return new ResponseEntity<>(new LoginResponse(auth), HttpStatus.OK);
    }
}
