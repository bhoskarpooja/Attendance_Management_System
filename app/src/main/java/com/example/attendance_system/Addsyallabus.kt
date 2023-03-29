package com.example.attendance_system

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class Addsyallabus : AppCompatActivity() {

    var edname: EditText?=null
    var edprofile: EditText?=null
    var edcriteria: EditText?=null
    var edsyll: EditText?=null
    var edhrname: EditText?=null
    var edcontact: EditText?=null
    var edaddress: EditText?=null

    var name:String?=null
    var category:String?=null
    var description:String?=null
    var syllabus:String?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addsyallabus)

        edname = findViewById<EditText>(R.id.edname)
        edprofile = findViewById<EditText>(R.id.edaddress)
        edcriteria = findViewById<EditText>(R.id.eddesc)
        edsyll = findViewById(R.id.edsyll)


    }

    fun UploadData(view: View?) {
        category = edname!!.text.toString()
        name = edprofile!!.text.toString()
        description = edcriteria!!.text.toString()
        syllabus = edsyll!!.text.toString()





        val data = FirebaseDatabase.getInstance().getReference().child("syllabus")
        val service = notice(category,name,description,syllabus)


        data.push().setValue(service)

        Toast.makeText(applicationContext,"Uploaded", Toast.LENGTH_LONG).show()



    }

}