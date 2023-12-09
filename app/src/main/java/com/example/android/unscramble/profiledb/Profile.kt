package com.example.android.unscramble.profiledb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profile_table")
class Profile(
    @PrimaryKey
    @ColumnInfo(name = "word")
    val name: String,
    @ColumnInfo(name = "email")
    val email: String
)