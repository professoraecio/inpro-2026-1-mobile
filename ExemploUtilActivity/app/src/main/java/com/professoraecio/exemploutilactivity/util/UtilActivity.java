package com.professoraecio.exemploutilactivity.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class UtilActivity {

    public static void mudarActivity(Context context,
                                     Class<?> activityDestino){
        Intent intent = new Intent(context,activityDestino);
        context.startActivity(intent);
    }

    public static void mudarEFecharActivity(Activity activityAtual,
                                            Class<?> activityDestino){
        Intent intent = new Intent(activityAtual,activityDestino);
        activityAtual.startActivity(intent);
        activityAtual.finish();
    }


}
