package com.application.app.modules.tampilandaftar.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowTampilanDaftar1Binding
import com.application.app.modules.tampilandaftar.`data`.model.TampilanDaftar1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerTampilanDaftarAdapter(
  public var list: List<TampilanDaftar1RowModel>
) : RecyclerView.Adapter<RecyclerTampilanDaftarAdapter.RowTampilanDaftar1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTampilanDaftar1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tampilan_daftar1,parent,false)
    return RowTampilanDaftar1VH(view)
  }

  public override fun onBindViewHolder(holder: RowTampilanDaftar1VH, position: Int): Unit {
    val tampilanDaftar1RowModel = TampilanDaftar1RowModel()
    // TODO uncomment following line after integration with data source
    // val tampilanDaftar1RowModel = list[position]
    holder.binding.tampilanDaftar1RowModel = tampilanDaftar1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TampilanDaftar1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: TampilanDaftar1RowModel
    ): Unit {
    }
  }

  public inner class RowTampilanDaftar1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowTampilanDaftar1Binding = RowTampilanDaftar1Binding.bind(itemView)
  }
}
