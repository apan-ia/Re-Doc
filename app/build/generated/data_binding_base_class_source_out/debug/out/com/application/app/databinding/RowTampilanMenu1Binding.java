// Generated by data binding compiler. Do not edit!
package com.application.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.application.app.R;
import com.application.app.modules.tampilanmenu.data.model.TampilanMenu1RowModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowTampilanMenu1Binding extends ViewDataBinding {
  @NonNull
  public final ImageView image51604271;

  @NonNull
  public final ImageView imageStar1;

  @NonNull
  public final LinearLayout linearGroup;

  @NonNull
  public final LinearLayout linearGroup71;

  @NonNull
  public final LinearLayout linearGroup72;

  @NonNull
  public final LinearLayout linearGroup74;

  @NonNull
  public final LinearLayout linearGroup76;

  @NonNull
  public final TextView txt5;

  @NonNull
  public final TextView txtBuatJanji;

  @NonNull
  public final TextView txtDrWAHDINISp;

  @NonNull
  public final TextView txtSpesialisAnak;

  @Bindable
  protected TampilanMenu1RowModel mTampilanMenu1RowModel;

  protected RowTampilanMenu1Binding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView image51604271, ImageView imageStar1, LinearLayout linearGroup,
      LinearLayout linearGroup71, LinearLayout linearGroup72, LinearLayout linearGroup74,
      LinearLayout linearGroup76, TextView txt5, TextView txtBuatJanji, TextView txtDrWAHDINISp,
      TextView txtSpesialisAnak) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image51604271 = image51604271;
    this.imageStar1 = imageStar1;
    this.linearGroup = linearGroup;
    this.linearGroup71 = linearGroup71;
    this.linearGroup72 = linearGroup72;
    this.linearGroup74 = linearGroup74;
    this.linearGroup76 = linearGroup76;
    this.txt5 = txt5;
    this.txtBuatJanji = txtBuatJanji;
    this.txtDrWAHDINISp = txtDrWAHDINISp;
    this.txtSpesialisAnak = txtSpesialisAnak;
  }

  public abstract void setTampilanMenu1RowModel(
      @Nullable TampilanMenu1RowModel tampilanMenu1RowModel);

  @Nullable
  public TampilanMenu1RowModel getTampilanMenu1RowModel() {
    return mTampilanMenu1RowModel;
  }

  @NonNull
  public static RowTampilanMenu1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_tampilan_menu1, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowTampilanMenu1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowTampilanMenu1Binding>inflateInternal(inflater, R.layout.row_tampilan_menu1, root, attachToRoot, component);
  }

  @NonNull
  public static RowTampilanMenu1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_tampilan_menu1, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowTampilanMenu1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowTampilanMenu1Binding>inflateInternal(inflater, R.layout.row_tampilan_menu1, null, false, component);
  }

  public static RowTampilanMenu1Binding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RowTampilanMenu1Binding bind(@NonNull View view, @Nullable Object component) {
    return (RowTampilanMenu1Binding)bind(component, view, R.layout.row_tampilan_menu1);
  }
}
