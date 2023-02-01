package com.text.modelviewtesting.roomDataBase

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import java.util.*



class Convertor {

    @TypeConverter
    fun fromDateToLong(value : Date) : Long{
        return  value.time
    }


    @TypeConverter
    fun fromLongToDate(value : Long) : Date{
        return  Date(value)
    }
}