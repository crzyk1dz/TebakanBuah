package com.example.tebakanbuah;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.os.Handler;

public class TebakActivity extends AppCompatActivity {

    ImageView imageView_tebak;
    EditText editText_jawaban;
    Button button_cek;

    String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);

        inisialisasiKomponen();
        cekIntent();
        onClickCek();
    }

    private void onClickCek() {
        button_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jawabanUser = editText_jawaban.getText().toString();
                if (jawabanUser.equals(jawaban)){
                    Toast.makeText(TebakActivity.this,"Jawaban benar!",Toast.LENGTH_SHORT).show();
                    // Menunda pemulihan ke MainActivity selama 2 detik
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // Memulai MainActivity setelah 2 detik
                            Intent intent = new Intent(TebakActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish(); // Opsional, untuk menutup aktivitas saat ini
                        }
                    }, 2000); // 2000 milidetik = 2 detik
                } else {
                    Toast.makeText(TebakActivity.this,"Jawaban salah!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void cekIntent() {
        Intent intent = getIntent();
        if (intent != null) {
            String namaBuah = intent.getStringExtra("nama_buah");
            if (namaBuah != null) {
                switch (namaBuah) {
                    case "alpukat":
                        imageView_tebak.setImageResource(R.drawable.alpukat);
                        jawaban = "alpukat";
                        break;
                    case "apel":
                        imageView_tebak.setImageResource(R.drawable.apel);
                        jawaban = "apel";
                        break;
                    case "durian":
                        imageView_tebak.setImageResource(R.drawable.durian);
                        jawaban = "durian";
                        break;
                    case "jambuair":
                        imageView_tebak.setImageResource(R.drawable.jambuair);
                        jawaban = "jambuair";
                        break;
                    case "manggis":
                        imageView_tebak.setImageResource(R.drawable.manggis);
                        jawaban = "manggis";
                        break;
                    case "stawberry":
                        imageView_tebak.setImageResource(R.drawable.strawberry);
                        jawaban = "stawberry";
                        break;
                    default:
                        imageView_tebak.setImageResource(R.drawable.ceri);
                        jawaban = "ceri";
                        break;
                }
            }
        }
    }

    private void inisialisasiKomponen() {
        imageView_tebak = findViewById(R.id.imageView_tebak);
        editText_jawaban = findViewById(R.id.editText_jawab);
        button_cek = findViewById(R.id.buttonCek);
    }
}
