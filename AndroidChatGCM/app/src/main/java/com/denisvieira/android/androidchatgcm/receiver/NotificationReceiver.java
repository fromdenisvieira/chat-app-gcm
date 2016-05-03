package com.denisvieira.android.androidchatgcm.receiver;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by denisvieira on 02/05/16.
 */
public class NotificationReceiver extends BroadcastReceiver {
    public static final String YES_NOTIFICATION_BUTTON = "com.denisvieira.android.androidchatgcm.receiver.YES_NOTIFICATION_BUTTON";
    public static final String MAYBE_NOTIFICATION_BUTTON = "com.denisvieira.android.androidchatgcm.receiver.MAYBE_NOTIFICATION_BUTTON";
    public static final String NO_NOTIFICATION_BUTTON = "com.denisvieira.android.androidchatgcm.receiver.NO_NOTIFICATION_BUTTON";

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if( action.equals( NotificationReceiver.YES_NOTIFICATION_BUTTON ) ){
            Toast.makeText(context, "Yes clicked - "+intent.getIntExtra("data", 0), Toast.LENGTH_SHORT).show();
        }
        else if( action.equals( NotificationReceiver.MAYBE_NOTIFICATION_BUTTON ) ){
            Toast.makeText(context, "Maybe clicked - "+intent.getIntExtra("data", 0), Toast.LENGTH_SHORT).show();
        }
        else if( action.equals( NotificationReceiver.NO_NOTIFICATION_BUTTON ) ){
            Toast.makeText(context, "No clicked - "+intent.getIntExtra("data", 0), Toast.LENGTH_SHORT).show();
        }

        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        nm.cancelAll();
    }
}
