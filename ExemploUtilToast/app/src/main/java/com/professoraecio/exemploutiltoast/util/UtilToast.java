package com.professoraecio.exemploutiltoast.util;

import android.content.Context;
import android.widget.Toast;

public class UtilToast {

    public static void showToast(Context context,
                                 String message,
                                 int duration){
        Toast.makeText(context,message,duration).show();
    }

    public static void alertaCurto(Context context,
                                   String message){
        showToast(context,message,Toast.LENGTH_SHORT);
    }

    public static void alertaLongo(Context context,
                                   String message){
        showToast(context,message,Toast.LENGTH_LONG);
    }

}
