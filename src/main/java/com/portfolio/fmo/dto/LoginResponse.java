package com.portfolio.fmo.dto;

public class LoginResponse {
    private boolean autenticado;

    public LoginResponse(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }
}
