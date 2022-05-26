package com.application.app.modules.tampilanmenu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilanmenu.`data`.model.TampilanMenu1RowModel
import com.application.app.modules.tampilanmenu.`data`.model.TampilanMenuModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class TampilanMenuVM : ViewModel(), KoinComponent {
  public val tampilanMenuModel: MutableLiveData<TampilanMenuModel> =
      MutableLiveData(TampilanMenuModel())

  public var navArguments: Bundle? = null

  public val recyclerTampilanMenuList: MutableLiveData<MutableList<TampilanMenu1RowModel>> =
      MutableLiveData(mutableListOf())
}
