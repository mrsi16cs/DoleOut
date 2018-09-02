package com.redmi.doleout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final Button bFood=(Button) findViewById(R.id.bFood);
        final Button bClothes=(Button) findViewById(R.id.bClothes);
        final Button bOthers=(Button) findViewById(R.id.bOthers);
    }
}
