package com.tugas.tugas_ppb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, pass;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.editusername);
        pass = (EditText) findViewById(R.id.editpassword);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = user.getText().toString();
                String password = pass.getText().toString();

                if(username.equals("admin")&&password.equals("admin")){
                    Intent i = new Intent(MainActivity.this, List_Olahraga.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Username dan password anda salah",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
