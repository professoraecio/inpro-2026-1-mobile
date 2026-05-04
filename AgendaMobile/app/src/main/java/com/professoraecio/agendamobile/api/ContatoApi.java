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

    public String inserir(Contato contato){
        String contatoJson = this.toJson(contato);
        HttpHelper httpHelper = new HttpHelper();
        String response =
                httpHelper.post(
                        "/api.agenda/contato-dao/create",
                        contatoJson
                );
        return response;
    }

    public String buscar(Contato contato){
        HttpHelper httpHelper = new HttpHelper();
        String response =
                httpHelper.get(
                        "/api.agenda/contato-dao/getId?id=" +
                                contato.getId_contato()
                );
        return response;
    }

    public String todos(){
        HttpHelper httpHelper = new HttpHelper();
        String response =
                httpHelper.get(
                        "/api.agenda/contato-dao/getAll"
                );
        return response;
    }

    public String atualizar(Contato contato){
        String contatoJson = this.toJson(contato);
        HttpHelper httpHelper = new HttpHelper();
        String response =
                httpHelper.post(
                        "/api.agenda/contato-dao/updateId",
                        contatoJson
                );
        return response;
    }

    public String excluir(Contato contato){
        String contatoJson = this.toJson(contato);
        HttpHelper httpHelper = new HttpHelper();
        String response =
                httpHelper.post(
                        "/api.agenda/contato-dao/deleteId",
                        contatoJson
                );
        return response;
    }
}
