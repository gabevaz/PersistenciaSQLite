package br.com.fiap.persistenciasqlit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    EditText edtNome;
    Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        edtNome = findViewById(R.id.edtNome);
        db = new Database(this);
    }

    public void salvar(View view) {
        String nome = edtNome.getText().toString();

        Contato contato = new Contato();
        contato.setNome(nome);

        db.insertContato(contato);

        Toast.makeText(this, R.string.contato_salvo_com_sucesso, Toast.LENGTH_SHORT).show();
        finish();
    }
}
