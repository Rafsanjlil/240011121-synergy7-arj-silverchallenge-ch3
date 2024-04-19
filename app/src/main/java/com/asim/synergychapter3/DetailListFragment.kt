package com.asim.synergychapter3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.asim.synergychapter3.databinding.FragmentDetailListBinding

class DetailListFragment : Fragment() {
    private var _binding: FragmentDetailListBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var Alpabhet = ""
        val params = arguments?.getString("PARAMS") //'A'
        var dataList = arrayListOf<String>()
        when (params){
            Words.A.char -> {
                dataList = Words.A.words
                Alpabhet = Words.A.char
            }
            Words.B.char -> {
                dataList = Words.B.words
                Alpabhet = Words.B.char
            }
            Words.C.char -> {
                dataList = Words.C.words
                Alpabhet = Words.C.char
            }
            Words.D.char -> {
                dataList = Words.D.words
                Alpabhet = Words.D.char
            }
            Words.E.char -> {
                dataList = Words.E.words
                Alpabhet = Words.E.char
            }
            Words.F.char -> {
                dataList = Words.F.words
                Alpabhet = Words.F.char
            }
            Words.G.char -> {
                dataList = Words.G.words
                Alpabhet = Words.G.char
            }
            Words.H.char -> {
                dataList = Words.H.words
                Alpabhet = Words.H.char
            }
            Words.I.char -> {
                dataList = Words.I.words
                Alpabhet = Words.I.char
            }
            Words.J.char -> {
                dataList = Words.J.words
                Alpabhet = Words.J.char
            }
            Words.K.char -> {
                dataList = Words.K.words
                Alpabhet = Words.K.char
            }
            Words.L.char -> {
                dataList = Words.L.words
                Alpabhet = Words.L.char
            }
            Words.M.char -> {
                dataList = Words.M.words
                Alpabhet = Words.M.char
            }
            Words.N.char -> {
                dataList = Words.N.words
                Alpabhet = Words.N.char
            }
            Words.O.char -> {
                dataList = Words.O.words
                Alpabhet = Words.O.char
            }
            Words.P.char -> {
                dataList = Words.P.words
                Alpabhet = Words.P.char
            }
            Words.Q.char -> {
                dataList = Words.Q.words
                Alpabhet = Words.Q.char
            }
            Words.R.char -> {
                dataList = Words.R.words
                Alpabhet = Words.R.char
            }
            Words.S.char -> {
                dataList = Words.S.words
                Alpabhet = Words.S.char
            }
            Words.T.char -> {
                dataList = Words.T.words
                Alpabhet = Words.T.char
            }
            Words.U.char -> {
                dataList = Words.U.words
                Alpabhet = Words.U.char
            }
            Words.V.char -> {
                dataList = Words.V.words
                Alpabhet = Words.V.char
            }
            Words.W.char -> {
                dataList = Words.W.words
                Alpabhet = Words.W.char
            }
            Words.X.char -> {
                dataList = Words.X.words
                Alpabhet = Words.X.char
            }
            Words.Y.char -> {
                dataList = Words.Y.words
                Alpabhet = Words.Y.char
            }
            Words.Z.char -> {
                dataList = Words.Z.words
                Alpabhet = Words.Z.char
            }
        }

        val adapter = ListItemAdapter {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.google.com/search?q=$it"))
            activity?.startActivity(intent)
        }
        dataList?.let { adapter.submitData(dataList) }
        binding.rvListWords.adapter = adapter
        binding.rvListWords.layoutManager = LinearLayoutManager(activity)

        setToolbar("Word That Start With $Alpabhet")
    }
    fun setToolbar(title: String){
        binding.toolbar.topAppBar.setNavigationOnClickListener {
            findNavController().popBackStack()
        }
        binding.toolbar.topAppBar.title = title
        binding.toolbar.topAppBar.menu.clear()
    }


}