package com.app.playtolife.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class resultados extends AppCompatActivity {

    TextView resultadoSuma;
    TextView resultadoResta;
    TextView resultadoMultiplicacion;
    TextView resultadoDivision;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        String infoSumaxx = getIntent().getStringExtra("infoSumar");
        String infoRestarxx = getIntent().getStringExtra("infoRestar");
        String infoMultiplicarxx = getIntent().getStringExtra("infoMultiplicacion");
        String infoDividirxx = getIntent().getStringExtra("infoDivision");

        resultadoSuma = (TextView) findViewById(R.id.resultsuma);
        resultadoResta = (TextView) findViewById(R.id.resultresta);
        resultadoMultiplicacion = (TextView) findViewById(R.id.resultmultiplicacion);
        resultadoDivision = (TextView) findViewById(R.id.resultdivision);

        resultadoSuma.setText(infoSumaxx);
        resultadoResta.setText(infoRestarxx);
        resultadoMultiplicacion.setText(infoMultiplicarxx);
        resultadoDivision.setText(infoDividirxx);
    }
}
