package com.example.tebakanbuah;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_apel, imageView_durian, imageView_ceri, imageView_alpukat,
    imageView_jambuair, imageView_manggis, imageView_stawberry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInisialisasi();
        onClickMantab();
    }

    private void setInisialisasi() {
        imageView_alpukat = findViewById(R.id.imageView_alpukat);
        imageView_apel = findViewById(R.id.imageView_apel);
        imageView_ceri = findViewById(R.id.imageView_ceri);
        imageView_durian = findViewById(R.id.imageView_durian);
        imageView_jambuair = findViewById(R.id.imageView_jambuair);
        imageView_manggis = findViewById(R.id.imageView_manggis);
        imageView_stawberry = findViewById(R.id.imageView_stawberry);
    }

    private void onClickMantab() {

        imageView_durian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this, TebakActivity.class);
                d.putExtra("nama_buah", "durian");
                startActivity(d);
            }
        });

        imageView_ceri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this, TebakActivity.class);
                c.putExtra("nama_buah", "ceri");
                startActivity(c);
            }
        });

        imageView_apel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, TebakActivity.class);
                a.putExtra("nama_buah", "apel");
                startActivity(a);
            }
        });

        imageView_alpukat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(MainActivity.this, TebakActivity.class);
                al.putExtra("nama_buah", "alpukat");
                startActivity(al);
            }
        });

        imageView_jambuair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(MainActivity.this, TebakActivity.class);
                al.putExtra("nama_buah", "jambuair");
                startActivity(al);
            }
        });

        imageView_manggis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(MainActivity.this, TebakActivity.class);
                al.putExtra("nama_buah", "manggis");
                startActivity(al);
            }
        });

        imageView_stawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(MainActivity.this, TebakActivity.class);
                al.putExtra("nama_buah", "stawberry");
                startActivity(al);
            }
        });
    }
}
