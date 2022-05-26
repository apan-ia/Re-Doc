package com.application.app.modules.tampilanbuatjanji4.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import com.application.app.modules.tampilanbuatjanji.ui.TampilanBuatJanjiFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class TampilanBuatJanji4ActivityPagerAdapter(
    public val fragmentManager: FragmentManager,
    public val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    public override fun getItemCount(): Int = viewPages.size

    public override fun createFragment(position: Int): Fragment = viewPages[position]

    public companion object AdapterConstant {
        public val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_18_00),MyApp.getInstance().resources.getString(R.string.lbl_19_00),MyApp.getInstance().resources.getString(R.string.lbl_20_00))

        public val viewPages: List<Fragment> =
                listOf(TampilanBuatJanjiFragment(),TampilanBuatJanjiFragment(),TampilanBuatJanjiFragment())

    }
}
