package com.google.android.finsky.layout;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.activities.hb;

/* loaded from: classes.dex */
public class DetailsExpandedContainer extends LinearLayout implements hb {

    /* renamed from: a, reason: collision with root package name */
    public TextView f2947a;

    /* renamed from: b, reason: collision with root package name */
    public DetailsTextBlock f2948b;
    public DetailsTextBlock c;
    public ViewGroup d;
    public DetailsTextBlock e;
    public CharSequence f;
    public CharSequence g;
    public boolean h;

    public DetailsExpandedContainer(Context context) {
        this(context, null);
    }

    public DetailsExpandedContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2947a = (TextView) findViewById(R.id.details_expanded_callout);
        this.f2947a.setMovementMethod(LinkMovementMethod.getInstance());
        this.f2948b = (DetailsTextBlock) findViewById(R.id.body_container1);
        this.c = (DetailsTextBlock) findViewById(R.id.body_container2);
        this.d = (ViewGroup) findViewById(R.id.details_expanded_extras);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f2947a.setTextIsSelectable(true);
            this.f2947a.setAutoLinkMask(15);
            this.f2947a.setMovementMethod(ArrowKeyMovementMethod.getInstance());
        }
        this.f2948b.setBodyTextIsSelectable(true);
        this.c.setBodyTextIsSelectable(true);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("expanded_container.parent_instance_state", super.onSaveInstanceState());
        bundle.putBoolean("expanded_container.translation_state", this.h);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.h = bundle.getBoolean("expanded_container.translation_state");
            super.onRestoreInstanceState(bundle.getParcelable("expanded_container.parent_instance_state"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.google.android.finsky.activities.hb
    public final boolean a() {
        return !TextUtils.isEmpty(this.g);
    }

    @Override // com.google.android.finsky.activities.hb
    public final boolean b() {
        return this.h;
    }

    @Override // com.google.android.finsky.activities.hb
    public final void c() {
        this.h = !this.h;
        this.e.setBody(this.h ? this.g : this.f);
    }

    public void setTopPaddingOnTopView(int i) {
        View view;
        if (!TextUtils.isEmpty(this.f2947a.getText())) {
            view = this.f2947a;
        } else {
            view = this.f2948b.b() ? this.f2948b : this.c;
        }
        android.support.v4.view.by.a(view, android.support.v4.view.by.n(view), i, android.support.v4.view.by.o(view), 0);
    }
}
