package com.application.app.modules.tampilanmasuk.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilanmasuk.`data`.model.TampilanMasukModel
import org.koin.core.KoinComponent

public class TampilanMasukVM : ViewModel(), KoinComponent {
  public val tampilanMasukModel: MutableLiveData<TampilanMasukModel> =
      MutableLiveData(TampilanMasukModel())

  public var navArguments: Bundle? = null
}
