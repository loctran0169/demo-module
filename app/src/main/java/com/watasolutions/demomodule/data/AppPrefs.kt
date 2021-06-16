package com.watasolutions.demomodule.data

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import com.google.gson.Gson
import com.google.gson.GsonBuilder

class AppPrefs(val context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)

    private val gson: Gson = GsonBuilder()
        .excludeFieldsWithoutExposeAnnotation()
        .setDateFormat("yyyy-MM-dd'T'HH:mm+07:00")
        .create()

    fun <T> put(key: String, data: T) {
        sharedPreferences.edit {
            putString(key, gson.toJson(data))
        }
    }

    fun <T> get(key: String, anonymousClass: Class<T>, defaultValue: T): T? {
        return try {
            gson.fromJson(
                sharedPreferences.getString(key, ""),
                anonymousClass
            )
        } catch (ex: Exception) {
            null
        }
    }
}