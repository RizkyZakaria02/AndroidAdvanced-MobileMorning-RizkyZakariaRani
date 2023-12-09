package com.example.quizappforadvanceandroidexcercise
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.preference.PreferenceManager

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val preferences = PreferenceManager.getDefaultSharedPreferences(application)

    fun saveScore(score: Int) {
        preferences.edit().putInt("score_key", score).apply()
    }

    fun loadScore(): Int {
        return preferences.getInt("score_key", 0)
    }
}