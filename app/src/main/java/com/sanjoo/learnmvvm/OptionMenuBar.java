package com.sanjoo.learnmvvm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionMenuBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_bar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menubars,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
              int item_id=item.getItemId();
              switch (item_id) {
                  case R.id.option_one:
                      Toast.makeText(this, "option1 selected", Toast.LENGTH_SHORT).show();
                      return true;
                  case R.id.option_two:
                      Toast.makeText(this, "option2 selected", Toast.LENGTH_SHORT).show();
                      return true;
                  case R.id.optionthree:
                      Toast.makeText(this, "option3 selected", Toast.LENGTH_SHORT).show();
                      return true; case R.id.option_four:
                      Toast.makeText(this, "option4 selected", Toast.LENGTH_SHORT).show();
                      return true;
                  default:
                      return super.onOptionsItemSelected(item);
              }
    }
}