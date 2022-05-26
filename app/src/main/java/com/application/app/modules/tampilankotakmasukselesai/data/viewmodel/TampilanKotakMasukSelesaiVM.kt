package com.application.app.modules.tampilankotakmasukselesai.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilankotakmasukselesai.`data`.model.TampilanKotakMasukSelesaiModel
import org.koin.core.KoinComponent

public class TampilanKotakMasukSelesaiVM : ViewModel(), KoinComponent {
  public val tampilanKotakMasukSelesaiModel: MutableLiveData<TampilanKotakMasukSelesaiModel> =
      MutableLiveData(TampilanKotakMasukSelesaiModel())

  public var navArguments: Bundle? = null
}
