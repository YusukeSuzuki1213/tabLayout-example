package com.example.tablayout_example.home.presentation.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.tablayout_example.R
import com.example.tablayout_example.databinding.FragmentCollectionDemoBinding
import com.example.tablayout_example.home.presentation.screen.adapter.DemoCollectionPagerAdapter

class CollectionDemoFragment : Fragment() {

    private lateinit var demoCollectionPagerAdapter: DemoCollectionPagerAdapter
    private lateinit var binding : FragmentCollectionDemoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_collection_demo, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        demoCollectionPagerAdapter = DemoCollectionPagerAdapter(childFragmentManager)

        binding.run {
            pager.adapter = demoCollectionPagerAdapter
            tabLayout.setupWithViewPager(this.pager)
        }
    }
}