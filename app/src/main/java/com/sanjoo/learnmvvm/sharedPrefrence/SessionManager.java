package com.sanjoo.learnmvvm.sharedPrefrence;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class SessionManager {
    Context context;
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    public final String KEY_IF_LOGGED_IN="key_session_if_loggedin";
    private final String KEY_NAME="key_session_name";
    private final String KEY_EMAIL="key_session_email";
    private final String KEY_PHNO="key_session_phno";
    private final String PREF_FILE_NAME="SHOPPING";
    private final int PRIVATE_MODE=0;

   public SessionManager(Context context){
       this.context=context;
       sp=context.getSharedPreferences(PREF_FILE_NAME,PRIVATE_MODE);
       editor= sp.edit();
    }

    public boolean checkSession(){
       if(sp.contains(KEY_IF_LOGGED_IN)){
           return true;
       }
       else {
           return false;
       }
    }
    public void createSession(String name,String email,String phno){
       editor.putString(KEY_NAME,name);
       editor.putString(KEY_EMAIL,email);
       editor.putString(KEY_PHNO,phno);
       editor.putBoolean(KEY_IF_LOGGED_IN,true);
       editor.commit();
    }
    public String getSessionDetails(String key){
       String value=sp.getString(key,null);
       return value;
    }

    public void logoutSession(){
       editor.clear();
       editor.commit();

        Intent intent=new Intent(context,Login.class);
        context.startActivity(intent);
    }
}







