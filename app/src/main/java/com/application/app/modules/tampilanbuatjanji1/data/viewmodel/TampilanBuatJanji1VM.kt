package com.application.app.modules.tampilanbuatjanji1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilanbuatjanji1.`data`.model.TampilanBuatJanji1Model
import com.application.app.modules.tampilanbuatjanji1.`data`.model.TampilanBuatJanji2RowModel
import com.application.app.modules.tampilanbuatjanji1.`data`.model.TampilanBuatJanji3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class TampilanBuatJanji1VM : ViewModel(), KoinComponent {
  public val tampilanBuatJanji1Model: MutableLiveData<TampilanBuatJanji1Model> =
      MutableLiveData(TampilanBuatJanji1Model())

  public var navArguments: Bundle? = null

  public val recyclerTampilanBuatJanjiList: MutableLiveData<MutableList<TampilanBuatJanji2RowModel>>
      = MutableLiveData(mutableListOf())

  public val recyclerTampilanBuatJanji1List:
      MutableLiveData<MutableList<TampilanBuatJanji3RowModel>> = MutableLiveData(mutableListOf())
}
