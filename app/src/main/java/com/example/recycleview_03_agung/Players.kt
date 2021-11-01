package com.example.recycleview_03_agung

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Players(
    val imgPlayers: Int,
    val namePlayers: String,
    val descPlayer: String
) : Parcelable
