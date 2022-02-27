package com.avidaldo.android_navigationsafeargs

import android.os.Parcel
import android.os.Parcelable

data class Empleado(private val nombre: String?, private val apellidos: String?, private val edad: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(apellidos)
        parcel.writeInt(edad)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Empleado> {
        override fun createFromParcel(parcel: Parcel): Empleado {
            return Empleado(parcel)
        }

        override fun newArray(size: Int): Array<Empleado?> {
            return arrayOfNulls(size)
        }
    }

    override fun toString() = "Se ha recibido al empleado $nombre $apellidos, de $edad años"

}