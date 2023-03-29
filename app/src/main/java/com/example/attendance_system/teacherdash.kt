package com.example.attendance_system

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class teacherdash : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacherdash)

        val addmarks = findViewById<Button>(R.id.addmarks)

        addmarks.setOnClickListener(){
            val intent = Intent(applicationContext, com.example.attendance_system.addmarks::class.java)
            startActivity(intent)
        }

        val addsyl = findViewById<Button>(R.id.addsyl)

        addsyl.setOnClickListener(){
            val intent = Intent(applicationContext,Addsyallabus::class.java)
            startActivity(intent)
        }

        val addtt = findViewById<Button>(R.id.addtt)

        addtt.setOnClickListener(){
            val intent = Intent(applicationContext,AddTimetable::class.java)
            startActivity(intent)
        }

        val addstd = findViewById<Button>(R.id.addstd)

        addstd.setOnClickListener(){
            val intent = Intent(applicationContext,addstudent::class.java)
            startActivity(intent)
        }

        val showstd = findViewById<Button>(R.id.showstd)

        showstd.setOnClickListener(){
            val intent = Intent(applicationContext,showstudent::class.java)
            startActivity(intent)
        }

        val btnrem = findViewById<Button>(R.id.btnrem)

        btnrem.setOnClickListener(){
            val intent = Intent(applicationContext,fee_remindar::class.java)
            startActivity(intent)
        }

        val btnevent = findViewById<Button>(R.id.btnevent)

        btnevent.setOnClickListener(){
            val intent = Intent(applicationContext,Addevent::class.java)
            startActivity(intent)
        }



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add-> {
                val intent = Intent(applicationContext,addmarks::class.java)
                startActivity(intent)

            }
            R.id.phistory -> {
                val intent = Intent(applicationContext,addstudent::class.java)
                startActivity(intent)

            }
            R.id.attend-> {

                val intent = Intent(applicationContext,showstudent::class.java)
                startActivity(intent)
            }
            R.id.attend-> {

                val intent = Intent(applicationContext,showstudent::class.java)
                startActivity(intent)
            }
            R.id.syllabus-> {

                val intent = Intent(applicationContext,Addsyallabus::class.java)
                startActivity(intent)
            }
            R.id.timetable-> {

                val intent = Intent(applicationContext,AddTimetable::class.java)
                startActivity(intent)
            }
            R.id.fee-> {

                val intent = Intent(applicationContext,fee_remindar::class.java)
                startActivity(intent)
            }
            R.id.event-> {

                val intent = Intent(applicationContext,Addevent::class.java)
                startActivity(intent)
            }





        }
        return true
    }
}