package com.application.app.modules.tampilanbuatjanji1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TampilanBuatJanji3RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDrgLita: String? = MyApp.getInstance().resources.getString(R.string.lbl_drg_lita)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDokterGigi: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dokter_gigi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt234: String? = MyApp.getInstance().resources.getString(R.string.lbl_234)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt38: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_8)

)
