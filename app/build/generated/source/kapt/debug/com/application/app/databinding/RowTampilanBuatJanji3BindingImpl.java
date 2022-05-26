package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowTampilanBuatJanji3BindingImpl extends RowTampilanBuatJanji3Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearGroup248, 6);
        sViewsWithIds.put(R.id.frameGroup249, 7);
        sViewsWithIds.put(R.id.imageEllipse12, 8);
        sViewsWithIds.put(R.id.linearGroup448, 9);
        sViewsWithIds.put(R.id.linearGroup225, 10);
        sViewsWithIds.put(R.id.imageStar1, 11);
        sViewsWithIds.put(R.id.btnBuatJanji, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowTampilanBuatJanji3BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private RowTampilanBuatJanji3BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[12]
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.image51604271.setTag(null);
        this.linearGroup.setTag(null);
        this.txt234.setTag(null);
        this.txt38.setTag(null);
        this.txtDokterGigi.setTag(null);
        this.txtDrgLita.setTag(null);
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
        if (BR.tampilanBuatJanji3RowModel == variableId) {
            setTampilanBuatJanji3RowModel((com.application.app.modules.tampilanbuatjanji1.data.model.TampilanBuatJanji3RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanBuatJanji3RowModel(@Nullable com.application.app.modules.tampilanbuatjanji1.data.model.TampilanBuatJanji3RowModel TampilanBuatJanji3RowModel) {
        this.mTampilanBuatJanji3RowModel = TampilanBuatJanji3RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tampilanBuatJanji3RowModel);
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
        java.lang.String tampilanBuatJanji3RowModelTxt38 = null;
        java.lang.String tampilanBuatJanji3RowModelTxtDokterGigi = null;
        java.lang.String tampilanBuatJanji3RowModelTxt234 = null;
        com.application.app.modules.tampilanbuatjanji1.data.model.TampilanBuatJanji3RowModel tampilanBuatJanji3RowModel = mTampilanBuatJanji3RowModel;
        java.lang.String tampilanBuatJanji3RowModelTxtDrgLita = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tampilanBuatJanji3RowModel != null) {
                    // read tampilanBuatJanji3RowModel.txt38
                    tampilanBuatJanji3RowModelTxt38 = tampilanBuatJanji3RowModel.getTxt38();
                    // read tampilanBuatJanji3RowModel.txtDokterGigi
                    tampilanBuatJanji3RowModelTxtDokterGigi = tampilanBuatJanji3RowModel.getTxtDokterGigi();
                    // read tampilanBuatJanji3RowModel.txt234
                    tampilanBuatJanji3RowModelTxt234 = tampilanBuatJanji3RowModel.getTxt234();
                    // read tampilanBuatJanji3RowModel.txtDrgLita
                    tampilanBuatJanji3RowModelTxtDrgLita = tampilanBuatJanji3RowModel.getTxtDrgLita();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image51604271, androidx.appcompat.content.res.AppCompatResources.getDrawable(image51604271.getContext(), R.drawable.img_51604271_5), (float)0f, true);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt234, tampilanBuatJanji3RowModelTxt234);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt38, tampilanBuatJanji3RowModelTxt38);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDokterGigi, tampilanBuatJanji3RowModelTxtDokterGigi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDrgLita, tampilanBuatJanji3RowModelTxtDrgLita);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanBuatJanji3RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}