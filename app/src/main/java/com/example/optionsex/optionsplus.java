package com.example.optionsex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class optionsplus extends AppCompatActivity {
    LinearLayout cl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optionsplus);

        cl2=(LinearLayout)findViewById(R.id.cl2);
    }

    public void gofirst(View view) {
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add(0,0,250,"red");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.blue)
            cl2.setBackgroundColor(Color.BLUE);
        else if(id==R.id.black)
            cl2.setBackgroundColor(Color.BLACK);
        else if (id==0)
            cl2.setBackgroundColor(Color.RED);
        else
            cl2.setBackgroundColor(Color.GREEN);
        return super.onOptionsItemSelected(item);
    }
}