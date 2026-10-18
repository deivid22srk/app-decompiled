package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzg;

/* loaded from: classes.dex */
public final class bh extends zzg<bl> {

    /* renamed from: a, reason: collision with root package name */
    private static final bh f5895a = new bh();

    private bh() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    public static bi a(String str, Context context) {
        bi b2;
        com.google.android.gms.common.b.a();
        return (com.google.android.gms.common.b.a(context) != 0 || (b2 = f5895a.b(str, context)) == null) ? new be(str, context) : b2;
    }

    private bi b(String str, Context context) {
        try {
            return bj.a(a(context).b(str, com.google.android.gms.dynamic.d.a(context)));
        } catch (RemoteException | zzg.zza e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.dynamic.zzg
    public final /* synthetic */ bl a(IBinder iBinder) {
        return bm.a(iBinder);
    }
}
