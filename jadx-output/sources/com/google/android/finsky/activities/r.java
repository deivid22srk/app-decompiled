package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* loaded from: classes.dex */
final class r implements DialogInterface.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f1868a;

    r(d dVar) {
        this.f1868a = dVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 84;
    }
}
