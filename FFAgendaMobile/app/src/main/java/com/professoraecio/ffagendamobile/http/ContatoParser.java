package com.professoraecio.ffagendamobile.http;

import android.util.Log;

import com.professoraecio.ffagendamobile.model.Contato;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

public class ContatoParser {

    public Contato getContatoFromJson(String jsonString){
        Contato contato = new Contato();
        try{
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray contacts  = jsonObject.getJSONArray("response");
            for(int i = 0; i < contacts.length() ; i++){
                JSONObject contact = contacts.getJSONObject(i);
                String nome = contact.getString("nome");
                String email = contact.getString("email");
                String fone = contact.getString("fone");
                int id = contact.getInt("id");
                contato.setId_contato(id);
                contato.setNome(nome);
                contato.setFone(fone);
                contato.setEmail(email);
            }
        }catch (Exception e){
            Log.d("debug-mode",e.toString());
        }
        return contato;
    }

    public ArrayList<Contato> getContatosFromJson(String jsonString){
        Contato contato = new Contato();
        ArrayList<Contato> contatos = new ArrayList<Contato>();
        try{
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray contacts = jsonObject.getJSONArray("response");
            for(int i = 0 ; i < contacts.length() ; i++){
                JSONObject contact = contacts.getJSONObject(i);
                String nome = contact.getString("nome");
                String email = contact.getString("email");
                String fone = contact.getString("fone");
                int id = contact.getInt("id");
                contato = new Contato();
                contato.setNome(nome);
                contato.setEmail(email);
                contato.setFone(fone);
                contato.setId_contato(id);
                contatos.add(contato);
            }
        }catch(JSONException e){
            Log.d("debug-mode",e.toString());
        }
        return contatos;
    }

}
