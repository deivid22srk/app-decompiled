package com.google.android.finsky.billing.lightpurchase.c;

import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
final class x implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextView f2378a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f2379b;

    x(v vVar, TextView textView) {
        this.f2379b = vVar;
        this.f2378a = textView;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        EditText editText;
        EditText editText2;
        TextView textView = this.f2378a;
        v vVar = this.f2379b;
        i4 = v.f2374a;
        textView.setText(vVar.a(R.string.character_count_format, Integer.valueOf(charSequence.length()), Integer.valueOf(i4)));
        int length = charSequence.length();
        i5 = v.f2374a;
        if (length == i5) {
            android.support.v4.app.t f = this.f2379b.f();
            v vVar2 = this.f2379b;
            i6 = v.f2374a;
            String a2 = vVar2.a(R.string.max_character_count_reached, Integer.valueOf(i6));
            editText = this.f2379b.as;
            ik.a(f, a2, editText);
            editText2 = this.f2379b.as;
            ik.a((Activity) f, (View) editText2);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText;
        editText = this.f2379b.as;
        if (editText.hasFocus()) {
            this.f2379b.al = editable.toString().trim();
        }
    }
}
