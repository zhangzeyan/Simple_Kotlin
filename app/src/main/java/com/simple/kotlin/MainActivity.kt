package com.simple.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.simple.kotlin.chapter3.*
import com.simple.kotlin.chapter4.interfaceDemo

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        typeofData()
//        typeConvert()
//        typeString()
//        classAndObject()
//        nullType()
//        range()
//        arrayTest()
//        lambda()
//        classMember()
//        infixExpression()
//        ifExpression()
//        whenExpression()
//        forExpression()
//        params()
        interfaceDemo()
    }

}
