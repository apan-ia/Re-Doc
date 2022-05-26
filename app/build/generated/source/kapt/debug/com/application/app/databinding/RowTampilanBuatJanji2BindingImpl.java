package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowTampilanBuatJanji2BindingImpl extends RowTampilanBuatJanji2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearGroup240, 11);
        sViewsWithIds.put(R.id.linearJennycontent, 12);
        sViewsWithIds.put(R.id.linearRating, 13);
        sViewsWithIds.put(R.id.linearGroup72, 14);
        sViewsWithIds.put(R.id.imageStar1, 15);
        sViewsWithIds.put(R.id.btnBuatJanji, 16);
        sViewsWithIds.put(R.id.linearDrzak, 17);
        sViewsWithIds.put(R.id.linearGroup448, 18);
        sViewsWithIds.put(R.id.linearGroup73, 19);
        sViewsWithIds.put(R.id.imageStar3, 20);
        sViewsWithIds.put(R.id.btnBuatJanji2, 21);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowTampilanBuatJanji2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private RowTampilanBuatJanji2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            );
        this.image51604271.setTag(null);
        this.image51604273.setTag(null);
        this.linearStsec.setTag(null);
        this.txt145.setTag(null);
        this.txt48.setTag(null);
        this.txt5.setTag(null);
        this.txt99.setTag(null);
        this.txtDokterGigi.setTag(null);
        this.txtDokterGigi2.setTag(null);
        this.txtDrgBudi.setTag(null);
        this.txtDrgSiti.setTag(null);
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
        if (BR.tampilanBuatJanji2RowModel == variableId) {
            setTampilanBuatJanji2RowModel((com.application.app.modules.tampilanbuatjanji1.data.model.TampilanBuatJanji2RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanBuatJanji2RowModel(@Nullable com.application.app.modules.tampilanbuatjanji1.data.model.TampilanBuatJanji2RowModel TampilanBuatJanji2RowModel) {
        this.mTampilanBuatJanji2RowModel = TampilanBuatJanji2RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tampilanBuatJanji2RowModel);
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
        java.lang.String tampilanBuatJanji2RowModelTxtDrgSiti = null;
        java.lang.String tampilanBuatJanji2RowModelTxtDokterGigi2 = null;
        java.lang.String tampilanBuatJanji2RowModelTxt145 = null;
        java.lang.String tampilanBuatJanji2RowModelTxtDrgBudi = null;
        com.application.app.modules.tampilanbuatjanji1.data.model.TampilanBuatJanji2RowModel tampilanBuatJanji2RowModel = mTampilanBuatJanji2RowModel;
        java.lang.String tampilanBuatJanji2RowModelTxt48 = null;
        java.lang.String tampilanBuatJanji2RowModelTxt5 = null;
        java.lang.String tampilanBuatJanji2RowModelTxt99 = null;
        java.lang.String tampilanBuatJanji2RowModelTxtDokterGigi = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tampilanBuatJanji2RowModel != null) {
                    // read tampilanBuatJanji2RowModel.txtDrgSiti
                    tampilanBuatJanji2RowModelTxtDrgSiti = tampilanBuatJanji2RowModel.getTxtDrgSiti();
                    // read tampilanBuatJanji2RowModel.txtDokterGigi2
                    tampilanBuatJanji2RowModelTxtDokterGigi2 = tampilanBuatJanji2RowModel.getTxtDokterGigi2();
                    // read tampilanBuatJanji2RowModel.txt145
                    tampilanBuatJanji2RowModelTxt145 = tampilanBuatJanji2RowModel.getTxt145();
                    // read tampilanBuatJanji2RowModel.txtDrgBudi
                    tampilanBuatJanji2RowModelTxtDrgBudi = tampilanBuatJanji2RowModel.getTxtDrgBudi();
                    // read tampilanBuatJanji2RowModel.txt48
                    tampilanBuatJanji2RowModelTxt48 = tampilanBuatJanji2RowModel.getTxt48();
                    // read tampilanBuatJanji2RowModel.txt5
                    tampilanBuatJanji2RowModelTxt5 = tampilanBuatJanji2RowModel.getTxt5();
                    // read tampilanBuatJanji2RowModel.txt99
                    tampilanBuatJanji2RowModelTxt99 = tampilanBuatJanji2RowModel.getTxt99();
                    // read tampilanBuatJanji2RowModel.txtDokterGigi
                    tampilanBuatJanji2RowModelTxtDokterGigi = tampilanBuatJanji2RowModel.getTxtDokterGigi();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image51604271, androidx.appcompat.content.res.AppCompatResources.getDrawable(image51604271.getContext(), R.drawable.img_51604271_3), (float)0f, true);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image51604273, androidx.appcompat.content.res.AppCompatResources.getDrawable(image51604273.getContext(), R.drawable.img_51604271_4), (float)0f, true);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt145, tampilanBuatJanji2RowModelTxt145);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt48, tampilanBuatJanji2RowModelTxt48);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt5, tampilanBuatJanji2RowModelTxt5);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt99, tampilanBuatJanji2RowModelTxt99);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDokterGigi, tampilanBuatJanji2RowModelTxtDokterGigi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDokterGigi2, tampilanBuatJanji2RowModelTxtDokterGigi2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDrgBudi, tampilanBuatJanji2RowModelTxtDrgBudi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDrgSiti, tampilanBuatJanji2RowModelTxtDrgSiti);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanBuatJanji2RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}