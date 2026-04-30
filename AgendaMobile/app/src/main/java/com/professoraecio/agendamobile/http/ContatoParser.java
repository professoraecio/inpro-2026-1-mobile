package com.professoraecio.agendamobile.http;

import android.util.Log;

import com.professoraecio.agendamobile.model.Contato;

import org.json.*;

import java.util.ArrayList;

public class ContatoParser {

    public Contato getContatoFromJson(String contatoJson){
        Contato contato = new Contato();
        try {
            JSONObject jsonObject = new JSONObject(contatoJson);
            JSONArray contacts = jsonObject.getJSONArray("response");
            for (int i = 0 ; i < contacts.length();i++){
                JSONObject contact = contacts.getJSONObject(i);
                contato.setId_contato(contact.getInt("id"));
                contato.setNome(contact.getString("nome"));
                contato.setFone(contact.getString("fone"));
                contato.setEmail(contact.getString("email"));
            }
        }catch (Exception e){
            Log.d("DEBUG-MODE",e.toString());
        }

        return contato;
    }

    public ArrayList<Contato> getContatosFromJson(String contatoJson){
        Contato contato = new Contato();
        ArrayList<Contato> contatos = new ArrayList<Contato>();
        try {
            JSONObject jsonObject = new JSONObject(contatoJson);
            JSONArray contacts = jsonObject.getJSONArray("response");
            for (int i = 0 ; i < contacts.length();i++){
                JSONObject contact = contacts.getJSONObject(i);
                contato = new Contato();
                contato.setId_contato(contact.getInt("id"));
                contato.setNome(contact.getString("nome"));
                contato.setFone(contact.getString("fone"));
                contato.setEmail(contact.getString("email"));
                contatos.add(contato);
            }
        }catch (Exception e){
            Log.d("DEBUG-MODE",e.toString());
        }

        return contatos;
    }

}
