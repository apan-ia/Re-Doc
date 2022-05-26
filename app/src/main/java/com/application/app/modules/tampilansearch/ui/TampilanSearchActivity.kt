package com.application.app.modules.tampilansearch.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTampilanSearchBinding
import com.application.app.modules.tampilanakun.ui.TampilanAkunActivity
import com.application.app.modules.tampilankotakmasuk.ui.TampilanKotakMasukActivity
import com.application.app.modules.tampilanmenu.ui.TampilanMenuActivity
import com.application.app.modules.tampilanreservasi.ui.TampilanReservasiActivity
import com.application.app.modules.tampilansearch.`data`.model.TampilanSearch1RowModel
import com.application.app.modules.tampilansearch.`data`.viewmodel.TampilanSearchVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class TampilanSearchActivity :
    BaseActivity<ActivityTampilanSearchBinding>(R.layout.activity_tampilan_search) {
  private val viewModel: TampilanSearchVM by viewModels<TampilanSearchVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerTampilanSearchAdapter =
    RecyclerTampilanSearchAdapter(viewModel.recyclerTampilanSearchList.value?:mutableListOf())
    binding.recyclerTampilanSearch.adapter = recyclerTampilanSearchAdapter
    recyclerTampilanSearchAdapter.setOnItemClickListener(
    object : RecyclerTampilanSearchAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TampilanSearch1RowModel) {
        onClickRecyclerTampilanSearch(view, position, item)
      }
    }
    )
    viewModel.recyclerTampilanSearchList.observe(this) {
      recyclerTampilanSearchAdapter.updateData(it)
    }
    binding.tampilanSearchVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageClipboardr.setOnClickListener {
      val destIntent = TampilanReservasiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
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
  }

  public fun onClickRecyclerTampilanSearch(
    view: View,
    position: Int,
    item: TampilanSearch1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "TAMPILAN_SEARCH_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanSearchActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
