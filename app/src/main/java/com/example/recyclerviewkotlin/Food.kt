package com.example.recyclerviewkotlin

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//data class Food(val image : Int, val name : String)

@Parcelize
data class Food(val image : Int, val name : String) : Parcelable
/*
{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Food> {
        override fun createFromParcel(parcel: Parcel): Food {
            return Food(parcel)
        }

        override fun newArray(size: Int): Array<Food?> {
            return arrayOfNulls(size)
        }
    }
}



 */