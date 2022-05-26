package com.application.app.modules.tampilanawal.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TampilanAwalModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtReDoc: String? = MyApp.getInstance().resources.getString(R.string.lbl_re_doc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtReservasiSeger: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reservasi_seger)

)
