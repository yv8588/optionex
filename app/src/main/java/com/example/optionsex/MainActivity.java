package com.example.optionsex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout cl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cl=(LinearLayout)findViewById(R.id.cl);
    }

    public void gosec(View view) {
        Intent si =new Intent(this,optionsplus.class);
        startActivity(si);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.blue)
            cl.setBackgroundColor(Color.BLUE);
        else if(id==R.id.black)
            cl.setBackgroundColor(Color.BLACK);
        else
            cl.setBackgroundColor(Color.GREEN);
        return super.onOptionsItemSelected(item);
    }
}