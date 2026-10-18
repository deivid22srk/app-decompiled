package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.wallet.common.util.ParcelableProto;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class CountdownButton extends android.support.v7.widget.ak implements View.OnClickListener, com.google.android.wallet.b.c, com.google.android.wallet.b.d, Runnable {

    /* renamed from: a, reason: collision with root package name */
    com.google.b.a.a.a.b.a.apkg.h f7438a;

    /* renamed from: b, reason: collision with root package name */
    private View.OnClickListener f7439b;
    private com.google.android.wallet.b.e c;
    private com.google.b.a.a.a.b.a.bpkg.i d;
    private boolean e;
    private long f;
    private boolean g;
    private boolean h;

    public CountdownButton(Context context) {
        super(context);
        this.f = -1L;
        a((AttributeSet) null);
    }

    public CountdownButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1L;
        a(attributeSet);
    }

    public CountdownButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1L;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{com.google.android.wallet.e.c.uicFormButtonTextCapitalized});
        this.e = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        super.setOnClickListener(this);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.e && !TextUtils.isEmpty(charSequence)) {
            charSequence = charSequence.toString().toUpperCase(getResources().getConfiguration().locale);
        }
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        if (this.f != -1) {
            this.h = z;
        } else {
            super.setEnabled(z);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean z;
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        com.google.b.a.a.a.b.a.apkg.h hVar = (com.google.b.a.a.a.b.a.apkg.h) ParcelableProto.a(bundle, "buttonSpec");
        if (this.f7438a == null) {
            this.f7438a = hVar;
        }
        com.google.b.a.a.a.b.a.apkg.h hVar2 = this.f7438a;
        if (hVar == hVar2) {
            z = true;
        } else if (hVar == null || hVar2 == null) {
            z = false;
        } else {
            z = hVar.e.equals(hVar2.e) && hVar.c.equals(hVar2.c) && hVar.d.equals(hVar2.d) && hVar.f == hVar2.f && hVar.f7626a == hVar2.f7626a && hVar.f7627b == hVar2.f7627b;
        }
        if (z) {
            this.f = bundle.getLong("timeWhenRefreshStartedMs");
            this.h = bundle.getBoolean("requestedEnabledState");
            setText(bundle.getCharSequence("text"));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putParcelable("buttonSpec", ParcelableProto.a(this.f7438a));
        bundle.putLong("timeWhenRefreshStartedMs", this.f);
        bundle.putBoolean("requestedEnabledState", this.h);
        bundle.putCharSequence("text", getText());
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        this.g = true;
        super.onAttachedToWindow();
        if (this.f7438a == null) {
            return;
        }
        if (this.f != -1) {
            super.setEnabled(false);
            run();
        } else if (TextUtils.isEmpty(getText())) {
            setText(this.f7438a.c);
            super.setEnabled(this.f7438a.f7627b);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g = false;
        removeCallbacks(this);
    }

    public void setUiSpecification(com.google.b.a.a.a.b.a.apkg.h hVar) {
        if (TextUtils.isEmpty(hVar.c)) {
            throw new IllegalArgumentException("Button spec without initial text received.");
        }
        if (hVar.f > 0) {
            if (TextUtils.isEmpty(hVar.d)) {
                throw new IllegalArgumentException("Re-send timer w/o a refresh message received.");
            }
            if (hVar.f < 1000) {
                throw new IllegalArgumentException("Re-send timer less then 1 second which is the minimum displayable unit.");
            }
        }
        this.f7438a = hVar;
        if (this.g) {
            setText(this.f7438a.c);
            super.setEnabled(this.f7438a.f7627b);
            removeCallbacks(this);
            this.f = -1L;
        }
    }

    private boolean a() {
        if (this.f != -1) {
            this.f = -1L;
            super.setEnabled(this.h);
            removeCallbacks(this);
            if (!TextUtils.isEmpty(this.f7438a.e)) {
                setText(this.f7438a.e);
            } else {
                setText(this.f7438a.c);
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7439b = onClickListener;
    }

    @Override // android.view.View
    public boolean hasOnClickListeners() {
        return super.hasOnClickListeners() && this.f7439b != null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f7438a.f > 0) {
            super.setEnabled(false);
            this.f = SystemClock.elapsedRealtime();
            this.h = true;
            long a2 = a(this.f7438a.f);
            setText(String.format(getResources().getConfiguration().locale, this.f7438a.d, Long.valueOf(a2 / 1000)));
            postDelayed(this, Math.min(a2, 1000L));
        } else if (!TextUtils.isEmpty(this.f7438a.e)) {
            setText(this.f7438a.e);
        } else {
            setText(this.f7438a.c);
        }
        if (this.f7439b != null) {
            this.f7439b.onClick(view);
        }
        if (this.c != null && this.d != null) {
            this.c.a(this.d);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f7438a.f <= 0) {
            throw new IllegalStateException("Timer based text changes not needed!");
        }
        long a2 = a((this.f + this.f7438a.f) - SystemClock.elapsedRealtime());
        if (a2 > 0) {
            setText(String.format(getResources().getConfiguration().locale, this.f7438a.d, Long.valueOf(a2 / 1000)));
            postDelayed(this, Math.min(a2, 1000L));
        } else {
            a();
        }
    }

    private static long a(long j) {
        return ((500 + j) / 1000) * 1000;
    }

    @Override // com.google.android.wallet.b.d
    public void setTriggerListener(com.google.android.wallet.b.e eVar) {
        this.c = eVar;
    }

    @Override // com.google.android.wallet.b.d
    public final void a(ArrayList<com.google.b.a.a.a.b.a.bpkg.i> arrayList) {
        if (arrayList.size() != 1) {
            throw new IllegalArgumentException("Should only contain a single click trigger");
        }
        com.google.b.a.a.a.b.a.bpkg.i iVar = arrayList.get(0);
        if (iVar.f7676b != 2) {
            throw new IllegalArgumentException(new StringBuilder(37).append("Unsupported trigger type: ").append(iVar.f7676b).toString());
        }
        this.d = iVar;
    }

    @Override // com.google.android.wallet.b.d
    public final boolean a(com.google.b.a.a.a.b.a.bpkg.i iVar) {
        if (iVar.f7676b == 2) {
            return false;
        }
        throw new IllegalArgumentException(new StringBuilder(37).append("Unsupported trigger type: ").append(iVar.f7676b).toString());
    }

    @Override // com.google.android.wallet.b.c
    public final void a(com.google.b.a.a.a.b.a.bpkg.f fVar, com.google.b.a.a.a.b.a.bpkg.i[] iVarArr) {
        switch (fVar.f7670a) {
            case 2:
                a();
                return;
            default:
                throw new IllegalArgumentException(new StringBuilder(46).append("Unsupported resulting action type: ").append(fVar.f7670a).toString());
        }
    }
}
