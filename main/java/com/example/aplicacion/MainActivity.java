  package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

  public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private RadioButton r1;
    private RadioButton r2;
    private RadioButton r3;
    private RadioButton r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= (EditText) findViewById(R.id.number1);
        et2= (EditText) findViewById(R.id.number2);
        tv1= (TextView) findViewById(R.id.result);
    }
    public void sumar(View view){
      Double a1= Double.parseDouble(et1.getText().toString());
      Double a2= Double.parseDouble(et2.getText().toString());
      Double result= a1+a2;
      String a3= String.valueOf(result);
      tv1.setText(a3);
    }
    public void restar(View view){
      Double a1= Double.parseDouble(et1.getText().toString());
      Double a2= Double.parseDouble(et2.getText().toString());
      Double result= a1-a2;
      String a3= String.valueOf(result);
      tv1.setText(a3);
    }
    public void multiplicar(View view){
      Double a1= Double.parseDouble(et1.getText().toString());
      Double a2= Double.parseDouble(et2.getText().toString());
      Double result= a1*a2;
      String a3= String.valueOf(result);
      tv1.setText(a3);
    }
    public void division(View view){
      Double a1= Double.parseDouble(et1.getText().toString());
      Double a2= Double.parseDouble(et2.getText().toString());
      Double result= a1/a2;
      String a3= String.valueOf(result);
      tv1.setText(a3);
    }
    public void radio(View view){
      if(r1.isChecked()){
        sumar(view);
      }
      if(r2.isChecked()){
        restar(view);
      }
      if(r3.isChecked()){
        multiplicar(view);
      }
      if(r4.isChecked()){
        division(view);
      }
    }

}