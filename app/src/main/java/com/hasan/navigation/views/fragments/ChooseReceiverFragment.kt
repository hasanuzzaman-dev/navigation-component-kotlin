package com.hasan.navigation.views.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hasan.navigation.R
import kotlinx.android.synthetic.main.fragment_choose_receiver.*


class ChooseReceiverFragment : Fragment(R.layout.fragment_choose_receiver){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_next.setOnClickListener{
            val receiverName = et_receiver_name.text.toString()
            val args = Bundle()
            args.putString("name",receiverName)

            val action = ChooseReceiverFragmentDirections
                .actionChooseReceiverFragmentToSendCashFragment(receiverName)
            findNavController().navigate(action)
        }
    }


}