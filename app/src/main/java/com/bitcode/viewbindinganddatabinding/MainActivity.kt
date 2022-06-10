package com.bitcode.viewbindinganddatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bitcode.viewbindinganddatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtName.setText("Welcome to BitCode")

        binding.btnSetName.setOnClickListener {
            binding.txtName.setText(binding.edtName.text.toString())
            binding.imgLogo.setImageResource(R.mipmap.ic_launcher)
        }

        binding.btnShowUserDetails.setOnClickListener {

            var user = User(
                R.mipmap.ic_launcher,
                "Vishal Jagtap",
                1,
                1980,
                "vishal.jagtap@bitcode.in"
            )

            var intent = Intent(this, UserDetailsActivity::class.java)
            intent.putExtra("user", user)

            startActivity(intent)
        }

    }
}