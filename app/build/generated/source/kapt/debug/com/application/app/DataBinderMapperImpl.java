package com.application.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.application.app.databinding.ActivityAppNavigationBindingImpl;
import com.application.app.databinding.ActivityTampilanAkunBindingImpl;
import com.application.app.databinding.ActivityTampilanAwalBindingImpl;
import com.application.app.databinding.ActivityTampilanBuatJanji1BindingImpl;
import com.application.app.databinding.ActivityTampilanBuatJanji4BindingImpl;
import com.application.app.databinding.ActivityTampilanDaftarBindingImpl;
import com.application.app.databinding.ActivityTampilanKategoriBindingImpl;
import com.application.app.databinding.ActivityTampilanKotakMasukBindingImpl;
import com.application.app.databinding.ActivityTampilanKotakMasukSelesaiBindingImpl;
import com.application.app.databinding.ActivityTampilanMasukBindingImpl;
import com.application.app.databinding.ActivityTampilanMenuBindingImpl;
import com.application.app.databinding.ActivityTampilanRekomendasiDokterBindingImpl;
import com.application.app.databinding.ActivityTampilanReservasiBindingImpl;
import com.application.app.databinding.ActivityTampilanSearchBindingImpl;
import com.application.app.databinding.FragmentTampilanBuatJanjiBindingImpl;
import com.application.app.databinding.LayoutProgressDialogBindingImpl;
import com.application.app.databinding.RowTampilanBuatJanji2BindingImpl;
import com.application.app.databinding.RowTampilanBuatJanji3BindingImpl;
import com.application.app.databinding.RowTampilanDaftar1BindingImpl;
import com.application.app.databinding.RowTampilanMenu1BindingImpl;
import com.application.app.databinding.RowTampilanRekomendasiDokter1BindingImpl;
import com.application.app.databinding.RowTampilanSearch1BindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYAPPNAVIGATION = 1;

  private static final int LAYOUT_ACTIVITYTAMPILANAKUN = 2;

  private static final int LAYOUT_ACTIVITYTAMPILANAWAL = 3;

  private static final int LAYOUT_ACTIVITYTAMPILANBUATJANJI1 = 4;

  private static final int LAYOUT_ACTIVITYTAMPILANBUATJANJI4 = 5;

  private static final int LAYOUT_ACTIVITYTAMPILANDAFTAR = 6;

  private static final int LAYOUT_ACTIVITYTAMPILANKATEGORI = 7;

  private static final int LAYOUT_ACTIVITYTAMPILANKOTAKMASUK = 8;

  private static final int LAYOUT_ACTIVITYTAMPILANKOTAKMASUKSELESAI = 9;

  private static final int LAYOUT_ACTIVITYTAMPILANMASUK = 10;

  private static final int LAYOUT_ACTIVITYTAMPILANMENU = 11;

  private static final int LAYOUT_ACTIVITYTAMPILANREKOMENDASIDOKTER = 12;

  private static final int LAYOUT_ACTIVITYTAMPILANRESERVASI = 13;

  private static final int LAYOUT_ACTIVITYTAMPILANSEARCH = 14;

  private static final int LAYOUT_FRAGMENTTAMPILANBUATJANJI = 15;

  private static final int LAYOUT_LAYOUTPROGRESSDIALOG = 16;

  private static final int LAYOUT_ROWTAMPILANBUATJANJI2 = 17;

  private static final int LAYOUT_ROWTAMPILANBUATJANJI3 = 18;

  private static final int LAYOUT_ROWTAMPILANDAFTAR1 = 19;

  private static final int LAYOUT_ROWTAMPILANMENU1 = 20;

  private static final int LAYOUT_ROWTAMPILANREKOMENDASIDOKTER1 = 21;

  private static final int LAYOUT_ROWTAMPILANSEARCH1 = 22;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(22);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_app_navigation, LAYOUT_ACTIVITYAPPNAVIGATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_tampilan_akun, LAYOUT_ACTIVITYTAMPILANAKUN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_tampilan_awal, LAYOUT_ACTIVITYTAMPILANAWAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_tampilan_buat_janji1, LAYOUT_ACTIVITYTAMPILANBUATJANJI1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_tampilan_buat_janji4, LAYOUT_ACTIVITYTAMPILANBUATJANJI4);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_tampilan_daftar, LAYOUT_ACTIVITYTAMPILANDAFTAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_tampilan_kategori, LAYOUT_ACTIVITYTAMPILANKATEGORI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_tampilan_kotak_masuk, LAYOUT_ACTIVITYTAMPILANKOTAKMASUK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_tampilan_kotak_masuk_selesai, LAYOUT_ACTIVITYTAMPILANKOTAKMASUKSELESAI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_tampilan_masuk, LAYOUT_ACTIVITYTAMPILANMASUK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_tampilan_menu, LAYOUT_ACTIVITYTAMPILANMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_tampilan_rekomendasi_dokter, LAYOUT_ACTIVITYTAMPILANREKOMENDASIDOKTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_tampilan_reservasi, LAYOUT_ACTIVITYTAMPILANRESERVASI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_tampilan_search, LAYOUT_ACTIVITYTAMPILANSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.fragment_tampilan_buat_janji, LAYOUT_FRAGMENTTAMPILANBUATJANJI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.layout_progress_dialog, LAYOUT_LAYOUTPROGRESSDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_tampilan_buat_janji2, LAYOUT_ROWTAMPILANBUATJANJI2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_tampilan_buat_janji3, LAYOUT_ROWTAMPILANBUATJANJI3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_tampilan_daftar1, LAYOUT_ROWTAMPILANDAFTAR1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_tampilan_menu1, LAYOUT_ROWTAMPILANMENU1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_tampilan_rekomendasi_dokter1, LAYOUT_ROWTAMPILANREKOMENDASIDOKTER1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_tampilan_search1, LAYOUT_ROWTAMPILANSEARCH1);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYAPPNAVIGATION: {
          if ("layout/activity_app_navigation_0".equals(tag)) {
            return new ActivityAppNavigationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_app_navigation is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAMPILANAKUN: {
          if ("layout/activity_tampilan_akun_0".equals(tag)) {
            return new ActivityTampilanAkunBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tampilan_akun is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAMPILANAWAL: {
          if ("layout/activity_tampilan_awal_0".equals(tag)) {
            return new ActivityTampilanAwalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tampilan_awal is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAMPILANBUATJANJI1: {
          if ("layout/activity_tampilan_buat_janji1_0".equals(tag)) {
            return new ActivityTampilanBuatJanji1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tampilan_buat_janji1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAMPILANBUATJANJI4: {
          if ("layout/activity_tampilan_buat_janji4_0".equals(tag)) {
            return new ActivityTampilanBuatJanji4BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tampilan_buat_janji4 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAMPILANDAFTAR: {
          if ("layout/activity_tampilan_daftar_0".equals(tag)) {
            return new ActivityTampilanDaftarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tampilan_daftar is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAMPILANKATEGORI: {
          if ("layout/activity_tampilan_kategori_0".equals(tag)) {
            return new ActivityTampilanKategoriBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tampilan_kategori is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAMPILANKOTAKMASUK: {
          if ("layout/activity_tampilan_kotak_masuk_0".equals(tag)) {
            return new ActivityTampilanKotakMasukBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tampilan_kotak_masuk is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAMPILANKOTAKMASUKSELESAI: {
          if ("layout/activity_tampilan_kotak_masuk_selesai_0".equals(tag)) {
            return new ActivityTampilanKotakMasukSelesaiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tampilan_kotak_masuk_selesai is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAMPILANMASUK: {
          if ("layout/activity_tampilan_masuk_0".equals(tag)) {
            return new ActivityTampilanMasukBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tampilan_masuk is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAMPILANMENU: {
          if ("layout/activity_tampilan_menu_0".equals(tag)) {
            return new ActivityTampilanMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tampilan_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAMPILANREKOMENDASIDOKTER: {
          if ("layout/activity_tampilan_rekomendasi_dokter_0".equals(tag)) {
            return new ActivityTampilanRekomendasiDokterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tampilan_rekomendasi_dokter is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAMPILANRESERVASI: {
          if ("layout/activity_tampilan_reservasi_0".equals(tag)) {
            return new ActivityTampilanReservasiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tampilan_reservasi is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTAMPILANSEARCH: {
          if ("layout/activity_tampilan_search_0".equals(tag)) {
            return new ActivityTampilanSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tampilan_search is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTAMPILANBUATJANJI: {
          if ("layout/fragment_tampilan_buat_janji_0".equals(tag)) {
            return new FragmentTampilanBuatJanjiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tampilan_buat_janji is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPROGRESSDIALOG: {
          if ("layout/layout_progress_dialog_0".equals(tag)) {
            return new LayoutProgressDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_progress_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWTAMPILANBUATJANJI2: {
          if ("layout/row_tampilan_buat_janji2_0".equals(tag)) {
            return new RowTampilanBuatJanji2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_tampilan_buat_janji2 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWTAMPILANBUATJANJI3: {
          if ("layout/row_tampilan_buat_janji3_0".equals(tag)) {
            return new RowTampilanBuatJanji3BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_tampilan_buat_janji3 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWTAMPILANDAFTAR1: {
          if ("layout/row_tampilan_daftar1_0".equals(tag)) {
            return new RowTampilanDaftar1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_tampilan_daftar1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWTAMPILANMENU1: {
          if ("layout/row_tampilan_menu1_0".equals(tag)) {
            return new RowTampilanMenu1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_tampilan_menu1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWTAMPILANREKOMENDASIDOKTER1: {
          if ("layout/row_tampilan_rekomendasi_dokter1_0".equals(tag)) {
            return new RowTampilanRekomendasiDokter1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_tampilan_rekomendasi_dokter1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWTAMPILANSEARCH1: {
          if ("layout/row_tampilan_search1_0".equals(tag)) {
            return new RowTampilanSearch1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_tampilan_search1 is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(23);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "appNavigationVM");
      sKeys.put(2, "message");
      sKeys.put(3, "tampilanAkunVM");
      sKeys.put(4, "tampilanAwalVM");
      sKeys.put(5, "tampilanBuatJanji1VM");
      sKeys.put(6, "tampilanBuatJanji2RowModel");
      sKeys.put(7, "tampilanBuatJanji3RowModel");
      sKeys.put(8, "tampilanBuatJanji4VM");
      sKeys.put(9, "tampilanBuatJanjiVM");
      sKeys.put(10, "tampilanDaftar1RowModel");
      sKeys.put(11, "tampilanDaftarVM");
      sKeys.put(12, "tampilanKategoriVM");
      sKeys.put(13, "tampilanKotakMasukSelesaiVM");
      sKeys.put(14, "tampilanKotakMasukVM");
      sKeys.put(15, "tampilanMasukVM");
      sKeys.put(16, "tampilanMenu1RowModel");
      sKeys.put(17, "tampilanMenuVM");
      sKeys.put(18, "tampilanRekomendasiDokter1RowModel");
      sKeys.put(19, "tampilanRekomendasiDokterVM");
      sKeys.put(20, "tampilanReservasiVM");
      sKeys.put(21, "tampilanSearch1RowModel");
      sKeys.put(22, "tampilanSearchVM");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(22);

    static {
      sKeys.put("layout/activity_app_navigation_0", com.application.app.R.layout.activity_app_navigation);
      sKeys.put("layout/activity_tampilan_akun_0", com.application.app.R.layout.activity_tampilan_akun);
      sKeys.put("layout/activity_tampilan_awal_0", com.application.app.R.layout.activity_tampilan_awal);
      sKeys.put("layout/activity_tampilan_buat_janji1_0", com.application.app.R.layout.activity_tampilan_buat_janji1);
      sKeys.put("layout/activity_tampilan_buat_janji4_0", com.application.app.R.layout.activity_tampilan_buat_janji4);
      sKeys.put("layout/activity_tampilan_daftar_0", com.application.app.R.layout.activity_tampilan_daftar);
      sKeys.put("layout/activity_tampilan_kategori_0", com.application.app.R.layout.activity_tampilan_kategori);
      sKeys.put("layout/activity_tampilan_kotak_masuk_0", com.application.app.R.layout.activity_tampilan_kotak_masuk);
      sKeys.put("layout/activity_tampilan_kotak_masuk_selesai_0", com.application.app.R.layout.activity_tampilan_kotak_masuk_selesai);
      sKeys.put("layout/activity_tampilan_masuk_0", com.application.app.R.layout.activity_tampilan_masuk);
      sKeys.put("layout/activity_tampilan_menu_0", com.application.app.R.layout.activity_tampilan_menu);
      sKeys.put("layout/activity_tampilan_rekomendasi_dokter_0", com.application.app.R.layout.activity_tampilan_rekomendasi_dokter);
      sKeys.put("layout/activity_tampilan_reservasi_0", com.application.app.R.layout.activity_tampilan_reservasi);
      sKeys.put("layout/activity_tampilan_search_0", com.application.app.R.layout.activity_tampilan_search);
      sKeys.put("layout/fragment_tampilan_buat_janji_0", com.application.app.R.layout.fragment_tampilan_buat_janji);
      sKeys.put("layout/layout_progress_dialog_0", com.application.app.R.layout.layout_progress_dialog);
      sKeys.put("layout/row_tampilan_buat_janji2_0", com.application.app.R.layout.row_tampilan_buat_janji2);
      sKeys.put("layout/row_tampilan_buat_janji3_0", com.application.app.R.layout.row_tampilan_buat_janji3);
      sKeys.put("layout/row_tampilan_daftar1_0", com.application.app.R.layout.row_tampilan_daftar1);
      sKeys.put("layout/row_tampilan_menu1_0", com.application.app.R.layout.row_tampilan_menu1);
      sKeys.put("layout/row_tampilan_rekomendasi_dokter1_0", com.application.app.R.layout.row_tampilan_rekomendasi_dokter1);
      sKeys.put("layout/row_tampilan_search1_0", com.application.app.R.layout.row_tampilan_search1);
    }
  }
}
