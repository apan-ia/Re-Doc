package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTampilanMenuBindingImpl extends ActivityTampilanMenuBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearBarAtas, 16);
        sViewsWithIds.put(R.id.toolbarToolbar, 17);
        sViewsWithIds.put(R.id.linearGroup290, 18);
        sViewsWithIds.put(R.id.imageVector, 19);
        sViewsWithIds.put(R.id.scrollViewScrollview, 20);
        sViewsWithIds.put(R.id.linearGroup297, 21);
        sViewsWithIds.put(R.id.linearGroup294, 22);
        sViewsWithIds.put(R.id.linearCatagories, 23);
        sViewsWithIds.put(R.id.linearCatagoriessec, 24);
        sViewsWithIds.put(R.id.linearGroup58, 25);
        sViewsWithIds.put(R.id.imageImage2, 26);
        sViewsWithIds.put(R.id.linearGroup62, 27);
        sViewsWithIds.put(R.id.imageImage3, 28);
        sViewsWithIds.put(R.id.linearGroup292, 29);
        sViewsWithIds.put(R.id.imageImage4, 30);
        sViewsWithIds.put(R.id.linearGroup293, 31);
        sViewsWithIds.put(R.id.linearTopdoc, 32);
        sViewsWithIds.put(R.id.linearBarBawah, 33);
        sViewsWithIds.put(R.id.linearGroup304, 34);
        sViewsWithIds.put(R.id.linearGroup302, 35);
        sViewsWithIds.put(R.id.imageHomer, 36);
        sViewsWithIds.put(R.id.imageClipboardr, 37);
        sViewsWithIds.put(R.id.imageEmailr, 38);
        sViewsWithIds.put(R.id.imageUserr, 39);
        sViewsWithIds.put(R.id.linearGroup303, 40);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etSearchandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of tampilanMenuVM.tampilanMenuModel.getValue().etSearchValue
            //         is tampilanMenuVM.tampilanMenuModel.getValue().setEtSearchValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etSearch);
            // localize variables for thread safety
            // tampilanMenuVM.tampilanMenuModel != null
            boolean tampilanMenuVMTampilanMenuModelJavaLangObjectNull = false;
            // tampilanMenuVM.tampilanMenuModel.getValue().etSearchValue
            java.lang.String tampilanMenuVMTampilanMenuModelEtSearchValue = null;
            // tampilanMenuVM.tampilanMenuModel.getValue() != null
            boolean tampilanMenuVMTampilanMenuModelGetValueJavaLangObjectNull = false;
            // tampilanMenuVM
            com.application.app.modules.tampilanmenu.data.viewmodel.TampilanMenuVM tampilanMenuVM = mTampilanMenuVM;
            // tampilanMenuVM.tampilanMenuModel
            androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanmenu.data.model.TampilanMenuModel> tampilanMenuVMTampilanMenuModel = null;
            // tampilanMenuVM.tampilanMenuModel.getValue()
            com.application.app.modules.tampilanmenu.data.model.TampilanMenuModel tampilanMenuVMTampilanMenuModelGetValue = null;
            // tampilanMenuVM != null
            boolean tampilanMenuVMJavaLangObjectNull = false;



            tampilanMenuVMJavaLangObjectNull = (tampilanMenuVM) != (null);
            if (tampilanMenuVMJavaLangObjectNull) {


                tampilanMenuVMTampilanMenuModel = tampilanMenuVM.getTampilanMenuModel();

                tampilanMenuVMTampilanMenuModelJavaLangObjectNull = (tampilanMenuVMTampilanMenuModel) != (null);
                if (tampilanMenuVMTampilanMenuModelJavaLangObjectNull) {


                    tampilanMenuVMTampilanMenuModelGetValue = tampilanMenuVMTampilanMenuModel.getValue();

                    tampilanMenuVMTampilanMenuModelGetValueJavaLangObjectNull = (tampilanMenuVMTampilanMenuModelGetValue) != (null);
                    if (tampilanMenuVMTampilanMenuModelGetValueJavaLangObjectNull) {




                        tampilanMenuVMTampilanMenuModelGetValue.setEtSearchValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityTampilanMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 41, sIncludes, sViewsWithIds));
    }
    private ActivityTampilanMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[3]
            , (android.widget.ImageView) bindings[37]
            , (android.widget.ImageView) bindings[38]
            , (android.widget.ImageView) bindings[36]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[39]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[35]
            , (android.widget.LinearLayout) bindings[40]
            , (android.widget.LinearLayout) bindings[34]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[32]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (androidx.core.widget.NestedScrollView) bindings[20]
            , (androidx.appcompat.widget.Toolbar) bindings[17]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            );
        this.etSearch.setTag(null);
        this.linearGroup307.setTag(null);
        this.recyclerTampilanMenu.setTag(null);
        this.txtAkunSaya.setTag(null);
        this.txtBeranda.setTag(null);
        this.txtGigi.setTag(null);
        this.txtJantung.setTag(null);
        this.txtKategori.setTag(null);
        this.txtKotakMasuk.setTag(null);
        this.txtReDoc.setTag(null);
        this.txtRekomendasi.setTag(null);
        this.txtReservasi.setTag(null);
        this.txtSeeAll.setTag(null);
        this.txtSeeAll1.setTag(null);
        this.txtSegeraReservas.setTag(null);
        this.txtTulang.setTag(null);
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
        if (BR.tampilanMenuVM == variableId) {
            setTampilanMenuVM((com.application.app.modules.tampilanmenu.data.viewmodel.TampilanMenuVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanMenuVM(@Nullable com.application.app.modules.tampilanmenu.data.viewmodel.TampilanMenuVM TampilanMenuVM) {
        this.mTampilanMenuVM = TampilanMenuVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanMenuVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanMenuVMTampilanMenuModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanmenu.data.model.TampilanMenuModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanMenuVMTampilanMenuModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanmenu.data.model.TampilanMenuModel> TampilanMenuVMTampilanMenuModel, int fieldId) {
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
        java.lang.String tampilanMenuVMTampilanMenuModelEtSearchValue = null;
        com.application.app.modules.tampilanmenu.data.viewmodel.TampilanMenuVM tampilanMenuVM = mTampilanMenuVM;
        java.lang.String tampilanMenuVMTampilanMenuModelTxtRekomendasi = null;
        java.lang.String tampilanMenuVMTampilanMenuModelTxtGigi = null;
        java.lang.String tampilanMenuVMTampilanMenuModelTxtKategori = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanmenu.data.model.TampilanMenuModel> tampilanMenuVMTampilanMenuModel = null;
        com.application.app.modules.tampilanmenu.data.model.TampilanMenuModel tampilanMenuVMTampilanMenuModelGetValue = null;
        java.lang.String tampilanMenuVMTampilanMenuModelTxtAkunSaya = null;
        java.lang.String tampilanMenuVMTampilanMenuModelTxtTulang = null;
        java.lang.String tampilanMenuVMTampilanMenuModelTxtReservasi = null;
        java.lang.String tampilanMenuVMTampilanMenuModelTxtReDoc = null;
        java.lang.String tampilanMenuVMTampilanMenuModelTxtSeeAll = null;
        java.lang.String tampilanMenuVMTampilanMenuModelTxtJantung = null;
        java.lang.String tampilanMenuVMTampilanMenuModelTxtBeranda = null;
        java.lang.String tampilanMenuVMTampilanMenuModelTxtSegeraReservas = null;
        java.lang.String tampilanMenuVMTampilanMenuModelTxtSeeAll1 = null;
        java.lang.String tampilanMenuVMTampilanMenuModelTxtKotakMasuk = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanMenuVM != null) {
                    // read tampilanMenuVM.tampilanMenuModel
                    tampilanMenuVMTampilanMenuModel = tampilanMenuVM.getTampilanMenuModel();
                }
                updateLiveDataRegistration(0, tampilanMenuVMTampilanMenuModel);


                if (tampilanMenuVMTampilanMenuModel != null) {
                    // read tampilanMenuVM.tampilanMenuModel.getValue()
                    tampilanMenuVMTampilanMenuModelGetValue = tampilanMenuVMTampilanMenuModel.getValue();
                }


                if (tampilanMenuVMTampilanMenuModelGetValue != null) {
                    // read tampilanMenuVM.tampilanMenuModel.getValue().etSearchValue
                    tampilanMenuVMTampilanMenuModelEtSearchValue = tampilanMenuVMTampilanMenuModelGetValue.getEtSearchValue();
                    // read tampilanMenuVM.tampilanMenuModel.getValue().txtRekomendasi
                    tampilanMenuVMTampilanMenuModelTxtRekomendasi = tampilanMenuVMTampilanMenuModelGetValue.getTxtRekomendasi();
                    // read tampilanMenuVM.tampilanMenuModel.getValue().txtGigi
                    tampilanMenuVMTampilanMenuModelTxtGigi = tampilanMenuVMTampilanMenuModelGetValue.getTxtGigi();
                    // read tampilanMenuVM.tampilanMenuModel.getValue().txtKategori
                    tampilanMenuVMTampilanMenuModelTxtKategori = tampilanMenuVMTampilanMenuModelGetValue.getTxtKategori();
                    // read tampilanMenuVM.tampilanMenuModel.getValue().txtAkunSaya
                    tampilanMenuVMTampilanMenuModelTxtAkunSaya = tampilanMenuVMTampilanMenuModelGetValue.getTxtAkunSaya();
                    // read tampilanMenuVM.tampilanMenuModel.getValue().txtTulang
                    tampilanMenuVMTampilanMenuModelTxtTulang = tampilanMenuVMTampilanMenuModelGetValue.getTxtTulang();
                    // read tampilanMenuVM.tampilanMenuModel.getValue().txtReservasi
                    tampilanMenuVMTampilanMenuModelTxtReservasi = tampilanMenuVMTampilanMenuModelGetValue.getTxtReservasi();
                    // read tampilanMenuVM.tampilanMenuModel.getValue().txtReDoc
                    tampilanMenuVMTampilanMenuModelTxtReDoc = tampilanMenuVMTampilanMenuModelGetValue.getTxtReDoc();
                    // read tampilanMenuVM.tampilanMenuModel.getValue().txtSeeAll
                    tampilanMenuVMTampilanMenuModelTxtSeeAll = tampilanMenuVMTampilanMenuModelGetValue.getTxtSeeAll();
                    // read tampilanMenuVM.tampilanMenuModel.getValue().txtJantung
                    tampilanMenuVMTampilanMenuModelTxtJantung = tampilanMenuVMTampilanMenuModelGetValue.getTxtJantung();
                    // read tampilanMenuVM.tampilanMenuModel.getValue().txtBeranda
                    tampilanMenuVMTampilanMenuModelTxtBeranda = tampilanMenuVMTampilanMenuModelGetValue.getTxtBeranda();
                    // read tampilanMenuVM.tampilanMenuModel.getValue().txtSegeraReservas
                    tampilanMenuVMTampilanMenuModelTxtSegeraReservas = tampilanMenuVMTampilanMenuModelGetValue.getTxtSegeraReservas();
                    // read tampilanMenuVM.tampilanMenuModel.getValue().txtSeeAll1
                    tampilanMenuVMTampilanMenuModelTxtSeeAll1 = tampilanMenuVMTampilanMenuModelGetValue.getTxtSeeAll1();
                    // read tampilanMenuVM.tampilanMenuModel.getValue().txtKotakMasuk
                    tampilanMenuVMTampilanMenuModelTxtKotakMasuk = tampilanMenuVMTampilanMenuModelGetValue.getTxtKotakMasuk();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etSearch, tampilanMenuVMTampilanMenuModelEtSearchValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkunSaya, tampilanMenuVMTampilanMenuModelTxtAkunSaya);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeranda, tampilanMenuVMTampilanMenuModelTxtBeranda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGigi, tampilanMenuVMTampilanMenuModelTxtGigi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtJantung, tampilanMenuVMTampilanMenuModelTxtJantung);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKategori, tampilanMenuVMTampilanMenuModelTxtKategori);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKotakMasuk, tampilanMenuVMTampilanMenuModelTxtKotakMasuk);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReDoc, tampilanMenuVMTampilanMenuModelTxtReDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRekomendasi, tampilanMenuVMTampilanMenuModelTxtRekomendasi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReservasi, tampilanMenuVMTampilanMenuModelTxtReservasi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSeeAll, tampilanMenuVMTampilanMenuModelTxtSeeAll);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSeeAll1, tampilanMenuVMTampilanMenuModelTxtSeeAll1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSegeraReservas, tampilanMenuVMTampilanMenuModelTxtSegeraReservas);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTulang, tampilanMenuVMTampilanMenuModelTxtTulang);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etSearch, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etSearchandroidTextAttrChanged);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerTampilanMenu, recyclerTampilanMenu.getResources().getDimension(R.dimen._15pxh), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanMenuVM.tampilanMenuModel
        flag 1 (0x2L): tampilanMenuVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}