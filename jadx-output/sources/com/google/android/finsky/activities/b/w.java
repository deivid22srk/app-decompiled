package com.google.android.finsky.activities.b;

import android.content.Context;
import android.widget.Toast;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class w implements com.google.android.finsky.utils.m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f1600a;

    w(u uVar) {
        this.f1600a = uVar;
    }

    @Override // com.google.android.finsky.utils.m
    public final void a() {
        Context context;
        context = this.f1600a.ap;
        Toast.makeText(context, R.string.refunding, 1).show();
    }

    @Override // com.google.android.finsky.utils.m
    public final void a(boolean z) {
        t tVar;
        t tVar2;
        if (z) {
            tVar = this.f1600a.ai;
            if (tVar != null) {
                tVar2 = this.f1600a.ai;
                tVar2.f774a.a();
            }
        }
    }
}
