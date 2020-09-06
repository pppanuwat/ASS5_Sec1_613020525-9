package com.example.labass5intent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Employee (val Name: String, val Gender: String, val mail: String, var salary: Int) :
    Parcelable {

}