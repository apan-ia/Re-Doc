package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTampilanDaftarBindingImpl extends ActivityTampilanDaftarBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearGroup313, 14);
        sViewsWithIds.put(R.id.linearBarAtas, 15);
        sViewsWithIds.put(R.id.toolbarToolbar, 16);
        sViewsWithIds.put(R.id.linearGroup309, 17);
        sViewsWithIds.put(R.id.imageVector, 18);
        sViewsWithIds.put(R.id.frameGroup317, 19);
        sViewsWithIds.put(R.id.imageGroup, 20);
        sViewsWithIds.put(R.id.frameGroup319, 21);
        sViewsWithIds.put(R.id.linearUserloginSec, 22);
        sViewsWithIds.put(R.id.linearUsername, 23);
        sViewsWithIds.put(R.id.linearEmailsec, 24);
        sViewsWithIds.put(R.id.linearAlamat, 25);
        sViewsWithIds.put(R.id.linearWorkingplace, 26);
        sViewsWithIds.put(R.id.linearWorkingplace1, 27);
        sViewsWithIds.put(R.id.btnDaftar, 28);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etAlamatDomisiliandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of tampilanDaftarVM.tampilanDaftarModel.getValue().etAlamatDomisiliValue
            //         is tampilanDaftarVM.tampilanDaftarModel.getValue().setEtAlamatDomisiliValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etAlamatDomisili);
            // localize variables for thread safety
            // tampilanDaftarVM.tampilanDaftarModel.getValue() != null
            boolean tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull = false;
            // tampilanDaftarVM != null
            boolean tampilanDaftarVMJavaLangObjectNull = false;
            // tampilanDaftarVM
            com.application.app.modules.tampilandaftar.data.viewmodel.TampilanDaftarVM tampilanDaftarVM = mTampilanDaftarVM;
            // tampilanDaftarVM.tampilanDaftarModel != null
            boolean tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull = false;
            // tampilanDaftarVM.tampilanDaftarModel.getValue().etAlamatDomisiliValue
            java.lang.String tampilanDaftarVMTampilanDaftarModelEtAlamatDomisiliValue = null;
            // tampilanDaftarVM.tampilanDaftarModel
            androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel> tampilanDaftarVMTampilanDaftarModel = null;
            // tampilanDaftarVM.tampilanDaftarModel.getValue()
            com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel tampilanDaftarVMTampilanDaftarModelGetValue = null;



            tampilanDaftarVMJavaLangObjectNull = (tampilanDaftarVM) != (null);
            if (tampilanDaftarVMJavaLangObjectNull) {


                tampilanDaftarVMTampilanDaftarModel = tampilanDaftarVM.getTampilanDaftarModel();

                tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull = (tampilanDaftarVMTampilanDaftarModel) != (null);
                if (tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull) {


                    tampilanDaftarVMTampilanDaftarModelGetValue = tampilanDaftarVMTampilanDaftarModel.getValue();

                    tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull = (tampilanDaftarVMTampilanDaftarModelGetValue) != (null);
                    if (tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull) {




                        tampilanDaftarVMTampilanDaftarModelGetValue.setEtAlamatDomisiliValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etMasukkanEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of tampilanDaftarVM.tampilanDaftarModel.getValue().etMasukkanEmailValue
            //         is tampilanDaftarVM.tampilanDaftarModel.getValue().setEtMasukkanEmailValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etMasukkanEmail);
            // localize variables for thread safety
            // tampilanDaftarVM.tampilanDaftarModel.getValue() != null
            boolean tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull = false;
            // tampilanDaftarVM.tampilanDaftarModel.getValue().etMasukkanEmailValue
            java.lang.String tampilanDaftarVMTampilanDaftarModelEtMasukkanEmailValue = null;
            // tampilanDaftarVM != null
            boolean tampilanDaftarVMJavaLangObjectNull = false;
            // tampilanDaftarVM
            com.application.app.modules.tampilandaftar.data.viewmodel.TampilanDaftarVM tampilanDaftarVM = mTampilanDaftarVM;
            // tampilanDaftarVM.tampilanDaftarModel != null
            boolean tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull = false;
            // tampilanDaftarVM.tampilanDaftarModel
            androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel> tampilanDaftarVMTampilanDaftarModel = null;
            // tampilanDaftarVM.tampilanDaftarModel.getValue()
            com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel tampilanDaftarVMTampilanDaftarModelGetValue = null;



            tampilanDaftarVMJavaLangObjectNull = (tampilanDaftarVM) != (null);
            if (tampilanDaftarVMJavaLangObjectNull) {


                tampilanDaftarVMTampilanDaftarModel = tampilanDaftarVM.getTampilanDaftarModel();

                tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull = (tampilanDaftarVMTampilanDaftarModel) != (null);
                if (tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull) {


                    tampilanDaftarVMTampilanDaftarModelGetValue = tampilanDaftarVMTampilanDaftarModel.getValue();

                    tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull = (tampilanDaftarVMTampilanDaftarModelGetValue) != (null);
                    if (tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull) {




                        tampilanDaftarVMTampilanDaftarModelGetValue.setEtMasukkanEmailValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etMasukkanUsernaandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of tampilanDaftarVM.tampilanDaftarModel.getValue().etMasukkanUsernaValue
            //         is tampilanDaftarVM.tampilanDaftarModel.getValue().setEtMasukkanUsernaValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etMasukkanUserna);
            // localize variables for thread safety
            // tampilanDaftarVM.tampilanDaftarModel.getValue() != null
            boolean tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull = false;
            // tampilanDaftarVM.tampilanDaftarModel.getValue().etMasukkanUsernaValue
            java.lang.String tampilanDaftarVMTampilanDaftarModelEtMasukkanUsernaValue = null;
            // tampilanDaftarVM != null
            boolean tampilanDaftarVMJavaLangObjectNull = false;
            // tampilanDaftarVM
            com.application.app.modules.tampilandaftar.data.viewmodel.TampilanDaftarVM tampilanDaftarVM = mTampilanDaftarVM;
            // tampilanDaftarVM.tampilanDaftarModel != null
            boolean tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull = false;
            // tampilanDaftarVM.tampilanDaftarModel
            androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel> tampilanDaftarVMTampilanDaftarModel = null;
            // tampilanDaftarVM.tampilanDaftarModel.getValue()
            com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel tampilanDaftarVMTampilanDaftarModelGetValue = null;



            tampilanDaftarVMJavaLangObjectNull = (tampilanDaftarVM) != (null);
            if (tampilanDaftarVMJavaLangObjectNull) {


                tampilanDaftarVMTampilanDaftarModel = tampilanDaftarVM.getTampilanDaftarModel();

                tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull = (tampilanDaftarVMTampilanDaftarModel) != (null);
                if (tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull) {


                    tampilanDaftarVMTampilanDaftarModelGetValue = tampilanDaftarVMTampilanDaftarModel.getValue();

                    tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull = (tampilanDaftarVMTampilanDaftarModelGetValue) != (null);
                    if (tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull) {




                        tampilanDaftarVMTampilanDaftarModelGetValue.setEtMasukkanUsernaValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etNoHpandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of tampilanDaftarVM.tampilanDaftarModel.getValue().etNoHpValue
            //         is tampilanDaftarVM.tampilanDaftarModel.getValue().setEtNoHpValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etNoHp);
            // localize variables for thread safety
            // tampilanDaftarVM.tampilanDaftarModel.getValue().etNoHpValue
            java.lang.String tampilanDaftarVMTampilanDaftarModelEtNoHpValue = null;
            // tampilanDaftarVM.tampilanDaftarModel.getValue() != null
            boolean tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull = false;
            // tampilanDaftarVM != null
            boolean tampilanDaftarVMJavaLangObjectNull = false;
            // tampilanDaftarVM
            com.application.app.modules.tampilandaftar.data.viewmodel.TampilanDaftarVM tampilanDaftarVM = mTampilanDaftarVM;
            // tampilanDaftarVM.tampilanDaftarModel != null
            boolean tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull = false;
            // tampilanDaftarVM.tampilanDaftarModel
            androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel> tampilanDaftarVMTampilanDaftarModel = null;
            // tampilanDaftarVM.tampilanDaftarModel.getValue()
            com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel tampilanDaftarVMTampilanDaftarModelGetValue = null;



            tampilanDaftarVMJavaLangObjectNull = (tampilanDaftarVM) != (null);
            if (tampilanDaftarVMJavaLangObjectNull) {


                tampilanDaftarVMTampilanDaftarModel = tampilanDaftarVM.getTampilanDaftarModel();

                tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull = (tampilanDaftarVMTampilanDaftarModel) != (null);
                if (tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull) {


                    tampilanDaftarVMTampilanDaftarModelGetValue = tampilanDaftarVMTampilanDaftarModel.getValue();

                    tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull = (tampilanDaftarVMTampilanDaftarModelGetValue) != (null);
                    if (tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull) {




                        tampilanDaftarVMTampilanDaftarModelGetValue.setEtNoHpValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etTanggalLahirandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of tampilanDaftarVM.tampilanDaftarModel.getValue().etTanggalLahirValue
            //         is tampilanDaftarVM.tampilanDaftarModel.getValue().setEtTanggalLahirValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etTanggalLahir);
            // localize variables for thread safety
            // tampilanDaftarVM.tampilanDaftarModel.getValue() != null
            boolean tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull = false;
            // tampilanDaftarVM != null
            boolean tampilanDaftarVMJavaLangObjectNull = false;
            // tampilanDaftarVM
            com.application.app.modules.tampilandaftar.data.viewmodel.TampilanDaftarVM tampilanDaftarVM = mTampilanDaftarVM;
            // tampilanDaftarVM.tampilanDaftarModel != null
            boolean tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull = false;
            // tampilanDaftarVM.tampilanDaftarModel.getValue().etTanggalLahirValue
            java.lang.String tampilanDaftarVMTampilanDaftarModelEtTanggalLahirValue = null;
            // tampilanDaftarVM.tampilanDaftarModel
            androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel> tampilanDaftarVMTampilanDaftarModel = null;
            // tampilanDaftarVM.tampilanDaftarModel.getValue()
            com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel tampilanDaftarVMTampilanDaftarModelGetValue = null;



            tampilanDaftarVMJavaLangObjectNull = (tampilanDaftarVM) != (null);
            if (tampilanDaftarVMJavaLangObjectNull) {


                tampilanDaftarVMTampilanDaftarModel = tampilanDaftarVM.getTampilanDaftarModel();

                tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull = (tampilanDaftarVMTampilanDaftarModel) != (null);
                if (tampilanDaftarVMTampilanDaftarModelJavaLangObjectNull) {


                    tampilanDaftarVMTampilanDaftarModelGetValue = tampilanDaftarVMTampilanDaftarModel.getValue();

                    tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull = (tampilanDaftarVMTampilanDaftarModelGetValue) != (null);
                    if (tampilanDaftarVMTampilanDaftarModelGetValueJavaLangObjectNull) {




                        tampilanDaftarVMTampilanDaftarModelGetValue.setEtTanggalLahirValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityTampilanDaftarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private ActivityTampilanDaftarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[28]
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[13]
            , (android.widget.EditText) bindings[11]
            , (android.widget.FrameLayout) bindings[19]
            , (android.widget.FrameLayout) bindings[21]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[27]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (androidx.appcompat.widget.Toolbar) bindings[16]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[3]
            );
        this.etAlamatDomisili.setTag(null);
        this.etMasukkanEmail.setTag(null);
        this.etMasukkanUserna.setTag(null);
        this.etNoHp.setTag(null);
        this.etTanggalLahir.setTag(null);
        this.linearTampilanDaftar.setTag(null);
        this.recyclerTampilanDaftar.setTag(null);
        this.txtAlamat.setTag(null);
        this.txtEmail.setTag(null);
        this.txtNoHp.setTag(null);
        this.txtReDoc.setTag(null);
        this.txtSilakanMendaft.setTag(null);
        this.txtTanggalLahir.setTag(null);
        this.txtUsername.setTag(null);
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
        if (BR.tampilanDaftarVM == variableId) {
            setTampilanDaftarVM((com.application.app.modules.tampilandaftar.data.viewmodel.TampilanDaftarVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanDaftarVM(@Nullable com.application.app.modules.tampilandaftar.data.viewmodel.TampilanDaftarVM TampilanDaftarVM) {
        this.mTampilanDaftarVM = TampilanDaftarVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanDaftarVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanDaftarVMTampilanDaftarModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanDaftarVMTampilanDaftarModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel> TampilanDaftarVMTampilanDaftarModel, int fieldId) {
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
        java.lang.String tampilanDaftarVMTampilanDaftarModelTxtTanggalLahir = null;
        java.lang.String tampilanDaftarVMTampilanDaftarModelEtAlamatDomisiliValue = null;
        java.lang.String tampilanDaftarVMTampilanDaftarModelTxtAlamat = null;
        java.lang.String tampilanDaftarVMTampilanDaftarModelTxtSilakanMendaft = null;
        java.lang.String tampilanDaftarVMTampilanDaftarModelTxtNoHp = null;
        java.lang.String tampilanDaftarVMTampilanDaftarModelEtTanggalLahirValue = null;
        java.lang.String tampilanDaftarVMTampilanDaftarModelEtNoHpValue = null;
        java.lang.String tampilanDaftarVMTampilanDaftarModelEtMasukkanUsernaValue = null;
        java.lang.String tampilanDaftarVMTampilanDaftarModelEtMasukkanEmailValue = null;
        java.lang.String tampilanDaftarVMTampilanDaftarModelTxtUsername = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel> tampilanDaftarVMTampilanDaftarModel = null;
        com.application.app.modules.tampilandaftar.data.model.TampilanDaftarModel tampilanDaftarVMTampilanDaftarModelGetValue = null;
        java.lang.String tampilanDaftarVMTampilanDaftarModelTxtReDoc = null;
        com.application.app.modules.tampilandaftar.data.viewmodel.TampilanDaftarVM tampilanDaftarVM = mTampilanDaftarVM;
        java.lang.String tampilanDaftarVMTampilanDaftarModelTxtEmail = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanDaftarVM != null) {
                    // read tampilanDaftarVM.tampilanDaftarModel
                    tampilanDaftarVMTampilanDaftarModel = tampilanDaftarVM.getTampilanDaftarModel();
                }
                updateLiveDataRegistration(0, tampilanDaftarVMTampilanDaftarModel);


                if (tampilanDaftarVMTampilanDaftarModel != null) {
                    // read tampilanDaftarVM.tampilanDaftarModel.getValue()
                    tampilanDaftarVMTampilanDaftarModelGetValue = tampilanDaftarVMTampilanDaftarModel.getValue();
                }


                if (tampilanDaftarVMTampilanDaftarModelGetValue != null) {
                    // read tampilanDaftarVM.tampilanDaftarModel.getValue().txtTanggalLahir
                    tampilanDaftarVMTampilanDaftarModelTxtTanggalLahir = tampilanDaftarVMTampilanDaftarModelGetValue.getTxtTanggalLahir();
                    // read tampilanDaftarVM.tampilanDaftarModel.getValue().etAlamatDomisiliValue
                    tampilanDaftarVMTampilanDaftarModelEtAlamatDomisiliValue = tampilanDaftarVMTampilanDaftarModelGetValue.getEtAlamatDomisiliValue();
                    // read tampilanDaftarVM.tampilanDaftarModel.getValue().txtAlamat
                    tampilanDaftarVMTampilanDaftarModelTxtAlamat = tampilanDaftarVMTampilanDaftarModelGetValue.getTxtAlamat();
                    // read tampilanDaftarVM.tampilanDaftarModel.getValue().txtSilakanMendaft
                    tampilanDaftarVMTampilanDaftarModelTxtSilakanMendaft = tampilanDaftarVMTampilanDaftarModelGetValue.getTxtSilakanMendaft();
                    // read tampilanDaftarVM.tampilanDaftarModel.getValue().txtNoHp
                    tampilanDaftarVMTampilanDaftarModelTxtNoHp = tampilanDaftarVMTampilanDaftarModelGetValue.getTxtNoHp();
                    // read tampilanDaftarVM.tampilanDaftarModel.getValue().etTanggalLahirValue
                    tampilanDaftarVMTampilanDaftarModelEtTanggalLahirValue = tampilanDaftarVMTampilanDaftarModelGetValue.getEtTanggalLahirValue();
                    // read tampilanDaftarVM.tampilanDaftarModel.getValue().etNoHpValue
                    tampilanDaftarVMTampilanDaftarModelEtNoHpValue = tampilanDaftarVMTampilanDaftarModelGetValue.getEtNoHpValue();
                    // read tampilanDaftarVM.tampilanDaftarModel.getValue().etMasukkanUsernaValue
                    tampilanDaftarVMTampilanDaftarModelEtMasukkanUsernaValue = tampilanDaftarVMTampilanDaftarModelGetValue.getEtMasukkanUsernaValue();
                    // read tampilanDaftarVM.tampilanDaftarModel.getValue().etMasukkanEmailValue
                    tampilanDaftarVMTampilanDaftarModelEtMasukkanEmailValue = tampilanDaftarVMTampilanDaftarModelGetValue.getEtMasukkanEmailValue();
                    // read tampilanDaftarVM.tampilanDaftarModel.getValue().txtUsername
                    tampilanDaftarVMTampilanDaftarModelTxtUsername = tampilanDaftarVMTampilanDaftarModelGetValue.getTxtUsername();
                    // read tampilanDaftarVM.tampilanDaftarModel.getValue().txtReDoc
                    tampilanDaftarVMTampilanDaftarModelTxtReDoc = tampilanDaftarVMTampilanDaftarModelGetValue.getTxtReDoc();
                    // read tampilanDaftarVM.tampilanDaftarModel.getValue().txtEmail
                    tampilanDaftarVMTampilanDaftarModelTxtEmail = tampilanDaftarVMTampilanDaftarModelGetValue.getTxtEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etAlamatDomisili, tampilanDaftarVMTampilanDaftarModelEtAlamatDomisiliValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etMasukkanEmail, tampilanDaftarVMTampilanDaftarModelEtMasukkanEmailValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etMasukkanUserna, tampilanDaftarVMTampilanDaftarModelEtMasukkanUsernaValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etNoHp, tampilanDaftarVMTampilanDaftarModelEtNoHpValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etTanggalLahir, tampilanDaftarVMTampilanDaftarModelEtTanggalLahirValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAlamat, tampilanDaftarVMTampilanDaftarModelTxtAlamat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmail, tampilanDaftarVMTampilanDaftarModelTxtEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNoHp, tampilanDaftarVMTampilanDaftarModelTxtNoHp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReDoc, tampilanDaftarVMTampilanDaftarModelTxtReDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSilakanMendaft, tampilanDaftarVMTampilanDaftarModelTxtSilakanMendaft);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTanggalLahir, tampilanDaftarVMTampilanDaftarModelTxtTanggalLahir);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUsername, tampilanDaftarVMTampilanDaftarModelTxtUsername);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etAlamatDomisili, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etAlamatDomisiliandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etMasukkanEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etMasukkanEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etMasukkanUserna, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etMasukkanUsernaandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etNoHp, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNoHpandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etTanggalLahir, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etTanggalLahirandroidTextAttrChanged);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerTampilanDaftar, recyclerTampilanDaftar.getResources().getDimension(R.dimen._2pxh), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanDaftarVM.tampilanDaftarModel
        flag 1 (0x2L): tampilanDaftarVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}