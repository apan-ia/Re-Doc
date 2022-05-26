package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTampilanAkunBindingImpl extends ActivityTampilanAkunBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearBarAtas, 15);
        sViewsWithIds.put(R.id.toolbarToolbar, 16);
        sViewsWithIds.put(R.id.linearGroup49, 17);
        sViewsWithIds.put(R.id.imageVector, 18);
        sViewsWithIds.put(R.id.scrollViewScrollview, 19);
        sViewsWithIds.put(R.id.linearBarAtas1, 20);
        sViewsWithIds.put(R.id.linearGroup59, 21);
        sViewsWithIds.put(R.id.linearTopsec, 22);
        sViewsWithIds.put(R.id.imageGroup, 23);
        sViewsWithIds.put(R.id.frameGroup61, 24);
        sViewsWithIds.put(R.id.imageRectangle709, 25);
        sViewsWithIds.put(R.id.linearGroup57, 26);
        sViewsWithIds.put(R.id.linearGroup50, 27);
        sViewsWithIds.put(R.id.imageUsert, 28);
        sViewsWithIds.put(R.id.linearGroup51, 29);
        sViewsWithIds.put(R.id.imageCalendart, 30);
        sViewsWithIds.put(R.id.linearGroup52, 31);
        sViewsWithIds.put(R.id.imageLocationt, 32);
        sViewsWithIds.put(R.id.linearGroup53, 33);
        sViewsWithIds.put(R.id.imageEmailt, 34);
        sViewsWithIds.put(R.id.linearGroup54, 35);
        sViewsWithIds.put(R.id.imagePhonet, 36);
        sViewsWithIds.put(R.id.btnKeluar, 37);
        sViewsWithIds.put(R.id.linearBarBawah, 38);
        sViewsWithIds.put(R.id.linearGroup68, 39);
        sViewsWithIds.put(R.id.linearGroup66, 40);
        sViewsWithIds.put(R.id.imageHomer, 41);
        sViewsWithIds.put(R.id.imageClipboardr, 42);
        sViewsWithIds.put(R.id.imageEmailr, 43);
        sViewsWithIds.put(R.id.imageUserr, 44);
        sViewsWithIds.put(R.id.linearGroup67, 45);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTampilanAkunBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 46, sIncludes, sViewsWithIds));
    }
    private ActivityTampilanAkunBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[37]
            , (android.widget.FrameLayout) bindings[24]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[42]
            , (android.widget.ImageView) bindings[43]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[41]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.ImageView) bindings[36]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[44]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[38]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.LinearLayout) bindings[35]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[40]
            , (android.widget.LinearLayout) bindings[45]
            , (android.widget.LinearLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.ScrollView) bindings[19]
            , (androidx.appcompat.widget.Toolbar) bindings[16]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[12]
            );
        this.image36498911.setTag(null);
        this.linearGroup70.setTag(null);
        this.txt081236548974.setTag(null);
        this.txt14012000.setTag(null);
        this.txtAffanIan.setTag(null);
        this.txtAffanIan1.setTag(null);
        this.txtAffannakemog.setTag(null);
        this.txtAffannakemog1.setTag(null);
        this.txtAkunSaya.setTag(null);
        this.txtBeranda.setTag(null);
        this.txtKotakMasuk.setTag(null);
        this.txtProfile.setTag(null);
        this.txtPunge.setTag(null);
        this.txtReDoc.setTag(null);
        this.txtReservasi.setTag(null);
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
        if (BR.tampilanAkunVM == variableId) {
            setTampilanAkunVM((com.application.app.modules.tampilanakun.data.viewmodel.TampilanAkunVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTampilanAkunVM(@Nullable com.application.app.modules.tampilanakun.data.viewmodel.TampilanAkunVM TampilanAkunVM) {
        this.mTampilanAkunVM = TampilanAkunVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tampilanAkunVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTampilanAkunVMTampilanAkunModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanakun.data.model.TampilanAkunModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTampilanAkunVMTampilanAkunModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanakun.data.model.TampilanAkunModel> TampilanAkunVMTampilanAkunModel, int fieldId) {
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
        java.lang.String tampilanAkunVMTampilanAkunModelTxtPunge = null;
        java.lang.String tampilanAkunVMTampilanAkunModelTxtAffannakemog1 = null;
        java.lang.String tampilanAkunVMTampilanAkunModelTxtAffanIan1 = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.tampilanakun.data.model.TampilanAkunModel> tampilanAkunVMTampilanAkunModel = null;
        java.lang.String tampilanAkunVMTampilanAkunModelTxtAkunSaya = null;
        java.lang.String tampilanAkunVMTampilanAkunModelTxt14012000 = null;
        java.lang.String tampilanAkunVMTampilanAkunModelTxtAffannakemog = null;
        java.lang.String tampilanAkunVMTampilanAkunModelTxtProfile = null;
        java.lang.String tampilanAkunVMTampilanAkunModelTxtKotakMasuk = null;
        java.lang.String tampilanAkunVMTampilanAkunModelTxtReservasi = null;
        com.application.app.modules.tampilanakun.data.model.TampilanAkunModel tampilanAkunVMTampilanAkunModelGetValue = null;
        java.lang.String tampilanAkunVMTampilanAkunModelTxtAffanIan = null;
        java.lang.String tampilanAkunVMTampilanAkunModelTxtBeranda = null;
        java.lang.String tampilanAkunVMTampilanAkunModelTxt081236548974 = null;
        java.lang.String tampilanAkunVMTampilanAkunModelTxtReDoc = null;
        com.application.app.modules.tampilanakun.data.viewmodel.TampilanAkunVM tampilanAkunVM = mTampilanAkunVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tampilanAkunVM != null) {
                    // read tampilanAkunVM.tampilanAkunModel
                    tampilanAkunVMTampilanAkunModel = tampilanAkunVM.getTampilanAkunModel();
                }
                updateLiveDataRegistration(0, tampilanAkunVMTampilanAkunModel);


                if (tampilanAkunVMTampilanAkunModel != null) {
                    // read tampilanAkunVM.tampilanAkunModel.getValue()
                    tampilanAkunVMTampilanAkunModelGetValue = tampilanAkunVMTampilanAkunModel.getValue();
                }


                if (tampilanAkunVMTampilanAkunModelGetValue != null) {
                    // read tampilanAkunVM.tampilanAkunModel.getValue().txtPunge
                    tampilanAkunVMTampilanAkunModelTxtPunge = tampilanAkunVMTampilanAkunModelGetValue.getTxtPunge();
                    // read tampilanAkunVM.tampilanAkunModel.getValue().txtAffannakemog1
                    tampilanAkunVMTampilanAkunModelTxtAffannakemog1 = tampilanAkunVMTampilanAkunModelGetValue.getTxtAffannakemog1();
                    // read tampilanAkunVM.tampilanAkunModel.getValue().txtAffanIan1
                    tampilanAkunVMTampilanAkunModelTxtAffanIan1 = tampilanAkunVMTampilanAkunModelGetValue.getTxtAffanIan1();
                    // read tampilanAkunVM.tampilanAkunModel.getValue().txtAkunSaya
                    tampilanAkunVMTampilanAkunModelTxtAkunSaya = tampilanAkunVMTampilanAkunModelGetValue.getTxtAkunSaya();
                    // read tampilanAkunVM.tampilanAkunModel.getValue().txt14012000
                    tampilanAkunVMTampilanAkunModelTxt14012000 = tampilanAkunVMTampilanAkunModelGetValue.getTxt14012000();
                    // read tampilanAkunVM.tampilanAkunModel.getValue().txtAffannakemog
                    tampilanAkunVMTampilanAkunModelTxtAffannakemog = tampilanAkunVMTampilanAkunModelGetValue.getTxtAffannakemog();
                    // read tampilanAkunVM.tampilanAkunModel.getValue().txtProfile
                    tampilanAkunVMTampilanAkunModelTxtProfile = tampilanAkunVMTampilanAkunModelGetValue.getTxtProfile();
                    // read tampilanAkunVM.tampilanAkunModel.getValue().txtKotakMasuk
                    tampilanAkunVMTampilanAkunModelTxtKotakMasuk = tampilanAkunVMTampilanAkunModelGetValue.getTxtKotakMasuk();
                    // read tampilanAkunVM.tampilanAkunModel.getValue().txtReservasi
                    tampilanAkunVMTampilanAkunModelTxtReservasi = tampilanAkunVMTampilanAkunModelGetValue.getTxtReservasi();
                    // read tampilanAkunVM.tampilanAkunModel.getValue().txtAffanIan
                    tampilanAkunVMTampilanAkunModelTxtAffanIan = tampilanAkunVMTampilanAkunModelGetValue.getTxtAffanIan();
                    // read tampilanAkunVM.tampilanAkunModel.getValue().txtBeranda
                    tampilanAkunVMTampilanAkunModelTxtBeranda = tampilanAkunVMTampilanAkunModelGetValue.getTxtBeranda();
                    // read tampilanAkunVM.tampilanAkunModel.getValue().txt081236548974
                    tampilanAkunVMTampilanAkunModelTxt081236548974 = tampilanAkunVMTampilanAkunModelGetValue.getTxt081236548974();
                    // read tampilanAkunVM.tampilanAkunModel.getValue().txtReDoc
                    tampilanAkunVMTampilanAkunModelTxtReDoc = tampilanAkunVMTampilanAkunModelGetValue.getTxtReDoc();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image36498911, androidx.appcompat.content.res.AppCompatResources.getDrawable(image36498911.getContext(), R.drawable.img_36498911), (float)0f, true);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt081236548974, tampilanAkunVMTampilanAkunModelTxt081236548974);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt14012000, tampilanAkunVMTampilanAkunModelTxt14012000);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAffanIan, tampilanAkunVMTampilanAkunModelTxtAffanIan);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAffanIan1, tampilanAkunVMTampilanAkunModelTxtAffanIan1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAffannakemog, tampilanAkunVMTampilanAkunModelTxtAffannakemog);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAffannakemog1, tampilanAkunVMTampilanAkunModelTxtAffannakemog1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAkunSaya, tampilanAkunVMTampilanAkunModelTxtAkunSaya);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBeranda, tampilanAkunVMTampilanAkunModelTxtBeranda);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtKotakMasuk, tampilanAkunVMTampilanAkunModelTxtKotakMasuk);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtProfile, tampilanAkunVMTampilanAkunModelTxtProfile);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPunge, tampilanAkunVMTampilanAkunModelTxtPunge);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReDoc, tampilanAkunVMTampilanAkunModelTxtReDoc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReservasi, tampilanAkunVMTampilanAkunModelTxtReservasi);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tampilanAkunVM.tampilanAkunModel
        flag 1 (0x2L): tampilanAkunVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}