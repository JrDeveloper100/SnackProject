package com.example.snackproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.snackbarlibrary.SnackbarUtil
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSnackbar: Button = findViewById(R.id.btnSnackbar)
        val btnSnackbar2: Button = findViewById(R.id.btnSnackbar2)
        val btnSnackbar3: Button = findViewById(R.id.btnSnackbar3)
        val btnSnackbar4: Button = findViewById(R.id.btnSnackbar4)
        val btnSnackbar5: Button = findViewById(R.id.btnSnackbar5)
        val btnSnackbar6: Button = findViewById(R.id.btnSnackbar6)
        val btnSnackbar7: Button = findViewById(R.id.btnSnackbar7)
        val btnSnackbar8: Button = findViewById(R.id.btnSnackbar8)
        val rootView = findViewById<View>(android.R.id.content)
        btnSnackbar.setOnClickListener {
            SnackbarUtil.showSnackbar7(rootView,Snackbar.LENGTH_SHORT)
        }
        btnSnackbar2.setOnClickListener {
            SnackbarUtil.showSnackbar8(rootView,Snackbar.LENGTH_SHORT)
        }
        btnSnackbar3.setOnClickListener {
            SnackbarUtil.showSnackbar5(rootView,Snackbar.LENGTH_SHORT)
        }
        btnSnackbar4.setOnClickListener {
            SnackbarUtil.showSnackbar4(rootView,Snackbar.LENGTH_SHORT)
        }
        btnSnackbar5.setOnClickListener {
            SnackbarUtil.showSnackbar3(rootView,Snackbar.LENGTH_SHORT)
        }
        btnSnackbar6.setOnClickListener {
            SnackbarUtil.showSnackbar6(rootView,Snackbar.LENGTH_SHORT)
        }
        btnSnackbar7.setOnClickListener {
            SnackbarUtil.showSnackbar1(rootView,Snackbar.LENGTH_SHORT)
        }
        btnSnackbar8.setOnClickListener {
            SnackbarUtil.showSnackbar2(rootView,Snackbar.LENGTH_SHORT)
        }
    }
}