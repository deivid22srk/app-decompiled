package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class a extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f5561a = null;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f5562b = null;

    public static a a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        a aVar = new a();
        Dialog dialog2 = (Dialog) com.google.android.gms.common.internal.av.a(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        aVar.f5561a = dialog2;
        if (onCancelListener != null) {
            aVar.f5562b = onCancelListener;
        }
        return aVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f5562b != null) {
            this.f5562b.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f5561a == null) {
            setShowsDialog(false);
        }
        return this.f5561a;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
