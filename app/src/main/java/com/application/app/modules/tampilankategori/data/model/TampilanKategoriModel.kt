package com.application.app.modules.tampilankategori.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TampilanKategoriModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtReDoc: String? = MyApp.getInstance().resources.getString(R.string.lbl_re_doc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKategori: String? = MyApp.getInstance().resources.getString(R.string.lbl_kategori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJantung: String? = MyApp.getInstance().resources.getString(R.string.lbl_jantung)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTulang: String? = MyApp.getInstance().resources.getString(R.string.lbl_tulang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGigi: String? = MyApp.getInstance().resources.getString(R.string.lbl_gigi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtParuparu: String? = MyApp.getInstance().resources.getString(R.string.lbl_paru_paru)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUmum: String? = MyApp.getInstance().resources.getString(R.string.lbl_umum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKandungan: String? = MyApp.getInstance().resources.getString(R.string.lbl_kandungan)
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
