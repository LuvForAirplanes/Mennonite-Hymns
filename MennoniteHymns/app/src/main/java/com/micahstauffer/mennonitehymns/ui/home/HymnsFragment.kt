package com.micahstauffer.mennonitehymns.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.micahstauffer.mennonitehymns.R

class HymnsFragment : Fragment() {

    private lateinit var hymnsViewModel: HymnsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        hymnsViewModel =
            ViewModelProviders.of(this).get(HymnsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_hymns, container, false)
        val textView: TextView = root.findViewById(R.id.hymns_label)
        hymnsViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}