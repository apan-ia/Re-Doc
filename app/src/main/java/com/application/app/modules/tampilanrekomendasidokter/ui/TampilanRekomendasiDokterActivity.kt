package com.application.app.modules.tampilanrekomendasidokter.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTampilanRekomendasiDokterBinding
import com.application.app.modules.tampilanakun.ui.TampilanAkunActivity
import com.application.app.modules.tampilankotakmasuk.ui.TampilanKotakMasukActivity
import com.application.app.modules.tampilanmenu.ui.TampilanMenuActivity
import com.application.app.modules.tampilanrekomendasidokter.`data`.model.TampilanRekomendasiDokter1RowModel
import com.application.app.modules.tampilanrekomendasidokter.`data`.viewmodel.TampilanRekomendasiDokterVM
import com.application.app.modules.tampilanreservasi.ui.TampilanReservasiActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class TampilanRekomendasiDokterActivity :
    BaseActivity<ActivityTampilanRekomendasiDokterBinding>(R.layout.activity_tampilan_rekomendasi_dokter)
    {
  private val viewModel: TampilanRekomendasiDokterVM by viewModels<TampilanRekomendasiDokterVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerTampilanRekomendasiDokterAdapter =
    RecyclerTampilanRekomendasiDokterAdapter(viewModel.recyclerTampilanRekomendasiDokterList.value?:mutableListOf())
    binding.recyclerTampilanRekomendasiDokter.adapter = recyclerTampilanRekomendasiDokterAdapter
    recyclerTampilanRekomendasiDokterAdapter.setOnItemClickListener(
    object : RecyclerTampilanRekomendasiDokterAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      TampilanRekomendasiDokter1RowModel) {
        onClickRecyclerTampilanRekomendasiDokter(view, position, item)
      }
    }
    )
    viewModel.recyclerTampilanRekomendasiDokterList.observe(this) {
      recyclerTampilanRekomendasiDokterAdapter.updateData(it)
    }
    binding.tampilanRekomendasiDokterVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageClipboardr.setOnClickListener {
      val destIntent = TampilanReservasiActivity.getIntent(this, null)
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
    binding.imageGroup.setOnClickListener {
      val destIntent = TampilanMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerTampilanRekomendasiDokter(
    view: View,
    position: Int,
    item: TampilanRekomendasiDokter1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "TAMPILAN_REKOMENDASI_DOKTER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanRekomendasiDokterActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
