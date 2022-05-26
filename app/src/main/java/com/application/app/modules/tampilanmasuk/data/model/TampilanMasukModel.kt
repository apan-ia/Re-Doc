package com.application.app.modules.tampilanmasuk.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class TampilanMasukModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtReDoc: String? = MyApp.getInstance().resources.getString(R.string.lbl_re_doc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSilakanLoginA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_silakan_login_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLupaPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lupa_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBelumPunyaAku: String? =
      MyApp.getInstance().resources.getString(R.string.msg_belum_punya_aku)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDaftar: String? = MyApp.getInstance().resources.getString(R.string.lbl_daftar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etUsernameValue: String? = null
)
