package com.google.android.wallet.ui.common;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
final class ad implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FormEditText f7477a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f7478b;

    ad(FormEditText formEditText) {
        this.f7477a = formEditText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        LinkedList textWatcherList;
        this.f7478b = this.f7477a.getError();
        z = this.f7477a.g;
        if (z) {
            Iterator<TextWatcher> it = this.f7477a.i.iterator();
            while (it.hasNext()) {
                it.next().beforeTextChanged(charSequence, i, i2, i3);
            }
        }
        textWatcherList = this.f7477a.getTextWatcherList();
        Iterator it2 = textWatcherList.iterator();
        while (it2.hasNext()) {
            ((TextWatcher) it2.next()).beforeTextChanged(charSequence, i, i2, i3);
        }
        if (this.f7477a.l != null) {
            this.f7477a.l.beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        LinkedList textWatcherList;
        z = this.f7477a.g;
        if (z) {
            Iterator<TextWatcher> it = this.f7477a.i.iterator();
            while (it.hasNext()) {
                it.next().onTextChanged(charSequence, i, i2, i3);
            }
        }
        textWatcherList = this.f7477a.getTextWatcherList();
        Iterator it2 = textWatcherList.iterator();
        while (it2.hasNext()) {
            ((TextWatcher) it2.next()).onTextChanged(charSequence, i, i2, i3);
        }
        if (this.f7477a.l != null) {
            this.f7477a.l.onTextChanged(charSequence, i, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        LinkedList textWatcherList;
        z = this.f7477a.g;
        if (z) {
            Iterator<TextWatcher> it = this.f7477a.i.iterator();
            while (it.hasNext()) {
                it.next().afterTextChanged(editable);
            }
        }
        textWatcherList = this.f7477a.getTextWatcherList();
        Iterator it2 = textWatcherList.iterator();
        while (it2.hasNext()) {
            ((TextWatcher) it2.next()).afterTextChanged(editable);
        }
        if (this.f7477a.l != null) {
            this.f7477a.l.afterTextChanged(editable);
        }
        CharSequence error = this.f7477a.getError();
        if (error != null && !TextUtils.equals(error, this.f7478b)) {
            this.f7477a.c();
        }
        this.f7478b = error;
    }
}
