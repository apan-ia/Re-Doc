package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTampilanSearchBindingImpl extends ActivityTampilanSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 10);
        sViewsWithIds.put(R.id.linearGroup278, 11);
        sViewsWithIds.put(R.id.linearBarAtas, 12);
        sViewsWithIds.put(R.id.toolbarToolbar, 13);
        sViewsWithIds.put(R.id.linearGroup265, 14);
        sViewsWithIds.put(R.id.imageVector, 15);
        sViewsWithIds.put(R.id.linearGroup276, 16);
        sViewsWithIds.put(R.id.imageGroup, 17);
        sViewsWithIds.put(R.id.linearBarBawah, 18);
        sViewsWithIds.put(R.id.linearGroup285, 19);
        sViewsWithIds.put(R.id.linearGroup283, 20);
        sViewsWithIds.put(R.id.imageHomer, 21);
        sViewsWithIds.put(R.id.imageClipboardr, 22);
        sViewsWithIds.put(R.id.imageEmailr, 23);
        sViewsWithIds.put(R.id.imageUserr, 24);
        sViewsWithIds.put(R.id.linearGroup284, 25);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etDrandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of tampilanSearchVM.tampilanSearchModel.getValue().etDrValue
            //         is tampilanSearchVM.tampilanSearchModel.getValue().setEtDrValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etDr);
            // localize variables for thread safety
            // tampilanSearchVM.tampilanSearchModel
            androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilansearch.data.model.TampilanSearchModel> tampilanSearchVMTampilanSearchModel = null;
            // tampilanSearchVM.tampilanSearchModel != null
            boolean tampilanSearchVMTampilanSearchModelJavaLangObjectNull = false;
            // tampilanSearchVM.tampilanSearchModel.getValue() != null
            boolean tampilanSearchVMTampilanSearchModelGetValueJavaLangObjectNull = false;
            // tampilanSearchVM != null
            boolean tampilanSearchVMJavaLangObjectNull = false;
            // tampilanSearchVM.tampilanSearchModel.getValue().etDrValue
            java.lang.String tampilanSearchVMTampilanSearchModelEtDrValue = null;
            // tampilanSearchVM.tampilanSearchModel.getValue()
            com.application.app.modules.tampilansearch.data.model.TampilanSearchModel tampilanSearchVMTampilanSearchModelGetValue = null;
            // tampilanSearchVM
            com.application.app.modules.tampilansearch.data.viewmodel.TampilanSearchVM tampilanSearchVM = mTampilanSearchVM;



            tampilanSearchVMJavaLangObjectNull = (tampilanSearchVM) != (null);
            if (tampilanSearchVMJavaLangObjectNull) {


                tampilanSearchVMTampilanSearchModel = tampilanSearchVM.getTampilanSearchModel();

                tampilanSearchVMTampilanSearchModelJavaLangObjectNull = (tampilanSearchVMTampilanSearchModel) != (null);
                if (tampilanSearchVMTampilanSearchModelJavaLangObjectNull) {


                    tampilanSearchVMTampilanSearchModelGetValue = tampilanSearchVMTampilanSearchModel.getValue();

                    tampilanSearchVMTampilanSearchModelGetValueJavaLangObjectNull = (tampilanSearchVMTampilanSearchModelGetValue) != (null);
                    if (tampilanSearchVMTampilanSearchModelGetValueJavaLangObjectNull) {




                        tampilanSearchVMTampilanSearchModelGetValue.setEtDrValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityTampilanSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private ActivityTampilanSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[3]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[10]
            , (androidx.appcompat.widget.Toolbar) bindings[13]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            );
        this.etDr.setTag(null);
        this.linearGroup288.setTag(null);
        this.recyclerTampilanSearch.setTag(null);
        this.txtAkunSaya.setTag(null);
        this.txtBeranda.setTag(null);
        this.txtKotakMasuk.setTag(null);
        this.txtReDoc.setTag(null);
        this.txtRekomendasiDok.setTag(null);
        this.txtReservasi.setTag(null);
        this.txtSuggestions.setTag(null);
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
        if (BR.tampilanSearchVM == variableId) {
            setTampilanSearchVM((com.application.app.modules.tampilansearch.data.viewmodel.TampilanSearchVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanSearchVM(@Nullable com.application.app.modules.tampilansearch.data.viewmodel.TampilanSearchVM TampilanSearchVM) {
        this.mTampilanSearchVM = TampilanSearchVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanSearchVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanSearchVMTampilanSearchModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilansearch.data.model.TampilanSearchModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanSearchVMTampilanSearchModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilansearch.data.model.TampilanSearchModel> TampilanSearchVMTampilanSearchModel, int fieldId) {
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
        java.lang.String tampilanSearchVMTampilanSearchModelTxtAkunSaya = null;
        java.lang.String tampilanSearchVMTampilanSearchModelTxtSuggestions = null;
        java.lang.String tampilanSearchVMTampilanSearchModelTxtKotakMasuk = null;
        com.application.app.modules.tampilansearch.data.viewmodel.TampilanSearchVM tampilanSearchVM = mTampilanSearchVM;
        java.lang.String tampilanSearchVMTampilanSearchModelTxtReDoc = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilansearch.data.model.TampilanSearchModel> tampilanSearchVMTampilanSearchModel = null;
        java.lang.String tampilanSearchVMTampilanSearchModelTxtReservasi = null;
        java.lang.String tampilanSearchVMTampilanSearchModelEtDrValue = null;
        com.application.app.modules.tampilansearch.data.model.TampilanSearchModel tampilanSearchVMTampilanSearchModelGetValue = null;
        java.lang.String tampilanSearchVMTampilanSearchModelTxtRekomendasiDok = null;
        java.lang.String tampilanSearchVMTampilanSearchModelTxtBeranda = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanSearchVM != null) {
                    // read tampilanSearchVM.tampilanSearchModel
                    tampilanSearchVMTampilanSearchModel = tampilanSearchVM.getTampilanSearchModel();
                }
                updateLiveDataRegistration(0, tampilanSearchVMTampilanSearchModel);


                if (tampilanSearchVMTampilanSearchModel != null) {
                    // read tampilanSearchVM.tampilanSearchModel.getValue()
                    tampilanSearchVMTampilanSearchModelGetValue = tampilanSearchVMTampilanSearchModel.getValue();
                }


                if (tampilanSearchVMTampilanSearchModelGetValue != null) {
                    // read tampilanSearchVM.tampilanSearchModel.getValue().txtAkunSaya
                    tampilanSearchVMTampilanSearchModelTxtAkunSaya = tampilanSearchVMTampilanSearchModelGetValue.getTxtAkunSaya();
                    // read tampilanSearchVM.tampilanSearchModel.getValue().txtSuggestions
                    tampilanSearchVMTampilanSearchModelTxtSuggestions = tampilanSearchVMTampilanSearchModelGetValue.getTxtSuggestions();
                    // read tampilanSearchVM.tampilanSearchModel.getValue().txtKotakMasuk
                    tampilanSearchVMTampilanSearchModelTxtKotakMasuk = tampilanSearchVMTampilanSearchModelGetValue.getTxtKotakMasuk();
                    // read tampilanSearchVM.tampilanSearchModel.getValue().txtReDoc
                    tampilanSearchVMTampilanSearchModelTxtReDoc = tampilanSearchVMTampilanSearchModelGetValue.getTxtReDoc();
                    // read tampilanSearchVM.tampilanSearchModel.getValue().txtReservasi
                    tampilanSearchVMTampilanSearchModelTxtReservasi = tampilanSearchVMTampilanSearchModelGetValue.getTxtReservasi();
                    // read tampilanSearchVM.tampilanSearchModel.getValue().etDrValue
                    tampilanSearchVMTampilanSearchModelEtDrValue = tampilanSearchVMTampilanSearchModelGetValue.getEtDrValue();
                    // read tampilanSearchVM.tampilanSearchModel.getValue().txtRekomendasiDok
                    tampilanSearchVMTampilanSearchModelTxtRekomendasiDok = tampilanSearchVMTampilanSearchModelGetValue.getTxtRekomendasiDok();
                    // read tampilanSearchVM.tampilanSearchModel.getValue().txtBeranda
                    tampilanSearchVMTampilanSearchModelTxtBeranda = tampilanSearchVMTampilanSearchModelGetValue.getTxtBeranda();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etDr, tampilanSearchVMTampilanSearchModelEtDrValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkunSaya, tampilanSearchVMTampilanSearchModelTxtAkunSaya);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeranda, tampilanSearchVMTampilanSearchModelTxtBeranda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKotakMasuk, tampilanSearchVMTampilanSearchModelTxtKotakMasuk);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReDoc, tampilanSearchVMTampilanSearchModelTxtReDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRekomendasiDok, tampilanSearchVMTampilanSearchModelTxtRekomendasiDok);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReservasi, tampilanSearchVMTampilanSearchModelTxtReservasi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSuggestions, tampilanSearchVMTampilanSearchModelTxtSuggestions);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etDr, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etDrandroidTextAttrChanged);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerTampilanSearch, recyclerTampilanSearch.getResources().getDimension(R.dimen._10pxh), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanSearchVM.tampilanSearchModel
        flag 1 (0x2L): tampilanSearchVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}