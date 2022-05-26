package com.application.app.modules.tampilanawal.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTampilanAwalBinding
import com.application.app.modules.tampilanawal.`data`.viewmodel.TampilanAwalVM
import com.application.app.modules.tampilanmasuk.ui.TampilanMasukActivity
import kotlin.String
import kotlin.Unit

public class TampilanAwalActivity :
    BaseActivity<ActivityTampilanAwalBinding>(R.layout.activity_tampilan_awal) {
  private val viewModel: TampilanAwalVM by viewModels<TampilanAwalVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tampilanAwalVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnReservasi.setOnClickListener {
      val destIntent = TampilanMasukActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "TAMPILAN_AWAL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanAwalActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
