package com.application.app.modules.tampilankategori.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilankategori.`data`.model.TampilanKategoriModel
import org.koin.core.KoinComponent

public class TampilanKategoriVM : ViewModel(), KoinComponent {
  public val tampilanKategoriModel: MutableLiveData<TampilanKategoriModel> =
      MutableLiveData(TampilanKategoriModel())

  public var navArguments: Bundle? = null
}
