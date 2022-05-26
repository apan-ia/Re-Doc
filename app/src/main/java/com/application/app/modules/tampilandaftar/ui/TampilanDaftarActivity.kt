package com.application.app.modules.tampilandaftar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityTampilanDaftarBinding
import com.application.app.modules.tampilandaftar.`data`.model.TampilanDaftar1RowModel
import com.application.app.modules.tampilandaftar.`data`.viewmodel.TampilanDaftarVM
import com.application.app.modules.tampilanmasuk.ui.TampilanMasukActivity
import com.application.app.modules.tampilanmenu.ui.TampilanMenuActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class TampilanDaftarActivity :
    BaseActivity<ActivityTampilanDaftarBinding>(R.layout.activity_tampilan_daftar) {
  private val viewModel: TampilanDaftarVM by viewModels<TampilanDaftarVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerTampilanDaftarAdapter =
    RecyclerTampilanDaftarAdapter(viewModel.recyclerTampilanDaftarList.value?:mutableListOf())
    binding.recyclerTampilanDaftar.adapter = recyclerTampilanDaftarAdapter
    recyclerTampilanDaftarAdapter.setOnItemClickListener(
    object : RecyclerTampilanDaftarAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TampilanDaftar1RowModel) {
        onClickRecyclerTampilanDaftar(view, position, item)
      }
    }
    )
    viewModel.recyclerTampilanDaftarList.observe(this) {
      recyclerTampilanDaftarAdapter.updateData(it)
    }
    binding.tampilanDaftarVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageGroup.setOnClickListener {
      val destIntent = TampilanMasukActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnDaftar.setOnClickListener {
      val destIntent = TampilanMenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerTampilanDaftar(
    view: View,
    position: Int,
    item: TampilanDaftar1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "TAMPILAN_DAFTAR_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanDaftarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
