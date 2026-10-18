package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class ImageWithCaptionView extends FifeNetworkImageView {

    /* renamed from: a, reason: collision with root package name */
    private int f7454a;

    public ImageWithCaptionView(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    public ImageWithCaptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ImageWithCaptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.wallet.e.k.WalletUicImageWithCaptionView);
        setErrorImageResId(obtainStyledAttributes.getResourceId(com.google.android.wallet.e.k.WalletUicImageWithCaptionView_internalUicErrorImage, 0));
        setDefaultImageResId(obtainStyledAttributes.getResourceId(com.google.android.wallet.e.k.WalletUicImageWithCaptionView_internalUicDefaultImage, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putInt("defaultImageResId", this.f7454a);
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f7454a = bundle.getInt("defaultImageResId");
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.android.volley.a.z
    public void setDefaultImageResId(int i) {
        super.setDefaultImageResId(i);
        this.f7454a = i;
    }

    public final void a(com.google.b.a.a.a.b.a.b.p pVar, com.android.volley.a.n nVar, boolean z) {
        if (com.google.android.wallet.common.util.i.b(pVar.f7684a)) {
            super.setDefaultImageResId(bj.a(getContext(), pVar.f7684a));
        } else {
            super.setDefaultImageResId(this.f7454a);
            a(pVar.f7684a, nVar, z);
        }
        setContentDescription(pVar.d);
    }

    @Override // android.view.View
    @TargetApi(11)
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (Build.VERSION.SDK_INT >= 11 && getDrawable() != null && !getDrawable().isStateful()) {
            setAlpha(z ? 1.0f : 0.4f);
        }
    }
}
