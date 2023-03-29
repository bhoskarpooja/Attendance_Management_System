package com.example.attendance_system

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class studentdashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_studentdashboard)

        val attenbtn = findViewById<Button>(R.id.attenbtn)
        val btntt= findViewById<Button>(R.id.btntt)

        attenbtn.setOnClickListener(){
            val intent = Intent(applicationContext,ShowAttendance::class.java)
            startActivity(intent)
        }

        btntt.setOnClickListener(){
            val intent = Intent(applicationContext,showtimetable::class.java)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.item, menu)
        return true

    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add-> {
                val intent = Intent(applicationContext,ShowAttendance::class.java)
                startActivity(intent)

            }
            R.id.phistory -> {
                val intent = Intent(applicationContext,showtimetable::class.java)
                startActivity(intent)

            }





        }
        return true
    }
}