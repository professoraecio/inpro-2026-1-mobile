package com.professoraecio.exemploutilsharedpreferences.ENUM;

public enum SHARED_PREFERENCES {

    USUARIO_KEY("USUARIO.KEY"),
    SENHA_KEY("SENHA.KEY");

    public String chave;

    SHARED_PREFERENCES(String chave){
        this.chave = chave;
    }
}
