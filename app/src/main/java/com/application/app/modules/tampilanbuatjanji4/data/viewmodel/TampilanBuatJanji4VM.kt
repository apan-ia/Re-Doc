package com.application.app.modules.tampilanbuatjanji4.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilanbuatjanji4.`data`.model.TampilanBuatJanji4Model
import org.koin.core.KoinComponent

public class TampilanBuatJanji4VM : ViewModel(), KoinComponent {
  public val tampilanBuatJanji4Model: MutableLiveData<TampilanBuatJanji4Model> =
      MutableLiveData(TampilanBuatJanji4Model())

  public var navArguments: Bundle? = null
}
