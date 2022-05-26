package com.application.app.modules.tampilanrekomendasidokter.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilanrekomendasidokter.`data`.model.TampilanRekomendasiDokter1RowModel
import com.application.app.modules.tampilanrekomendasidokter.`data`.model.TampilanRekomendasiDokterModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class TampilanRekomendasiDokterVM : ViewModel(), KoinComponent {
  public val tampilanRekomendasiDokterModel: MutableLiveData<TampilanRekomendasiDokterModel> =
      MutableLiveData(TampilanRekomendasiDokterModel())

  public var navArguments: Bundle? = null

  public val recyclerTampilanRekomendasiDokterList:
      MutableLiveData<MutableList<TampilanRekomendasiDokter1RowModel>> =
      MutableLiveData(mutableListOf())
}
