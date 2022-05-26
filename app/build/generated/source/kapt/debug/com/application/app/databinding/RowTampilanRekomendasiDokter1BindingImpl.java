package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowTampilanRekomendasiDokter1BindingImpl extends RowTampilanRekomendasiDokter1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearGroup209, 11);
        sViewsWithIds.put(R.id.linearJennycontent, 12);
        sViewsWithIds.put(R.id.linearRating, 13);
        sViewsWithIds.put(R.id.linearGroup72, 14);
        sViewsWithIds.put(R.id.imageStar1, 15);
        sViewsWithIds.put(R.id.btnBuatJanji, 16);
        sViewsWithIds.put(R.id.linearDrzak, 17);
        sViewsWithIds.put(R.id.linearGroup448, 18);
        sViewsWithIds.put(R.id.linearGroup73, 19);
        sViewsWithIds.put(R.id.imageStar2, 20);
        sViewsWithIds.put(R.id.btnBuatJanji1, 21);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowTampilanRekomendasiDokter1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private RowTampilanRekomendasiDokter1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (androidx.appcompat.widget.AppCompatButton) bindings[21]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            );
        this.image51604271.setTag(null);
        this.image51604272.setTag(null);
        this.linearStsec.setTag(null);
        this.txt145.setTag(null);
        this.txt48.setTag(null);
        this.txt5.setTag(null);
        this.txt99.setTag(null);
        this.txtDrSyahrulSp.setTag(null);
        this.txtDrWAHDINISp.setTag(null);
        this.txtSpesialisAnak.setTag(null);
        this.txtSpesialisSaraf.setTag(null);
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
        if (BR.tampilanRekomendasiDokter1RowModel == variableId) {
            setTampilanRekomendasiDokter1RowModel((com.application.app.modules.tampilanrekomendasidokter.data.model.TampilanRekomendasiDokter1RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanRekomendasiDokter1RowModel(@Nullable com.application.app.modules.tampilanrekomendasidokter.data.model.TampilanRekomendasiDokter1RowModel TampilanRekomendasiDokter1RowModel) {
        this.mTampilanRekomendasiDokter1RowModel = TampilanRekomendasiDokter1RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tampilanRekomendasiDokter1RowModel);
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
        java.lang.String tampilanRekomendasiDokter1RowModelTxt99 = null;
        java.lang.String tampilanRekomendasiDokter1RowModelTxtSpesialisSaraf = null;
        com.application.app.modules.tampilanrekomendasidokter.data.model.TampilanRekomendasiDokter1RowModel tampilanRekomendasiDokter1RowModel = mTampilanRekomendasiDokter1RowModel;
        java.lang.String tampilanRekomendasiDokter1RowModelTxt5 = null;
        java.lang.String tampilanRekomendasiDokter1RowModelTxtSpesialisAnak = null;
        java.lang.String tampilanRekomendasiDokter1RowModelTxt48 = null;
        java.lang.String tampilanRekomendasiDokter1RowModelTxtDrSyahrulSp = null;
        java.lang.String tampilanRekomendasiDokter1RowModelTxtDrWAHDINISp = null;
        java.lang.String tampilanRekomendasiDokter1RowModelTxt145 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tampilanRekomendasiDokter1RowModel != null) {
                    // read tampilanRekomendasiDokter1RowModel.txt99
                    tampilanRekomendasiDokter1RowModelTxt99 = tampilanRekomendasiDokter1RowModel.getTxt99();
                    // read tampilanRekomendasiDokter1RowModel.txtSpesialisSaraf
                    tampilanRekomendasiDokter1RowModelTxtSpesialisSaraf = tampilanRekomendasiDokter1RowModel.getTxtSpesialisSaraf();
                    // read tampilanRekomendasiDokter1RowModel.txt5
                    tampilanRekomendasiDokter1RowModelTxt5 = tampilanRekomendasiDokter1RowModel.getTxt5();
                    // read tampilanRekomendasiDokter1RowModel.txtSpesialisAnak
                    tampilanRekomendasiDokter1RowModelTxtSpesialisAnak = tampilanRekomendasiDokter1RowModel.getTxtSpesialisAnak();
                    // read tampilanRekomendasiDokter1RowModel.txt48
                    tampilanRekomendasiDokter1RowModelTxt48 = tampilanRekomendasiDokter1RowModel.getTxt48();
                    // read tampilanRekomendasiDokter1RowModel.txtDrSyahrulSp
                    tampilanRekomendasiDokter1RowModelTxtDrSyahrulSp = tampilanRekomendasiDokter1RowModel.getTxtDrSyahrulSp();
                    // read tampilanRekomendasiDokter1RowModel.txtDrWAHDINISp
                    tampilanRekomendasiDokter1RowModelTxtDrWAHDINISp = tampilanRekomendasiDokter1RowModel.getTxtDrWAHDINISp();
                    // read tampilanRekomendasiDokter1RowModel.txt145
                    tampilanRekomendasiDokter1RowModelTxt145 = tampilanRekomendasiDokter1RowModel.getTxt145();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image51604271, androidx.appcompat.content.res.AppCompatResources.getDrawable(image51604271.getContext(), R.drawable.img_51604271_1), (float)0f, true);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image51604272, androidx.appcompat.content.res.AppCompatResources.getDrawable(image51604272.getContext(), R.drawable.img_51604271_2), (float)0f, true);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt145, tampilanRekomendasiDokter1RowModelTxt145);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt48, tampilanRekomendasiDokter1RowModelTxt48);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt5, tampilanRekomendasiDokter1RowModelTxt5);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt99, tampilanRekomendasiDokter1RowModelTxt99);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDrSyahrulSp, tampilanRekomendasiDokter1RowModelTxtDrSyahrulSp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDrWAHDINISp, tampilanRekomendasiDokter1RowModelTxtDrWAHDINISp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSpesialisAnak, tampilanRekomendasiDokter1RowModelTxtSpesialisAnak);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSpesialisSaraf, tampilanRekomendasiDokter1RowModelTxtSpesialisSaraf);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanRekomendasiDokter1RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}