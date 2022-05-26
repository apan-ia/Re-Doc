package com.application.app.modules.tampilanmasuk.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTampilanMasukBinding
import com.application.app.modules.tampilandaftar.ui.TampilanDaftarActivity
import com.application.app.modules.tampilanmasuk.`data`.viewmodel.TampilanMasukVM
import com.application.app.modules.tampilanmenu.ui.TampilanMenuActivity
import kotlin.String
import kotlin.Unit

public class TampilanMasukActivity :
    BaseActivity<ActivityTampilanMasukBinding>(R.layout.activity_tampilan_masuk) {
  private val viewModel: TampilanMasukVM by viewModels<TampilanMasukVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tampilanMasukVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearBottomsec.setOnClickListener {
      val destIntent = TampilanDaftarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnMasuk.setOnClickListener {
      val destIntent = TampilanMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "TAMPILAN_MASUK_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanMasukActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
