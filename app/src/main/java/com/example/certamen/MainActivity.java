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
    //https://github.com/NikoMaximi12/Certamen.git
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
        imc.setText(IMC.toString().substring(0,5));
        if (IMC<18.5){
            interfaz.setText(
                    "1) Come con mas frecuencia. Empieza poco a poco a hacer 5 a 6 comidas mas pequeñas durante el dia" +
                    "2) Elige alimentos con muchoas nutrientes" +
                    "3) Agrega aderezos" +
                    "4) Prueba Licuados y batidos de frutas" +
                    "5) Controla que bebes y cuando" +
                    "6) Haz ejercicio");
        }else if(IMC>18.5 && IMC<24.9){
            interfaz.setText("");
            Toast.makeText(this, "Felicitaciones ud mantiene una excelente alimentacion", Toast.LENGTH_SHORT).show();
        } else if (IMC>25 && IMC<29.9) {
            interfaz.setText("Como reducir el imc: "
                    +
                    "1) Haga 30 minutos de ejercicio aerobico 5 veces por semana" +
                    "2) Logre un equilibrio entre el consumo de calorias y la actividad fisica" +
                    "3) Limite las grasas saturadas a no mas del 7% de las calorias totales" +
                    "4) Tenga una alimentacion baja en colesterol con carnes magras, frutas, verduras y cereales integrales");
        }else if(IMC>30 && IMC<34.9){
            interfaz.setText("Como reducir el imc: "
                    +
                    "1) Haga 30 minutos de ejercicio aerobico 5 veces por semana" +
                    "2) Logre un equilibrio entre el consumo de calorias y la actividad fisica" +
                    "3) Limite las grasas saturadas a no mas del 7% de las calorias totales" +
                    "4) Tenga una alimentacion baja en colesterol con carnes magras, frutas, verduras y cereales integrales");
        }


    }
}