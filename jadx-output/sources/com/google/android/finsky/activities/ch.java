package com.google.android.finsky.activities;

import android.R;
import android.content.DialogInterface;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class ch extends gj {
    private boolean aj = false;

    public ch() {
        b(true);
    }

    public static ch a(android.support.v4.app.aa aaVar, String str, String str2, boolean z) {
        b(aaVar);
        ch b2 = new ci().c(str).b(str2).d(R.string.ok).a(323, null, 2903, -1, null).b();
        b2.r.putBoolean("go_back", z);
        b2.a(aaVar, "error_dialog");
        return b2;
    }

    public final void a(android.support.v4.app.aa aaVar) {
        b(aaVar);
        this.r.putBoolean("go_back", false);
        super.a(aaVar, "error_dialog");
    }

    private static void b(android.support.v4.app.aa aaVar) {
        aaVar.b();
        ch chVar = (ch) aaVar.a("error_dialog");
        if (chVar != null) {
            android.support.v4.app.ap a2 = aaVar.a();
            try {
                chVar.aj = true;
                a2.a(chVar).a((String) null).b();
            } catch (IllegalStateException e) {
                FinskyLog.c("Double remove of error dialog fragment: " + chVar, new Object[0]);
            }
        }
    }

    @Override // android.support.v4.app.r, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.aj && f() != null && this.r.getBoolean("go_back")) {
            if (f() instanceof com.google.android.finsky.e.t) {
                ((com.google.android.finsky.e.t) f()).j();
            } else {
                FinskyLog.e("Dialog not hosted by PageFragmentHost. Cannot navigate back.", new Object[0]);
            }
        }
        super.onDismiss(dialogInterface);
    }
}
