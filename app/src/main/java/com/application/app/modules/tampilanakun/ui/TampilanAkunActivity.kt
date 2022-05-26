package com.application.app.modules.tampilanakun.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTampilanAkunBinding
import com.application.app.modules.tampilanakun.`data`.viewmodel.TampilanAkunVM
import com.application.app.modules.tampilankotakmasuk.ui.TampilanKotakMasukActivity
import com.application.app.modules.tampilanmenu.ui.TampilanMenuActivity
import com.application.app.modules.tampilanreservasi.ui.TampilanReservasiActivity
import kotlin.String
import kotlin.Unit

public class TampilanAkunActivity :
    BaseActivity<ActivityTampilanAkunBinding>(R.layout.activity_tampilan_akun) {
  private val viewModel: TampilanAkunVM by viewModels<TampilanAkunVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tampilanAkunVM = viewModel
  }

  public override fun setUpClicks(): Unit {
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
  }

  public companion object {
    public const val TAG: String = "TAMPILAN_AKUN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanAkunActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
