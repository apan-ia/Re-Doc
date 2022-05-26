package com.application.app.modules.tampilanreservasi.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TampilanReservasiModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtReDoc: String? = MyApp.getInstance().resources.getString(R.string.lbl_re_doc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt15Maret1800: String? =
      MyApp.getInstance().resources.getString(R.string.msg_15_maret_18_00)
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
  public var txt01020304: String? =
      MyApp.getInstance().resources.getString(R.string.msg_01_02_03_04)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSelesaiSelesa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selesai_selesa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDRDrSYAHRUL: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_dr_syahrul)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etANTRIANValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_antrian)

)
