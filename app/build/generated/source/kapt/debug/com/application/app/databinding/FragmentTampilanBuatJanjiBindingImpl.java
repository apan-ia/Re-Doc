package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTampilanBuatJanjiBindingImpl extends FragmentTampilanBuatJanjiBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearGroup181, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTampilanBuatJanjiBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentTampilanBuatJanjiBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.ScrollView) bindings[0]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.scrollViewScrollview.setTag(null);
        this.txtBuatJanji.setTag(null);
        this.txtTampilkanKalen.setTag(null);
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
        if (BR.tampilanBuatJanjiVM == variableId) {
            setTampilanBuatJanjiVM((com.application.app.modules.tampilanbuatjanji.data.viewmodel.TampilanBuatJanjiVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanBuatJanjiVM(@Nullable com.application.app.modules.tampilanbuatjanji.data.viewmodel.TampilanBuatJanjiVM TampilanBuatJanjiVM) {
        this.mTampilanBuatJanjiVM = TampilanBuatJanjiVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanBuatJanjiVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanBuatJanjiVMTampilanBuatJanjiModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanbuatjanji.data.model.TampilanBuatJanjiModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanBuatJanjiVMTampilanBuatJanjiModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanbuatjanji.data.model.TampilanBuatJanjiModel> TampilanBuatJanjiVMTampilanBuatJanjiModel, int fieldId) {
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
        com.application.app.modules.tampilanbuatjanji.data.model.TampilanBuatJanjiModel tampilanBuatJanjiVMTampilanBuatJanjiModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanbuatjanji.data.model.TampilanBuatJanjiModel> tampilanBuatJanjiVMTampilanBuatJanjiModel = null;
        java.lang.String tampilanBuatJanjiVMTampilanBuatJanjiModelTxtBuatJanji = null;
        com.application.app.modules.tampilanbuatjanji.data.viewmodel.TampilanBuatJanjiVM tampilanBuatJanjiVM = mTampilanBuatJanjiVM;
        java.lang.String tampilanBuatJanjiVMTampilanBuatJanjiModelTxtTampilkanKalen = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanBuatJanjiVM != null) {
                    // read tampilanBuatJanjiVM.tampilanBuatJanjiModel
                    tampilanBuatJanjiVMTampilanBuatJanjiModel = tampilanBuatJanjiVM.getTampilanBuatJanjiModel();
                }
                updateLiveDataRegistration(0, tampilanBuatJanjiVMTampilanBuatJanjiModel);


                if (tampilanBuatJanjiVMTampilanBuatJanjiModel != null) {
                    // read tampilanBuatJanjiVM.tampilanBuatJanjiModel.getValue()
                    tampilanBuatJanjiVMTampilanBuatJanjiModelGetValue = tampilanBuatJanjiVMTampilanBuatJanjiModel.getValue();
                }


                if (tampilanBuatJanjiVMTampilanBuatJanjiModelGetValue != null) {
                    // read tampilanBuatJanjiVM.tampilanBuatJanjiModel.getValue().txtBuatJanji
                    tampilanBuatJanjiVMTampilanBuatJanjiModelTxtBuatJanji = tampilanBuatJanjiVMTampilanBuatJanjiModelGetValue.getTxtBuatJanji();
                    // read tampilanBuatJanjiVM.tampilanBuatJanjiModel.getValue().txtTampilkanKalen
                    tampilanBuatJanjiVMTampilanBuatJanjiModelTxtTampilkanKalen = tampilanBuatJanjiVMTampilanBuatJanjiModelGetValue.getTxtTampilkanKalen();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBuatJanji, tampilanBuatJanjiVMTampilanBuatJanjiModelTxtBuatJanji);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTampilkanKalen, tampilanBuatJanjiVMTampilanBuatJanjiModelTxtTampilkanKalen);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanBuatJanjiVM.tampilanBuatJanjiModel
        flag 1 (0x2L): tampilanBuatJanjiVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}