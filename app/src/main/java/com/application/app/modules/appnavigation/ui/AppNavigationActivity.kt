package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.tampilanakun.ui.TampilanAkunActivity
import com.application.app.modules.tampilanawal.ui.TampilanAwalActivity
import com.application.app.modules.tampilanbuatjanji1.ui.TampilanBuatJanji1Activity
import com.application.app.modules.tampilanbuatjanji4.ui.TampilanBuatJanji4Activity
import com.application.app.modules.tampilandaftar.ui.TampilanDaftarActivity
import com.application.app.modules.tampilankategori.ui.TampilanKategoriActivity
import com.application.app.modules.tampilankotakmasuk.ui.TampilanKotakMasukActivity
import com.application.app.modules.tampilankotakmasukselesai.ui.TampilanKotakMasukSelesaiActivity
import com.application.app.modules.tampilanmasuk.ui.TampilanMasukActivity
import com.application.app.modules.tampilanmenu.ui.TampilanMenuActivity
import com.application.app.modules.tampilanrekomendasidokter.ui.TampilanRekomendasiDokterActivity
import com.application.app.modules.tampilanreservasi.ui.TampilanReservasiActivity
import com.application.app.modules.tampilansearch.ui.TampilanSearchActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearTampilanBuatJanji1.setOnClickListener {
      val destIntent = TampilanBuatJanji4Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTampilanKotakMasuk.setOnClickListener {
      val destIntent = TampilanKotakMasukActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTampilanAwal.setOnClickListener {
      val destIntent = TampilanAwalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTampilanReservasi.setOnClickListener {
      val destIntent = TampilanReservasiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTampilanMenu.setOnClickListener {
      val destIntent = TampilanMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTampilanKategori.setOnClickListener {
      val destIntent = TampilanKategoriActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTampilanBuatJanji.setOnClickListener {
      val destIntent = TampilanBuatJanji1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTampilanKotakMasukSelesai.setOnClickListener {
      val destIntent = TampilanKotakMasukSelesaiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTampilanRekomendasiDokter.setOnClickListener {
      val destIntent = TampilanRekomendasiDokterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTampilanDaftar.setOnClickListener {
      val destIntent = TampilanDaftarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTampilanSearch.setOnClickListener {
      val destIntent = TampilanSearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTampilanMasuk.setOnClickListener {
      val destIntent = TampilanMasukActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTampilanAkun.setOnClickListener {
      val destIntent = TampilanAkunActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
