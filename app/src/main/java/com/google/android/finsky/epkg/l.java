package com.google.android.finsky.epkg;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public abstract class l extends android.support.v4.app.r implements cy {
    public final ai ai = com.google.android.finsky.apkg.i.a(u());
    public com.google.android.finsky.apkg.i aj;

    public abstract int u();

    @Override // android.support.v4.app.r, android.support.v4.app.Fragment
    public final void a(Activity activity) {
        super.a(activity);
        if (!(activity instanceof cy)) {
            throw new IllegalStateException("Parent activity must implement PlayStoreUiElementNode.");
        }
    }

    @Override // android.support.v4.app.r, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        String string = this.r.getString("authAccount");
        if (string == null) {
            FinskyLog.e("authAccount argument not set.", new Object[0]);
        }
        this.aj = FinskyApp.a().f(string);
        if (bundle == null) {
            this.aj.a(0L, (cy) this);
        }
    }

    @Override // android.support.v4.app.r, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.aj != null) {
            this.aj.b(603, null, this);
        }
        super.onDismiss(dialogInterface);
    }

    public final void b(int i) {
        this.aj.a(i, (byte[]) null, this);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public ai getPlayStoreUiElement() {
        return this.ai;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return (cy) f();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        throw new UnsupportedOperationException("Unwanted children.");
    }
}
