package com.example.estoque;

import android.content.Intent;
import android.os.Bundle;

public class MenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void cadastrar{
        cadastrarRedirect();
    }

    public void consultar {
        consultarRedirect();
    }

    void cadastrarRedirect(){
        Intent novaTela = new Intent(MenuActivity.this,CadastrarActivity.class);
        startActivity(novaTela);
    }

    void consultarRedirect(){
        Intent novaTela = new Intent(MenuActivity.this,ConsultarActivity.class);
        startActivity(novaTela);
    }
}
