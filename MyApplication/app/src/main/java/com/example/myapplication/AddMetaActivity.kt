package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.Constants.META_RESULT
import com.example.myapplication.databinding.ActivityAdicionarMetaBinding

class AddMetaActivity : AppCompatActivity() {
    private lateinit var databind: ActivityAdicionarMetaBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        databind = ActivityAdicionarMetaBinding.inflate(layoutInflater)
        setContentView(databind.root)

        databind.confirmBtn.setOnClickListener {
            val prioridade: Int = Integer.parseInt(databind.metaPrioridadeTxt.text.toString())
            Intent().apply {
                putExtra(
                    META_RESULT,
                    MetasModel(
                        prioridade,
                        databind.metaTituloTxt.text.toString(),
                        databind.metaDescricaoTxt.text.toString()
                    )
                )
                setResul(RESULT_OK, this)
            }
            this.finish()
        }
    }
}