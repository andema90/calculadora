package com.app.playtolife.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public TextView mauro;
    public Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mauro = (TextView) findViewById(R.id.mauro);
        ingresar = (Button) findViewById(R.id.ingresar);
        ingresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ingresar:
                Intent intent = new Intent(this,Calculator.class);
                startActivity(intent);
            break;
        }
    }
}
