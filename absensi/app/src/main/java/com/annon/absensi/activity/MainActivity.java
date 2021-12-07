package com.annon.absensi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.annon.absensi.R;

public class MainActivity extends AppCompatActivity {

    private Button scan, hadir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scan = findViewById(R.id.btn_scan);

        hadir = findViewById(R.id.btn_hadir);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Ketika tombol scan di tekan apa yg terjadi
                //Ke halaman scan

            }
        });

        hadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Ketika tombol hadir di tekan apa yg terjadi
                //Ke halaman daftar hadir
            }
        });
    }
}