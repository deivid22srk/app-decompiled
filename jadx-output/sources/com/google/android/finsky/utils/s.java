package com.google.android.finsky.utils;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.deivid22srk.store.R;
import com.google.android.finsky.activities.MainActivity;

/* loaded from: classes.dex */
public final class s extends android.support.v4.app.r implements DialogInterface.OnClickListener {
    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        com.google.android.wallet.ui.common.a aVar = new com.google.android.wallet.ui.common.a(f());
        aVar.b(R.string.auto_update_enable_dialog_message);
        aVar.a(R.string.yes, this);
        aVar.b(R.string.no, this);
        return aVar.a();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -2:
                a(false);
                break;
            case -1:
                a(false);
                bg.t.a((com.google.android.finsky.c.o<Boolean>) true);
                bg.u.a((com.google.android.finsky.c.o<Boolean>) true);
                break;
        }
        android.support.v4.app.t f = f();
        if (f != null && (f instanceof MainActivity)) {
            ((MainActivity) f).b_(null);
        }
    }
}
