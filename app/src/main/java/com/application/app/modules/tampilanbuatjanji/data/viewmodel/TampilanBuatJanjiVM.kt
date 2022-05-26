package com.application.app.modules.tampilanbuatjanji.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilanbuatjanji.`data`.model.TampilanBuatJanjiModel
import org.koin.core.KoinComponent

public class TampilanBuatJanjiVM : ViewModel(), KoinComponent {
  public val tampilanBuatJanjiModel: MutableLiveData<TampilanBuatJanjiModel> =
      MutableLiveData(TampilanBuatJanjiModel())

  public var navArguments: Bundle? = null
}
