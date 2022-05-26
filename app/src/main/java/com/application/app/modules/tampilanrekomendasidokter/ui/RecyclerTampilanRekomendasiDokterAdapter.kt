package com.application.app.modules.tampilanrekomendasidokter.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowTampilanRekomendasiDokter1Binding
import com.application.app.modules.tampilanrekomendasidokter.`data`.model.TampilanRekomendasiDokter1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerTampilanRekomendasiDokterAdapter(
  public var list: List<TampilanRekomendasiDokter1RowModel>
) : RecyclerView.Adapter<RecyclerTampilanRekomendasiDokterAdapter.RowTampilanRekomendasiDokter1VH>()
    {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowTampilanRekomendasiDokter1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_tampilan_rekomendasi_dokter1,parent,false)
    return RowTampilanRekomendasiDokter1VH(view)
  }

  public override fun onBindViewHolder(holder: RowTampilanRekomendasiDokter1VH, position: Int):
      Unit {
    val tampilanRekomendasiDokter1RowModel = TampilanRekomendasiDokter1RowModel()
    // TODO uncomment following line after integration with data source
    // val tampilanRekomendasiDokter1RowModel = list[position]
    holder.binding.tampilanRekomendasiDokter1RowModel = tampilanRekomendasiDokter1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TampilanRekomendasiDokter1RowModel>): Unit {
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
      item: TampilanRekomendasiDokter1RowModel
    ): Unit {
    }
  }

  public inner class RowTampilanRekomendasiDokter1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowTampilanRekomendasiDokter1Binding =
        RowTampilanRekomendasiDokter1Binding.bind(itemView)
  }
}
