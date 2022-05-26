package com.application.app.modules.tampilankotakmasuk.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilankotakmasuk.`data`.model.TampilanKotakMasukModel
import org.koin.core.KoinComponent

public class TampilanKotakMasukVM : ViewModel(), KoinComponent {
  public val tampilanKotakMasukModel: MutableLiveData<TampilanKotakMasukModel> =
      MutableLiveData(TampilanKotakMasukModel())

  public var navArguments: Bundle? = null
}
