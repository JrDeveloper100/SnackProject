package com.example.snackbarlibrary

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

object SnackbarUtil{

    fun showSnackbar(view: View, message: String, duration: Int = Snackbar.LENGTH_SHORT) {
        Snackbar.make(view, message, duration).show()
    }

    fun showSnackbarWithAction(
        view: View,
        message: String,
        actionText: String,
        duration: Int = Snackbar.LENGTH_INDEFINITE,
        action: View.OnClickListener
    ) {
        Snackbar.make(view, message, duration)
            .setAction(actionText, action)
            .show()
    }

    fun showSnackbar1(view: View, duration: Int = Snackbar.LENGTH_SHORT) {
        val snackbar = Snackbar.make(view, "", duration)
        val snackbarView = snackbar.view
        val customLayout = LayoutInflater.from(view.context)
            .inflate(R.layout.snackbar_layout1, null)
        val snackbarLayout = snackbarView as Snackbar.SnackbarLayout
        snackbarLayout.addView(customLayout, 0)
        snackbarView.setBackgroundColor(Color.TRANSPARENT)
        snackbar.show()
    }


    fun showSnackbar2(view: View, duration: Int = Snackbar.LENGTH_SHORT) {
        val snackbar = Snackbar.make(view, "", duration)
        val snackbarView = snackbar.view
        val customLayout = LayoutInflater.from(view.context)
            .inflate(R.layout.snackbar_layout2, null)
        val snackbarLayout = snackbarView as Snackbar.SnackbarLayout
        snackbarLayout.addView(customLayout, 0)
        snackbarView.setBackgroundColor(Color.TRANSPARENT)
        val btnClose = customLayout.findViewById<ImageView>(R.id.btnClose)
        btnClose.setOnClickListener {
            snackbar.dismiss()
        }
        snackbar.show()
    }

    fun showSnackbar3(view: View, duration: Int = Snackbar.LENGTH_SHORT) {
        val snackbar = Snackbar.make(view, "", duration)
        val snackbarView = snackbar.view
        val customLayout = LayoutInflater.from(view.context)
            .inflate(R.layout.snackbar_layout3, null)
        val snackbarLayout = snackbarView as Snackbar.SnackbarLayout
        snackbarLayout.addView(customLayout, 0)
        snackbarView.setBackgroundColor(Color.TRANSPARENT)
        val btnAction = customLayout.findViewById<TextView>(R.id.btnAction)
        btnAction.setOnClickListener {

        }
        snackbar.show()
    }

    fun showSnackbar4(view: View, duration: Int = Snackbar.LENGTH_SHORT) {
        val snackbar = Snackbar.make(view, "", duration)
        val snackbarView = snackbar.view
        val customLayout = LayoutInflater.from(view.context)
            .inflate(R.layout.snackbar_layout4, null)
        val snackbarLayout = snackbarView as Snackbar.SnackbarLayout
        snackbarLayout.addView(customLayout, 0)
        snackbarView.setBackgroundColor(Color.TRANSPARENT)
        val btnAction = customLayout.findViewById<TextView>(R.id.btnAction)
        val btnClose = customLayout.findViewById<ImageView>(R.id.btnClose)
        btnAction.setOnClickListener {

        }
        btnClose.setOnClickListener {
            snackbar.dismiss()
        }
        snackbar.show()
    }

    fun showSnackbar5(view: View, duration: Int = Snackbar.LENGTH_SHORT) {
        val snackbar = Snackbar.make(view, "", duration)
        val snackbarView = snackbar.view
        val customLayout = LayoutInflater.from(view.context)
            .inflate(R.layout.snackbar_layout5, null)
        val snackbarLayout = snackbarView as Snackbar.SnackbarLayout
        snackbarLayout.addView(customLayout, 0)
        snackbarView.setBackgroundColor(Color.TRANSPARENT)
        snackbar.show()
    }

    fun showSnackbar6(view: View, duration: Int = Snackbar.LENGTH_SHORT) {
        val snackbar = Snackbar.make(view, "", duration)
        val snackbarView = snackbar.view
        val customLayout = LayoutInflater.from(view.context)
            .inflate(R.layout.snackbar_layout6, null)
        val snackbarLayout = snackbarView as Snackbar.SnackbarLayout
        snackbarLayout.addView(customLayout, 0)
        snackbarView.setBackgroundColor(Color.TRANSPARENT)
        val btnClose = customLayout.findViewById<ImageView>(R.id.btnClose)
        btnClose.setOnClickListener {
            snackbar.dismiss()
        }
        snackbar.show()
    }

    fun showSnackbar7(view: View, duration: Int = Snackbar.LENGTH_SHORT) {
        val snackbar = Snackbar.make(view, "", duration)
        val snackbarView = snackbar.view
        val customLayout = LayoutInflater.from(view.context)
            .inflate(R.layout.snackbar_layout7, null)
        val snackbarLayout = snackbarView as Snackbar.SnackbarLayout
        snackbarLayout.addView(customLayout, 0)
        snackbarView.setBackgroundColor(Color.TRANSPARENT)
        val btnAction = customLayout.findViewById<TextView>(R.id.btnAction)
        btnAction.setOnClickListener {

        }
        snackbar.show()
    }

    fun showSnackbar8(view: View, duration: Int = Snackbar.LENGTH_SHORT) {
        val snackbar = Snackbar.make(view, "", duration)
        val snackbarView = snackbar.view
        val customLayout = LayoutInflater.from(view.context)
            .inflate(R.layout.snackbar_layout8, null)
        val snackbarLayout = snackbarView as Snackbar.SnackbarLayout
        snackbarLayout.addView(customLayout, 0)
        snackbarView.setBackgroundColor(Color.TRANSPARENT)
        val btnAction = customLayout.findViewById<TextView>(R.id.btnAction)
        val btnClose = customLayout.findViewById<ImageView>(R.id.btnClose)
        btnAction.setOnClickListener {

        }
        btnClose.setOnClickListener {
            snackbar.dismiss()
        }
        snackbar.show()
    }

}