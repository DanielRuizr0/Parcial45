package com.example.parcial3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


public class poli extends Factura{
    @Override
    public void calcular(String producto, int cantidad, int monto, int codigo){
        super.monto=monto;
        this.codigo=codigo;
    }
}



//RECURSIVIDAD

public class recur{
    public int dividir(int x) {
        x = 16;
        if ((x == 0) || (x == 1)) {
            return 0;
        } else if ((x != 0) || (x != 1)) {
        x = x / 2;
    }else{
        System.out.println("No se pudo");
    }
}
}