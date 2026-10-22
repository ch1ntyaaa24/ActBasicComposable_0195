package com.example.pertemuan6.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.pertemuan6pam.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.material3.OutlinedTextField

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    var textNama by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.home), color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = textNama,
                singleLine = true,
                shape = MaterialTheme.shapes.large,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(250.dp),
                label = { Text(text = "Nama Lengkap") },
                onValueChange = {},
            )
            HorizontalDivider(
                modifier = Modifier
                    .padding(all = 20.dp)
                    .width(250.dp), thickness = DividerDefaults.Thickness, color = Color.Red
            )
            Row {
                jenisK.forEach { item ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = false,
                            onClick = { item }
                        )
                        Text(text = item)
                    }
                }
            }
            HorizontalDivider(modifier = Modifier
                .padding(all = 20.dp)
                .width(250.dp),
                thickness = 1.dp,
                color = Color.Red
            )
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .width(250.dp),
                label = {Text(text = "Alamat")},
                onValueChange = {},
            )
