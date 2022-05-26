package com.application.app.modules.tampilanbuatjanji1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowTampilanBuatJanji2Binding
import com.application.app.modules.tampilanbuatjanji1.`data`.model.TampilanBuatJanji2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerTampilanBuatJanjiAdapter(
  public var list: List<TampilanBuatJanji2RowModel>
) : RecyclerView.Adapter<RecyclerTampilanBuatJanjiAdapter.RowTampilanBuatJanji2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowTampilanBuatJanji2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_tampilan_buat_janji2,parent,false)
    return RowTampilanBuatJanji2VH(view)
  }

  public override fun onBindViewHolder(holder: RowTampilanBuatJanji2VH, position: Int): Unit {
    val tampilanBuatJanji2RowModel = TampilanBuatJanji2RowModel()
    // TODO uncomment following line after integration with data source
    // val tampilanBuatJanji2RowModel = list[position]
    holder.binding.tampilanBuatJanji2RowModel = tampilanBuatJanji2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TampilanBuatJanji2RowModel>): Unit {
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
      item: TampilanBuatJanji2RowModel
    ): Unit {
    }
  }

  public inner class RowTampilanBuatJanji2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowTampilanBuatJanji2Binding = RowTampilanBuatJanji2Binding.bind(itemView)
  }
}
