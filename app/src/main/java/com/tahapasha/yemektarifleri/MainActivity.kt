package com.tahapasha.yemektarifleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.Navigation
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.yemek_ekle,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
        //navHostFragment!!.childFragmentManager.fragments[0]

        //supportFragmentManager.findFragmentById(R.id.tarifFragment)



        if((item.itemId == R.id.yemek_ekleme_itemi) && (findNavController(R.id.fragmentContainerView).currentDestination?.id != R.id.tarifFragment)){

            val action = ListeFragmentDirections.actionListeFragmentToTarifFragment("menudengeldim",0)
            Navigation.findNavController(this,R.id.fragmentContainerView).navigate(action)
        }

        return super.onOptionsItemSelected(item)
    }
}