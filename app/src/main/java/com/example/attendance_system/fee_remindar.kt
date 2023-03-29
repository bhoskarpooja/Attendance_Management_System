package com.example.attendance_system

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class fee_remindar : AppCompatActivity() {


    var edname: EditText?=null
    var edprofile: EditText?=null
    var edcriteria: EditText?=null
    var edtime: EditText?=null
    var edhrname: EditText?=null
    var edcontact: EditText?=null
    var edaddress: EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fee_remindar)

        edname = findViewById<EditText>(R.id.edtype)
        edprofile = findViewById<EditText>(R.id.edname)
        edcriteria = findViewById<EditText>(R.id.eddes)
        edtime = findViewById<EditText>(R.id.edprice)
    }
    fun UploadData(view: View?) {
        val category = edname!!.text.toString()
        val name = edprofile!!.text.toString()
        val description = edcriteria!!.text.toString()
        val price = edtime!!.text.toString()


        val data = FirebaseDatabase.getInstance().reference.child("Fees")
        val service = Myfee(category,name,description,price)


        data.push().setValue(service)

        Toast.makeText(applicationContext,"Uploaded", Toast.LENGTH_LONG).show()

        val prefs = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE)

        val number = prefs.getString("number", "default")
        Toast.makeText(applicationContext,number.toString(),Toast.LENGTH_LONG).show()
        val smsManager = SmsManager.getDefault() as SmsManager
        smsManager.sendTextMessage("+91$number",null, "Fees Pending rs$price",null,null)




    }
}