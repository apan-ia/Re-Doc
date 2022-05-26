package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTampilanMasukBindingImpl extends ActivityTampilanMasukBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearBarAtas, 10);
        sViewsWithIds.put(R.id.linearBarAtas1, 11);
        sViewsWithIds.put(R.id.toolbarToolbar, 12);
        sViewsWithIds.put(R.id.linearGroup324, 13);
        sViewsWithIds.put(R.id.imageVector, 14);
        sViewsWithIds.put(R.id.linearSignup, 15);
        sViewsWithIds.put(R.id.linearLogin, 16);
        sViewsWithIds.put(R.id.linearUsername, 17);
        sViewsWithIds.put(R.id.linearPassword, 18);
        sViewsWithIds.put(R.id.linearGroup325, 19);
        sViewsWithIds.put(R.id.linearGroup327, 20);
        sViewsWithIds.put(R.id.imageVector1, 21);
        sViewsWithIds.put(R.id.imageGroup9, 22);
        sViewsWithIds.put(R.id.linearForgotsection, 23);
        sViewsWithIds.put(R.id.checkBoxGroup47, 24);
        sViewsWithIds.put(R.id.btnMasuk, 25);
        sViewsWithIds.put(R.id.linearBottomsec, 26);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of tampilanMasukVM.tampilanMasukModel.getValue().etUsernameValue
            //         is tampilanMasukVM.tampilanMasukModel.getValue().setEtUsernameValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etUsername);
            // localize variables for thread safety
            // tampilanMasukVM.tampilanMasukModel != null
            boolean tampilanMasukVMTampilanMasukModelJavaLangObjectNull = false;
            // tampilanMasukVM.tampilanMasukModel.getValue()
            com.application.app.modules.tampilanmasuk.data.model.TampilanMasukModel tampilanMasukVMTampilanMasukModelGetValue = null;
            // tampilanMasukVM != null
            boolean tampilanMasukVMJavaLangObjectNull = false;
            // tampilanMasukVM.tampilanMasukModel
            androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanmasuk.data.model.TampilanMasukModel> tampilanMasukVMTampilanMasukModel = null;
            // tampilanMasukVM
            com.application.app.modules.tampilanmasuk.data.viewmodel.TampilanMasukVM tampilanMasukVM = mTampilanMasukVM;
            // tampilanMasukVM.tampilanMasukModel.getValue() != null
            boolean tampilanMasukVMTampilanMasukModelGetValueJavaLangObjectNull = false;
            // tampilanMasukVM.tampilanMasukModel.getValue().etUsernameValue
            java.lang.String tampilanMasukVMTampilanMasukModelEtUsernameValue = null;



            tampilanMasukVMJavaLangObjectNull = (tampilanMasukVM) != (null);
            if (tampilanMasukVMJavaLangObjectNull) {


                tampilanMasukVMTampilanMasukModel = tampilanMasukVM.getTampilanMasukModel();

                tampilanMasukVMTampilanMasukModelJavaLangObjectNull = (tampilanMasukVMTampilanMasukModel) != (null);
                if (tampilanMasukVMTampilanMasukModelJavaLangObjectNull) {


                    tampilanMasukVMTampilanMasukModelGetValue = tampilanMasukVMTampilanMasukModel.getValue();

                    tampilanMasukVMTampilanMasukModelGetValueJavaLangObjectNull = (tampilanMasukVMTampilanMasukModelGetValue) != (null);
                    if (tampilanMasukVMTampilanMasukModelGetValueJavaLangObjectNull) {




                        tampilanMasukVMTampilanMasukModelGetValue.setEtUsernameValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityTampilanMasukBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private ActivityTampilanMasukBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[25]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[24]
            , (android.widget.EditText) bindings[4]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[17]
            , (androidx.appcompat.widget.Toolbar) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.etUsername.setTag(null);
        this.linearTampilanMasuk.setTag(null);
        this.txt.setTag(null);
        this.txtBelumPunyaAku.setTag(null);
        this.txtDaftar.setTag(null);
        this.txtLupaPassword.setTag(null);
        this.txtPassword.setTag(null);
        this.txtReDoc.setTag(null);
        this.txtSilakanLoginA.setTag(null);
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
        if (BR.tampilanMasukVM == variableId) {
            setTampilanMasukVM((com.application.app.modules.tampilanmasuk.data.viewmodel.TampilanMasukVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanMasukVM(@Nullable com.application.app.modules.tampilanmasuk.data.viewmodel.TampilanMasukVM TampilanMasukVM) {
        this.mTampilanMasukVM = TampilanMasukVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanMasukVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanMasukVMTampilanMasukModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanmasuk.data.model.TampilanMasukModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanMasukVMTampilanMasukModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanmasuk.data.model.TampilanMasukModel> TampilanMasukVMTampilanMasukModel, int fieldId) {
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
        java.lang.String tampilanMasukVMTampilanMasukModelTxtReDoc = null;
        java.lang.String tampilanMasukVMTampilanMasukModelTxtDaftar = null;
        com.application.app.modules.tampilanmasuk.data.model.TampilanMasukModel tampilanMasukVMTampilanMasukModelGetValue = null;
        java.lang.String tampilanMasukVMTampilanMasukModelTxtLupaPassword = null;
        java.lang.String tampilanMasukVMTampilanMasukModelTxtUsername = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanmasuk.data.model.TampilanMasukModel> tampilanMasukVMTampilanMasukModel = null;
        com.application.app.modules.tampilanmasuk.data.viewmodel.TampilanMasukVM tampilanMasukVM = mTampilanMasukVM;
        java.lang.String tampilanMasukVMTampilanMasukModelEtUsernameValue = null;
        java.lang.String tampilanMasukVMTampilanMasukModelTxtPassword = null;
        java.lang.String tampilanMasukVMTampilanMasukModelTxt = null;
        java.lang.String tampilanMasukVMTampilanMasukModelTxtBelumPunyaAku = null;
        java.lang.String tampilanMasukVMTampilanMasukModelTxtSilakanLoginA = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanMasukVM != null) {
                    // read tampilanMasukVM.tampilanMasukModel
                    tampilanMasukVMTampilanMasukModel = tampilanMasukVM.getTampilanMasukModel();
                }
                updateLiveDataRegistration(0, tampilanMasukVMTampilanMasukModel);


                if (tampilanMasukVMTampilanMasukModel != null) {
                    // read tampilanMasukVM.tampilanMasukModel.getValue()
                    tampilanMasukVMTampilanMasukModelGetValue = tampilanMasukVMTampilanMasukModel.getValue();
                }


                if (tampilanMasukVMTampilanMasukModelGetValue != null) {
                    // read tampilanMasukVM.tampilanMasukModel.getValue().txtReDoc
                    tampilanMasukVMTampilanMasukModelTxtReDoc = tampilanMasukVMTampilanMasukModelGetValue.getTxtReDoc();
                    // read tampilanMasukVM.tampilanMasukModel.getValue().txtDaftar
                    tampilanMasukVMTampilanMasukModelTxtDaftar = tampilanMasukVMTampilanMasukModelGetValue.getTxtDaftar();
                    // read tampilanMasukVM.tampilanMasukModel.getValue().txtLupaPassword
                    tampilanMasukVMTampilanMasukModelTxtLupaPassword = tampilanMasukVMTampilanMasukModelGetValue.getTxtLupaPassword();
                    // read tampilanMasukVM.tampilanMasukModel.getValue().txtUsername
                    tampilanMasukVMTampilanMasukModelTxtUsername = tampilanMasukVMTampilanMasukModelGetValue.getTxtUsername();
                    // read tampilanMasukVM.tampilanMasukModel.getValue().etUsernameValue
                    tampilanMasukVMTampilanMasukModelEtUsernameValue = tampilanMasukVMTampilanMasukModelGetValue.getEtUsernameValue();
                    // read tampilanMasukVM.tampilanMasukModel.getValue().txtPassword
                    tampilanMasukVMTampilanMasukModelTxtPassword = tampilanMasukVMTampilanMasukModelGetValue.getTxtPassword();
                    // read tampilanMasukVM.tampilanMasukModel.getValue().txt
                    tampilanMasukVMTampilanMasukModelTxt = tampilanMasukVMTampilanMasukModelGetValue.getTxt();
                    // read tampilanMasukVM.tampilanMasukModel.getValue().txtBelumPunyaAku
                    tampilanMasukVMTampilanMasukModelTxtBelumPunyaAku = tampilanMasukVMTampilanMasukModelGetValue.getTxtBelumPunyaAku();
                    // read tampilanMasukVM.tampilanMasukModel.getValue().txtSilakanLoginA
                    tampilanMasukVMTampilanMasukModelTxtSilakanLoginA = tampilanMasukVMTampilanMasukModelGetValue.getTxtSilakanLoginA();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etUsername, tampilanMasukVMTampilanMasukModelEtUsernameValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt, tampilanMasukVMTampilanMasukModelTxt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBelumPunyaAku, tampilanMasukVMTampilanMasukModelTxtBelumPunyaAku);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDaftar, tampilanMasukVMTampilanMasukModelTxtDaftar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLupaPassword, tampilanMasukVMTampilanMasukModelTxtLupaPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPassword, tampilanMasukVMTampilanMasukModelTxtPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReDoc, tampilanMasukVMTampilanMasukModelTxtReDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSilakanLoginA, tampilanMasukVMTampilanMasukModelTxtSilakanLoginA);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUsername, tampilanMasukVMTampilanMasukModelTxtUsername);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etUsernameandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanMasukVM.tampilanMasukModel
        flag 1 (0x2L): tampilanMasukVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}