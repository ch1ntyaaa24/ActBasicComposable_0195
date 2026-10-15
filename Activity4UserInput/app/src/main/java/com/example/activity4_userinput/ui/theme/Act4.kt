package com.example.activity4_userinput.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier


@Composable
fun FormDataDiri(modifier: Modifier){
    //variabela-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableSetOf(value="")}
    var textAlamat by remember {mutableSetOf(value="")}
    var textJK by remember { mutableSetOf(values="")}
    val gender: List<String> = listOf("Laki-laki","Perempuan")

    //variabel-variabel untuk menyimpan data yang diperboleh dari komponen UI
    var nama by remember { mutableSetOf(value="")}


}
