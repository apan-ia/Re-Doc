package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTampilanRekomendasiDokterBindingImpl extends ActivityTampilanRekomendasiDokterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 8);
        sViewsWithIds.put(R.id.linearGroup208, 9);
        sViewsWithIds.put(R.id.linearBarAtas, 10);
        sViewsWithIds.put(R.id.toolbarToolbar, 11);
        sViewsWithIds.put(R.id.linearGroup203, 12);
        sViewsWithIds.put(R.id.imageVector, 13);
        sViewsWithIds.put(R.id.linearGroup206, 14);
        sViewsWithIds.put(R.id.imageGroup, 15);
        sViewsWithIds.put(R.id.linearBarBawah, 16);
        sViewsWithIds.put(R.id.linearGroup218, 17);
        sViewsWithIds.put(R.id.linearGroup216, 18);
        sViewsWithIds.put(R.id.imageHomer, 19);
        sViewsWithIds.put(R.id.imageClipboardr, 20);
        sViewsWithIds.put(R.id.imageEmailr, 21);
        sViewsWithIds.put(R.id.imageUserr, 22);
        sViewsWithIds.put(R.id.linearGroup217, 23);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTampilanRekomendasiDokterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private ActivityTampilanRekomendasiDokterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (androidx.appcompat.widget.Toolbar) bindings[11]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            );
        this.linearGroup221.setTag(null);
        this.recyclerTampilanRekomendasiDokter.setTag(null);
        this.txtAkunSaya.setTag(null);
        this.txtBeranda.setTag(null);
        this.txtKotakMasuk.setTag(null);
        this.txtReDoc.setTag(null);
        this.txtRekomendasiDok.setTag(null);
        this.txtReservasi.setTag(null);
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
        if (BR.tampilanRekomendasiDokterVM == variableId) {
            setTampilanRekomendasiDokterVM((com.application.app.modules.tampilanrekomendasidokter.data.viewmodel.TampilanRekomendasiDokterVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanRekomendasiDokterVM(@Nullable com.application.app.modules.tampilanrekomendasidokter.data.viewmodel.TampilanRekomendasiDokterVM TampilanRekomendasiDokterVM) {
        this.mTampilanRekomendasiDokterVM = TampilanRekomendasiDokterVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanRekomendasiDokterVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanRekomendasiDokterVMTampilanRekomendasiDokterModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanrekomendasidokter.data.model.TampilanRekomendasiDokterModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanRekomendasiDokterVMTampilanRekomendasiDokterModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanrekomendasidokter.data.model.TampilanRekomendasiDokterModel> TampilanRekomendasiDokterVMTampilanRekomendasiDokterModel, int fieldId) {
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
        java.lang.String tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtReDoc = null;
        java.lang.String tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtReservasi = null;
        java.lang.String tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtRekomendasiDok = null;
        com.application.app.modules.tampilanrekomendasidokter.data.model.TampilanRekomendasiDokterModel tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelGetValue = null;
        com.application.app.modules.tampilanrekomendasidokter.data.viewmodel.TampilanRekomendasiDokterVM tampilanRekomendasiDokterVM = mTampilanRekomendasiDokterVM;
        java.lang.String tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtAkunSaya = null;
        java.lang.String tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtKotakMasuk = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanrekomendasidokter.data.model.TampilanRekomendasiDokterModel> tampilanRekomendasiDokterVMTampilanRekomendasiDokterModel = null;
        java.lang.String tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtBeranda = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanRekomendasiDokterVM != null) {
                    // read tampilanRekomendasiDokterVM.tampilanRekomendasiDokterModel
                    tampilanRekomendasiDokterVMTampilanRekomendasiDokterModel = tampilanRekomendasiDokterVM.getTampilanRekomendasiDokterModel();
                }
                updateLiveDataRegistration(0, tampilanRekomendasiDokterVMTampilanRekomendasiDokterModel);


                if (tampilanRekomendasiDokterVMTampilanRekomendasiDokterModel != null) {
                    // read tampilanRekomendasiDokterVM.tampilanRekomendasiDokterModel.getValue()
                    tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelGetValue = tampilanRekomendasiDokterVMTampilanRekomendasiDokterModel.getValue();
                }


                if (tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelGetValue != null) {
                    // read tampilanRekomendasiDokterVM.tampilanRekomendasiDokterModel.getValue().txtReDoc
                    tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtReDoc = tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelGetValue.getTxtReDoc();
                    // read tampilanRekomendasiDokterVM.tampilanRekomendasiDokterModel.getValue().txtReservasi
                    tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtReservasi = tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelGetValue.getTxtReservasi();
                    // read tampilanRekomendasiDokterVM.tampilanRekomendasiDokterModel.getValue().txtRekomendasiDok
                    tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtRekomendasiDok = tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelGetValue.getTxtRekomendasiDok();
                    // read tampilanRekomendasiDokterVM.tampilanRekomendasiDokterModel.getValue().txtAkunSaya
                    tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtAkunSaya = tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelGetValue.getTxtAkunSaya();
                    // read tampilanRekomendasiDokterVM.tampilanRekomendasiDokterModel.getValue().txtKotakMasuk
                    tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtKotakMasuk = tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelGetValue.getTxtKotakMasuk();
                    // read tampilanRekomendasiDokterVM.tampilanRekomendasiDokterModel.getValue().txtBeranda
                    tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtBeranda = tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelGetValue.getTxtBeranda();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerTampilanRekomendasiDokter, recyclerTampilanRekomendasiDokter.getResources().getDimension(R.dimen._23pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkunSaya, tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtAkunSaya);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeranda, tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtBeranda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKotakMasuk, tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtKotakMasuk);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReDoc, tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtReDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRekomendasiDok, tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtRekomendasiDok);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReservasi, tampilanRekomendasiDokterVMTampilanRekomendasiDokterModelTxtReservasi);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanRekomendasiDokterVM.tampilanRekomendasiDokterModel
        flag 1 (0x2L): tampilanRekomendasiDokterVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}