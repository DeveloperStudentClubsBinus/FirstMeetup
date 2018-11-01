package com.dsc.dscbinusfirstmeetup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Membuat objek dari Button btnVertical dengan id komponen btn_vertical
        // Untuk mengetahui lebih lanjut apa itu objek, class, extends, dll Anda bisa pelajari mengenai OOP (Object Oriented Programming)
        Button btnVertical = findViewById(R.id.btn_vertical);
        Button btnHorizontal = findViewById(R.id.btn_horizontal);
        Button btnForm = findViewById(R.id.btn_form);

        // Ketika objek btnForm di klik, maka...
        btnForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke page atau activity FormActivity
                // Intent merupakan syntax yang dapat memungkinkan Anda untuk berpindah dari satu activity ke activity lainnya
                Intent intent = new Intent(getApplicationContext(), FormActivity.class);
                startActivity(intent);
            }
        });

        // Ketika objek btnVertical di klik, maka...
        btnVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke page atau activity LinearVerticalActivity
                // Intent merupakan syntax yang dapat memungkinkan Anda untuk berpindah dari satu activity ke activity lainnya
                Intent intent = new Intent(getApplicationContext(), LinearVerticalActivity.class);
                startActivity(intent);
            }
        });

        // Ketika objek btnHorizontal di klik, maka...
        btnHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke page atau activity LinearHorizontalActivity
                // Intent merupakan syntax yang dapat memungkinkan Anda untuk berpindah dari satu activity ke activity lainnya
                Intent intent = new Intent(getApplicationContext(), LinearHorizontalActivity.class);
                startActivity(intent);
            }
        });
    }
}
