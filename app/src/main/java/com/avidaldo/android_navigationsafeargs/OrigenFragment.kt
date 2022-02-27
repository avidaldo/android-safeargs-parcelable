package com.avidaldo.android_navigationsafeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.avidaldo.android_navigationsafeargs.databinding.FragmentOrigenBinding


class OrigenFragment : Fragment() {
    private var _binding: FragmentOrigenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentOrigenBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCalculateAverageScore.setOnClickListener {

            val empleado =  Empleado(
                binding.textInputEditTextNombre.text.toString(),
                binding.textInputEditTextApellidos.text.toString(),
                binding.textInputEditTextEdad.text.toString().toInt()
            )
            /** Habría que gestionar errores en la inserción de datos, en particular
             * la NumberFormatException que salta si no se introduce un Int para la edad */


            findNavController().navigate(
                OrigenFragmentDirections.actionOrigenFragmentToDestinoFragment(empleado))
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}