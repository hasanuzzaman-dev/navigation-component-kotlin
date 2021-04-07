package com.hasan.navigation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.hasan.navigation.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()

        btn_view_balance.setOnClickListener{

            //// Navigate using action object (3)
            val action = HomeFragmentDirections.actionHomeFragmentToViewBalanceFragment()
            navController.navigate(action)

            // Navigate using direct action id (2)
            // navController.navigate(R.id.action_homeFragment_to_viewBalanceFragment)

            // Navigate using destination Id (1)
            // navController.navigate(R.id.viewBalanceFragment)
        }

        btn_transactions.setOnClickListener{

            val action = HomeFragmentDirections.actionHomeFragmentToViewTransactionFragment()
            navController.navigate(action)

            // Navigate using direct action id
            /* navController.navigate(R.id.action_homeFragment_to_viewTransactionFragment)*/
        }

        btn_send_money.setOnClickListener{

            val action = HomeFragmentDirections.actionHomeFragmentToChooseReceiverFragment()
            navController.navigate(action)

            // Navigate using direct action id

            //navController.navigate(R.id.action_homeFragment_to_chooseReceiverFragment)

            // Navigate using destination Id (1)
            // If you using destination id then its nav graph animation did not work
            // you need to create animation here

            /*val navOption = NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_right)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopExitAnim(R.anim.slide_out_right)
                .build()

            navController.navigate(R.id.chooseReceiverFragment, null, navOption)*/

            // navController.navigate(R.id.chooseReceiverFragment)
        }
    }
}



