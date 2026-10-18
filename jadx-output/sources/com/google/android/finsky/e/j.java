package com.google.android.finsky.e;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes.dex */
final class j implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f2758a;

    j(i iVar) {
        this.f2758a = iVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.f2758a.a(true);
        return true;
    }
}
