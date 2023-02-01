package com.text.modelviewtesting.roomDataBase

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.room.Room
import com.text.modelviewtesting.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class RoomDataBaseMain : AppCompatActivity() {

    lateinit var database: ContactDatabase

    //lateinit var binding: DatabaseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.database)

        //binding = DataBindingUtil.setContentView(this, R.layout.database)

         database = ContactDatabase.getDatabase(this)

        GlobalScope.launch {
            database.contactDao().insertContact(Contact(0,"Pankaj", "999", Date(), 1))

        }
    }

    fun getData(view: View) {

        database.contactDao().getContact().observe(this, Observer {

            Toast.makeText(this, it.toString(), Toast.LENGTH_LONG).show()
        })
    }


}