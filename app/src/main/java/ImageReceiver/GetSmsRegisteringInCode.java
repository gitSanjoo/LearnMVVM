package ImageReceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.sanjoo.learnmvvm.R;

public class GetSmsRegisteringInCode extends AppCompatActivity {
    private BroadcastReceiver broadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_sms_registering_in_code);
        broadcastReceiver=new BroadClass();
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter=new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
        registerReceiver(broadcastReceiver,intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcastReceiver);
    }
}