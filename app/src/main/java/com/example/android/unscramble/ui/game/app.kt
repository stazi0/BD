package com.example.android.unscramble.ui.game

import android.app.Application

class App : Application() {
    // Using by lazy so the database and the repository are only created when they're needed
    // rather than when the application starts
    val database by lazy { ProfileRoomDatabase.getDatabase(this) }
    val repository by lazy { ProfileRepository(database.profileDao()) }
}