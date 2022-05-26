package com.application.app.modules.tampilanawal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilanawal.`data`.model.TampilanAwalModel
import org.koin.core.KoinComponent

public class TampilanAwalVM : ViewModel(), KoinComponent {
  public val tampilanAwalModel: MutableLiveData<TampilanAwalModel> =
      MutableLiveData(TampilanAwalModel())

  public var navArguments: Bundle? = null
}
