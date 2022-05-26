package com.application.app.modules.tampilankotakmasukselesai.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTampilanKotakMasukSelesaiBinding
import com.application.app.modules.tampilanakun.ui.TampilanAkunActivity
import com.application.app.modules.tampilankotakmasuk.ui.TampilanKotakMasukActivity
import com.application.app.modules.tampilankotakmasukselesai.`data`.viewmodel.TampilanKotakMasukSelesaiVM
import com.application.app.modules.tampilanmenu.ui.TampilanMenuActivity
import com.application.app.modules.tampilanreservasi.ui.TampilanReservasiActivity
import kotlin.String
import kotlin.Unit

public class TampilanKotakMasukSelesaiActivity :
    BaseActivity<ActivityTampilanKotakMasukSelesaiBinding>(R.layout.activity_tampilan_kotak_masuk_selesai)
    {
  private val viewModel: TampilanKotakMasukSelesaiVM by viewModels<TampilanKotakMasukSelesaiVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tampilanKotakMasukSelesaiVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageGroup.setOnClickListener {
      val destIntent = TampilanMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUserr.setOnClickListener {
      val destIntent = TampilanAkunActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageEmailr.setOnClickListener {
      val destIntent = TampilanKotakMasukActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHomer.setOnClickListener {
      val destIntent = TampilanMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageClipboardr.setOnClickListener {
      val destIntent = TampilanReservasiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtOK.setOnClickListener {
      val destIntent = TampilanMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtReservasi.setOnClickListener {
      val destIntent = TampilanKotakMasukActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "TAMPILAN_KOTAK_MASUK_SELESAI_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanKotakMasukSelesaiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
