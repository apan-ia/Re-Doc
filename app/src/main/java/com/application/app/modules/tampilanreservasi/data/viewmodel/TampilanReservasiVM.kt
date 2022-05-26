package com.application.app.modules.tampilanreservasi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilanreservasi.`data`.model.TampilanReservasiModel
import org.koin.core.KoinComponent

public class TampilanReservasiVM : ViewModel(), KoinComponent {
  public val tampilanReservasiModel: MutableLiveData<TampilanReservasiModel> =
      MutableLiveData(TampilanReservasiModel())

  public var navArguments: Bundle? = null
}
