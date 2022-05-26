package com.application.app.modules.tampilandaftar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.tampilandaftar.`data`.model.TampilanDaftar1RowModel
import com.application.app.modules.tampilandaftar.`data`.model.TampilanDaftarModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class TampilanDaftarVM : ViewModel(), KoinComponent {
  public val tampilanDaftarModel: MutableLiveData<TampilanDaftarModel> =
      MutableLiveData(TampilanDaftarModel())

  public var navArguments: Bundle? = null

  public val recyclerTampilanDaftarList: MutableLiveData<MutableList<TampilanDaftar1RowModel>> =
      MutableLiveData(mutableListOf())
}
