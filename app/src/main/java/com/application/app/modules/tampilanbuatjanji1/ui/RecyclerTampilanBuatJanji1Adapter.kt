package com.application.app.modules.tampilanbuatjanji1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowTampilanBuatJanji3Binding
import com.application.app.modules.tampilanbuatjanji1.`data`.model.TampilanBuatJanji3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerTampilanBuatJanji1Adapter(
  public var list: List<TampilanBuatJanji3RowModel>
) : RecyclerView.Adapter<RecyclerTampilanBuatJanji1Adapter.RowTampilanBuatJanji3VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowTampilanBuatJanji3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_tampilan_buat_janji3,parent,false)
    return RowTampilanBuatJanji3VH(view)
  }

  public override fun onBindViewHolder(holder: RowTampilanBuatJanji3VH, position: Int): Unit {
    val tampilanBuatJanji3RowModel = TampilanBuatJanji3RowModel()
    // TODO uncomment following line after integration with data source
    // val tampilanBuatJanji3RowModel = list[position]
    holder.binding.tampilanBuatJanji3RowModel = tampilanBuatJanji3RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TampilanBuatJanji3RowModel>): Unit {
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
      item: TampilanBuatJanji3RowModel
    ): Unit {
    }
  }

  public inner class RowTampilanBuatJanji3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowTampilanBuatJanji3Binding = RowTampilanBuatJanji3Binding.bind(itemView)
  }
}
