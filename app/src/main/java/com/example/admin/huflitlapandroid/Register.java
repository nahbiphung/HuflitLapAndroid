package com.example.admin.huflitlapandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText edt1, edt2, edt3;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edt1 = findViewById(R.id.email);
        edt2 = findViewById(R.id.password);
        edt3 = findViewById(R.id.confirmPassword);

        btn1 = findViewById(R.id.createAccount);
        btn2 = findViewById(R.id.haveAccount);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edt1.getText().toString();
                String pass = edt2.getText().toString();
                String confirm = edt2.getText().toString();

                if(pass.compareToIgnoreCase(confirm) == 0){
                    Intent intent = new Intent(Register.this,Login.class);
                    intent.putExtra("name", email);
                    intent.putExtra("pass", pass);
                    setResult(101,intent);
                    finish();
                    Toast.makeText(Register.this,"Registered !!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this,Login.class);
                startActivity(intent);
            }
        });
    }
}
