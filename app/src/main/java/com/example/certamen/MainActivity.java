package com.example.certamen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Peso,Estatura;
    TextView imc,interfaz;
    Button btnimc;
    Spinner Sexo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Peso = findViewById(R.id.Txt_Peso);
        Estatura = findViewById(R.id.Txt_Estatura);
        imc = findViewById(R.id.txt_imc);
        interfaz = findViewById(R.id.txt_interfaz);
        btnimc = findViewById(R.id.Btn_IMC);
        Sexo = findViewById(R.id.spinner2);

    }
    public void Calculo(View view){
        String peso = Peso.getText().toString();
        String estatura = Estatura.getText().toString();

        Double estatura1 = Double.parseDouble(estatura)/100;
        Double IMC = Double.parseDouble(peso)/(estatura1*estatura1);
        imc.setText(IMC.toString());



    }
}