package com.example.lab_week_04

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class CafeAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    private val context: Context = fragmentActivity

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CafeDetailFragment.newInstance(content = context.getString(R.string.starbucks_desc))
            1 -> CafeDetailFragment.newInstance(content = context.getString(R.string.janjijiwa_desc))
            2 -> CafeDetailFragment.newInstance(content = context.getString(R.string.kopikenangan_desc))
            else -> CafeDetailFragment.newInstance(content = "")
        }
    }
}