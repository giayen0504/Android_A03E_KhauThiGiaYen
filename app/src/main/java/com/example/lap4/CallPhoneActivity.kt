package com.example.lap4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lap4.databinding.ActivitiCallPhoneBinding


class CallPhoneActivity : AppCompatActivity() {
    private lateinit var binding: ActivitiCallPhoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitiCallPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //quay lai main
        binding.btnback.setOnClickListener {
            val i3 = Intent(this, MainActivity::class.java)
            startActivity(i3)
        }


        //call phone

        val onClickListener = binding.edtphone.setOnClickListener {
            val i8 = Intent(Intent.ACTION_CALL)
            val phone = binding.edtphone.text.toString()
            if (phone.matches(Regex("\\d{10}"))) {
                val uri = Uri.parse("tel:$phone")
                i8.data = uri

                startActivity(i8)

            }
            startActivity(i8)
        }
    }
}

