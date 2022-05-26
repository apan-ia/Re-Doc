package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTampilanBuatJanji1BindingImpl extends ActivityTampilanBuatJanji1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearBarAtas, 9);
        sViewsWithIds.put(R.id.toolbarToolbar, 10);
        sViewsWithIds.put(R.id.linearGroup223, 11);
        sViewsWithIds.put(R.id.imageVector, 12);
        sViewsWithIds.put(R.id.scrollViewScrollview, 13);
        sViewsWithIds.put(R.id.linearBarAtas1, 14);
        sViewsWithIds.put(R.id.linearDoctorsec, 15);
        sViewsWithIds.put(R.id.linearBarBawah, 16);
        sViewsWithIds.put(R.id.linearGroup259, 17);
        sViewsWithIds.put(R.id.linearGroup257, 18);
        sViewsWithIds.put(R.id.imageHomer, 19);
        sViewsWithIds.put(R.id.imageClipboardr, 20);
        sViewsWithIds.put(R.id.imageEmailr, 21);
        sViewsWithIds.put(R.id.imageUserr, 22);
        sViewsWithIds.put(R.id.linearGroup258, 23);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTampilanBuatJanji1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private ActivityTampilanBuatJanji1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.core.widget.NestedScrollView) bindings[13]
            , (androidx.appcompat.widget.Toolbar) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[6]
            );
        this.linearGroup263.setTag(null);
        this.recyclerTampilanBuatJanji.setTag(null);
        this.recyclerTampilanBuatJanji1.setTag(null);
        this.txtAkunSaya.setTag(null);
        this.txtBeranda.setTag(null);
        this.txtDokterGigi.setTag(null);
        this.txtKotakMasuk.setTag(null);
        this.txtReDoc.setTag(null);
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
        if (BR.tampilanBuatJanji1VM == variableId) {
            setTampilanBuatJanji1VM((com.application.app.modules.tampilanbuatjanji1.data.viewmodel.TampilanBuatJanji1VM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanBuatJanji1VM(@Nullable com.application.app.modules.tampilanbuatjanji1.data.viewmodel.TampilanBuatJanji1VM TampilanBuatJanji1VM) {
        this.mTampilanBuatJanji1VM = TampilanBuatJanji1VM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanBuatJanji1VM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanBuatJanji1VMTampilanBuatJanji1Model((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanbuatjanji1.data.model.TampilanBuatJanji1Model>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanBuatJanji1VMTampilanBuatJanji1Model(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanbuatjanji1.data.model.TampilanBuatJanji1Model> TampilanBuatJanji1VMTampilanBuatJanji1Model, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanbuatjanji1.data.model.TampilanBuatJanji1Model> tampilanBuatJanji1VMTampilanBuatJanji1Model = null;
        java.lang.String tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtReDoc = null;
        java.lang.String tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtAkunSaya = null;
        java.lang.String tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtDokterGigi = null;
        java.lang.String tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtReservasi = null;
        java.lang.String tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtBeranda = null;
        com.application.app.modules.tampilanbuatjanji1.data.model.TampilanBuatJanji1Model tampilanBuatJanji1VMTampilanBuatJanji1ModelGetValue = null;
        com.application.app.modules.tampilanbuatjanji1.data.viewmodel.TampilanBuatJanji1VM tampilanBuatJanji1VM = mTampilanBuatJanji1VM;
        java.lang.String tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtKotakMasuk = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanBuatJanji1VM != null) {
                    // read tampilanBuatJanji1VM.tampilanBuatJanji1Model
                    tampilanBuatJanji1VMTampilanBuatJanji1Model = tampilanBuatJanji1VM.getTampilanBuatJanji1Model();
                }
                updateLiveDataRegistration(0, tampilanBuatJanji1VMTampilanBuatJanji1Model);


                if (tampilanBuatJanji1VMTampilanBuatJanji1Model != null) {
                    // read tampilanBuatJanji1VM.tampilanBuatJanji1Model.getValue()
                    tampilanBuatJanji1VMTampilanBuatJanji1ModelGetValue = tampilanBuatJanji1VMTampilanBuatJanji1Model.getValue();
                }


                if (tampilanBuatJanji1VMTampilanBuatJanji1ModelGetValue != null) {
                    // read tampilanBuatJanji1VM.tampilanBuatJanji1Model.getValue().txtReDoc
                    tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtReDoc = tampilanBuatJanji1VMTampilanBuatJanji1ModelGetValue.getTxtReDoc();
                    // read tampilanBuatJanji1VM.tampilanBuatJanji1Model.getValue().txtAkunSaya
                    tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtAkunSaya = tampilanBuatJanji1VMTampilanBuatJanji1ModelGetValue.getTxtAkunSaya();
                    // read tampilanBuatJanji1VM.tampilanBuatJanji1Model.getValue().txtDokterGigi
                    tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtDokterGigi = tampilanBuatJanji1VMTampilanBuatJanji1ModelGetValue.getTxtDokterGigi();
                    // read tampilanBuatJanji1VM.tampilanBuatJanji1Model.getValue().txtReservasi
                    tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtReservasi = tampilanBuatJanji1VMTampilanBuatJanji1ModelGetValue.getTxtReservasi();
                    // read tampilanBuatJanji1VM.tampilanBuatJanji1Model.getValue().txtBeranda
                    tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtBeranda = tampilanBuatJanji1VMTampilanBuatJanji1ModelGetValue.getTxtBeranda();
                    // read tampilanBuatJanji1VM.tampilanBuatJanji1Model.getValue().txtKotakMasuk
                    tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtKotakMasuk = tampilanBuatJanji1VMTampilanBuatJanji1ModelGetValue.getTxtKotakMasuk();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerTampilanBuatJanji, recyclerTampilanBuatJanji.getResources().getDimension(R.dimen._10pxh), (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerTampilanBuatJanji1, recyclerTampilanBuatJanji1.getResources().getDimension(R.dimen._33pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkunSaya, tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtAkunSaya);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeranda, tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtBeranda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDokterGigi, tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtDokterGigi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKotakMasuk, tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtKotakMasuk);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReDoc, tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtReDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReservasi, tampilanBuatJanji1VMTampilanBuatJanji1ModelTxtReservasi);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanBuatJanji1VM.tampilanBuatJanji1Model
        flag 1 (0x2L): tampilanBuatJanji1VM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}