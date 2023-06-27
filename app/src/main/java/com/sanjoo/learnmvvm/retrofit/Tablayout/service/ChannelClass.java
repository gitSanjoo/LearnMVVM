package com.sanjoo.learnmvvm.retrofit.Tablayout.service;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class ChannelClass extends Application {
    public static final String channel_id="myChannel";

    @Override
    public void onCreate() {
        super.onCreate();

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel notificationChannel=new NotificationChannel(
                    channel_id,"Service Example",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            NotificationManager notificationManager=getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
