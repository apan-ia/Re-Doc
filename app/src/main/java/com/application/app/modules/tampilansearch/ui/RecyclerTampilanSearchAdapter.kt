package com.application.app.modules.tampilansearch.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowTampilanSearch1Binding
import com.application.app.modules.tampilansearch.`data`.model.TampilanSearch1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerTampilanSearchAdapter(
  public var list: List<TampilanSearch1RowModel>
) : RecyclerView.Adapter<RecyclerTampilanSearchAdapter.RowTampilanSearch1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTampilanSearch1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tampilan_search1,parent,false)
    return RowTampilanSearch1VH(view)
  }

  public override fun onBindViewHolder(holder: RowTampilanSearch1VH, position: Int): Unit {
    val tampilanSearch1RowModel = TampilanSearch1RowModel()
    // TODO uncomment following line after integration with data source
    // val tampilanSearch1RowModel = list[position]
    holder.binding.tampilanSearch1RowModel = tampilanSearch1RowModel
  }

  public override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TampilanSearch1RowModel>): Unit {
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
      item: TampilanSearch1RowModel
    ): Unit {
    }
  }

  public inner class RowTampilanSearch1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowTampilanSearch1Binding = RowTampilanSearch1Binding.bind(itemView)
  }
}
