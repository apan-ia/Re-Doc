package com.application.app.modules.tampilanbuatjanji.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TampilanBuatJanjiModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtBuatJanji: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_buat_janji)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilkanKalen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tampilkan_kalen)

)
