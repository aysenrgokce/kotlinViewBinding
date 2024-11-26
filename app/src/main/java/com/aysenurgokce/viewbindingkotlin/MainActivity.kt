package com.aysenurgokce.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.aysenurgokce.viewbindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)//Bu satır, XML dosyasını (örneğin, activity_main.xml) şişirir (inflate eder) ve kod ile ilişkilendirir.
        val view = binding.root//binding.root, XML dosyasının kök görünümünü (root view) temsil eder. Burada, oluşturulan arayüz (layout) bir View nesnesine atanmıştır.
        setContentView(view)//belirttiğimiz görünümü ekranda gösterir
    }
}