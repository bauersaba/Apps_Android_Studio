package com.example.aprendizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResult;
    private EditText editPeso;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textResult = findViewById(R.id.editResult);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);




    }
    public void calcularIMC(View ver){

        if (editPeso.getText().toString().equals("") || editAltura.getText().toString().equals("")){
            textResult.setText("Campo vazio. Preencha todos os campos!");
        }
        else{
            double peso = Double.parseDouble(editPeso.getText().toString());
            double altura = Double.parseDouble(editAltura.getText().toString());
            double resultado = peso / (altura * altura);

            if (resultado < 19){
                textResult.setText("Abaixo do peso");

            }else if(resultado <= 19 || resultado < 25){
                textResult.setText("Peso normal");

            }else if (resultado <= 25 || resultado < 30){
                textResult.setText("Acima do peso");

            }else if (resultado <= 30 || resultado < 40){
                textResult.setText("Obesidade  tipo I");

            }else if (resultado >= 40){
                textResult.setText("Obesidade tipo II");

            }
        }

    }
}