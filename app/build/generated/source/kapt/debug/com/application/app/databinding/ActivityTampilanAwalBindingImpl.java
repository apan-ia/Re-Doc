package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTampilanAwalBindingImpl extends ActivityTampilanAwalBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearBarAtas, 4);
        sViewsWithIds.put(R.id.linearBarAtas1, 5);
        sViewsWithIds.put(R.id.toolbarToolbar, 6);
        sViewsWithIds.put(R.id.linearGroup328, 7);
        sViewsWithIds.put(R.id.imageVector, 8);
        sViewsWithIds.put(R.id.btnReservasi, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTampilanAwalBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityTampilanAwalBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.appcompat.widget.Toolbar) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.imageClipdoctorand.setTag(null);
        this.linearTampilanAwal.setTag(null);
        this.txtReDoc.setTag(null);
        this.txtReservasiSeger.setTag(null);
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
        if (BR.tampilanAwalVM == variableId) {
            setTampilanAwalVM((com.application.app.modules.tampilanawal.data.viewmodel.TampilanAwalVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanAwalVM(@Nullable com.application.app.modules.tampilanawal.data.viewmodel.TampilanAwalVM TampilanAwalVM) {
        this.mTampilanAwalVM = TampilanAwalVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanAwalVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanAwalVMTampilanAwalModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanawal.data.model.TampilanAwalModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanAwalVMTampilanAwalModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanawal.data.model.TampilanAwalModel> TampilanAwalVMTampilanAwalModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanawal.data.model.TampilanAwalModel> tampilanAwalVMTampilanAwalModel = null;
        java.lang.String tampilanAwalVMTampilanAwalModelTxtReDoc = null;
        com.application.app.modules.tampilanawal.data.model.TampilanAwalModel tampilanAwalVMTampilanAwalModelGetValue = null;
        com.application.app.modules.tampilanawal.data.viewmodel.TampilanAwalVM tampilanAwalVM = mTampilanAwalVM;
        java.lang.String tampilanAwalVMTampilanAwalModelTxtReservasiSeger = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanAwalVM != null) {
                    // read tampilanAwalVM.tampilanAwalModel
                    tampilanAwalVMTampilanAwalModel = tampilanAwalVM.getTampilanAwalModel();
                }
                updateLiveDataRegistration(0, tampilanAwalVMTampilanAwalModel);


                if (tampilanAwalVMTampilanAwalModel != null) {
                    // read tampilanAwalVM.tampilanAwalModel.getValue()
                    tampilanAwalVMTampilanAwalModelGetValue = tampilanAwalVMTampilanAwalModel.getValue();
                }


                if (tampilanAwalVMTampilanAwalModelGetValue != null) {
                    // read tampilanAwalVM.tampilanAwalModel.getValue().txtReDoc
                    tampilanAwalVMTampilanAwalModelTxtReDoc = tampilanAwalVMTampilanAwalModelGetValue.getTxtReDoc();
                    // read tampilanAwalVM.tampilanAwalModel.getValue().txtReservasiSeger
                    tampilanAwalVMTampilanAwalModelTxtReservasiSeger = tampilanAwalVMTampilanAwalModelGetValue.getTxtReservasiSeger();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageClipdoctorand, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageClipdoctorand.getContext(), R.drawable.img_clipdoctorand), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReDoc, tampilanAwalVMTampilanAwalModelTxtReDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReservasiSeger, tampilanAwalVMTampilanAwalModelTxtReservasiSeger);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanAwalVM.tampilanAwalModel
        flag 1 (0x2L): tampilanAwalVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}