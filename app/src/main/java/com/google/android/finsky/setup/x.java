package com.google.android.finsky.setup;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.finsky.protos.lm;
import com.google.android.finsky.services.VpaService;
import com.google.android.finsky.services.bh;

/* loaded from: classes.dex */
final class x implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ VpaSelectionActivity f4682a;

    x(VpaSelectionActivity vpaSelectionActivity) {
        this.f4682a = vpaSelectionActivity;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        lm[] lmVarArr;
        VpaService vpaService;
        this.f4682a.v = ((bh) iBinder).f4616a;
        lmVarArr = this.f4682a.u;
        if (lmVarArr == null) {
            vpaService = this.f4682a.v;
            y yVar = new y(this);
            if (VpaService.f4558a != null) {
                yVar.a(VpaService.f4558a);
            } else {
                vpaService.f4559b.add(yVar);
                vpaService.d();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f4682a.v = null;
    }
}
