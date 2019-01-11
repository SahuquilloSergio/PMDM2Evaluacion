package com.pmdm.sauky.pmdm2evaluacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find
import org.jetbrains.anko.horizontalScrollView
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {

    lateinit var bDefault: Button
    lateinit var bLandscape: Button
    var horizontal:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    bDefault = findViewById(R.id.botonDefault)
    bLandscape = findViewById(R.id.botonLandscape)

    if(bLandscape.visibility.equals("invisible")){
        horizontal = true;
    }

    if (horizontal == true){
        toast("Estas en horizontal")

    }else{
        toast("Estas en vertical")
    }

    }


}
