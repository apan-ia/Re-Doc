package com.application.app.modules.tampilanbuatjanji1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTampilanBuatJanji1Binding
import com.application.app.modules.tampilanakun.ui.TampilanAkunActivity
import com.application.app.modules.tampilanbuatjanji1.`data`.model.TampilanBuatJanji2RowModel
import com.application.app.modules.tampilanbuatjanji1.`data`.model.TampilanBuatJanji3RowModel
import com.application.app.modules.tampilanbuatjanji1.`data`.viewmodel.TampilanBuatJanji1VM
import com.application.app.modules.tampilankotakmasuk.ui.TampilanKotakMasukActivity
import com.application.app.modules.tampilanmenu.ui.TampilanMenuActivity
import com.application.app.modules.tampilanreservasi.ui.TampilanReservasiActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class TampilanBuatJanji1Activity :
    BaseActivity<ActivityTampilanBuatJanji1Binding>(R.layout.activity_tampilan_buat_janji1) {
  private val viewModel: TampilanBuatJanji1VM by viewModels<TampilanBuatJanji1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerTampilanBuatJanjiAdapter =
    RecyclerTampilanBuatJanjiAdapter(viewModel.recyclerTampilanBuatJanjiList.value?:mutableListOf())
    binding.recyclerTampilanBuatJanji.adapter = recyclerTampilanBuatJanjiAdapter
    recyclerTampilanBuatJanjiAdapter.setOnItemClickListener(
    object : RecyclerTampilanBuatJanjiAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TampilanBuatJanji2RowModel) {
        onClickRecyclerTampilanBuatJanji(view, position, item)
      }
    }
    )
    viewModel.recyclerTampilanBuatJanjiList.observe(this) {
      recyclerTampilanBuatJanjiAdapter.updateData(it)
    }
    val recyclerTampilanBuatJanji1Adapter =
    RecyclerTampilanBuatJanji1Adapter(viewModel.recyclerTampilanBuatJanji1List.value?:mutableListOf())
    binding.recyclerTampilanBuatJanji1.adapter = recyclerTampilanBuatJanji1Adapter
    recyclerTampilanBuatJanji1Adapter.setOnItemClickListener(
    object : RecyclerTampilanBuatJanji1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TampilanBuatJanji3RowModel) {
        onClickRecyclerTampilanBuatJanji1(view, position, item)
      }
    }
    )
    viewModel.recyclerTampilanBuatJanji1List.observe(this) {
      recyclerTampilanBuatJanji1Adapter.updateData(it)
    }
    binding.tampilanBuatJanji1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageHomer.setOnClickListener {
      val destIntent = TampilanMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
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
  }

  public fun onClickRecyclerTampilanBuatJanji(
    view: View,
    position: Int,
    item: TampilanBuatJanji2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerTampilanBuatJanji1(
    view: View,
    position: Int,
    item: TampilanBuatJanji3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "TAMPILAN_BUAT_JANJI1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanBuatJanji1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
