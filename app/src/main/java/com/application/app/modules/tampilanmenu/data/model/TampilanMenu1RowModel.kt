package com.application.app.modules.tampilanmenu.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TampilanMenu1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDrWAHDINISp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_wahdini_sp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSpesialisAnak: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_spesialis_anak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt5: String? = MyApp.getInstance().resources.getString(R.string.lbl_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBuatJanji: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_buat_janji)

)
