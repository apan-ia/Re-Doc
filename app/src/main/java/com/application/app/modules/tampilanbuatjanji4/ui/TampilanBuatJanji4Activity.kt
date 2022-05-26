package com.application.app.modules.tampilanbuatjanji4.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTampilanBuatJanji4Binding
import com.application.app.modules.tampilanbuatjanji4.`data`.viewmodel.TampilanBuatJanji4VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

public class TampilanBuatJanji4Activity :
    BaseActivity<ActivityTampilanBuatJanji4Binding>(R.layout.activity_tampilan_buat_janji4) {
  private val viewModel: TampilanBuatJanji4VM by viewModels<TampilanBuatJanji4VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tampilanBuatJanji4VM = viewModel
    val adapter = TampilanBuatJanji4ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerGroup182.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup25,binding.viewPagerGroup182) { tab, position ->
      tab.text = TampilanBuatJanji4ActivityPagerAdapter.title[position]
      }.attach()
    }

    public override fun setUpClicks(): Unit {
    }

    public companion object {
      public const val TAG: String = "TAMPILAN_BUAT_JANJI4ACTIVITY"

      public fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, TampilanBuatJanji4Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
