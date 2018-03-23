package com.simple.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.simple.kotlin.chapter2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        typeofData()
//        typeConvert()
//        typeString()
//        classAndObject()
        nullType()
    }
}
