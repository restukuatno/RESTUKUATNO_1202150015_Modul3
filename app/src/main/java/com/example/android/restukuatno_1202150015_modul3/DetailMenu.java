package com.example.android.restukuatno_1202150015_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMenu extends AppCompatActivity {

    private Button btnAdd, btnMin;
    private ImageView progress, rImg;
    private TextView rJudul, rDesc, rStats;
    private int level =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailitem);

        btnAdd = findViewById(R.id.btnIsiTambah);
        btnMin = findViewById(R.id.btnIsiKurang);
        progress = findViewById(R.id.imgIsi);

        rJudul = findViewById(R.id.rJudul);
        rDesc = findViewById(R.id.rDeskripsi);
        rImg = findViewById(R.id.rImg);
        rStats = findViewById(R.id.rStatus);

        Intent in = getIntent();
        String title=in.getStringExtra("etitle");
        String description=in.getStringExtra("edesc");
        if(description.length()<1){description="Tidak Ada Deskripsi\n";}
        int imgRes = in.getIntExtra("eimg",0);

        setTitle(title);
        rJudul.setText(title);
        rDesc.setText(description);
        rImg.setImageResource(imgRes);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahIsi();
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kurangIsi();
            }
        });
    }


    public void tambahIsi(){
        if(level==6){Toast.makeText(this,"Air Telah Penuh",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(++level);
        status();
    }

    public void kurangIsi(){

        if(level==0){Toast.makeText(this,"Air Masih Kosong",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(--level);
        status();
    }

    public void status(){
        rStats.setText(""+level+"L");
    }
}
