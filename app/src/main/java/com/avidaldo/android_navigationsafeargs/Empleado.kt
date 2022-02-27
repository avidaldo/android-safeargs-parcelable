package com.avidaldo.android_navigationsafeargs


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Empleado(private val nombre: String?, private val apellidos: String?, private val edad: Int) : Parcelable {

    override fun toString() = "Se ha recibido al empleado $nombre $apellidos, de $edad años"

}