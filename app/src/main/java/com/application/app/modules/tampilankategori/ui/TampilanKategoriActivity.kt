package com.application.app.modules.tampilankategori.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTampilanKategoriBinding
import com.application.app.modules.tampilanakun.ui.TampilanAkunActivity
import com.application.app.modules.tampilanbuatjanji1.ui.TampilanBuatJanji1Activity
import com.application.app.modules.tampilankategori.`data`.viewmodel.TampilanKategoriVM
import com.application.app.modules.tampilankotakmasuk.ui.TampilanKotakMasukActivity
import com.application.app.modules.tampilanmenu.ui.TampilanMenuActivity
import com.application.app.modules.tampilanreservasi.ui.TampilanReservasiActivity
import kotlin.String
import kotlin.Unit

public class TampilanKategoriActivity :
    BaseActivity<ActivityTampilanKategoriBinding>(R.layout.activity_tampilan_kategori) {
  private val viewModel: TampilanKategoriVM by viewModels<TampilanKategoriVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tampilanKategoriVM = viewModel
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
    binding.imageClipboardr.setOnClickListener {
      val destIntent = TampilanReservasiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageEmailr.setOnClickListener {
      val destIntent = TampilanKotakMasukActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearGroup189.setOnClickListener {
      val destIntent = TampilanBuatJanji1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "TAMPILAN_KATEGORI_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanKategoriActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
