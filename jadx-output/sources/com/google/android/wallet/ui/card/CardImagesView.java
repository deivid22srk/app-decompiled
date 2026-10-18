package com.google.android.wallet.ui.card;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ao;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.am;
import com.google.android.wallet.ui.common.bj;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public class CardImagesView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public ImageView[] f7410a;

    /* renamed from: b, reason: collision with root package name */
    ImageView[] f7411b;
    View c;
    i d;
    com.google.b.a.a.a.b.a.b.p e;
    public boolean f;
    private int g;
    private boolean h;
    private boolean i;
    private am j;

    public CardImagesView(Context context) {
        super(context);
        this.i = true;
    }

    public CardImagesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = true;
        a(context, attributeSet);
    }

    @TargetApi(11)
    public CardImagesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = true;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.wallet.e.k.WalletUicCardImagesView);
        this.g = obtainStyledAttributes.getDimensionPixelSize(com.google.android.wallet.e.k.WalletUicCardImagesView_internalUicSpacingBetweenCardImages, 0);
        this.h = obtainStyledAttributes.getBoolean(com.google.android.wallet.e.k.WalletUicCardImagesView_internalUicAllImagesStaticOnly, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (!this.h) {
            this.c = findViewById(com.google.android.wallet.e.g.unresolved_logo);
        }
    }

    @TargetApi(11)
    public final void a(com.google.b.a.a.a.b.a.b.p[] pVarArr, com.google.b.a.a.a.b.a.b.p[] pVarArr2, boolean z) {
        i jVar;
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.google.android.wallet.e.f.wallet_uic_credit_card_icon_width);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.google.android.wallet.e.f.wallet_uic_credit_card_icon_height);
        this.f7410a = a(pVarArr, dimensionPixelSize, dimensionPixelSize2, z, false);
        this.f7411b = a(pVarArr2, dimensionPixelSize, dimensionPixelSize2, z, true);
        this.f = z;
        if (this.h) {
            if (z) {
                throw new IllegalArgumentException("One card mode cannot be used if allImagesStaticOnly is true.");
            }
            return;
        }
        ImageView[] imageViewArr = this.f7410a;
        ImageView[] imageViewArr2 = this.f7411b;
        boolean z2 = this.f;
        if (Build.VERSION.SDK_INT >= 14) {
            jVar = new k(imageViewArr, imageViewArr2, this.c);
        } else {
            jVar = new j(getContext(), imageViewArr, imageViewArr2, this.c, z2);
        }
        this.d = jVar;
    }

    private ImageView[] a(com.google.b.a.a.a.b.a.b.p[] pVarArr, int i, int i2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList(pVarArr.length);
        HashSet hashSet = new HashSet(pVarArr.length);
        int a2 = getIdGenerator().a();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.uicCardResolvedGenericDrawable});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        int i3 = -1;
        int i4 = a2;
        for (com.google.b.a.a.a.b.a.b.p pVar : pVarArr) {
            if (!hashSet.contains(pVar.f7684a)) {
                hashSet.add(pVar.f7684a);
                ImageWithCaptionView imageWithCaptionView = new ImageWithCaptionView(getContext());
                if (Build.VERSION.SDK_INT >= 11) {
                    imageWithCaptionView.setLayerType(2, null);
                }
                imageWithCaptionView.setId(i4);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
                if (!z && !z2 && i3 > 0) {
                    ao.a(layoutParams, this.g);
                    layoutParams.addRule(bj.a(17), i3);
                }
                addView(imageWithCaptionView, layoutParams);
                imageWithCaptionView.a(pVar, com.google.android.wallet.common.util.i.b(getContext().getApplicationContext()), com.google.android.wallet.a.d.f7228a.b().booleanValue());
                imageWithCaptionView.setFadeIn(true);
                imageWithCaptionView.setErrorImageResId(resourceId);
                imageWithCaptionView.setTag(pVar);
                arrayList.add(imageWithCaptionView);
                int i5 = i4;
                i4 = getIdGenerator().a();
                i3 = i5;
            }
        }
        return (ImageView[]) arrayList.toArray(new ImageView[arrayList.size()]);
    }

    private am getIdGenerator() {
        if (this.j == null) {
            this.j = am.b();
        }
        return this.j;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putParcelable("currentIcon", ParcelableProto.a(this.e));
        bundle.putBoolean("oneCardMode", this.f);
        if (this.j != null) {
            this.j.a(bundle);
        }
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.e = (com.google.b.a.a.a.b.a.b.p) ParcelableProto.a(bundle, "currentIcon");
            this.f = bundle.getBoolean("oneCardMode");
            this.j = am.b(bundle);
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.h && this.i) {
            this.i = false;
            this.d.a(this.e);
            if (this.f) {
                a();
            }
        }
    }

    public final void a() {
        if (this.h) {
            throw new IllegalStateException("One card mode cannot be used if allImagesStaticOnly is true.");
        }
        if (this.d instanceof k) {
            this.f = true;
            if (!this.i) {
                ((k) this.d).a();
            }
        }
    }

    public void setCardIcon(com.google.b.a.a.a.b.a.b.p pVar) {
        if (this.h) {
            throw new IllegalStateException("setCardIcon cannot be used if allImagesStaticOnly is true.");
        }
        this.e = pVar;
        if (!this.i) {
            this.d.b(pVar);
        }
    }
}
