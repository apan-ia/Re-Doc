package com.application.app.modules.tampilankotakmasukselesai.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TampilanKotakMasukSelesaiModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtReDoc: String? = MyApp.getInstance().resources.getString(R.string.lbl_re_doc)
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
  public var txtReservasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_reservasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSelesai: String? = MyApp.getInstance().resources.getString(R.string.lbl_selesai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDRDrSYAHRUL: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_dr_syahrul3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKomentarDokter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_komentar_dokter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMax600Words: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_max_600_words)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOK: String? = MyApp.getInstance().resources.getString(R.string.lbl_ok)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBeranda: String? = MyApp.getInstance().resources.getString(R.string.lbl_beranda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtReservasi1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reservasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKotakMasuk1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kotak_masuk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAkunSaya: String? = MyApp.getInstance().resources.getString(R.string.lbl_akun_saya)

)
