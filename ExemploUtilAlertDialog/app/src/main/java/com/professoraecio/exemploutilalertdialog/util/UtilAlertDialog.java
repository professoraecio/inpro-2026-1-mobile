package com.professoraecio.exemploutilalertdialog.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class UtilAlertDialog {

    public static void mostrarAlerta(Context context,
                                     String titulo,
                                     String mensagem){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(titulo)
                .setMessage(mensagem)
                .setPositiveButton("OK",null)
                .show();
    }

    public static void mostrarAlertaComAcao(Context context,
                                            String titulo,
                                            String mensagem,
                                            DialogInterface.OnClickListener botaoSim,
                                            DialogInterface.OnClickListener botaoNao){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(titulo)
                .setMessage(mensagem)
                .setPositiveButton("Sim",botaoSim)
                .setNegativeButton("Não",botaoNao)
                .show();
    }

}
