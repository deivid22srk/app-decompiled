package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes.dex */
public class FormHeaderView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f7450a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.b.a.a.a.b.a.a.j f7451b;
    private am c;

    public FormHeaderView(Context context) {
        super(context);
        setVisibility(getVisibility());
    }

    public FormHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(getVisibility());
    }

    @TargetApi(11)
    public FormHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(getVisibility());
    }

    @TargetApi(21)
    public FormHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setVisibility(getVisibility());
    }

    public final void a(com.google.b.a.a.a.b.a.a.j jVar, LayoutInflater layoutInflater, e eVar, com.google.android.wallet.analytics.e eVar2, List<com.google.android.wallet.analytics.e> list) {
        if (!TextUtils.isEmpty(jVar.d)) {
            TextView textView = (TextView) findViewById(com.google.android.wallet.e.g.header_title);
            textView.setText(jVar.d);
            textView.setVisibility(0);
        }
        TypedArray obtainStyledAttributes = layoutInflater.getContext().obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.internalUicInfoMessageLayout});
        int resourceId = obtainStyledAttributes.getResourceId(0, com.google.android.wallet.e.h.view_info_message_text);
        obtainStyledAttributes.recycle();
        for (com.google.b.a.a.a.b.a.b.r rVar : jVar.e) {
            InfoMessageTextView infoMessageTextView = (InfoMessageTextView) layoutInflater.inflate(resourceId, (ViewGroup) this, false);
            infoMessageTextView.setId(getIdGenerator().a());
            infoMessageTextView.setInfoMessage(rVar);
            infoMessageTextView.setUrlClickListener(eVar);
            addView(infoMessageTextView);
            infoMessageTextView.setParentUiNode(eVar2);
            list.add(infoMessageTextView);
        }
        this.f7451b = jVar;
        setVisibility(this.f7450a);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.f7450a = i;
        if (this.f7451b == null || (TextUtils.isEmpty(this.f7451b.d) && this.f7451b.e.length == 0)) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i);
        }
    }

    private am getIdGenerator() {
        if (this.c == null) {
            this.c = am.b();
        }
        return this.c;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedState", super.onSaveInstanceState());
        if (this.c != null) {
            this.c.a(bundle);
        }
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedState"));
        this.c = am.b(bundle);
    }
}
