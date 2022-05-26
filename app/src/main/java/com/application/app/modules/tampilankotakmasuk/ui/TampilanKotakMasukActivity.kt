package com.application.app.modules.tampilankotakmasuk.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTampilanKotakMasukBinding
import com.application.app.modules.tampilanakun.ui.TampilanAkunActivity
import com.application.app.modules.tampilankotakmasuk.`data`.viewmodel.TampilanKotakMasukVM
import com.application.app.modules.tampilankotakmasukselesai.ui.TampilanKotakMasukSelesaiActivity
import com.application.app.modules.tampilanmenu.ui.TampilanMenuActivity
import com.application.app.modules.tampilanreservasi.ui.TampilanReservasiActivity
import kotlin.String
import kotlin.Unit

public class TampilanKotakMasukActivity :
    BaseActivity<ActivityTampilanKotakMasukBinding>(R.layout.activity_tampilan_kotak_masuk) {
  private val viewModel: TampilanKotakMasukVM by viewModels<TampilanKotakMasukVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tampilanKotakMasukVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageHomer.setOnClickListener {
      val destIntent = TampilanMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUserr.setOnClickListener {
      val destIntent = TampilanAkunActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageClipboardr.setOnClickListener {
      val destIntent = TampilanReservasiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSelesai.setOnClickListener {
      val destIntent = TampilanKotakMasukSelesaiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageGroup.setOnClickListener {
      val destIntent = TampilanMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "TAMPILAN_KOTAK_MASUK_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanKotakMasukActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
