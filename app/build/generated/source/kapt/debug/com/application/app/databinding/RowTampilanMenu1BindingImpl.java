package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowTampilanMenu1BindingImpl extends RowTampilanMenu1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearGroup76, 6);
        sViewsWithIds.put(R.id.linearGroup71, 7);
        sViewsWithIds.put(R.id.linearGroup74, 8);
        sViewsWithIds.put(R.id.linearGroup72, 9);
        sViewsWithIds.put(R.id.imageStar1, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowTampilanMenu1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private RowTampilanMenu1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.image51604271.setTag(null);
        this.linearGroup.setTag(null);
        this.txt5.setTag(null);
        this.txtBuatJanji.setTag(null);
        this.txtDrWAHDINISp.setTag(null);
        this.txtSpesialisAnak.setTag(null);
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
        if (BR.tampilanMenu1RowModel == variableId) {
            setTampilanMenu1RowModel((com.application.app.modules.tampilanmenu.data.model.TampilanMenu1RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanMenu1RowModel(@Nullable com.application.app.modules.tampilanmenu.data.model.TampilanMenu1RowModel TampilanMenu1RowModel) {
        this.mTampilanMenu1RowModel = TampilanMenu1RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tampilanMenu1RowModel);
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
        com.application.app.modules.tampilanmenu.data.model.TampilanMenu1RowModel tampilanMenu1RowModel = mTampilanMenu1RowModel;
        java.lang.String tampilanMenu1RowModelTxtDrWAHDINISp = null;
        java.lang.String tampilanMenu1RowModelTxt5 = null;
        java.lang.String tampilanMenu1RowModelTxtSpesialisAnak = null;
        java.lang.String tampilanMenu1RowModelTxtBuatJanji = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tampilanMenu1RowModel != null) {
                    // read tampilanMenu1RowModel.txtDrWAHDINISp
                    tampilanMenu1RowModelTxtDrWAHDINISp = tampilanMenu1RowModel.getTxtDrWAHDINISp();
                    // read tampilanMenu1RowModel.txt5
                    tampilanMenu1RowModelTxt5 = tampilanMenu1RowModel.getTxt5();
                    // read tampilanMenu1RowModel.txtSpesialisAnak
                    tampilanMenu1RowModelTxtSpesialisAnak = tampilanMenu1RowModel.getTxtSpesialisAnak();
                    // read tampilanMenu1RowModel.txtBuatJanji
                    tampilanMenu1RowModelTxtBuatJanji = tampilanMenu1RowModel.getTxtBuatJanji();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image51604271, androidx.appcompat.content.res.AppCompatResources.getDrawable(image51604271.getContext(), R.drawable.img_51604271_7), (float)0f, true);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt5, tampilanMenu1RowModelTxt5);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBuatJanji, tampilanMenu1RowModelTxtBuatJanji);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDrWAHDINISp, tampilanMenu1RowModelTxtDrWAHDINISp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSpesialisAnak, tampilanMenu1RowModelTxtSpesialisAnak);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanMenu1RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}