package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class b extends ae {

    /* renamed from: a, reason: collision with root package name */
    int f5707a;

    /* renamed from: b, reason: collision with root package name */
    private Account f5708b;
    private Context c;

    public static Account a(ad adVar) {
        Account account = null;
        if (adVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = adVar.a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    @Override // com.google.android.gms.common.internal.ad
    public final Account a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid == this.f5707a) {
            return this.f5708b;
        }
        if (!com.google.android.gms.common.c.a(this.c, callingUid)) {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
        this.f5707a = callingUid;
        return this.f5708b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f5708b.equals(((b) obj).f5708b);
        }
        return false;
    }
}
