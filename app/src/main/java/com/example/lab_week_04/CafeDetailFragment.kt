package com.example.lab_week_04

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.TextView
import androidx.fragment.app.Fragment

class CafeDetailFragment : Fragment() {
    private val cafeTitle: TextView?
        get() = view?.findViewById(R.id.cafe_title)
    private val cafeDesc: TextView?
        get() = view?.findViewById(R.id.cafe_desc)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val position = arguments?.getInt("position", 0) ?: 0

        when (position) {
            0 -> {
                cafeTitle?.text = getString(R.string.starbucks_title)
                cafeDesc?.text = "Starbucks adalah jaringan kedai kopi internasional yang didirikan di Seattle, Washington. Mereka menawarkan berbagai macam kopi, teh, dan makanan ringan."
            }
            1 -> {
                cafeTitle?.text = getString(R.string.janjijiwa_title)
                cafeDesc?.text = "Janji Jiwa adalah brand kopi asli Indonesia yang menyajikan kopi dengan kualitas premium namun dengan harga yang terjangkau."
            }
            2 -> {
                cafeTitle?.text = getString(R.string.kopikenangan_title)
                cafeDesc?.text = "Kopi Kenangan adalah jaringan coffee shop Indonesia yang menyajikan kopi berkualitas dengan rasa yang khas dan memorable."
            }
        }
    }

    companion object {
        fun newInstance(position: Int): CafeDetailFragment {
            val fragment = CafeDetailFragment()
            val args = Bundle()
            args.putInt("position", position)
            fragment.arguments = args
            return fragment
        }
    }
}