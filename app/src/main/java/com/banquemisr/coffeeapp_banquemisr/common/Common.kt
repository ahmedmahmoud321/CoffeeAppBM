package com.banquemisr.coffeeapp_banquemisr.common

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.banquemisr.coffeeapp_banquemisr.R

class Common {

    companion object {
        fun getTheme(context: Context) {
            val preferencesManager =
                PreferencesManager(context)
            val themeBoolean = preferencesManager.getBoolean(Constants.THEME_BOOLEAN)
            if (themeBoolean) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                context.setTheme(R.style.Theme_Night)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                context.setTheme(R.style.Theme_Light)
            }
        }

        fun openActivity(context: Context, activity: Class<*>?) {
            val intent = Intent(context, activity)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }

         fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }


    }
}