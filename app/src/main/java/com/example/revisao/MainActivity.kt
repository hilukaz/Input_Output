package com.example.revisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome: TextView = findViewById(R.id.edtNome)//instancia objeto do xml, ao kotlin
        val edtEndereco: TextView = findViewById(R.id.edtEndereco)
        val edtBairro: TextView = findViewById(R.id.edtBairro)
        val edtCEP: TextView = findViewById(R.id.edtCep)
        val edtCidade: TextView = findViewById(R.id.edtCidade)

        val btnCadastrar:Button = findViewById(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener {
            //Toast.makeText(this, "Nome: " + txtNome.text.toString(), Toast.LENGTH_LONG).show()

            val intent = Intent(this, Resultado::class.java)//atribui em mudança de tela

            intent.putExtra("nome", edtNome.text.toString())//coloca uma variável no intent
            //quando sai da tela, todas as variáveis é apagada


            intent.putExtra("endereco", edtEndereco.text.toString())
            intent.putExtra("bairro", edtBairro.text.toString())
            intent.putExtra("cep", edtCEP.text.toString())
            intent.putExtra("cidade", edtCidade.text.toString())
            startActivity(intent)//executa o intent junto das variáveis
        }

    }
}