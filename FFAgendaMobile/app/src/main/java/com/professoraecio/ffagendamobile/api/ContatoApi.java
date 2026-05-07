package com.professoraecio.ffagendamobile.api;

import com.google.gson.Gson;
import com.professoraecio.ffagendamobile.http.HttpHelper;
import com.professoraecio.ffagendamobile.model.Contato;

public class ContatoApi {

    public String toJson(Contato contato){
        Gson gson = new Gson();
        String contatoJson = gson.toJson(contato);
        return  contatoJson;
    }

    // http://10.0.2.2:3000/api.agenda/contato-dao/create
    public String inserir(Contato contato){
        String contatoJson = this.toJson(contato);
        HttpHelper httpHelper = new HttpHelper();
        String reponse = httpHelper.post(contatoJson,"/api.agenda/contato-dao/create");
        return reponse;
    }

    // http://10.0.2.2:3000/api.agenda/contato-dao/getId?id=1
    public String buscar(Contato contato){
        HttpHelper httpHelper = new HttpHelper();
        String response = httpHelper.get("/api.agenda/contato-dao/getId?id=" + contato.getId_contato());
        return response;
    }

    // http://10.0.2.2:3000/api.agenda/contato-dao/getAll
    public String todos(){
        HttpHelper httpHelper = new HttpHelper();
        String response = httpHelper.get("/api.agenda/contato-dao/getAll");
        return response;
    }

    // http://10.0.2.2:3000/api.agenda/contato-dao/update
    public String atualizar(Contato contato){
        String contatoJson = this.toJson(contato);
        HttpHelper httpHelper = new HttpHelper();
        String response =
                httpHelper.post(contatoJson,
                        "/api.agenda/contato-dao/update");
        return response;
    }

    // http://10.0.2.2:3000/api.agenda/contato-dao/delete
    public String excluir(Contato contato){
        String contatoJson = this.toJson(contato);
        HttpHelper httpHelper = new HttpHelper();
        String response =
                httpHelper.post(contatoJson,
                        "/api.agenda/contato-dao/delete");
        return response;
    }

}
