package com.example.drinkwater;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class Notification_receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context,"notifyDW")
                .setSmallIcon(R.drawable.app_icon)
                .setContentTitle("Drink Water!!")
                .setContentText("Time to Drink Water to stay Healthy !!")
                .setPriority(Notification.PRIORITY_MAX)
                .setAutoCancel(true);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        notificationManager.notify(200,builder.build());
    }
}