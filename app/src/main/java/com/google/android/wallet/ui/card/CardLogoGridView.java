package com.google.android.wallet.ui.card;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.wallet.ui.common.bj;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CardLogoGridView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    Button f7412a;

    /* renamed from: b, reason: collision with root package name */
    LinearLayout f7413b;

    public CardLogoGridView(Context context) {
        super(context);
    }

    public CardLogoGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @TargetApi(11)
    public CardLogoGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public CardLogoGridView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7412a = (Button) findViewById(com.google.android.wallet.e.g.card_logo_grid_toggle);
        this.f7413b = (LinearLayout) findViewById(com.google.android.wallet.e.g.card_logo_grid);
        this.f7412a.setOnClickListener(this);
    }

    public void setLogos(com.google.b.a.a.a.b.a.bpkg.p[] pVarArr) {
        int length = pVarArr.length;
        int i = 0;
        while (i < length) {
            int min = Math.min(i + 5, length);
            CardImagesView cardImagesView = (CardImagesView) LayoutInflater.from(getContext()).inflate(com.google.android.wallet.e.h.view_card_logo_grid_row, (ViewGroup) this.f7413b, false);
            cardImagesView.a((com.google.b.a.a.a.b.a.bpkg.p[]) Arrays.copyOfRange(pVarArr, i, min, com.google.b.a.a.a.b.a.bpkg.p[].class), com.google.b.a.a.a.b.a.bpkg.p.b(), false);
            this.f7413b.addView(cardImagesView);
            i = min;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f7412a) {
            if (this.f7413b.getVisibility() == 0) {
                bj.a(this.f7413b, 0, 0);
                this.f7412a.setText(getContext().getString(com.google.android.wallet.e.j.wallet_uic_view_card_logos));
            } else {
                bj.a(this.f7413b, 0);
                this.f7412a.setText(getContext().getString(com.google.android.wallet.e.j.wallet_uic_hide_card_logos));
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putBoolean("cardLogoGridVisible", this.f7413b.getVisibility() == 0);
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("parentState"));
        if (bundle.getBoolean("cardLogoGridVisible")) {
            this.f7413b.setVisibility(0);
            this.f7412a.setText(getContext().getString(com.google.android.wallet.e.j.wallet_uic_hide_card_logos));
        }
    }
}
