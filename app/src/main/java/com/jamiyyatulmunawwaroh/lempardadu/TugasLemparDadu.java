package com.jamiyyatulmunawwaroh.lempardadu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class TugasLemparDadu extends AppCompatActivity {

    ImageView dadu;
    TextView aangka;
    Button aacak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_lempar_dadu);

        dadu = findViewById(R.id.imgSatu);
        aangka = findViewById(R.id.txt_angka);
        aacak = findViewById(R.id.btn_aacak);

        aacak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pergantiandadu();
                acakangka();
            }
        });
    }

    private void acakangka() {
        Random acak = new Random();
        String angka = String.valueOf(1+ acak.nextInt(6));
        aangka.setText(angka);


        if (angka.equals("6")){
            Toast.makeText(TugasLemparDadu.this, "Sudah Maksimum", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(TugasLemparDadu.this, "Belum Maksimum", Toast.LENGTH_SHORT).show();
//            lempardadu();
        }
//        String angka = String.valueOf(aangka);
//        for (int i=1; i<=6; i++){
//            aangka.setText(i);
//        }

    }

    private void pergantiandadu() {

        Random random = new Random();

        int [] gambardadu = new int[6];
        gambardadu[0] = R.drawable.dice_1;
        gambardadu[1] = R.drawable.dice_2;
        gambardadu[2] = R.drawable.dice_3;
        gambardadu[3] = R.drawable.dice_4;
        gambardadu[4] = R.drawable.dice_5;
        gambardadu[5] = R.drawable.dice_6;

        dadu.setImageResource(gambardadu[random.nextInt(5)]);
    }

    @Override
    protected void onStart() {
        super.onStart();
        aangka.setText("Hello World");
    }
}
