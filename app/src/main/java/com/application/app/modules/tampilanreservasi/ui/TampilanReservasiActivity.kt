package com.application.app.modules.tampilanreservasi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTampilanReservasiBinding
import com.application.app.modules.tampilanakun.ui.TampilanAkunActivity
import com.application.app.modules.tampilankotakmasuk.ui.TampilanKotakMasukActivity
import com.application.app.modules.tampilanmenu.ui.TampilanMenuActivity
import com.application.app.modules.tampilanreservasi.`data`.viewmodel.TampilanReservasiVM
import kotlin.String
import kotlin.Unit

public class TampilanReservasiActivity :
    BaseActivity<ActivityTampilanReservasiBinding>(R.layout.activity_tampilan_reservasi) {
  private val viewModel: TampilanReservasiVM by viewModels<TampilanReservasiVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tampilanReservasiVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageEmailr.setOnClickListener {
      val destIntent = TampilanKotakMasukActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageUserr.setOnClickListener {
      val destIntent = TampilanAkunActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageGroup.setOnClickListener {
      val destIntent = TampilanMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageHomer.setOnClickListener {
      val destIntent = TampilanMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "TAMPILAN_RESERVASI_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanReservasiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
