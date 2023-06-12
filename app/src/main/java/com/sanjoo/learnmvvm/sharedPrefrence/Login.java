package com.sanjoo.learnmvvm.sharedPrefrence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sanjoo.learnmvvm.R;

public class Login extends AppCompatActivity {

    EditText email,pass;
    Button btn;
    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.log_email1);
        pass=findViewById(R.id.password1);

        sessionManager=new SessionManager(getApplicationContext());
        btn=findViewById(R.id.login_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String log_email=email.getText().toString();
//                String log_pass=email.getText().toString();

                if(email.getText().toString().equals("sanju@gmail.com") && pass.getText().toString().equals("12345")){
                    sessionManager.createSession("sanju","sanju@gmail.com","123456789");

                    Intent intent=new Intent(getApplicationContext(),Profile.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"email or password didn't match",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    public void openRegisterScreen(View view){
        Intent intent=new Intent(this,RegisterScreen.class);
        startActivity(intent);
    }
}