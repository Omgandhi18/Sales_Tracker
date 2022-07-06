package com.example.salestracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edt1,edt2;
Button btn;
String user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=(EditText)findViewById(R.id.edt1);
        edt2=(EditText)findViewById(R.id.edt2);
        btn=(Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = edt1.getText().toString();
                pass = edt2.getText().toString();
                if((user.equals("admin")) && (pass.equals("admin123")))
                {
                    Intent i=new Intent(getApplicationContext(),MainPage.class);
                    edt1.setText("");
                    edt2.setText("");
                    finish();
                    startActivity(i);
                }
            }
        });
    }
}