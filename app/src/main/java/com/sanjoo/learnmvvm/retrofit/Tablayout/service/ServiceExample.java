package com.sanjoo.learnmvvm.retrofit.Tablayout.service;

import static com.sanjoo.learnmvvm.retrofit.Tablayout.service.ChannelClass.channel_id;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.sanjoo.learnmvvm.R;

public class ServiceExample extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
    Intent notiIntent=new Intent(this,MainActivity.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,notiIntent,0);
        Notification notification=new NotificationCompat.Builder(this,channel_id)
                .setContentTitle("My notification")
                .setContentText("this is my notification")
                .setSmallIcon(R.drawable.ic_share)
                .setContentIntent(pendingIntent).build();
        startForeground(1,notification);
        return START_NOT_STICKY;
    }
}
