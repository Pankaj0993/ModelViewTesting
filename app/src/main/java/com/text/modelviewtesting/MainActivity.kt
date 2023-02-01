package com.text.modelviewtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.text.modelviewtesting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    private val factTextView: TextView
    get() = findViewById(R.id.factsTextView)

    private val btnUpdate: TextView
        get() = findViewById(R.id.btnUpdate)

    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        /*mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.mainViewModel = mainViewModel
        binding.lifecycleOwner = this
*/
        // binding.factsTextView.text = "Hello Pankaj"

       // val studentUser = Student("Hello", 4)
      /*  binding.student = studentUser

        //------------------------------------------Room data Base -----------------------------
        mainViewModel.quoteLiveData.observe(this, Observer {
            factTextView.text = it
        })


        btnUpdate.setOnClickListener {
            mainViewModel.updateQuote()
        }
*/


        val student = Student("Intro",2, "https://i.picsum.photos/id/1/200/300.jpg?hmac=jH5bDkLr6Tgy3oAg5khKCHeunZMHq0ehBZr6vGifPLY")
        binding.student = student
    }
}