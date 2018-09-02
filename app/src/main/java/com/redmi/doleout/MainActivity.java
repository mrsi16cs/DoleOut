package com.redmi.doleout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etUsername=(EditText) findViewById(R.id.etUsername);
        final EditText etPassword=(EditText) findViewById(R.id.etPassword);
        final Button bLogin=(Button) findViewById (R.id.bLogin);
        final TextView regiterLink=(TextView) findViewById(R.id.tvRegisterHere);
        regiterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent=new Intent(MainActivity.this,RegisterActivity.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });
    }
}
