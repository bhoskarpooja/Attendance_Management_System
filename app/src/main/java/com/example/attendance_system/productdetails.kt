package com.example.attendance_system

import android.annotation.SuppressLint
import android.os.Bundle
import android.preference.PreferenceManager
import android.telephony.SmsManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.text.SimpleDateFormat
import java.util.*

class productdetails : AppCompatActivity() {

    var name: String? = null
    var material: String? = null
    var manifacute: String? = null
    var origin: String? = null
    var weight: String? = null
    var rating: String? = null
    var demi: String? = null
    var price: String? = null

    var ref: DatabaseReference? = null
    var username: String? = null
    var usermobile: String? = null
    var useremail: String? = null
    var useraddress: String? = null
    var url: String? = null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productdetails)

        val txtproname = findViewById<TextView>(R.id.txtname)
        val txtmaterial = findViewById<TextView>(R.id.txtmaterial)


        val image = findViewById<ImageView>(R.id.image1)
        val bundle = intent.extras




        name = bundle?.getString("name")
        material = bundle?.getString("rollno")


        url = bundle?.getString("url")

        Glide.with(this@productdetails).load(url).into(image)

        txtproname.setText("Student Name :" + name)
        txtmaterial.setText("Roll No: " + material)
        val btnpresent = findViewById<Button>(R.id.btnpresent)

        btnpresent.setOnClickListener {
            val date: String = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())
            Toast.makeText(applicationContext,date.toString(),Toast.LENGTH_SHORT).show()
            val data = FirebaseDatabase.getInstance().getReference().child("attendance")
            val service = service(name,material,"present",date)


            data.push().setValue(service)

            Toast.makeText(applicationContext,"Uploaded", Toast.LENGTH_LONG).show()


        }

        val btnabsent = findViewById<Button>(R.id.btnabsent)

        btnabsent.setOnClickListener {
            val date: String = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())
            Toast.makeText(applicationContext,date.toString(),Toast.LENGTH_SHORT).show()
            val data = FirebaseDatabase.getInstance().reference.child("attendance")
            val service = service(name,material,"absent",date)


            data.push().setValue(service)

            Toast.makeText(applicationContext,"Uploaded", Toast.LENGTH_LONG).show()

            val prefs = getSharedPreferences("MY_PREFS_NAME", MODE_PRIVATE)

            val number = prefs.getString("number", "default")
            Toast.makeText(applicationContext,number.toString(),Toast.LENGTH_LONG).show()
            val smsManager = SmsManager.getDefault() as SmsManager
            smsManager.sendTextMessage("+91$number",null,"Today Your Child Is Absent",null,null)

        }



    }
}