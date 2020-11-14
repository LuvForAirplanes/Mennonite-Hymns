package com.micahstauffer.mennonitehymns.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HymnsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is where the hymns will reside."
    }
    val text: LiveData<String> = _text
}