package com.simple.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.simple.kotlin.chapter5.functionTest
import com.simple.shop.ui.activity.R

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //chapter2
//        typeofData()
//        typeConvert()
//        typeString()
//        classAndObject()
//        nullType()
//        range()
//        arrayTest()

        //chapter3
//        lambda()
//        classMember()
//        infixExpression()
//        ifExpression()
//        whenExpression()
//        forExpression()
//        params()

        //chapter4
//        interfaceDemo()

        //chapter5
        functionTest()
    }

}
