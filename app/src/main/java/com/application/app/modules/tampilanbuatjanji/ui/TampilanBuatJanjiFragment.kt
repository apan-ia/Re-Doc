package com.application.app.modules.tampilanbuatjanji.ui

import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentTampilanBuatJanjiBinding
import com.application.app.modules.tampilanbuatjanji.`data`.viewmodel.TampilanBuatJanjiVM
import com.application.app.modules.tampilanmenu.ui.TampilanMenuActivity
import kotlin.String
import kotlin.Unit

public class TampilanBuatJanjiFragment :
    BaseFragment<FragmentTampilanBuatJanjiBinding>(R.layout.fragment_tampilan_buat_janji) {
  private val viewModel: TampilanBuatJanjiVM by viewModels<TampilanBuatJanjiVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.tampilanBuatJanjiVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtBuatJanji.setOnClickListener {
      val destIntent = TampilanMenuActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  public companion object {
    public const val TAG: String = "TAMPILAN_BUAT_JANJI_FRAGMENT"
  }
}
