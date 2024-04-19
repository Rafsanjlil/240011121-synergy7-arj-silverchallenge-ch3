package com.asim.synergychapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.asim.synergychapter3.databinding.FragmentHomeListBinding

class HomeListFragment : Fragment() {

    private var _binding: FragmentHomeListBinding? = null
    private val binding get() = _binding!!

    private var isGridLayout = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolbar()
        setupRecyclerView()
    }
    private fun setupToolbar() {
        binding.toolbar.topAppBar.setNavigationIcon(null)
        binding.toolbar.topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.changeLayout -> {
                    toggleLayoutManager()
                }
            }
            false
        }
    }


    fun setupRecyclerView(){
        val adapter = ListItemAdapter {
            val bundle = Bundle()
            bundle.putString("PARAMS", it)
            findNavController().navigate(R.id.action_homeListFragment_to_detailListFragment, bundle)
        }
        adapter.submitData(alphabet)
        binding.rvListAlphabet.adapter = adapter
        binding.rvListAlphabet.layoutManager = LinearLayoutManager(activity)
    }

    private fun toggleLayoutManager() {
        if (isGridLayout) {
            binding.rvListAlphabet.layoutManager = LinearLayoutManager(activity)
        } else {
            binding.rvListAlphabet.layoutManager = GridLayoutManager(activity, 2)
        }
        isGridLayout = !isGridLayout
    }


}