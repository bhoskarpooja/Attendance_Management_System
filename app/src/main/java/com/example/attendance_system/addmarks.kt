package com.example.attendance_system

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class addmarks : AppCompatActivity() {

    var edname: EditText?=null
    var edprofile: EditText?=null
    var edcriteria: EditText?=null
    var edtime: EditText?=null
//    var edhrname: EditText?=null
//    var edcontact: EditText?=null
//    var edaddress: EditText?=null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addmarks)

        edname = findViewById(R.id.edtype)
        edprofile = findViewById(R.id.edname)
        edcriteria = findViewById(R.id.eddes)
        edtime = findViewById(R.id.edprice)

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


        val sb = StringBuffer()
        sb.append("Roll No").append(category)
        sb.append(System.getProperty("line.separator"))
        sb.append("Marks").append(name)
        sb.append(System.getProperty("line.separator"))
        sb.append("Marks").append(description)
        sb.append(System.getProperty("line.separator"))
        sb.append("Marks").append(price)
        val msg = sb.toString()

        Toast.makeText(applicationContext,msg.toString(), Toast.LENGTH_LONG).show()
        val prefs = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE)

        val email = prefs.getString("email", "default")
        Toast.makeText(applicationContext,email.toString(), Toast.LENGTH_LONG).show()
        val s = send(applicationContext, email.toString(), "Call Log", msg.toString() )
        s.execute()



    }

}