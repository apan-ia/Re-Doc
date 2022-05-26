package com.application.app.modules.tampilanmenu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTampilanMenuBinding
import com.application.app.modules.tampilanakun.ui.TampilanAkunActivity
import com.application.app.modules.tampilanbuatjanji1.ui.TampilanBuatJanji1Activity
import com.application.app.modules.tampilankategori.ui.TampilanKategoriActivity
import com.application.app.modules.tampilankotakmasuk.ui.TampilanKotakMasukActivity
import com.application.app.modules.tampilanmenu.`data`.model.TampilanMenu1RowModel
import com.application.app.modules.tampilanmenu.`data`.viewmodel.TampilanMenuVM
import com.application.app.modules.tampilanrekomendasidokter.ui.TampilanRekomendasiDokterActivity
import com.application.app.modules.tampilanreservasi.ui.TampilanReservasiActivity
import com.application.app.modules.tampilansearch.ui.TampilanSearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class TampilanMenuActivity :
    BaseActivity<ActivityTampilanMenuBinding>(R.layout.activity_tampilan_menu) {
  private val viewModel: TampilanMenuVM by viewModels<TampilanMenuVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerTampilanMenuAdapter =
    RecyclerTampilanMenuAdapter(viewModel.recyclerTampilanMenuList.value?:mutableListOf())
    binding.recyclerTampilanMenu.adapter = recyclerTampilanMenuAdapter
    recyclerTampilanMenuAdapter.setOnItemClickListener(
    object : RecyclerTampilanMenuAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TampilanMenu1RowModel) {
        onClickRecyclerTampilanMenu(view, position, item)
      }
    }
    )
    viewModel.recyclerTampilanMenuList.observe(this) {
      recyclerTampilanMenuAdapter.updateData(it)
    }
    binding.tampilanMenuVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageUserr.setOnClickListener {
      val destIntent = TampilanAkunActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageEmailr.setOnClickListener {
      val destIntent = TampilanKotakMasukActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearGroup292.setOnClickListener {
      val destIntent = TampilanBuatJanji1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageClipboardr.setOnClickListener {
      val destIntent = TampilanReservasiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCatagories.setOnClickListener {
      val destIntent = TampilanKategoriActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etSearch.setOnClickListener {
      val destIntent = TampilanSearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTopdoc.setOnClickListener {
      val destIntent = TampilanRekomendasiDokterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerTampilanMenu(
    view: View,
    position: Int,
    item: TampilanMenu1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "TAMPILAN_MENU_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanMenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
