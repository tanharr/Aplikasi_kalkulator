package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    RadioGroup rdButton;
    RadioButton rdTambah, rdKurang, rdKali, rdBagi;
    Button btHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= (EditText) findViewById(R.id.editText1);
        et2= (EditText) findViewById(R.id.editText2);
        rdButton=(RadioGroup) findViewById(R.id.radioGroup3);
        rdTambah=(RadioButton) findViewById(R.id.radioTambah);
        rdKurang=(RadioButton) findViewById(R.id.radioKurang);
        rdKali=(RadioButton) findViewById(R.id.radioKali);
        rdBagi=(RadioButton) findViewById(R.id.radioBagi);
        btHasil=(Button) findViewById(R.id.buttonHasil);

        rdTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(et1.getText().toString().trim());
                bil2=Double.valueOf(et2.getText().toString().trim());
                hasil=bil1+bil2;
                String hasil1=String.valueOf(hasil);
                btHasil.setText(hasil1);
            }
        });
        rdKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(et1.getText().toString().trim());
                bil2=Double.valueOf(et2.getText().toString().trim());
                hasil=bil1-bil2;
                String hasil1=String.valueOf(hasil);
                btHasil.setText(hasil1);
            }
        });
        rdKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(et1.getText().toString().trim());
                bil2=Double.valueOf(et2.getText().toString().trim());
                hasil=bil1*bil2;
                String hasil1=String.valueOf(hasil);
                btHasil.setText(hasil1);
            }
        });

        rdBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(et1.getText().toString().trim());
                bil2=Double.valueOf(et2.getText().toString().trim());
                hasil=bil1/bil2;
                String hasil1=String.valueOf(hasil);
                btHasil.setText(hasil1);
            }
        });
    }
}