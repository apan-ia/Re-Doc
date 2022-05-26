package com.application.app.modules.tampilanbuatjanji1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TampilanBuatJanji1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtReDoc: String? = MyApp.getInstance().resources.getString(R.string.lbl_re_doc)
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
  public var txtBeranda: String? = MyApp.getInstance().resources.getString(R.string.lbl_beranda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtReservasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_reservasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKotakMasuk: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kotak_masuk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAkunSaya: String? = MyApp.getInstance().resources.getString(R.string.lbl_akun_saya)

)
