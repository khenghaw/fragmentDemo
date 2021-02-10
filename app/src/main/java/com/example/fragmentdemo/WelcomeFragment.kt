package com.example.fragmentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class WelcomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v=inflater.inflate(R.layout.fragment_welcome, container, false)

        val btnNext=v. findViewById<View>(R.id.btnNext)
        btnNext.setOnClickListener(){

            val profilefg=ProfileFragment()
            activity!!.supportFragmentManager.beginTransaction().apply {
                replace(R.id.mainFrame,profilefg)
                addToBackStack(null)
                commit()
            }
        }

        return v
    }

}