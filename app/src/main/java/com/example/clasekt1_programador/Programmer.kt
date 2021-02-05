package com.example.clasekt1_programador

import android.util.Log

class Programmer : ProgrammerInterface {
    val TAG:String = ":::TAG"

    override fun getProgrammerData(): ProgrammerData {
        var programmer:ProgrammerData = ProgrammerData(this.getProgrammerName(),this.getProgrammerAge(),this.getProgrammerLanguage())
        return programmer
    }

    private fun getProgrammerName():String{
        return "Jose"
    }
    private fun getProgrammerAge():Int{
        return 20
    }
    private fun getProgrammerLanguage():String{
        return "Kotlin"
    }


}