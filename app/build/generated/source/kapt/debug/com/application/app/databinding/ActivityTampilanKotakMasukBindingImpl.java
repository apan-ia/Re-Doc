package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTampilanKotakMasukBindingImpl extends ActivityTampilanKotakMasukBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearBarAtas, 13);
        sViewsWithIds.put(R.id.toolbarToolbar, 14);
        sViewsWithIds.put(R.id.linearGroup140, 15);
        sViewsWithIds.put(R.id.imageVector, 16);
        sViewsWithIds.put(R.id.scrollViewScrollview, 17);
        sViewsWithIds.put(R.id.linearGroup150, 18);
        sViewsWithIds.put(R.id.imageGroup, 19);
        sViewsWithIds.put(R.id.linearGroup147, 20);
        sViewsWithIds.put(R.id.btnSelesai, 21);
        sViewsWithIds.put(R.id.linearGroup146, 22);
        sViewsWithIds.put(R.id.linearGroup141, 23);
        sViewsWithIds.put(R.id.imageCalendarr, 24);
        sViewsWithIds.put(R.id.linearGroup142, 25);
        sViewsWithIds.put(R.id.imageClockr, 26);
        sViewsWithIds.put(R.id.linearGroup143, 27);
        sViewsWithIds.put(R.id.imageVector1, 28);
        sViewsWithIds.put(R.id.linearBarBawah, 29);
        sViewsWithIds.put(R.id.linearGroup157, 30);
        sViewsWithIds.put(R.id.linearGroup155, 31);
        sViewsWithIds.put(R.id.imageHomer, 32);
        sViewsWithIds.put(R.id.imageClipboardr, 33);
        sViewsWithIds.put(R.id.imageEmailr, 34);
        sViewsWithIds.put(R.id.imageUserr, 35);
        sViewsWithIds.put(R.id.linearGroup156, 36);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTampilanKotakMasukBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 37, sIncludes, sViewsWithIds));
    }
    private ActivityTampilanKotakMasukBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[21]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[33]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.ImageView) bindings[35]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[36]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.ScrollView) bindings[17]
            , (androidx.appcompat.widget.Toolbar) bindings[14]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[10]
            );
        this.linearGroup159.setTag(null);
        this.txt15Maret.setTag(null);
        this.txt1800WIB.setTag(null);
        this.txtAkunSaya.setTag(null);
        this.txtAntrian4.setTag(null);
        this.txtBeranda.setTag(null);
        this.txtCempakaLima.setTag(null);
        this.txtDRDrSYAHRUL.setTag(null);
        this.txtKotakMasuk.setTag(null);
        this.txtKotakMasuk1.setTag(null);
        this.txtReDoc.setTag(null);
        this.txtReservasi.setTag(null);
        this.txtReservasi1.setTag(null);
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
        if (BR.tampilanKotakMasukVM == variableId) {
            setTampilanKotakMasukVM((com.application.app.modules.tampilankotakmasuk.data.viewmodel.TampilanKotakMasukVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanKotakMasukVM(@Nullable com.application.app.modules.tampilankotakmasuk.data.viewmodel.TampilanKotakMasukVM TampilanKotakMasukVM) {
        this.mTampilanKotakMasukVM = TampilanKotakMasukVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanKotakMasukVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanKotakMasukVMTampilanKotakMasukModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilankotakmasuk.data.model.TampilanKotakMasukModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanKotakMasukVMTampilanKotakMasukModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilankotakmasuk.data.model.TampilanKotakMasukModel> TampilanKotakMasukVMTampilanKotakMasukModel, int fieldId) {
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
        java.lang.String tampilanKotakMasukVMTampilanKotakMasukModelTxtAntrian4 = null;
        java.lang.String tampilanKotakMasukVMTampilanKotakMasukModelTxtReservasi = null;
        java.lang.String tampilanKotakMasukVMTampilanKotakMasukModelTxtKotakMasuk1 = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilankotakmasuk.data.model.TampilanKotakMasukModel> tampilanKotakMasukVMTampilanKotakMasukModel = null;
        java.lang.String tampilanKotakMasukVMTampilanKotakMasukModelTxtBeranda = null;
        java.lang.String tampilanKotakMasukVMTampilanKotakMasukModelTxtDRDrSYAHRUL = null;
        java.lang.String tampilanKotakMasukVMTampilanKotakMasukModelTxtKotakMasuk = null;
        java.lang.String tampilanKotakMasukVMTampilanKotakMasukModelTxtReservasi1 = null;
        java.lang.String tampilanKotakMasukVMTampilanKotakMasukModelTxtReDoc = null;
        com.application.app.modules.tampilankotakmasuk.data.model.TampilanKotakMasukModel tampilanKotakMasukVMTampilanKotakMasukModelGetValue = null;
        java.lang.String tampilanKotakMasukVMTampilanKotakMasukModelTxt15Maret = null;
        com.application.app.modules.tampilankotakmasuk.data.viewmodel.TampilanKotakMasukVM tampilanKotakMasukVM = mTampilanKotakMasukVM;
        java.lang.String tampilanKotakMasukVMTampilanKotakMasukModelTxtCempakaLima = null;
        java.lang.String tampilanKotakMasukVMTampilanKotakMasukModelTxt1800WIB = null;
        java.lang.String tampilanKotakMasukVMTampilanKotakMasukModelTxtAkunSaya = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanKotakMasukVM != null) {
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel
                    tampilanKotakMasukVMTampilanKotakMasukModel = tampilanKotakMasukVM.getTampilanKotakMasukModel();
                }
                updateLiveDataRegistration(0, tampilanKotakMasukVMTampilanKotakMasukModel);


                if (tampilanKotakMasukVMTampilanKotakMasukModel != null) {
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel.getValue()
                    tampilanKotakMasukVMTampilanKotakMasukModelGetValue = tampilanKotakMasukVMTampilanKotakMasukModel.getValue();
                }


                if (tampilanKotakMasukVMTampilanKotakMasukModelGetValue != null) {
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel.getValue().txtAntrian4
                    tampilanKotakMasukVMTampilanKotakMasukModelTxtAntrian4 = tampilanKotakMasukVMTampilanKotakMasukModelGetValue.getTxtAntrian4();
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel.getValue().txtReservasi
                    tampilanKotakMasukVMTampilanKotakMasukModelTxtReservasi = tampilanKotakMasukVMTampilanKotakMasukModelGetValue.getTxtReservasi();
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel.getValue().txtKotakMasuk1
                    tampilanKotakMasukVMTampilanKotakMasukModelTxtKotakMasuk1 = tampilanKotakMasukVMTampilanKotakMasukModelGetValue.getTxtKotakMasuk1();
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel.getValue().txtBeranda
                    tampilanKotakMasukVMTampilanKotakMasukModelTxtBeranda = tampilanKotakMasukVMTampilanKotakMasukModelGetValue.getTxtBeranda();
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel.getValue().txtDRDrSYAHRUL
                    tampilanKotakMasukVMTampilanKotakMasukModelTxtDRDrSYAHRUL = tampilanKotakMasukVMTampilanKotakMasukModelGetValue.getTxtDRDrSYAHRUL();
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel.getValue().txtKotakMasuk
                    tampilanKotakMasukVMTampilanKotakMasukModelTxtKotakMasuk = tampilanKotakMasukVMTampilanKotakMasukModelGetValue.getTxtKotakMasuk();
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel.getValue().txtReservasi1
                    tampilanKotakMasukVMTampilanKotakMasukModelTxtReservasi1 = tampilanKotakMasukVMTampilanKotakMasukModelGetValue.getTxtReservasi1();
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel.getValue().txtReDoc
                    tampilanKotakMasukVMTampilanKotakMasukModelTxtReDoc = tampilanKotakMasukVMTampilanKotakMasukModelGetValue.getTxtReDoc();
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel.getValue().txt15Maret
                    tampilanKotakMasukVMTampilanKotakMasukModelTxt15Maret = tampilanKotakMasukVMTampilanKotakMasukModelGetValue.getTxt15Maret();
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel.getValue().txtCempakaLima
                    tampilanKotakMasukVMTampilanKotakMasukModelTxtCempakaLima = tampilanKotakMasukVMTampilanKotakMasukModelGetValue.getTxtCempakaLima();
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel.getValue().txt1800WIB
                    tampilanKotakMasukVMTampilanKotakMasukModelTxt1800WIB = tampilanKotakMasukVMTampilanKotakMasukModelGetValue.getTxt1800WIB();
                    // read tampilanKotakMasukVM.tampilanKotakMasukModel.getValue().txtAkunSaya
                    tampilanKotakMasukVMTampilanKotakMasukModelTxtAkunSaya = tampilanKotakMasukVMTampilanKotakMasukModelGetValue.getTxtAkunSaya();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt15Maret, tampilanKotakMasukVMTampilanKotakMasukModelTxt15Maret);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt1800WIB, tampilanKotakMasukVMTampilanKotakMasukModelTxt1800WIB);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkunSaya, tampilanKotakMasukVMTampilanKotakMasukModelTxtAkunSaya);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAntrian4, tampilanKotakMasukVMTampilanKotakMasukModelTxtAntrian4);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeranda, tampilanKotakMasukVMTampilanKotakMasukModelTxtBeranda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCempakaLima, tampilanKotakMasukVMTampilanKotakMasukModelTxtCempakaLima);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDRDrSYAHRUL, tampilanKotakMasukVMTampilanKotakMasukModelTxtDRDrSYAHRUL);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKotakMasuk, tampilanKotakMasukVMTampilanKotakMasukModelTxtKotakMasuk);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKotakMasuk1, tampilanKotakMasukVMTampilanKotakMasukModelTxtKotakMasuk1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReDoc, tampilanKotakMasukVMTampilanKotakMasukModelTxtReDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReservasi, tampilanKotakMasukVMTampilanKotakMasukModelTxtReservasi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReservasi1, tampilanKotakMasukVMTampilanKotakMasukModelTxtReservasi1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanKotakMasukVM.tampilanKotakMasukModel
        flag 1 (0x2L): tampilanKotakMasukVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}