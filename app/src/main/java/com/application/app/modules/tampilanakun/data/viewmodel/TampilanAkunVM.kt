package com.application.app.modules.tampilanakun.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilanakun.`data`.model.TampilanAkunModel
import org.koin.core.KoinComponent

public class TampilanAkunVM : ViewModel(), KoinComponent {
  public val tampilanAkunModel: MutableLiveData<TampilanAkunModel> =
      MutableLiveData(TampilanAkunModel())

  public var navArguments: Bundle? = null
}
