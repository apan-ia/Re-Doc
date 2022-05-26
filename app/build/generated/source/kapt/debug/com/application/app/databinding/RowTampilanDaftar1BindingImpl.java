package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowTampilanDaftar1BindingImpl extends RowTampilanDaftar1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearGroup310, 3);
        sViewsWithIds.put(R.id.linearGroup322, 4);
        sViewsWithIds.put(R.id.imageVector, 5);
        sViewsWithIds.put(R.id.imageGroup9, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowTampilanDaftar1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private RowTampilanDaftar1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.linearPasswordsec.setTag(null);
        this.txt.setTag(null);
        this.txtPassword.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.tampilanDaftar1RowModel == variableId) {
            setTampilanDaftar1RowModel((com.application.app.modules.tampilandaftar.data.model.TampilanDaftar1RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanDaftar1RowModel(@Nullable com.application.app.modules.tampilandaftar.data.model.TampilanDaftar1RowModel TampilanDaftar1RowModel) {
        this.mTampilanDaftar1RowModel = TampilanDaftar1RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tampilanDaftar1RowModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.application.app.modules.tampilandaftar.data.model.TampilanDaftar1RowModel tampilanDaftar1RowModel = mTampilanDaftar1RowModel;
        java.lang.String tampilanDaftar1RowModelTxt = null;
        java.lang.String tampilanDaftar1RowModelTxtPassword = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tampilanDaftar1RowModel != null) {
                    // read tampilanDaftar1RowModel.txt
                    tampilanDaftar1RowModelTxt = tampilanDaftar1RowModel.getTxt();
                    // read tampilanDaftar1RowModel.txtPassword
                    tampilanDaftar1RowModelTxtPassword = tampilanDaftar1RowModel.getTxtPassword();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt, tampilanDaftar1RowModelTxt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPassword, tampilanDaftar1RowModelTxtPassword);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanDaftar1RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}