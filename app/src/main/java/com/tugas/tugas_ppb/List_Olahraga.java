package com.tugas.tugas_ppb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class List_Olahraga extends AppCompatActivity {
    Button listolahraga, about, exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__olahraga);
        listolahraga = (Button) findViewById(R.id.List_olahraga);
        about = (Button) findViewById(R.id.About);
        exit = (Button) findViewById(R.id.Exit);

        listolahraga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(List_Olahraga.this, KumpulanOlahraga.class);
                startActivity(i);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(List_Olahraga.this, About.class);
                startActivity(i);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_logout){
            Intent intbacklogin = new Intent(List_Olahraga.this, MainActivity.class);
            startActivity(intbacklogin);
        }
        else if(item.getItemId()==R.id.action_list){
            Intent intbacklogin = new Intent(List_Olahraga.this, KumpulanOlahraga.class);
            startActivity(intbacklogin);
        }
        return super.onOptionsItemSelected(item);
    }
}
