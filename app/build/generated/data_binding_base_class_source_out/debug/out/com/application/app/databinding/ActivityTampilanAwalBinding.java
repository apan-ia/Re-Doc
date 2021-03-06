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
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.application.app.R;
import com.application.app.modules.tampilanawal.data.viewmodel.TampilanAwalVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityTampilanAwalBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnReservasi;

  @NonNull
  public final ImageView imageClipdoctorand;

  @NonNull
  public final ImageView imageVector;

  @NonNull
  public final LinearLayout linearBarAtas;

  @NonNull
  public final LinearLayout linearBarAtas1;

  @NonNull
  public final LinearLayout linearGroup328;

  @NonNull
  public final LinearLayout linearTampilanAwal;

  @NonNull
  public final Toolbar toolbarToolbar;

  @NonNull
  public final TextView txtReDoc;

  @NonNull
  public final TextView txtReservasiSeger;

  @Bindable
  protected TampilanAwalVM mTampilanAwalVM;

  protected ActivityTampilanAwalBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnReservasi, ImageView imageClipdoctorand, ImageView imageVector,
      LinearLayout linearBarAtas, LinearLayout linearBarAtas1, LinearLayout linearGroup328,
      LinearLayout linearTampilanAwal, Toolbar toolbarToolbar, TextView txtReDoc,
      TextView txtReservasiSeger) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnReservasi = btnReservasi;
    this.imageClipdoctorand = imageClipdoctorand;
    this.imageVector = imageVector;
    this.linearBarAtas = linearBarAtas;
    this.linearBarAtas1 = linearBarAtas1;
    this.linearGroup328 = linearGroup328;
    this.linearTampilanAwal = linearTampilanAwal;
    this.toolbarToolbar = toolbarToolbar;
    this.txtReDoc = txtReDoc;
    this.txtReservasiSeger = txtReservasiSeger;
  }

  public abstract void setTampilanAwalVM(@Nullable TampilanAwalVM tampilanAwalVM);

  @Nullable
  public TampilanAwalVM getTampilanAwalVM() {
    return mTampilanAwalVM;
  }

  @NonNull
  public static ActivityTampilanAwalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_tampilan_awal, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTampilanAwalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityTampilanAwalBinding>inflateInternal(inflater, R.layout.activity_tampilan_awal, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityTampilanAwalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_tampilan_awal, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTampilanAwalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityTampilanAwalBinding>inflateInternal(inflater, R.layout.activity_tampilan_awal, null, false, component);
  }

  public static ActivityTampilanAwalBinding bind(@NonNull View view) {
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
  public static ActivityTampilanAwalBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityTampilanAwalBinding)bind(component, view, R.layout.activity_tampilan_awal);
  }
}
