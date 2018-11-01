package com.dsc.dscbinusfirstmeetup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        // Membuat objek Button dan EditText berdasarkan komponen yang ada di activity_form.xml di nama btn_submit dan edt_name
        Button btnSubmit = findViewById(R.id.btn_submit);
        final EditText edtName = findViewById(R.id.edt_name);

        // Ketika btnSubmit di klik, maka...
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengkonversi tipe data edtName menjadi String
                String name = edtName.getText().toString();

                // Memunculkan popup (Toast) dengan output Welcome, [name] (nama yang sudah diketikkan)
                Toast.makeText(FormActivity.this, "Welcome, " + name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
