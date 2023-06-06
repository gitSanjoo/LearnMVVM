package com.sanjoo.learnmvvm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ContextMenuBar extends AppCompatActivity {

    ListView contactList;
    String[] contacts = {"A", "B", "gksfhk", "gfk", "rttsyiushii"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu_bar);
        contactList = findViewById(R.id.contact_list);

        registerForContextMenu(contactList);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contacts);
        contactList.setAdapter(adapter);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.context_menubars, menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int item_id = item.getItemId();
        switch (item_id) {
            case R.id.call:
                Toast.makeText(this, "calling", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.msg:
                Toast.makeText(this, "messaged", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}