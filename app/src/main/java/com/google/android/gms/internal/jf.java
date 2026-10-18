package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* loaded from: classes.dex */
final class jf implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f6085a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditText f6086b;

    jf(JsPromptResult jsPromptResult, EditText editText) {
        this.f6085a = jsPromptResult;
        this.f6086b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6085a.confirm(this.f6086b.getText().toString());
    }
}
