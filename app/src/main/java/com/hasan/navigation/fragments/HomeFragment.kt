package com.hasan.navigation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hasan.navigation.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        btn_view_balance.setOnClickListener{
            navController.navigate(R.id.action_homeFragment_to_viewBalanceFragment)
        }

        btn_transactions.setOnClickListener{
            navController.navigate(R.id.action_homeFragment_to_viewTransactionFragment)
        }

        btn_send_money.setOnClickListener{
            navController.navigate(R.id.action_homeFragment_to_chooseReceiverFragment)
        }
    }
}



