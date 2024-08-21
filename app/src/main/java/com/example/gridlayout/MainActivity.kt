package com.example.gridlayout

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gridlayout.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var result = 0
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.toolbarMain.title = "Калькулятор"
        binding.toolbarMain.setTitleTextColor(Color.WHITE)
        setSupportActionBar(binding.toolbarMain)

        binding.inputET.isEnabled = false

        buttons()
        binding.resetBTN.setOnClickListener {
            binding.inputET.text.clear()
            result = 0
        }
        binding.resultBTN.setOnClickListener {
            val result = 0

            binding.resultTV.text = result.toString()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun buttons() {
        binding.oneBTN.setOnClickListener(this)
        binding.twoBTN.setOnClickListener(this)
        binding.threeBTN.setOnClickListener(this)
        binding.fourBTN.setOnClickListener(this)
        binding.fiveBTN.setOnClickListener(this)
        binding.sixBTN.setOnClickListener(this)
        binding.sevenBTN.setOnClickListener(this)
        binding.eightBTN.setOnClickListener(this)
        binding.nineBTN.setOnClickListener(this)
        binding.zeroBTN.setOnClickListener(this)
        binding.subBTN.setOnClickListener(this)
        binding.sumBTN.setOnClickListener(this)
        binding.divBTN.setOnClickListener(this)
        binding.multBTN.setOnClickListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.exitMenuMain -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.oneBTN -> {
                binding.inputET.setText(binding.inputET.text.toString() + Operations().keys[1])

            }

            R.id.twoBTN -> binding.inputET.setText(binding.inputET.text.toString() + Operations().keys[2])
            R.id.threeBTN -> binding.inputET.setText(binding.inputET.text.toString() + Operations().keys[3])
            R.id.fourBTN -> binding.inputET.setText(binding.inputET.text.toString() + Operations().keys[4])
            R.id.fiveBTN -> binding.inputET.setText(binding.inputET.text.toString() + Operations().keys[5])
            R.id.sixBTN -> binding.inputET.setText(binding.inputET.text.toString() + Operations().keys[6])
            R.id.sevenBTN -> binding.inputET.setText(binding.inputET.text.toString() + Operations().keys[7])
            R.id.eightBTN -> binding.inputET.setText(binding.inputET.text.toString() + Operations().keys[8])
            R.id.nineBTN -> binding.inputET.setText(binding.inputET.text.toString() + Operations().keys[9])
            R.id.zeroBTN -> binding.inputET.setText(binding.inputET.text.toString() + Operations().keys[0])
            R.id.divBTN -> binding.inputET.setText(binding.inputET.text.toString() + Operations().keys["/"])
            R.id.sumBTN -> binding.inputET.setText(binding.inputET.text.toString() + Operations().keys["+"])
            R.id.subBTN -> binding.inputET.setText(binding.inputET.text.toString() + Operations().keys["-"])
            R.id.multBTN -> binding.inputET.setText(binding.inputET.text.toString() + Operations().keys["*"])
        }
    }
}
