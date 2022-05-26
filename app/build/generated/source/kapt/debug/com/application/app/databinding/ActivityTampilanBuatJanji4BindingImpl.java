package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTampilanBuatJanji4BindingImpl extends ActivityTampilanBuatJanji4Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearGroup170, 14);
        sViewsWithIds.put(R.id.linearBarAtas, 15);
        sViewsWithIds.put(R.id.toolbarToolbar, 16);
        sViewsWithIds.put(R.id.linearGroup161, 17);
        sViewsWithIds.put(R.id.imageVector, 18);
        sViewsWithIds.put(R.id.linearGroup162, 19);
        sViewsWithIds.put(R.id.frameGroup172, 20);
        sViewsWithIds.put(R.id.linearGroup163, 21);
        sViewsWithIds.put(R.id.tabLayoutGroup25, 22);
        sViewsWithIds.put(R.id.viewPagerGroup182, 23);
        sViewsWithIds.put(R.id.linearBarBawah, 24);
        sViewsWithIds.put(R.id.linearGroup179, 25);
        sViewsWithIds.put(R.id.linearGroup177, 26);
        sViewsWithIds.put(R.id.imageHomer, 27);
        sViewsWithIds.put(R.id.imageClipboardr, 28);
        sViewsWithIds.put(R.id.imageEmailr, 29);
        sViewsWithIds.put(R.id.imageUserr, 30);
        sViewsWithIds.put(R.id.linearGroup178, 31);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTampilanBuatJanji4BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 32, sIncludes, sViewsWithIds));
    }
    private ActivityTampilanBuatJanji4BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.FrameLayout) bindings[20]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[0]
            , (com.google.android.material.tabs.TabLayout) bindings[22]
            , (androidx.appcompat.widget.Toolbar) bindings[16]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (androidx.viewpager2.widget.ViewPager2) bindings[23]
            );
        this.image51604271.setTag(null);
        this.linearGroup331.setTag(null);
        this.txt1500.setTag(null);
        this.txt15Maret.setTag(null);
        this.txt1600.setTag(null);
        this.txt1700.setTag(null);
        this.txtAkunSaya.setTag(null);
        this.txtBeranda.setTag(null);
        this.txtDRDrSYAHRUL.setTag(null);
        this.txtJadwalYangTer.setTag(null);
        this.txtKotakMasuk.setTag(null);
        this.txtReDoc.setTag(null);
        this.txtReservasi.setTag(null);
        this.txtSpesialisSaraf.setTag(null);
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
        if (BR.tampilanBuatJanji4VM == variableId) {
            setTampilanBuatJanji4VM((com.application.app.modules.tampilanbuatjanji4.data.viewmodel.TampilanBuatJanji4VM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanBuatJanji4VM(@Nullable com.application.app.modules.tampilanbuatjanji4.data.viewmodel.TampilanBuatJanji4VM TampilanBuatJanji4VM) {
        this.mTampilanBuatJanji4VM = TampilanBuatJanji4VM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanBuatJanji4VM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanBuatJanji4VMTampilanBuatJanji4Model((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanbuatjanji4.data.model.TampilanBuatJanji4Model>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanBuatJanji4VMTampilanBuatJanji4Model(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanbuatjanji4.data.model.TampilanBuatJanji4Model> TampilanBuatJanji4VMTampilanBuatJanji4Model, int fieldId) {
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
        java.lang.String tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtSpesialisSaraf = null;
        java.lang.String tampilanBuatJanji4VMTampilanBuatJanji4ModelTxt1700 = null;
        com.application.app.modules.tampilanbuatjanji4.data.viewmodel.TampilanBuatJanji4VM tampilanBuatJanji4VM = mTampilanBuatJanji4VM;
        java.lang.String tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtJadwalYangTer = null;
        java.lang.String tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtReservasi = null;
        java.lang.String tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtDRDrSYAHRUL = null;
        java.lang.String tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtReDoc = null;
        java.lang.String tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtAkunSaya = null;
        java.lang.String tampilanBuatJanji4VMTampilanBuatJanji4ModelTxt15Maret = null;
        java.lang.String tampilanBuatJanji4VMTampilanBuatJanji4ModelTxt1500 = null;
        java.lang.String tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtBeranda = null;
        com.application.app.modules.tampilanbuatjanji4.data.model.TampilanBuatJanji4Model tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanbuatjanji4.data.model.TampilanBuatJanji4Model> tampilanBuatJanji4VMTampilanBuatJanji4Model = null;
        java.lang.String tampilanBuatJanji4VMTampilanBuatJanji4ModelTxt1600 = null;
        java.lang.String tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtKotakMasuk = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanBuatJanji4VM != null) {
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model
                    tampilanBuatJanji4VMTampilanBuatJanji4Model = tampilanBuatJanji4VM.getTampilanBuatJanji4Model();
                }
                updateLiveDataRegistration(0, tampilanBuatJanji4VMTampilanBuatJanji4Model);


                if (tampilanBuatJanji4VMTampilanBuatJanji4Model != null) {
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model.getValue()
                    tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue = tampilanBuatJanji4VMTampilanBuatJanji4Model.getValue();
                }


                if (tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue != null) {
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model.getValue().txtSpesialisSaraf
                    tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtSpesialisSaraf = tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue.getTxtSpesialisSaraf();
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model.getValue().txt1700
                    tampilanBuatJanji4VMTampilanBuatJanji4ModelTxt1700 = tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue.getTxt1700();
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model.getValue().txtJadwalYangTer
                    tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtJadwalYangTer = tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue.getTxtJadwalYangTer();
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model.getValue().txtReservasi
                    tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtReservasi = tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue.getTxtReservasi();
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model.getValue().txtDRDrSYAHRUL
                    tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtDRDrSYAHRUL = tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue.getTxtDRDrSYAHRUL();
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model.getValue().txtReDoc
                    tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtReDoc = tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue.getTxtReDoc();
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model.getValue().txtAkunSaya
                    tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtAkunSaya = tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue.getTxtAkunSaya();
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model.getValue().txt15Maret
                    tampilanBuatJanji4VMTampilanBuatJanji4ModelTxt15Maret = tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue.getTxt15Maret();
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model.getValue().txt1500
                    tampilanBuatJanji4VMTampilanBuatJanji4ModelTxt1500 = tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue.getTxt1500();
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model.getValue().txtBeranda
                    tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtBeranda = tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue.getTxtBeranda();
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model.getValue().txt1600
                    tampilanBuatJanji4VMTampilanBuatJanji4ModelTxt1600 = tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue.getTxt1600();
                    // read tampilanBuatJanji4VM.tampilanBuatJanji4Model.getValue().txtKotakMasuk
                    tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtKotakMasuk = tampilanBuatJanji4VMTampilanBuatJanji4ModelGetValue.getTxtKotakMasuk();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image51604271, androidx.appcompat.content.res.AppCompatResources.getDrawable(image51604271.getContext(), R.drawable.img_51604271_2), (float)0f, true);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt1500, tampilanBuatJanji4VMTampilanBuatJanji4ModelTxt1500);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt15Maret, tampilanBuatJanji4VMTampilanBuatJanji4ModelTxt15Maret);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt1600, tampilanBuatJanji4VMTampilanBuatJanji4ModelTxt1600);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt1700, tampilanBuatJanji4VMTampilanBuatJanji4ModelTxt1700);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkunSaya, tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtAkunSaya);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeranda, tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtBeranda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDRDrSYAHRUL, tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtDRDrSYAHRUL);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtJadwalYangTer, tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtJadwalYangTer);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKotakMasuk, tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtKotakMasuk);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReDoc, tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtReDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReservasi, tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtReservasi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSpesialisSaraf, tampilanBuatJanji4VMTampilanBuatJanji4ModelTxtSpesialisSaraf);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanBuatJanji4VM.tampilanBuatJanji4Model
        flag 1 (0x2L): tampilanBuatJanji4VM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}