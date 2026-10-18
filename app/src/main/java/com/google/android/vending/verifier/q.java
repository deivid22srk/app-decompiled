package com.google.android.vending.verifier;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* loaded from: classes.dex */
final class q implements DialogInterface.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f7173a;

    q(p pVar) {
        this.f7173a = pVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        PackageWarningDialogView packageWarningDialogView;
        if (i == 4 && keyEvent.getAction() == 1) {
            packageWarningDialogView = this.f7173a.aj;
            packageWarningDialogView.f7109a.putBoolean("pressed_back_button", true);
            return false;
        }
        return false;
    }
}
