package com.azore.compustore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    public ImageButton btncategorias;
    public ImageButton btnproductos;
    public ImageButton btnensambles;
    public ImageButton btnclientes;
    public ImageButton btnordenes;
    public ImageButton btnreportes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DECLARANDO BOTONES
        btncategorias= (ImageButton)findViewById(R.id.btnCategory);
        btnproductos= (ImageButton)findViewById(R.id.btnProductos);
        btnensambles= (ImageButton)findViewById(R.id.btnEnsambles);
        btnclientes= (ImageButton)findViewById(R.id.btnClientes);
        btnordenes= (ImageButton)findViewById(R.id.btnOrdenes);
        btnreportes= (ImageButton)findViewById(R.id.btnReportes);
        // DECLARANDO BOTONESs
    }

    // Boton categorias
    public void BtnCategorias(View v){
        Intent i = new Intent(this,CategoriasActivity.class);
        startActivity(i);
    }
    // Boton productos
    public void BtnProductos(View v){
        Intent i = new Intent(this,ProductosActivity.class);
        startActivity(i);
    }
    // Boton ensambles
    public void BtnEnsambles(View v){
        Intent i = new Intent(this,EnsamblesActivity.class);
        startActivity(i);
    }
    // Boton clientes
    public void BtnClientes(View v){
        Intent i = new Intent(this,ClientesActivity.class);
        startActivity(i);
    }
    // Boton ordenes
    public void BtnOrdenes(View v){
        Intent i = new Intent(this,OrdenesActivity.class);
        startActivity(i);
    }
    // Boton reportes
    public void BtnReportes(View v){
        Intent i = new Intent(this,ReportesActivity.class);
        startActivity(i);
    }


}
