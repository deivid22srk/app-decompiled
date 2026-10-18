package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class FormSpinner extends AppCompatSpinner implements AdapterView.OnItemSelectedListener, t {

    /* renamed from: a, reason: collision with root package name */
    final l f7452a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<AdapterView.OnItemSelectedListener> f7453b;
    public boolean c;
    private List<AdapterView.OnItemSelectedListener> d;
    private l e;
    private View f;
    private boolean g;
    private String h;
    private boolean i;
    private boolean j;
    private boolean k;

    public FormSpinner(Context context) {
        super(context);
        this.f7452a = new aj(this);
        this.f7453b = new ArrayList<>(2);
        this.d = null;
        this.e = this.f7452a;
        this.g = true;
        this.j = false;
        this.c = false;
        this.k = true;
        a(context);
    }

    public FormSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7452a = new aj(this);
        this.f7453b = new ArrayList<>(2);
        this.d = null;
        this.e = this.f7452a;
        this.g = true;
        this.j = false;
        this.c = false;
        this.k = true;
        a(context);
    }

    public FormSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7452a = new aj(this);
        this.f7453b = new ArrayList<>(2);
        this.d = null;
        this.e = this.f7452a;
        this.g = true;
        this.j = false;
        this.c = false;
        this.k = true;
        a(context);
    }

    private void a(Context context) {
        super.setOnItemSelectedListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.internalUicValidateFieldsWhenNotVisible});
        this.c = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        if (onItemSelectedListener != null && !this.f7453b.contains(onItemSelectedListener)) {
            this.f7453b.add(onItemSelectedListener);
            this.d = null;
        }
    }

    private List<AdapterView.OnItemSelectedListener> getSafeListForListeners() {
        if (this.d == null) {
            this.d = Collections.unmodifiableList(new ArrayList(this.f7453b));
        }
        return this.d;
    }

    public void setErrorHandler(l lVar) {
        this.e = lVar;
    }

    public void setVisibilityMatchingView(View view) {
        this.f = view;
    }

    public void setShouldValidateWhenNotVisible(boolean z) {
        this.c = z;
    }

    public void setRequired(boolean z) {
        this.g = z;
    }

    public void setLabel(String str) {
        this.h = str;
    }

    @Override // com.google.android.wallet.ui.common.t
    public final boolean af_() {
        if (getAdapter() == null || getAdapter().isEmpty()) {
            throw new IllegalStateException("Must set non-empty adapter before validating");
        }
        this.i = true;
        if (ag_()) {
            this.e.a(null);
            return true;
        }
        this.e.a(getContext().getString(com.google.android.wallet.e.j.wallet_uic_error_field_must_not_be_empty));
        return false;
    }

    @Override // com.google.android.wallet.ui.common.t
    public void setError(CharSequence charSequence) {
        this.e.a(charSequence);
    }

    @Override // com.google.android.wallet.ui.common.t
    public CharSequence getError() {
        return this.e.a();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("potentialErrorOnConfigChange", this.i);
        bundle.putInt("selectedItemPosition", getSelectedItemPosition());
        return bundle;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        this.i = bundle.getBoolean("potentialErrorOnConfigChange");
        int i = bundle.getInt("selectedItemPosition");
        if (getSelectedItemPosition() != i) {
            setSelection(i);
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.j && getAdapter() != null) {
            this.j = true;
            if (this.i) {
                af_();
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (ag_()) {
            af_();
        }
        List<AdapterView.OnItemSelectedListener> safeListForListeners = getSafeListForListeners();
        int size = safeListForListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            safeListForListeners.get(i2).onItemSelected(adapterView, view, i, j);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        if (ag_()) {
            af_();
        }
        List<AdapterView.OnItemSelectedListener> safeListForListeners = getSafeListForListeners();
        int size = safeListForListeners.size();
        for (int i = 0; i < size; i++) {
            safeListForListeners.get(i).onNothingSelected(adapterView);
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z && getError() != null) {
            b();
        }
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f != null) {
            this.f.setVisibility(i);
        }
    }

    public void setNonUserInputSelection(int i) {
        this.k = true;
        setSelection(i);
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.k && accessibilityEvent.getEventType() == 4) {
            this.k = false;
        } else {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public final void b() {
        bj.a((View) this, (CharSequence) getErrorTextForAccessibility());
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        if (Build.VERSION.SDK_INT < 16 && accessibilityEvent.getEventType() == 8 && getError() != null) {
            accessibilityEvent.getText().add(getErrorTextForAccessibility());
            return true;
        }
        return true;
    }

    String getErrorTextForAccessibility() {
        return getResources().getString(com.google.android.wallet.e.j.wallet_uic_accessibility_event_form_field_error, this.h, getError());
    }

    @Override // com.google.android.wallet.ui.common.t
    public boolean ag_() {
        int selectedItemPosition;
        if (!this.g || (!this.c && getVisibility() != 0)) {
            return true;
        }
        SpinnerAdapter adapter = getAdapter();
        if (adapter != null && (selectedItemPosition = getSelectedItemPosition()) != -1) {
            if (adapter instanceof ListAdapter) {
                return ((ListAdapter) adapter).isEnabled(selectedItemPosition);
            }
            return true;
        }
        return false;
    }
}
