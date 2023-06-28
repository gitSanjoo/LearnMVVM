package com.sanjoo.learnmvvm.retrofit.Tablayout.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import com.sanjoo.learnmvvm.R;

import java.util.Random;

public class MyService extends Service {

    private int mRandomNumber;
    private boolean mIsRandomGeneratorOn;

    private final int MIN=0;
    private final int MAX=100;

    class MyServiceBinder extends Binder{
        public MyService getService(){
            return MyService.this;
        }
    }

    private IBinder mBinder=new MyServiceBinder();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(getString(R.string.service_demo_tag),"In OnBind");
        return mBinder;
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(getString(R.string.service_demo_tag),"In onStartCommend, thread id: "+Thread.currentThread().getId());
        mIsRandomGeneratorOn =true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                startRandomNumberGenerator();
            }
        }).start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stopRandomNumberGenerator();
        Log.i(getString(R.string.service_demo_tag),"Service Destroyed");
    }

    private void startRandomNumberGenerator(){
        while (mIsRandomGeneratorOn){
            try{
                Thread.sleep(1000);
                if(mIsRandomGeneratorOn){
                    mRandomNumber =new Random().nextInt(MAX)+MIN;
                    Log.i(getString(R.string.service_demo_tag),"Thread id: "+Thread.currentThread().getId()+", Random Number: "+ mRandomNumber);
                }
            }catch (InterruptedException e){
                Log.i(getString(R.string.service_demo_tag),"Thread Interrupted");
            }

        }
    }
    private void stopRandomNumberGenerator(){
        mIsRandomGeneratorOn =false;
    }

}
