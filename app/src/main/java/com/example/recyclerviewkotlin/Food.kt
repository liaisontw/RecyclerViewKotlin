package com.example.recyclerviewkotlin

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(val image : Int, val name : String) : Parcelable
