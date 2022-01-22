package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R


class LoginFragment : Fragment(R.layout.fragment_login) {
    private lateinit var editTextEmail2: EditText
    private lateinit var editTextPassword2: EditText
    private lateinit var buttonLogin: Button
    private lateinit var textViewResetPassword : TextView
    private lateinit var textViewSignup : TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val controller = Navigation.findNavController(view)

        editTextEmail2 = view.findViewById(R.id.editTextEmail2)
        editTextPassword2 = view.findViewById(R.id.editTextPassword2)
        buttonLogin = view.findViewById(R.id.buttonLogin)
        textViewResetPassword = view.findViewById(R.id.textViewResetPassword)
        textViewSignup = view.findViewById(R.id.textViewSignUp)

        textViewResetPassword.setOnClickListener(){
            val action = LoginFragmentDirections.actionLoginFragmentToRegistrationFragment()
            controller.navigate(action)

        }

        textViewSignup.setOnClickListener(){
            val action = LoginFragmentDirections.actionLoginFragmentToResetPasswordFragment()
            controller.navigate(action)
        }
    }


}
