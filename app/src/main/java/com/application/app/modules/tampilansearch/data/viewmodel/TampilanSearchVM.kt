package com.application.app.modules.tampilansearch.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilansearch.`data`.model.TampilanSearch1RowModel
import com.application.app.modules.tampilansearch.`data`.model.TampilanSearchModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class TampilanSearchVM : ViewModel(), KoinComponent {
  public val tampilanSearchModel: MutableLiveData<TampilanSearchModel> =
      MutableLiveData(TampilanSearchModel())

  public var navArguments: Bundle? = null

  public val recyclerTampilanSearchList: MutableLiveData<MutableList<TampilanSearch1RowModel>> =
      MutableLiveData(mutableListOf())
}
