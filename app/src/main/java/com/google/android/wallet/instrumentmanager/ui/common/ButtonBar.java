package com.google.android.wallet.instrumentmanager.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.wallet.instrumentmanager.b;
import com.google.android.wallet.instrumentmanager.e;
import com.google.android.wallet.instrumentmanager.h;
import com.google.android.wallet.ui.common.bc;
import com.google.android.wallet.ui.common.bj;
import java.util.Locale;

/* loaded from: classes.dex */
public class ButtonBar extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public Button f7341a;

    /* renamed from: b, reason: collision with root package name */
    public Button f7342b;
    public Button c;
    ImageView d;
    public boolean e;
    private float f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;

    public ButtonBar(Context context) {
        super(context);
    }

    public ButtonBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    @TargetApi(11)
    public ButtonBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.WalletImButtonBar);
        this.h = obtainStyledAttributes.getBoolean(h.WalletImButtonBar_capitalizeButtonText, false);
        this.e = obtainStyledAttributes.getBoolean(h.WalletImButtonBar_showNegativeButton, false);
        this.i = obtainStyledAttributes.getBoolean(h.WalletImButtonBar_hideNegativeButtonText, false);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{b.imButtonMinimumTouchTargetSize});
        this.g = obtainStyledAttributes2.getDimensionPixelSize(0, -1);
        obtainStyledAttributes2.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.d = (ImageView) findViewById(e.logo);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{b.imButtonBarIntegratorLogoDrawable, b.imPositiveButtonBarAlphaWhenDisabled});
        TypedValue peekValue = obtainStyledAttributes.peekValue(0);
        this.f = obtainStyledAttributes.getFloat(1, -1.0f);
        obtainStyledAttributes.recycle();
        bj.a(this.d, peekValue);
        this.j = this.d.getVisibility() == 0;
        this.c = (Button) findViewById(e.expand_btn);
        this.f7341a = (Button) findViewById(e.positive_btn);
        this.f7342b = (Button) findViewById(e.negative_btn);
        if (this.h) {
            Locale locale = getResources().getConfiguration().locale;
            this.f7341a.setText(this.f7341a.getText().toString().toUpperCase(locale));
            this.f7342b.setText(this.f7342b.getText().toString().toUpperCase(locale));
        }
        a(this.e);
        if (this.i) {
            this.f7342b.setText((CharSequence) null);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        bc bcVar;
        super.onLayout(z, i, i2, i3, i4);
        if (getTouchDelegate() == null) {
            bcVar = new bc(this);
            setTouchDelegate(bcVar);
        } else {
            bcVar = (bc) getTouchDelegate();
        }
        a(bcVar, this.f7342b);
        a(bcVar, this.c);
        a(bcVar, this.f7341a);
    }

    private void a(bc bcVar, Button button) {
        if (button.getVisibility() != 8 && (button.getHeight() < this.g || button.getWidth() < this.g)) {
            Rect rect = new Rect();
            bj.a(rect, button, this.g, this.g);
            if (button == null) {
                throw new NullPointerException("delegateView cannot be null");
            }
            bcVar.f7504a.put(button, new TouchDelegate(rect, button));
            return;
        }
        if (bcVar.f7504a.remove(button) != bcVar.f7505b) {
            return;
        }
        bcVar.f7505b = null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("positiveButtonEnabled", this.f7341a.isEnabled());
        bundle.putBoolean("negativeButtonShowing", this.f7342b.getVisibility() == 0);
        bundle.putBoolean("expandButtonEnabled", this.c.isEnabled());
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        this.f7341a.setEnabled(bundle.getBoolean("positiveButtonEnabled"));
        a(bundle.getBoolean("negativeButtonShowing"));
        this.c.setEnabled(bundle.getBoolean("expandButtonEnabled"));
    }

    @TargetApi(11)
    public void setPositiveButtonEnabled(boolean z) {
        this.f7341a.setEnabled(z);
        if (Build.VERSION.SDK_INT >= 11 && this.f >= 0.0f) {
            this.f7341a.setAlpha(z ? 1.0f : this.f);
        }
    }

    public void setExpandButtonEnabled(boolean z) {
        this.c.setEnabled(z);
    }

    public void setPositiveButtonText(String str) {
        if (this.h) {
            str = str.toUpperCase(getResources().getConfiguration().locale);
        }
        this.f7341a.setText(str);
    }

    public void setExpandButtonText(String str) {
        this.c.setText(str);
    }

    public void setPositiveButtonOnClickListener(View.OnClickListener onClickListener) {
        this.f7341a.setOnClickListener(onClickListener);
    }

    public void setNegativeButtonOnClickListener(View.OnClickListener onClickListener) {
        this.f7342b.setOnClickListener(onClickListener);
    }

    public void setExpandButtonOnClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public final void a(boolean z) {
        if (z) {
            if (this.c.getVisibility() == 0) {
                throw new IllegalStateException("Can't show negative button while expand button is visible.");
            }
            this.f7342b.setVisibility(0);
            if (this.j) {
                this.d.setVisibility(8);
                return;
            }
            return;
        }
        this.f7342b.setVisibility(8);
        if (this.j && this.c.getVisibility() != 0) {
            this.d.setVisibility(0);
        }
    }

    public final void b(boolean z) {
        if (z) {
            if (this.f7342b.getVisibility() == 0) {
                throw new IllegalStateException("Can't show expand button while negative button is visible.");
            }
            this.c.setVisibility(0);
            if (this.j) {
                this.d.setVisibility(8);
                return;
            }
            return;
        }
        this.c.setVisibility(8);
        if (this.j && this.f7342b.getVisibility() != 0) {
            this.d.setVisibility(0);
        }
    }
}
