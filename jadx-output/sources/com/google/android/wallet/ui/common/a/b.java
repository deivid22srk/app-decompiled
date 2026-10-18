package com.google.android.wallet.ui.common.a;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.wallet.b.e;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.b.a.a.a.b.a.b.i;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f7471a;

    /* renamed from: b, reason: collision with root package name */
    private final i f7472b;
    private final e c;
    private final Pattern d;

    public b(EditText editText, i iVar, e eVar) {
        this.f7471a = editText;
        this.f7472b = iVar;
        this.c = eVar;
        if (iVar.c.f7679a != null) {
            this.d = Pattern.compile(iVar.c.f7679a.f7678b);
        } else {
            this.d = null;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.d == null) {
            this.c.a(this.f7472b);
            return;
        }
        CharSequence charSequence = editable;
        if (this.f7471a instanceof FormEditText) {
            charSequence = ((FormEditText) this.f7471a).getValue();
        }
        if (this.d.matcher(charSequence).matches()) {
            this.c.a(this.f7472b);
        }
    }
}
