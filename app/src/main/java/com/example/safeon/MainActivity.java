package com.example.safeon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.idUsuario);
        senha = findViewById(R.id.idSenha);
    }

    public void entrar(View view){
        String user = usuario.getText().toString();
        String pass = senha.getText().toString();

        if(user.isEmpty() || pass.isEmpty()) {
            Toast.makeText(this, "Usuario e/ou senha invalidas", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent feedIntent = new Intent(this, FeedActivity.class);
        startActivity(feedIntent);
    }
}
