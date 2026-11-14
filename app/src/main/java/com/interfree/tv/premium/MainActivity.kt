
package com.interfree.tv.premium

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(10, 17, 35)
        window.navigationBarColor = Color.rgb(10, 17, 35)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(28, 30, 28, 30)
            setBackgroundColor(Color.rgb(10, 17, 35))
        }

        val title = TextView(this).apply {
            text = "INTERFREE TV"
            textSize = 30f
            gravity = Gravity.CENTER
            setTextColor(Color.WHITE)
        }

        val premium = TextView(this).apply {
            text = "PREMIUM"
            textSize = 18f
            gravity = Gravity.CENTER
            setTextColor(Color.rgb(235, 190, 75))
        }

        val user = EditText(this).apply {
            hint = "Usuario"
            singleLine = true
            setTextColor(Color.WHITE)
            setHintTextColor(Color.LTGRAY)
        }

        val pass = EditText(this).apply {
            hint = "Contraseña"
            singleLine = true
            inputType = 129
            setTextColor(Color.WHITE)
            setHintTextColor(Color.LTGRAY)
        }

        val status = TextView(this).apply {
            text = "Ingresa tus datos de acceso"
            gravity = Gravity.CENTER
            setTextColor(Color.LTGRAY)
        }

        val login = Button(this).apply {
            text = "INICIAR SESIÓN"
            setOnClickListener {
                status.text = "Conectividad en preparación"
            }
        }

        layout.addView(title)
        layout.addView(premium)
        layout.addView(user)
        layout.addView(pass)
        layout.addView(login)
        layout.addView(status)

        setContentView(layout)
    }
}
