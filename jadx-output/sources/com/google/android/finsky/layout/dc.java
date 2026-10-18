package com.google.android.finsky.layout;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes.dex */
final class dc implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RateReviewEditor2 f3215a;

    dc(RateReviewEditor2 rateReviewEditor2) {
        this.f3215a = rateReviewEditor2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        ButtonBar buttonBar;
        Drawable drawable;
        ButtonBar buttonBar2;
        TextView textView;
        TextView textView2;
        View.OnFocusChangeListener onFocusChangeListener;
        View.OnFocusChangeListener onFocusChangeListener2;
        ButtonBar buttonBar3;
        InsetDrawable insetDrawable;
        ButtonBar buttonBar4;
        TextView textView3;
        if (z) {
            buttonBar3 = this.f3215a.h;
            if (buttonBar3.getVisibility() != 0) {
                EditText editText = this.f3215a.c;
                insetDrawable = this.f3215a.j;
                editText.setBackgroundDrawable(insetDrawable);
                buttonBar4 = this.f3215a.h;
                buttonBar4.setVisibility(0);
                textView3 = this.f3215a.g;
                textView3.setVisibility(8);
                this.f3215a.post(new dd(this));
            }
        } else {
            buttonBar = this.f3215a.h;
            if (buttonBar.getVisibility() == 0) {
                EditText editText2 = this.f3215a.c;
                drawable = this.f3215a.i;
                editText2.setBackgroundDrawable(drawable);
                buttonBar2 = this.f3215a.h;
                buttonBar2.setVisibility(8);
                textView = this.f3215a.g;
                if (!TextUtils.isEmpty(textView.getText())) {
                    textView2 = this.f3215a.g;
                    textView2.setVisibility(0);
                }
            }
            ((InputMethodManager) this.f3215a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f3215a.c.getWindowToken(), 0);
        }
        onFocusChangeListener = this.f3215a.k;
        if (onFocusChangeListener != null) {
            onFocusChangeListener2 = this.f3215a.k;
            onFocusChangeListener2.onFocusChange(view, z);
        }
    }
}
