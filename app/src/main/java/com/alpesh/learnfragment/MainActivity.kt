package com.alpesh.learnfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.alpesh.learnfragment.Fragment.ActivityFragment
import com.alpesh.learnfragment.Fragment.ButtonFragment
import com.alpesh.learnfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ButtonHome.setOnClickListener {
            var activityFragment=ActivityFragment()
            var manager:FragmentManager = supportFragmentManager
            var transaction = manager.beginTransaction()
            transaction.replace(R.id.fragFram,activityFragment)
            transaction.commit()
        }

        binding.ButtonLanguage.setOnClickListener {
            loadFragment(ButtonFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragFram,fragment).commit()
    }
}
