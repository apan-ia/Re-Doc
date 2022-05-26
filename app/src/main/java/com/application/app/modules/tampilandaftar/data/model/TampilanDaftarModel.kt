package com.application.app.modules.tampilandaftar.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TampilanDaftarModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtReDoc: String? = MyApp.getInstance().resources.getString(R.string.lbl_re_doc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSilakanMendaft: String? =
      MyApp.getInstance().resources.getString(R.string.msg_silakan_mendaft)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlamat: String? = MyApp.getInstance().resources.getString(R.string.lbl_alamat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTanggalLahir: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tanggal_lahir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNoHp: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_hp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etMasukkanUsernaValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etMasukkanEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etAlamatDomisiliValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etTanggalLahirValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etNoHpValue: String? = null
)
