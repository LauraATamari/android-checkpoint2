package com.example.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MetasModel(
    val prioridade: Int,
    val titulo: String,
    val descricao: String,
    var concluida: Boolean = false,
    var isDetailVisible: Boolean = false
) : Parcelable
