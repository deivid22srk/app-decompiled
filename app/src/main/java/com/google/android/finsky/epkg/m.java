package com.google.android.finsky.epkg;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public abstract class m extends Fragment implements cy {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.finsky.apkg.i f2759a;

    /* renamed from: b, reason: collision with root package name */
    public ai f2760b;

    public abstract int u();

    @Override // android.support.v4.app.Fragment
    public final void a(Activity activity) {
        super.a(activity);
        if (!(activity instanceof cy)) {
            throw new IllegalStateException("Parent activity must implement PlayStoreUiElementNode.");
        }
    }

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.f2760b = com.google.android.finsky.apkg.i.a(u());
        String string = this.r.getString("authAccount");
        if (string == null) {
            FinskyLog.e("authAccount argument not set.", new Object[0]);
        }
        this.f2759a = FinskyApp.a().f(string);
        if (bundle == null) {
            this.f2759a.a(0L, (cy) this);
        }
    }

    public final void b(int i) {
        this.f2759a.a(i, (byte[]) null, this);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public ai getPlayStoreUiElement() {
        return this.f2760b;
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
