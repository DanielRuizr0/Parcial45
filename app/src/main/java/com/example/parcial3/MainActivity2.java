package com.example.parcial3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}

public class Factura{
    String producto;
    int cantidad;
    int monto;
    int codigo;
    public void principal(){
        this.producto=producto;
        this.cantidad=cantidad;
        this.monto=monto;
    }
    public void fac(){
        producto = "Nevera";
        cantidad = 4;
        monto = 6000;
        codigo = 457;
    }
    public static void main(String[]args){
        System.out.println("La factura por"+producto+"con el codigo"+codigo+"llego en "+monto+"Por la cantidad de "cantidad"unidades.");
    }
}