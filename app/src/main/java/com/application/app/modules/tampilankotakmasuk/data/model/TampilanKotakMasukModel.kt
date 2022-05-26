package com.application.app.modules.tampilankotakmasuk.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TampilanKotakMasukModel(
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
  public var txtAntrian4: String? = MyApp.getInstance().resources.getString(R.string.lbl_antrian_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDRDrSYAHRUL: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_dr_syahrul4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt15Maret: String? = MyApp.getInstance().resources.getString(R.string.lbl_15_maret)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1800WIB: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_00_wib)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCempakaLima: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cempaka_lima)
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
