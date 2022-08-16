package com.example.revisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val edtResultado: EditText = findViewById(R.id.edtResultado)//instancia xml atribuindo a variável do kotlin


        val edtEndereco: EditText = findViewById(R.id.edtEnderecores)
        val edtBairro: EditText = findViewById(R.id.edtBairrores)
        val edtCep: EditText = findViewById(R.id.edtCepores)
        val edtCidade: EditText = findViewById(R.id.edtCidaderes)

        val intent = intent
        val inputNome = intent.getStringExtra("nome")//atribui o intent da outra tela ao inputNome
        val inputEndereco = intent.getStringExtra("endereco")
        val inputBairro = intent.getStringExtra("bairro")
        val inputCep = intent.getStringExtra("cep")
        val inputCidade = intent.getStringExtra("cidade")

        edtResultado.setText("Nome: " + inputNome.toString())//exibi e tudo
        edtEndereco.setText("Endereço: " + inputEndereco.toString())
        edtBairro.setText("Bairro: " + inputBairro.toString())
        edtCep.setText("CEP: " + inputCep.toString())
        edtCidade.setText("Cidade: " + inputCidade.toString())

        val btnVoltar: Button = findViewById(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            //Toast.makeText(this, "Nome: " + txtNome.text.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}