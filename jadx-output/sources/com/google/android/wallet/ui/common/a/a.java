package com.google.android.wallet.ui.common.a;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.wallet.ui.common.ap;
import com.google.android.wallet.ui.common.bj;
import com.google.android.wallet.ui.common.f;
import com.google.android.wallet.ui.common.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements TextWatcher, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final List<ap> f7469a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final EditText f7470b;
    private final f c;
    private final t d;
    private boolean e;

    public a(EditText editText, f fVar, t tVar) {
        this.f7470b = editText;
        this.c = fVar;
        this.d = tVar;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.e = i3 == 0;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!this.f7470b.isFocused() || this.e || !this.c.ah_() || !this.d.af_()) {
            return;
        }
        int size = this.f7469a.size();
        for (int i = 0; i < size; i++) {
            this.f7469a.get(i).a(this.f7470b);
        }
        this.f7470b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        bj.g(this.f7470b);
    }
}
