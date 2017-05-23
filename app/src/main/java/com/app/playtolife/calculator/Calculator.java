package com.app.playtolife.calculator;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity implements View.OnClickListener{

    String vector[] = {"","","",""};
    String vector2[] = new String[4];
    String infoSuma,infoResta,infoMultiplicacion,infoDivision;

    RadioGroup radioGroup;
    TextView resultado;
    EditText numberOne;
    EditText numberTwo;
    Button button;

    float result,valorUno,valorTwo;

    public void analisis(){
        String aux = "si";
        for(int i=0;i<=3;i++){
            if(vector[i] == "") {
                aux = "no";
            }
        }
        if (aux == "si"){
            button.setEnabled(true);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        resultado = (TextView) findViewById(R.id.textView4);

        numberOne = (EditText) findViewById(R.id.editText7);
        numberTwo = (EditText) findViewById(R.id.editText8);

        radioGroup = (RadioGroup)findViewById(R.id.radiogrupo);

        button = (Button) findViewById(R.id.button);
        button.setEnabled(false);
        button.setOnClickListener(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if(i == R.id.suma){
                    valorUno = Integer.parseInt(numberOne.getText().toString());
                    valorTwo = Integer.parseInt(numberTwo.getText().toString());
                    result = valorUno+valorTwo;
                    vector[0] = "ok";
                    infoSuma = String.valueOf(result);
                    analisis();

                    resultado.setText(String.valueOf(result));
                }else if(i == R.id.resta){
                    valorUno = Integer.parseInt(numberOne.getText().toString());
                    valorTwo = Integer.parseInt(numberTwo.getText().toString());
                    result = valorUno-valorTwo;
                    vector[1] = "ok";
                    infoResta = String.valueOf(result);
                    analisis();

                    resultado.setText(String.valueOf(result));
                }else if(i == R.id.multiplicacion){
                    valorUno = Integer.parseInt(numberOne.getText().toString());
                    valorTwo = Integer.parseInt(numberTwo.getText().toString());
                    result = valorUno*valorTwo;
                    vector[2] = "ok";
                    infoMultiplicacion = String.valueOf(result);
                    analisis();

                    resultado.setText(String.valueOf(result));
                }else if (i == R.id.division){
                    valorUno = Integer.parseInt(numberOne.getText().toString());
                    valorTwo = Integer.parseInt(numberTwo.getText().toString());
                    result = valorUno/valorTwo;
                    vector[3] = "ok";
                    infoDivision = String.valueOf(result);
                    analisis();

                    resultado.setText(String.valueOf(result));
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Intent intent = new Intent(this,resultados.class);
                intent.putExtra("infoSumar",infoSuma);
                intent.putExtra("infoRestar",infoResta);
                intent.putExtra("infoMultiplicacion",infoMultiplicacion);
                intent.putExtra("infoDivision",infoDivision);

                startActivity(intent);
                break;
        }
    }
}

