package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowTampilanSearch1BindingImpl extends RowTampilanSearch1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearGroup266, 2);
        sViewsWithIds.put(R.id.imageGroup, 3);
        sViewsWithIds.put(R.id.lineLine3, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowTampilanSearch1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RowTampilanSearch1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[3]
            , (android.view.View) bindings[4]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.linearGroup.setTag(null);
        this.txtDrDRDrSya.setTag(null);
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
        if (BR.tampilanSearch1RowModel == variableId) {
            setTampilanSearch1RowModel((com.application.app.modules.tampilansearch.data.model.TampilanSearch1RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanSearch1RowModel(@Nullable com.application.app.modules.tampilansearch.data.model.TampilanSearch1RowModel TampilanSearch1RowModel) {
        this.mTampilanSearch1RowModel = TampilanSearch1RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tampilanSearch1RowModel);
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
        com.application.app.modules.tampilansearch.data.model.TampilanSearch1RowModel tampilanSearch1RowModel = mTampilanSearch1RowModel;
        java.lang.String tampilanSearch1RowModelTxtDrDRDrSya = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tampilanSearch1RowModel != null) {
                    // read tampilanSearch1RowModel.txtDrDRDrSya
                    tampilanSearch1RowModelTxtDrDRDrSya = tampilanSearch1RowModel.getTxtDrDRDrSya();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDrDRDrSya, tampilanSearch1RowModelTxtDrDRDrSya);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanSearch1RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}