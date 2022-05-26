package com.application.app.modules.tampilanrekomendasidokter.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TampilanRekomendasiDokter1RowModel(
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
  public var txt99: String? = MyApp.getInstance().resources.getString(R.string.lbl_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt5: String? = MyApp.getInstance().resources.getString(R.string.lbl_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDrSyahrulSp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_syahrul_sp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSpesialisSaraf: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_spesialis_saraf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt145: String? = MyApp.getInstance().resources.getString(R.string.lbl_145)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt48: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8)

)
