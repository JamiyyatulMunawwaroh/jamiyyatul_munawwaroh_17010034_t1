package com.jamiyyatulmunawwaroh.lempardadu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.Random;

public class lempardaduActivity extends AppCompatActivity {
    //inisialisasi kelas
    private Button tblAcak;
    private TextView txtText;
    private ImageView imgSatu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lempardadu);

        txtText = findViewById(R.id.txtText);
        imgSatu = findViewById(R.id.imgSatu);
        tblAcak = findViewById(R.id.btnAcak);

        //memberikan listener pada button
        tblAcak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // perintah button

//                // context: activity // text = terserah // long/short = durasi
//                Toast.makeText(lempardaduActivity.this, "Hello JavaPoint", Toast.LENGTH_LONG).show();

                //fungsi toast
                //toast();
                //fungsi lempar dadu
                lempardadu();
                gantiGambar();



            }
        });


    }

    private void gantiGambar() {

        Random acak = new Random();

        //membuat array drawable (gambar) dadu // drawable returnnya int
        int [] gambar = new int[6];
        gambar[0] = R.drawable.dice_1;
        gambar[1] = R.drawable.dice_2;
        gambar[2] = R.drawable.dice_3;
        gambar[3] = R.drawable.dice_4;
        gambar[4] = R.drawable.dice_5;
        gambar[5] = R.drawable.dice_6;

        //mengeset gambar dengan drawable baru + di acak
        imgSatu.setImageResource(gambar[acak.nextInt(5)]);
    }

    private void lempardadu() {
        //memanggil fungsi acak
        Random acak = new Random();
////        //membuat variabel angka
        String angka = String.valueOf(1+ acak.nextInt (6));
        txtText.setText(angka);

//        int angka[] = {1,2,3,4,5,6};
//        for (int x = 1; x<=6; x++){
//            String angka = String.valueOf(x +" ");
//        }


        if (angka.equals("6")){
            Toast.makeText(lempardaduActivity.this, "Maksimum", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(lempardaduActivity.this, "Belum Maksimum", Toast.LENGTH_SHORT).show();
        }


    }

    private void toast() {

        // context: activity // text = terserah // long/short = durasi
        Toast.makeText(lempardaduActivity.this, "Hello JavaPoint", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        txtText.setText("Hello World");
    }
}
