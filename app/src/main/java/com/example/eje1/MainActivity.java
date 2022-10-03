package com.example.eje1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //1.crear objetos graficos
    private EditText num1;
    private EditText num2;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. darles valores o instarciar los objetos
        num1=(EditText)findViewById(R.id.txtnumero1);
        num2 = findViewById(R.id.txtnumero2);
        resultado =(TextView)findViewById(R.id.txtresultado);
    }
    public void sumar(View view){
    double n1,n2,suma;
    n1= Double.parseDouble(num1.getText().toString());
    n2 =Double.parseDouble(num2.getText().toString());
    suma=n1+n2;
    //double suma = Double.parseDouble(num1.getText().toString())+Double.parseDouble(num2.getText().toString());
    //mostrar resultados
        resultado.setText(""+suma);
    }
    public void restar(View view){
        double n1,n2,restar;
        n1= Double.parseDouble(num1.getText().toString());
        n2 =Double.parseDouble(num2.getText().toString());
        //dividir=n1+n2;



        if (n1>n2){
            restar=n1-n2;
        }else{
            restar=n2-n1;
        }
        //double resta = Double.parseDouble(num1.getText().toString())-Double.parseDouble(num2.getText().toString());
        resultado.setText(""+restar);
    }
    public void multiplicacion(View view){
        double n1,n2,multiplicar;
        n1= Double.parseDouble(num1.getText().toString());
        n2 =Double.parseDouble(num2.getText().toString());
        multiplicar=n1*n2;
        //double multiplicar = Double.parseDouble(num1.getText().toString())*Double.parseDouble(num2.getText().toString());
        resultado.setText(""+multiplicar);
    }
    public void divicion(View view){
        Toast toast1 = new Toast(getApplicationContext());
        double n1,n2,dividir;
        n1= Double.parseDouble(num1.getText().toString());
        n2 =Double.parseDouble(num2.getText().toString());
        //dividir=n1+n2;



        if (n1>n2){
            dividir=n1/n2;
        }else
            dividir=n2/n1;


        //double dividir = Double.parseDouble(num1.getText().toString())/Double.parseDouble(num2.getText().toString());
        resultado.setText(""+dividir);
    }



}