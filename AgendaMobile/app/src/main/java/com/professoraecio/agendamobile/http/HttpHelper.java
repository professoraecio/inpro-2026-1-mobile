package com.professoraecio.agendamobile.http;

import android.os.StrictMode;

import android.util.Log;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class HttpHelper {

    public static final String URL_BASE =
            "http://10.0.2.2:3000";

    static {
        StrictMode.ThreadPolicy policy =
                new StrictMode.ThreadPolicy.
                        Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    public String get(String url){
        String responseString = "";
        final String URL = URL_BASE + url;
        final MediaType headerhttp =
                MediaType.parse("application/json; charset=UTF-8");

        final OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(URL).get().build();
        try {
            Response response = client.newCall(request).execute();
            ResponseBody responseBody = response.body(); // resultado req
            if(responseBody != null){
                responseString = responseBody.string();
                Log.d("DEBUG-MODE",responseString);
            }
        }catch (Exception e){
            Log.d("DEBUG-MODE",e.toString());
            responseString = e.toString();
        }
        return responseString;
    }

    public String post(String url, String json){
        String responseString = "";
        final String URL = URL_BASE + url;
        final MediaType headerhttp =
                MediaType.parse("application/json; charset=UTF-8");

        final OkHttpClient client = new OkHttpClient();
        final RequestBody body = RequestBody.create(headerhttp,json);
        Request request = new Request.Builder().url(URL).post(body).build(); // post
        try {
            Response response = client.newCall(request).execute();
            ResponseBody responseBody = response.body(); // resultado req
            if(responseBody != null){
                responseString = responseBody.string();
                Log.d("DEBUG-MODE",responseString);
            }
        }catch (Exception e){
            Log.d("DEBUG-MODE",e.toString());
            responseString = e.toString();
        }
        return responseString;
    }
}










