package com.baileninformacion.menuopcioneskotlin

import android.content.Intent
import android.os.Bundle
import android.view.ContextMenu
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import com.baileninformacion.menuopcioneskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        registerForContextMenu(binding.imgAsir)
        registerForContextMenu(binding.imgDam)
        registerForContextMenu(binding.imgDaw)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val intent:Intent
        when (item.itemId) {
            R.id.action_asir -> intent = Intent(this,ScrollingASIR::class.java)
            R.id.action_dam -> intent = Intent(this,ScrollingDAM::class.java)
            R.id.action_daw -> intent = Intent(this,ScrollingDAW::class.java)
            else -> intent = Intent(this,ScrollingASIR::class.java)
        }
        startActivity(intent)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent:Intent
        when (item.itemId) {
            R.id.action_asir -> intent = Intent(this,ScrollingASIR::class.java)
            R.id.action_dam -> intent = Intent(this,ScrollingDAM::class.java)
            R.id.action_daw -> intent = Intent(this,ScrollingDAW::class.java)
            else -> intent = Intent(this,ScrollingASIR::class.java)
        }
        startActivity(intent)
        return true
    }


}