package com.application.app.modules.tampilanmenu.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowTampilanMenu1Binding
import com.application.app.modules.tampilanmenu.`data`.model.TampilanMenu1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerTampilanMenuAdapter(
  public var list: List<TampilanMenu1RowModel>
) : RecyclerView.Adapter<RecyclerTampilanMenuAdapter.RowTampilanMenu1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTampilanMenu1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tampilan_menu1,parent,false)
    return RowTampilanMenu1VH(view)
  }

  public override fun onBindViewHolder(holder: RowTampilanMenu1VH, position: Int): Unit {
    val tampilanMenu1RowModel = TampilanMenu1RowModel()
    // TODO uncomment following line after integration with data source
    // val tampilanMenu1RowModel = list[position]
    holder.binding.tampilanMenu1RowModel = tampilanMenu1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TampilanMenu1RowModel>): Unit {
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
      item: TampilanMenu1RowModel
    ): Unit {
    }
  }

  public inner class RowTampilanMenu1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowTampilanMenu1Binding = RowTampilanMenu1Binding.bind(itemView)
  }
}
