package com.application.app.modules.appnavigation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilanAkun: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tampilan_akun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilanReservasi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tampilan_reserv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilanKotakMasukSelesai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tampilan_kotak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilanKotakMasuk: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tampilan_kotak2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilanKategori: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tampilan_katego)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilanRekomendasiDokter: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tampilan_rekome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilanBuatJanji: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tampilan_buat_j)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilanSearch: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tampilan_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilanMenu: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tampilan_menu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilanDaftar: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tampilan_daftar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilanMasuk: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tampilan_masuk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilanAwal: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tampilan_awal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTampilanBuatJanji1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tampilan_buat_j)

)
