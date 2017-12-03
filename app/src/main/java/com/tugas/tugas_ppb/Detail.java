package com.tugas.tugas_ppb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {
    TextView pilihol, counterwaktu;
    Button plus, minus, lakukan;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        pilihol = (TextView) findViewById(R.id.ol_pilih);
        counterwaktu = (TextView) findViewById(R.id.counter);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        lakukan = (Button) findViewById(R.id.lakukan);

        counter = 0;
        final String piliholahraga = getIntent().getStringExtra("olahraga");
        pilihol.setText(piliholahraga);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(counter==0){
                    minus.setEnabled(false);
                }
                else{
                    counter = counter-1;
                    counterwaktu.setText(String.valueOf(counter));
                }

            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(counter>=0){
                    counter = counter+1;
                    counterwaktu.setText(String.valueOf(counter));
                    minus.setEnabled(true);
                }
            }
        });

        lakukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Anda akan melakukan olahraga "+
                                piliholahraga+" selama "+
                                counterwaktu.getText().toString()+" jam",Toast.LENGTH_LONG).show();

            }
        });
    }
}
