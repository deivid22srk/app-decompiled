package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.wallet.common.util.ParcelableProto;
import java.util.List;

/* loaded from: classes.dex */
public class InfoMessageTextView extends android.support.v7.widget.bm implements com.google.android.wallet.analytics.e, e, t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7455a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7456b;
    private boolean c;
    private int d;
    private com.google.b.a.a.a.b.a.bpkg.r e;
    private com.google.android.wallet.analytics.e f;
    private e g;
    private final com.google.android.wallet.analytics.f h;
    private com.google.android.wallet.analytics.a i;

    public InfoMessageTextView(Context context) {
        super(context, null);
        this.f7455a = true;
        this.f7456b = true;
        this.c = true;
        this.h = new com.google.android.wallet.analytics.f(1627);
        setVisibility(getVisibility());
    }

    public InfoMessageTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7455a = true;
        this.f7456b = true;
        this.c = true;
        this.h = new com.google.android.wallet.analytics.f(1627);
        a(context, attributeSet);
        setVisibility(getVisibility());
    }

    public InfoMessageTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7455a = true;
        this.f7456b = true;
        this.c = true;
        this.h = new com.google.android.wallet.analytics.f(1627);
        a(context, attributeSet);
        setVisibility(getVisibility());
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.uicAlwaysInlineExpandLabel});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (z) {
            this.f7455a = true;
            return;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, com.google.android.wallet.e.k.WalletUicInfoMessageTextView);
        this.f7455a = obtainStyledAttributes2.getBoolean(com.google.android.wallet.e.k.WalletUicInfoMessageTextView_internalUicInlineExpandLabel, true);
        obtainStyledAttributes2.recycle();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.d = i;
        if (this.e == null) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i);
        }
    }

    public void setLinkify(boolean z) {
        this.c = z;
    }

    private void a() {
        if (this.e == null) {
            setText("");
            this.f7456b = true;
        } else if (!TextUtils.isEmpty(this.e.c)) {
            if (this.f7456b) {
                if (this.c) {
                    ClickSpan.a(this, this.e.c, this);
                } else {
                    setText(this.e.c);
                }
            } else if (this.f7455a) {
                if (!this.c) {
                    throw new IllegalArgumentException("InfoMessageTextView inline expand label can only be used when linkify is true");
                }
                ClickSpan.a(this, String.format("%s <a href=\"%s\">%s</a>", this.e.f7687b, "expandInfoText", this.e.d), this);
            } else if (this.c) {
                ClickSpan.a(this, this.e.f7687b, this);
            } else {
                setText(this.e.f7687b);
            }
        } else {
            this.f7456b = true;
            ClickSpan.a(this, this.e.f7687b, this);
        }
        setVisibility(this.d);
    }

    @Override // com.google.android.wallet.analytics.e
    public void setParentUiNode(com.google.android.wallet.analytics.e eVar) {
        this.f = eVar;
    }

    public void setUrlClickListener(e eVar) {
        this.g = eVar;
    }

    public final void a(boolean z) {
        if (this.f7456b != z) {
            if (z) {
                a(1628);
            }
            this.f7456b = z;
            a();
        }
    }

    private void a(int i) {
        if (this.i != null) {
            this.i.a(this, i);
        }
    }

    public String getExpandLabel() {
        return this.e.d;
    }

    @Override // com.google.android.wallet.ui.common.e
    public final void a(View view, String str) {
        if ("expandInfoText".equals(str)) {
            a(true);
        } else {
            a(1629);
            this.g.a(this, str);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putParcelable("infoMessage", ParcelableProto.a(this.e));
        bundle.putBoolean("expanded", this.f7456b);
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.e = (com.google.b.a.a.a.b.a.bpkg.r) ParcelableProto.a(bundle, "infoMessage");
            this.f7456b = bundle.getBoolean("expanded");
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            a();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.google.android.wallet.analytics.e
    public com.google.android.wallet.analytics.e getParentUiNode() {
        return this.f;
    }

    @Override // com.google.android.wallet.analytics.e
    public com.google.android.wallet.analytics.f getUiElement() {
        return this.h;
    }

    @Override // com.google.android.wallet.analytics.e
    public List<com.google.android.wallet.analytics.e> getChildren() {
        return null;
    }

    @Override // com.google.android.wallet.ui.common.t
    public final boolean af_() {
        return true;
    }

    @Override // com.google.android.wallet.ui.common.t
    public final boolean ag_() {
        return true;
    }

    public void setAnalyticsClickListener(com.google.android.wallet.analytics.a aVar) {
        this.i = aVar;
    }

    public void setInfoMessage(com.google.b.a.a.a.b.a.bpkg.r rVar) {
        if (rVar != null) {
            if (TextUtils.isEmpty(rVar.f7687b)) {
                throw new IllegalArgumentException("Info message must contain messageHtml.");
            }
            if (TextUtils.isEmpty(rVar.c) != TextUtils.isEmpty(rVar.d)) {
                throw new IllegalArgumentException("Info message must either contain both detailedMessageHtml and showDetailedMessageLabel, or neither.");
            }
        }
        this.e = rVar;
        this.f7456b = false;
        a();
    }
}
