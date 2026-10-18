package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class s extends m {
    public final IBinder e;
    final /* synthetic */ l f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(l lVar, int i, IBinder iBinder, Bundle bundle) {
        super(lVar, i, bundle);
        this.f = lVar;
        this.e = iBinder;
    }

    protected final void a(ConnectionResult connectionResult) {
        com.google.android.gms.common.api.q qVar;
        com.google.android.gms.common.api.q qVar2;
        qVar = this.f.s;
        if (qVar != null) {
            qVar2 = this.f.s;
            qVar2.a(connectionResult);
        }
        l.k();
    }

    protected final boolean a() {
        boolean a2;
        com.google.android.gms.common.api.p pVar;
        com.google.android.gms.common.api.p pVar2;
        try {
            String interfaceDescriptor = this.e.getInterfaceDescriptor();
            if (!this.f.e().equals(interfaceDescriptor)) {
                Log.e("GmsClient", "service descriptor mismatch: " + this.f.e() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface a3 = this.f.a(this.e);
            if (a3 == null) {
                return false;
            }
            a2 = this.f.a(2, 3, a3);
            if (!a2) {
                return false;
            }
            pVar = this.f.r;
            if (pVar != null) {
                pVar2 = this.f.r;
                pVar2.a((Bundle) null);
            }
            return true;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
