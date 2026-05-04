package com.professoraecio.agendamobile.api;

import com.google.gson.Gson;
import com.professoraecio.agendamobile.http.HttpHelper;
import com.professoraecio.agendamobile.model.Contato;

public class ContatoApi {

    public String toJson(Contato contato){
        Gson gson = new Gson();
        String contatoJson = gson.toJson(contato);
        return contatoJson;
    }
}
