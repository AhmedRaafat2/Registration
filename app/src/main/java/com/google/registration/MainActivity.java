package com.google.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView title;
    private EditText full_name, company, email, phone, pasword;
    private Button register_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);
        full_name = findViewById(R.id.full_name);
        company = findViewById(R.id.company);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        pasword = findViewById(R.id.password);
        register_btn = findViewById(R.id.register_btn);
        register_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.register_btn:
                if (full_name.getText().toString().length() == 0) {
                    Toast.makeText(this, R.string.full_name_empty, Toast.LENGTH_SHORT).show();
                    break;
                } else if (full_name.getText().toString().length() >= 32) {
                    Toast.makeText(this, R.string.full_name_big, Toast.LENGTH_SHORT).show();
                    break;
                } else if (company.getText().toString().length() == 0) {
                    Toast.makeText(this, R.string.compant_empty, Toast.LENGTH_SHORT).show();
                    break;
                } else if (email.getText().toString().length() == 0) {
                    Toast.makeText(this, R.string.email_empty, Toast.LENGTH_SHORT).show();
                } else if (phone.getText().toString().length() == 0) {
                    Toast.makeText(this, R.string.phone_empty, Toast.LENGTH_SHORT).show();
                    break;
                } else if (company.getText().toString().length() > 11 && company.getText().toString().length() < 11) {
                    Toast.makeText(this, R.string.phone_not_valid, Toast.LENGTH_SHORT).show();
                    break;
                } else if (pasword.getText().toString().length() == 0) {
                    Toast.makeText(this, R.string.password_empty, Toast.LENGTH_SHORT).show();
                    break;
                } else if (pasword.getText().toString().length() < 8) {
                    Toast.makeText(this, R.string.password_not_valid, Toast.LENGTH_SHORT).show();
                    break;
                }
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                finish();
        }


    }
}
