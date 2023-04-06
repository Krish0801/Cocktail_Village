package com.example.cocktailvillage.ui.latestDrinks

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cocktailvillage.R

class LatestDrinksFragment : Fragment() {

    companion object {
        fun newInstance() = LatestDrinksFragment()
    }

    private lateinit var viewModel: LatestDrinksViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_latest_drinks, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LatestDrinksViewModel::class.java)
        // TODO: Use the ViewModel
    }

}