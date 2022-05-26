package com.application.app.modules.tampilansearch.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TampilanSearch1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDrDRDrSya: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_dr_dr_sya)

)
