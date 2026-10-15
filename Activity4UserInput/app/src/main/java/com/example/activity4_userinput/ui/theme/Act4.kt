package com.example.activity4_userinput.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun FormDataDiri(modifier: Modifier){
    //variabela-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableSetOf(value="")}
    var textAlamat by remember {mutableSetOf(value="")}
    var textJK by remember { mutableSetOf(values="")}
    val gender: List<String> = listOf("Laki-laki","Perempuan")

    //variabel-variabel untuk menyimpan data yang diperboleh dari komponen UI
    var nama by remember { mutableSetOf(value="")}
    var alamat by remember { mutableSetOf(value="") }
    var jenis by remember { mutableSetOf(value="") }

    Column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),
            label = {Text(text = "Nama Lengkap") },
        )
    }



}
