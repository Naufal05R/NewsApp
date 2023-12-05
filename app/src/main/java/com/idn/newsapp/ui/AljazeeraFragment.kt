package com.idn.newsapp.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.newsapp.NewsViewModel
import com.idn.newsapp.adapter.NewsAdapter
import com.idn.newsapp.databinding.FragmentAljazeeraBinding

class AljazeeraFragment : Fragment() {
    private var _binding: FragmentAljazeeraBinding? = null
    private val binding get() = _binding as FragmentAljazeeraBinding

    private var _alJazeeraNewsViewModel: NewsViewModel? = null
    private val alJazeeraNewsViewModel get() = _alJazeeraNewsViewModel as NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentAljazeeraBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loadingView.root.visibility = View.VISIBLE
        _alJazeeraNewsViewModel = ViewModelProvider(this)[NewsViewModel::class.java]
        alJazeeraNewsViewModel.alJazeeraNews()
        alJazeeraNewsViewModel.alJazeeraNews.observe(viewLifecycleOwner) {
            val mAdapter = NewsAdapter()
            mAdapter.setData(it.articles)
            Log.i("AboutAlQuranFragment", "onViewCreated: ${it.articles}")
            binding.rvAljazeera.apply {
                adapter = mAdapter
                layoutManager = LinearLayoutManager(view.context)
            }
            binding.loadingView.root.visibility = View.GONE
        }
    }
}