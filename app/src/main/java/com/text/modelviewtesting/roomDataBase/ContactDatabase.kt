package com.text.modelviewtesting.roomDataBase

import android.content.Context
import androidx.room.*
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [Contact::class], version = 2 )
@TypeConverters(Convertor::class)
abstract class ContactDatabase: RoomDatabase() {

    abstract fun contactDao(): ContactDao

    companion object{

        val migration_1_2 = object : Migration(1,2){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE contact ADD COLUMN isActive INTEGER NOT NULL DEFAULT(1)")
            }

        }
        //jaise harame instace wale variable par koi values asign hoga wase sare thread ko mil jayega
     @Volatile
      private var INSTANCE: ContactDatabase? = null

        fun getDatabase(context: Context): ContactDatabase{
            if(INSTANCE == null){
                synchronized(this){
                    INSTANCE = Room.databaseBuilder(context.applicationContext, ContactDatabase::class.java, "contactDB")
                        .addMigrations(migration_1_2)
                        .build()
                }
            }

            return INSTANCE!!
        }

    }

}