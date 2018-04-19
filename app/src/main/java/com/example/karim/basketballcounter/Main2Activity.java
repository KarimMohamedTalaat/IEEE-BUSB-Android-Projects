package com.example.karim.basketballcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button goToTheAppBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        goToTheAppBtn = (Button) findViewById(R.id.app_btn);

        goToTheAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent basketballActivity = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(basketballActivity);
            }
        });
    }
}
