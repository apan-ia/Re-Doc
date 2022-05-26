package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTampilanKotakMasukSelesaiBindingImpl extends ActivityTampilanKotakMasukSelesaiBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 14);
        sViewsWithIds.put(R.id.linearGroup121, 15);
        sViewsWithIds.put(R.id.linearBarAtas, 16);
        sViewsWithIds.put(R.id.toolbarToolbar, 17);
        sViewsWithIds.put(R.id.linearGroup110, 18);
        sViewsWithIds.put(R.id.imageVector, 19);
        sViewsWithIds.put(R.id.imageGroup, 20);
        sViewsWithIds.put(R.id.frameGroup125, 21);
        sViewsWithIds.put(R.id.frameGroup127, 22);
        sViewsWithIds.put(R.id.imageRectangle709, 23);
        sViewsWithIds.put(R.id.linearGroup117, 24);
        sViewsWithIds.put(R.id.linearGroup114, 25);
        sViewsWithIds.put(R.id.linearGroup111, 26);
        sViewsWithIds.put(R.id.imageStar2, 27);
        sViewsWithIds.put(R.id.imageStar3, 28);
        sViewsWithIds.put(R.id.imageStar4, 29);
        sViewsWithIds.put(R.id.frameGroup129, 30);
        sViewsWithIds.put(R.id.imageStar5, 31);
        sViewsWithIds.put(R.id.imageStar6, 32);
        sViewsWithIds.put(R.id.linearGroup113, 33);
        sViewsWithIds.put(R.id.viewRectangle716, 34);
        sViewsWithIds.put(R.id.linearBarBawah, 35);
        sViewsWithIds.put(R.id.linearGroup136, 36);
        sViewsWithIds.put(R.id.linearGroup134, 37);
        sViewsWithIds.put(R.id.imageHomer, 38);
        sViewsWithIds.put(R.id.imageClipboardr, 39);
        sViewsWithIds.put(R.id.imageEmailr, 40);
        sViewsWithIds.put(R.id.imageUserr, 41);
        sViewsWithIds.put(R.id.linearGroup135, 42);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTampilanKotakMasukSelesaiBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 43, sIncludes, sViewsWithIds));
    }
    private ActivityTampilanKotakMasukSelesaiBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.FrameLayout) bindings[21]
            , (android.widget.FrameLayout) bindings[22]
            , (android.widget.FrameLayout) bindings[30]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[39]
            , (android.widget.ImageView) bindings[40]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[38]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[31]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.ImageView) bindings[41]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[35]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.LinearLayout) bindings[42]
            , (android.widget.LinearLayout) bindings[36]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.ScrollView) bindings[14]
            , (androidx.appcompat.widget.Toolbar) bindings[17]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.view.View) bindings[34]
            );
        this.image51604271.setTag(null);
        this.linearGroup138.setTag(null);
        this.txtAkunSaya.setTag(null);
        this.txtBeranda.setTag(null);
        this.txtDRDrSYAHRUL.setTag(null);
        this.txtKomentarDokter.setTag(null);
        this.txtKotakMasuk.setTag(null);
        this.txtKotakMasuk1.setTag(null);
        this.txtMax600Words.setTag(null);
        this.txtOK.setTag(null);
        this.txtReDoc.setTag(null);
        this.txtReservasi.setTag(null);
        this.txtReservasi1.setTag(null);
        this.txtSelesai.setTag(null);
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
        if (BR.tampilanKotakMasukSelesaiVM == variableId) {
            setTampilanKotakMasukSelesaiVM((com.application.app.modules.tampilankotakmasukselesai.data.viewmodel.TampilanKotakMasukSelesaiVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanKotakMasukSelesaiVM(@Nullable com.application.app.modules.tampilankotakmasukselesai.data.viewmodel.TampilanKotakMasukSelesaiVM TampilanKotakMasukSelesaiVM) {
        this.mTampilanKotakMasukSelesaiVM = TampilanKotakMasukSelesaiVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanKotakMasukSelesaiVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilankotakmasukselesai.data.model.TampilanKotakMasukSelesaiModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilankotakmasukselesai.data.model.TampilanKotakMasukSelesaiModel> TampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModel, int fieldId) {
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
        com.application.app.modules.tampilankotakmasukselesai.data.viewmodel.TampilanKotakMasukSelesaiVM tampilanKotakMasukSelesaiVM = mTampilanKotakMasukSelesaiVM;
        java.lang.String tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtKotakMasuk1 = null;
        java.lang.String tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtReservasi1 = null;
        java.lang.String tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtReservasi = null;
        java.lang.String tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtDRDrSYAHRUL = null;
        java.lang.String tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtOK = null;
        java.lang.String tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtKotakMasuk = null;
        java.lang.String tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtSelesai = null;
        java.lang.String tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtReDoc = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilankotakmasukselesai.data.model.TampilanKotakMasukSelesaiModel> tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModel = null;
        java.lang.String tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtMax600Words = null;
        java.lang.String tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtAkunSaya = null;
        com.application.app.modules.tampilankotakmasukselesai.data.model.TampilanKotakMasukSelesaiModel tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue = null;
        java.lang.String tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtBeranda = null;
        java.lang.String tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtKomentarDokter = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanKotakMasukSelesaiVM != null) {
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModel = tampilanKotakMasukSelesaiVM.getTampilanKotakMasukSelesaiModel();
                }
                updateLiveDataRegistration(0, tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModel);


                if (tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModel != null) {
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel.getValue()
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue = tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModel.getValue();
                }


                if (tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue != null) {
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel.getValue().txtKotakMasuk1
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtKotakMasuk1 = tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue.getTxtKotakMasuk1();
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel.getValue().txtReservasi1
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtReservasi1 = tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue.getTxtReservasi1();
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel.getValue().txtReservasi
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtReservasi = tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue.getTxtReservasi();
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel.getValue().txtDRDrSYAHRUL
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtDRDrSYAHRUL = tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue.getTxtDRDrSYAHRUL();
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel.getValue().txtOK
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtOK = tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue.getTxtOK();
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel.getValue().txtKotakMasuk
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtKotakMasuk = tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue.getTxtKotakMasuk();
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel.getValue().txtSelesai
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtSelesai = tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue.getTxtSelesai();
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel.getValue().txtReDoc
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtReDoc = tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue.getTxtReDoc();
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel.getValue().txtMax600Words
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtMax600Words = tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue.getTxtMax600Words();
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel.getValue().txtAkunSaya
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtAkunSaya = tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue.getTxtAkunSaya();
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel.getValue().txtBeranda
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtBeranda = tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue.getTxtBeranda();
                    // read tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel.getValue().txtKomentarDokter
                    tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtKomentarDokter = tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelGetValue.getTxtKomentarDokter();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image51604271, androidx.appcompat.content.res.AppCompatResources.getDrawable(image51604271.getContext(), R.drawable.img_51604271), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkunSaya, tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtAkunSaya);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeranda, tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtBeranda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDRDrSYAHRUL, tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtDRDrSYAHRUL);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKomentarDokter, tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtKomentarDokter);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKotakMasuk, tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtKotakMasuk);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKotakMasuk1, tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtKotakMasuk1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtMax600Words, tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtMax600Words);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtOK, tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtOK);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReDoc, tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtReDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReservasi, tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtReservasi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReservasi1, tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtReservasi1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSelesai, tampilanKotakMasukSelesaiVMTampilanKotakMasukSelesaiModelTxtSelesai);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanKotakMasukSelesaiVM.tampilanKotakMasukSelesaiModel
        flag 1 (0x2L): tampilanKotakMasukSelesaiVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}