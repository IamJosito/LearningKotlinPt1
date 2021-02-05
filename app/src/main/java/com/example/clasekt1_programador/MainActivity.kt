package com.example.clasekt1_programador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG : String = ":::TAG "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val programmer:Programmer = Programmer()
        val programmerData:ProgrammerData = programmer.getProgrammerData()
        Log.d(TAG,"El programador se llama: ${programmerData._name}, tiene: ${programmerData._age} " +
                "y el lenguaje es: ${programmerData._laguage}")

    }
}
