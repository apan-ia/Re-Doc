package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTampilanReservasiBindingImpl extends ActivityTampilanReservasiBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameGroup96, 12);
        sViewsWithIds.put(R.id.linearGroup87, 13);
        sViewsWithIds.put(R.id.linearBarAtas, 14);
        sViewsWithIds.put(R.id.toolbarToolbar, 15);
        sViewsWithIds.put(R.id.linearGroup74, 16);
        sViewsWithIds.put(R.id.imageVector, 17);
        sViewsWithIds.put(R.id.linearGroup81, 18);
        sViewsWithIds.put(R.id.linearGroup76, 19);
        sViewsWithIds.put(R.id.imageCalendarr, 20);
        sViewsWithIds.put(R.id.frameGroup98, 21);
        sViewsWithIds.put(R.id.imageVector1, 22);
        sViewsWithIds.put(R.id.imageGroup, 23);
        sViewsWithIds.put(R.id.linearGroup99, 24);
        sViewsWithIds.put(R.id.textInputLayANTRIAN, 25);
        sViewsWithIds.put(R.id.lineLine1, 26);
        sViewsWithIds.put(R.id.frameGroup101, 27);
        sViewsWithIds.put(R.id.linearGroup77, 28);
        sViewsWithIds.put(R.id.linearGroup80, 29);
        sViewsWithIds.put(R.id.lineLine2, 30);
        sViewsWithIds.put(R.id.lineLine3, 31);
        sViewsWithIds.put(R.id.lineLine4, 32);
        sViewsWithIds.put(R.id.lineLine5, 33);
        sViewsWithIds.put(R.id.lineLine6, 34);
        sViewsWithIds.put(R.id.lineLine7, 35);
        sViewsWithIds.put(R.id.linearGroup88, 36);
        sViewsWithIds.put(R.id.imageVector2, 37);
        sViewsWithIds.put(R.id.linearBarBawah, 38);
        sViewsWithIds.put(R.id.linearGroup108, 39);
        sViewsWithIds.put(R.id.linearGroup106, 40);
        sViewsWithIds.put(R.id.imageHomer, 41);
        sViewsWithIds.put(R.id.imageClipboardr, 42);
        sViewsWithIds.put(R.id.imageEmailr, 43);
        sViewsWithIds.put(R.id.imageUserr, 44);
        sViewsWithIds.put(R.id.linearGroup107, 45);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etANTRIANandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of tampilanReservasiVM.tampilanReservasiModel.getValue().etANTRIANValue
            //         is tampilanReservasiVM.tampilanReservasiModel.getValue().setEtANTRIANValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etANTRIAN);
            // localize variables for thread safety
            // tampilanReservasiVM.tampilanReservasiModel
            androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanreservasi.data.model.TampilanReservasiModel> tampilanReservasiVMTampilanReservasiModel = null;
            // tampilanReservasiVM.tampilanReservasiModel.getValue() != null
            boolean tampilanReservasiVMTampilanReservasiModelGetValueJavaLangObjectNull = false;
            // tampilanReservasiVM != null
            boolean tampilanReservasiVMJavaLangObjectNull = false;
            // tampilanReservasiVM
            com.application.app.modules.tampilanreservasi.data.viewmodel.TampilanReservasiVM tampilanReservasiVM = mTampilanReservasiVM;
            // tampilanReservasiVM.tampilanReservasiModel.getValue().etANTRIANValue
            java.lang.String tampilanReservasiVMTampilanReservasiModelEtANTRIANValue = null;
            // tampilanReservasiVM.tampilanReservasiModel.getValue()
            com.application.app.modules.tampilanreservasi.data.model.TampilanReservasiModel tampilanReservasiVMTampilanReservasiModelGetValue = null;
            // tampilanReservasiVM.tampilanReservasiModel != null
            boolean tampilanReservasiVMTampilanReservasiModelJavaLangObjectNull = false;



            tampilanReservasiVMJavaLangObjectNull = (tampilanReservasiVM) != (null);
            if (tampilanReservasiVMJavaLangObjectNull) {


                tampilanReservasiVMTampilanReservasiModel = tampilanReservasiVM.getTampilanReservasiModel();

                tampilanReservasiVMTampilanReservasiModelJavaLangObjectNull = (tampilanReservasiVMTampilanReservasiModel) != (null);
                if (tampilanReservasiVMTampilanReservasiModelJavaLangObjectNull) {


                    tampilanReservasiVMTampilanReservasiModelGetValue = tampilanReservasiVMTampilanReservasiModel.getValue();

                    tampilanReservasiVMTampilanReservasiModelGetValueJavaLangObjectNull = (tampilanReservasiVMTampilanReservasiModelGetValue) != (null);
                    if (tampilanReservasiVMTampilanReservasiModelGetValueJavaLangObjectNull) {




                        tampilanReservasiVMTampilanReservasiModelGetValue.setEtANTRIANValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityTampilanReservasiBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 46, sIncludes, sViewsWithIds));
    }
    private ActivityTampilanReservasiBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (android.widget.FrameLayout) bindings[27]
            , (android.widget.FrameLayout) bindings[12]
            , (android.widget.FrameLayout) bindings[21]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[42]
            , (android.widget.ImageView) bindings[43]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[41]
            , (android.widget.ImageView) bindings[44]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[37]
            , (android.view.View) bindings[26]
            , (android.view.View) bindings[30]
            , (android.view.View) bindings[31]
            , (android.view.View) bindings[32]
            , (android.view.View) bindings[33]
            , (android.view.View) bindings[34]
            , (android.view.View) bindings[35]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[38]
            , (android.widget.LinearLayout) bindings[40]
            , (android.widget.LinearLayout) bindings[45]
            , (android.widget.LinearLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[36]
            , (android.widget.LinearLayout) bindings[24]
            , (com.google.android.material.textfield.TextInputLayout) bindings[25]
            , (androidx.appcompat.widget.Toolbar) bindings[15]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            );
        this.etANTRIAN.setTag(null);
        this.linearGroup73.setTag(null);
        this.txt01020304.setTag(null);
        this.txt15Maret1800.setTag(null);
        this.txtAkunSaya.setTag(null);
        this.txtBeranda.setTag(null);
        this.txtCempakaLima.setTag(null);
        this.txtDRDrSYAHRUL.setTag(null);
        this.txtKotakMasuk.setTag(null);
        this.txtReDoc.setTag(null);
        this.txtReservasi.setTag(null);
        this.txtSelesaiSelesa.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.tampilanReservasiVM == variableId) {
            setTampilanReservasiVM((com.application.app.modules.tampilanreservasi.data.viewmodel.TampilanReservasiVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanReservasiVM(@Nullable com.application.app.modules.tampilanreservasi.data.viewmodel.TampilanReservasiVM TampilanReservasiVM) {
        this.mTampilanReservasiVM = TampilanReservasiVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanReservasiVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanReservasiVMTampilanReservasiModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanreservasi.data.model.TampilanReservasiModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanReservasiVMTampilanReservasiModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanreservasi.data.model.TampilanReservasiModel> TampilanReservasiVMTampilanReservasiModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanreservasi.data.model.TampilanReservasiModel> tampilanReservasiVMTampilanReservasiModel = null;
        java.lang.String tampilanReservasiVMTampilanReservasiModelTxt15Maret1800 = null;
        java.lang.String tampilanReservasiVMTampilanReservasiModelTxtKotakMasuk = null;
        java.lang.String tampilanReservasiVMTampilanReservasiModelTxtReservasi = null;
        java.lang.String tampilanReservasiVMTampilanReservasiModelTxtCempakaLima = null;
        java.lang.String tampilanReservasiVMTampilanReservasiModelTxtAkunSaya = null;
        java.lang.String tampilanReservasiVMTampilanReservasiModelTxt01020304 = null;
        java.lang.String tampilanReservasiVMTampilanReservasiModelTxtBeranda = null;
        java.lang.String tampilanReservasiVMTampilanReservasiModelTxtSelesaiSelesa = null;
        java.lang.String tampilanReservasiVMTampilanReservasiModelEtANTRIANValue = null;
        java.lang.String tampilanReservasiVMTampilanReservasiModelTxtDRDrSYAHRUL = null;
        com.application.app.modules.tampilanreservasi.data.viewmodel.TampilanReservasiVM tampilanReservasiVM = mTampilanReservasiVM;
        java.lang.String tampilanReservasiVMTampilanReservasiModelTxtReDoc = null;
        com.application.app.modules.tampilanreservasi.data.model.TampilanReservasiModel tampilanReservasiVMTampilanReservasiModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanReservasiVM != null) {
                    // read tampilanReservasiVM.tampilanReservasiModel
                    tampilanReservasiVMTampilanReservasiModel = tampilanReservasiVM.getTampilanReservasiModel();
                }
                updateLiveDataRegistration(0, tampilanReservasiVMTampilanReservasiModel);


                if (tampilanReservasiVMTampilanReservasiModel != null) {
                    // read tampilanReservasiVM.tampilanReservasiModel.getValue()
                    tampilanReservasiVMTampilanReservasiModelGetValue = tampilanReservasiVMTampilanReservasiModel.getValue();
                }


                if (tampilanReservasiVMTampilanReservasiModelGetValue != null) {
                    // read tampilanReservasiVM.tampilanReservasiModel.getValue().txt15Maret1800
                    tampilanReservasiVMTampilanReservasiModelTxt15Maret1800 = tampilanReservasiVMTampilanReservasiModelGetValue.getTxt15Maret1800();
                    // read tampilanReservasiVM.tampilanReservasiModel.getValue().txtKotakMasuk
                    tampilanReservasiVMTampilanReservasiModelTxtKotakMasuk = tampilanReservasiVMTampilanReservasiModelGetValue.getTxtKotakMasuk();
                    // read tampilanReservasiVM.tampilanReservasiModel.getValue().txtReservasi
                    tampilanReservasiVMTampilanReservasiModelTxtReservasi = tampilanReservasiVMTampilanReservasiModelGetValue.getTxtReservasi();
                    // read tampilanReservasiVM.tampilanReservasiModel.getValue().txtCempakaLima
                    tampilanReservasiVMTampilanReservasiModelTxtCempakaLima = tampilanReservasiVMTampilanReservasiModelGetValue.getTxtCempakaLima();
                    // read tampilanReservasiVM.tampilanReservasiModel.getValue().txtAkunSaya
                    tampilanReservasiVMTampilanReservasiModelTxtAkunSaya = tampilanReservasiVMTampilanReservasiModelGetValue.getTxtAkunSaya();
                    // read tampilanReservasiVM.tampilanReservasiModel.getValue().txt01020304
                    tampilanReservasiVMTampilanReservasiModelTxt01020304 = tampilanReservasiVMTampilanReservasiModelGetValue.getTxt01020304();
                    // read tampilanReservasiVM.tampilanReservasiModel.getValue().txtBeranda
                    tampilanReservasiVMTampilanReservasiModelTxtBeranda = tampilanReservasiVMTampilanReservasiModelGetValue.getTxtBeranda();
                    // read tampilanReservasiVM.tampilanReservasiModel.getValue().txtSelesaiSelesa
                    tampilanReservasiVMTampilanReservasiModelTxtSelesaiSelesa = tampilanReservasiVMTampilanReservasiModelGetValue.getTxtSelesaiSelesa();
                    // read tampilanReservasiVM.tampilanReservasiModel.getValue().etANTRIANValue
                    tampilanReservasiVMTampilanReservasiModelEtANTRIANValue = tampilanReservasiVMTampilanReservasiModelGetValue.getEtANTRIANValue();
                    // read tampilanReservasiVM.tampilanReservasiModel.getValue().txtDRDrSYAHRUL
                    tampilanReservasiVMTampilanReservasiModelTxtDRDrSYAHRUL = tampilanReservasiVMTampilanReservasiModelGetValue.getTxtDRDrSYAHRUL();
                    // read tampilanReservasiVM.tampilanReservasiModel.getValue().txtReDoc
                    tampilanReservasiVMTampilanReservasiModelTxtReDoc = tampilanReservasiVMTampilanReservasiModelGetValue.getTxtReDoc();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etANTRIAN, tampilanReservasiVMTampilanReservasiModelEtANTRIANValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt01020304, tampilanReservasiVMTampilanReservasiModelTxt01020304);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt15Maret1800, tampilanReservasiVMTampilanReservasiModelTxt15Maret1800);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkunSaya, tampilanReservasiVMTampilanReservasiModelTxtAkunSaya);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeranda, tampilanReservasiVMTampilanReservasiModelTxtBeranda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCempakaLima, tampilanReservasiVMTampilanReservasiModelTxtCempakaLima);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDRDrSYAHRUL, tampilanReservasiVMTampilanReservasiModelTxtDRDrSYAHRUL);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKotakMasuk, tampilanReservasiVMTampilanReservasiModelTxtKotakMasuk);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReDoc, tampilanReservasiVMTampilanReservasiModelTxtReDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReservasi, tampilanReservasiVMTampilanReservasiModelTxtReservasi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSelesaiSelesa, tampilanReservasiVMTampilanReservasiModelTxtSelesaiSelesa);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etANTRIAN, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etANTRIANandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanReservasiVM.tampilanReservasiModel
        flag 1 (0x2L): tampilanReservasiVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}