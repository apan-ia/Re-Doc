package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTampilanKategoriBindingImpl extends ActivityTampilanKategoriBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 13);
        sViewsWithIds.put(R.id.linearGroup188, 14);
        sViewsWithIds.put(R.id.linearBarAtas, 15);
        sViewsWithIds.put(R.id.toolbarToolbar, 16);
        sViewsWithIds.put(R.id.linearGroup183, 17);
        sViewsWithIds.put(R.id.imageVector, 18);
        sViewsWithIds.put(R.id.linearGroup184, 19);
        sViewsWithIds.put(R.id.imageGroup, 20);
        sViewsWithIds.put(R.id.linearCatagoriessec, 21);
        sViewsWithIds.put(R.id.linearGroup58, 22);
        sViewsWithIds.put(R.id.imageImage2, 23);
        sViewsWithIds.put(R.id.linearGroup62, 24);
        sViewsWithIds.put(R.id.imageImage3, 25);
        sViewsWithIds.put(R.id.linearGroup189, 26);
        sViewsWithIds.put(R.id.imageImage4, 27);
        sViewsWithIds.put(R.id.linearGroup185, 28);
        sViewsWithIds.put(R.id.linearGroup190, 29);
        sViewsWithIds.put(R.id.imageGroup47, 30);
        sViewsWithIds.put(R.id.linearGroup191, 31);
        sViewsWithIds.put(R.id.imageGroup25, 32);
        sViewsWithIds.put(R.id.linearGroup192, 33);
        sViewsWithIds.put(R.id.imageGroup27, 34);
        sViewsWithIds.put(R.id.linearBarBawah, 35);
        sViewsWithIds.put(R.id.linearGroup199, 36);
        sViewsWithIds.put(R.id.linearGroup197, 37);
        sViewsWithIds.put(R.id.imageHomer, 38);
        sViewsWithIds.put(R.id.imageClipboardr, 39);
        sViewsWithIds.put(R.id.imageEmailr, 40);
        sViewsWithIds.put(R.id.imageUserr, 41);
        sViewsWithIds.put(R.id.linearGroup198, 42);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTampilanKategoriBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 43, sIncludes, sViewsWithIds));
    }
    private ActivityTampilanKategoriBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[39]
            , (android.widget.ImageView) bindings[40]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[38]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[41]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[35]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.LinearLayout) bindings[42]
            , (android.widget.LinearLayout) bindings[36]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.ScrollView) bindings[13]
            , (androidx.appcompat.widget.Toolbar) bindings[16]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            );
        this.linearGroup201.setTag(null);
        this.txtAkunSaya.setTag(null);
        this.txtBeranda.setTag(null);
        this.txtGigi.setTag(null);
        this.txtJantung.setTag(null);
        this.txtKandungan.setTag(null);
        this.txtKategori.setTag(null);
        this.txtKotakMasuk.setTag(null);
        this.txtParuparu.setTag(null);
        this.txtReDoc.setTag(null);
        this.txtReservasi.setTag(null);
        this.txtTulang.setTag(null);
        this.txtUmum.setTag(null);
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
        if (BR.tampilanKategoriVM == variableId) {
            setTampilanKategoriVM((com.application.app.modules.tampilankategori.data.viewmodel.TampilanKategoriVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanKategoriVM(@Nullable com.application.app.modules.tampilankategori.data.viewmodel.TampilanKategoriVM TampilanKategoriVM) {
        this.mTampilanKategoriVM = TampilanKategoriVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanKategoriVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanKategoriVMTampilanKategoriModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilankategori.data.model.TampilanKategoriModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanKategoriVMTampilanKategoriModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilankategori.data.model.TampilanKategoriModel> TampilanKategoriVMTampilanKategoriModel, int fieldId) {
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
        java.lang.String tampilanKategoriVMTampilanKategoriModelTxtAkunSaya = null;
        java.lang.String tampilanKategoriVMTampilanKategoriModelTxtReDoc = null;
        java.lang.String tampilanKategoriVMTampilanKategoriModelTxtJantung = null;
        java.lang.String tampilanKategoriVMTampilanKategoriModelTxtGigi = null;
        java.lang.String tampilanKategoriVMTampilanKategoriModelTxtTulang = null;
        com.application.app.modules.tampilankategori.data.model.TampilanKategoriModel tampilanKategoriVMTampilanKategoriModelGetValue = null;
        com.application.app.modules.tampilankategori.data.viewmodel.TampilanKategoriVM tampilanKategoriVM = mTampilanKategoriVM;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilankategori.data.model.TampilanKategoriModel> tampilanKategoriVMTampilanKategoriModel = null;
        java.lang.String tampilanKategoriVMTampilanKategoriModelTxtUmum = null;
        java.lang.String tampilanKategoriVMTampilanKategoriModelTxtParuparu = null;
        java.lang.String tampilanKategoriVMTampilanKategoriModelTxtKandungan = null;
        java.lang.String tampilanKategoriVMTampilanKategoriModelTxtBeranda = null;
        java.lang.String tampilanKategoriVMTampilanKategoriModelTxtReservasi = null;
        java.lang.String tampilanKategoriVMTampilanKategoriModelTxtKategori = null;
        java.lang.String tampilanKategoriVMTampilanKategoriModelTxtKotakMasuk = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanKategoriVM != null) {
                    // read tampilanKategoriVM.tampilanKategoriModel
                    tampilanKategoriVMTampilanKategoriModel = tampilanKategoriVM.getTampilanKategoriModel();
                }
                updateLiveDataRegistration(0, tampilanKategoriVMTampilanKategoriModel);


                if (tampilanKategoriVMTampilanKategoriModel != null) {
                    // read tampilanKategoriVM.tampilanKategoriModel.getValue()
                    tampilanKategoriVMTampilanKategoriModelGetValue = tampilanKategoriVMTampilanKategoriModel.getValue();
                }


                if (tampilanKategoriVMTampilanKategoriModelGetValue != null) {
                    // read tampilanKategoriVM.tampilanKategoriModel.getValue().txtAkunSaya
                    tampilanKategoriVMTampilanKategoriModelTxtAkunSaya = tampilanKategoriVMTampilanKategoriModelGetValue.getTxtAkunSaya();
                    // read tampilanKategoriVM.tampilanKategoriModel.getValue().txtReDoc
                    tampilanKategoriVMTampilanKategoriModelTxtReDoc = tampilanKategoriVMTampilanKategoriModelGetValue.getTxtReDoc();
                    // read tampilanKategoriVM.tampilanKategoriModel.getValue().txtJantung
                    tampilanKategoriVMTampilanKategoriModelTxtJantung = tampilanKategoriVMTampilanKategoriModelGetValue.getTxtJantung();
                    // read tampilanKategoriVM.tampilanKategoriModel.getValue().txtGigi
                    tampilanKategoriVMTampilanKategoriModelTxtGigi = tampilanKategoriVMTampilanKategoriModelGetValue.getTxtGigi();
                    // read tampilanKategoriVM.tampilanKategoriModel.getValue().txtTulang
                    tampilanKategoriVMTampilanKategoriModelTxtTulang = tampilanKategoriVMTampilanKategoriModelGetValue.getTxtTulang();
                    // read tampilanKategoriVM.tampilanKategoriModel.getValue().txtUmum
                    tampilanKategoriVMTampilanKategoriModelTxtUmum = tampilanKategoriVMTampilanKategoriModelGetValue.getTxtUmum();
                    // read tampilanKategoriVM.tampilanKategoriModel.getValue().txtParuparu
                    tampilanKategoriVMTampilanKategoriModelTxtParuparu = tampilanKategoriVMTampilanKategoriModelGetValue.getTxtParuparu();
                    // read tampilanKategoriVM.tampilanKategoriModel.getValue().txtKandungan
                    tampilanKategoriVMTampilanKategoriModelTxtKandungan = tampilanKategoriVMTampilanKategoriModelGetValue.getTxtKandungan();
                    // read tampilanKategoriVM.tampilanKategoriModel.getValue().txtBeranda
                    tampilanKategoriVMTampilanKategoriModelTxtBeranda = tampilanKategoriVMTampilanKategoriModelGetValue.getTxtBeranda();
                    // read tampilanKategoriVM.tampilanKategoriModel.getValue().txtReservasi
                    tampilanKategoriVMTampilanKategoriModelTxtReservasi = tampilanKategoriVMTampilanKategoriModelGetValue.getTxtReservasi();
                    // read tampilanKategoriVM.tampilanKategoriModel.getValue().txtKategori
                    tampilanKategoriVMTampilanKategoriModelTxtKategori = tampilanKategoriVMTampilanKategoriModelGetValue.getTxtKategori();
                    // read tampilanKategoriVM.tampilanKategoriModel.getValue().txtKotakMasuk
                    tampilanKategoriVMTampilanKategoriModelTxtKotakMasuk = tampilanKategoriVMTampilanKategoriModelGetValue.getTxtKotakMasuk();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkunSaya, tampilanKategoriVMTampilanKategoriModelTxtAkunSaya);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeranda, tampilanKategoriVMTampilanKategoriModelTxtBeranda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGigi, tampilanKategoriVMTampilanKategoriModelTxtGigi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtJantung, tampilanKategoriVMTampilanKategoriModelTxtJantung);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKandungan, tampilanKategoriVMTampilanKategoriModelTxtKandungan);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKategori, tampilanKategoriVMTampilanKategoriModelTxtKategori);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKotakMasuk, tampilanKategoriVMTampilanKategoriModelTxtKotakMasuk);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtParuparu, tampilanKategoriVMTampilanKategoriModelTxtParuparu);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReDoc, tampilanKategoriVMTampilanKategoriModelTxtReDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReservasi, tampilanKategoriVMTampilanKategoriModelTxtReservasi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTulang, tampilanKategoriVMTampilanKategoriModelTxtTulang);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUmum, tampilanKategoriVMTampilanKategoriModelTxtUmum);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanKategoriVM.tampilanKategoriModel
        flag 1 (0x2L): tampilanKategoriVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}