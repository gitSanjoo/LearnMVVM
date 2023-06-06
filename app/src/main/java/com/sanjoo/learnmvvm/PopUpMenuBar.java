package com.sanjoo.learnmvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopUpMenuBar extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu_bar);
        btn=findViewById(R.id.popup_btn);
    }
    public void Click_me(View view){
        PopupMenu popupMenu=new PopupMenu(PopUpMenuBar.this,btn);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menubars,popupMenu.getMenu());
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                int item_id = item.getItemId();
                switch (item_id) {

                    case R.id.option_one:
                        Toast.makeText(PopUpMenuBar.this,"menu 1",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.option_two:
                        Toast.makeText(PopUpMenuBar.this, "option2 selected", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.optionthree:
                        Toast.makeText(PopUpMenuBar.this, "option3 selected", Toast.LENGTH_SHORT).show();
                        return true; case R.id.option_four:
                        Toast.makeText(PopUpMenuBar.this, "option4 selected", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        Toast.makeText(PopUpMenuBar.this, "nothing selected", Toast.LENGTH_SHORT).show();
                        return true;

                }
            }
        });
        popupMenu.show();
    }
}