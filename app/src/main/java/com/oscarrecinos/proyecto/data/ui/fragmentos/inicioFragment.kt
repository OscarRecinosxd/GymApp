package com.oscarrecinos.proyecto.data.ui.fragmentos

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.oscarrecinos.proyecto.R

class inicioFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_inicio, container, false)

        view.findViewById<Button>(R.id.EmpezarButton).setOnClickListener {
            view.findNavController().navigate(R.id.menuFragment)
            Log.d("ASD","Prueba")
        }
        return view
    }


}