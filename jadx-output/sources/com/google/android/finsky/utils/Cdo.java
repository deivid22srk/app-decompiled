package com.google.android.finsky.utils;

import android.annotation.TargetApi;
import android.nfc.NdefMessage;

@TargetApi(10)
/* renamed from: com.google.android.finsky.utils.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo extends dn {
    private boolean c;

    public /* synthetic */ Cdo(com.google.android.finsky.activities.bh bhVar, byte b2) {
        this(bhVar);
    }

    private Cdo(com.google.android.finsky.activities.bh bhVar) {
        super(bhVar, (byte) 0);
        this.c = false;
    }

    @Override // com.google.android.finsky.utils.dq
    public final void b() {
        if (this.c) {
            this.f4831b.disableForegroundNdefPush(this.f4830a.f());
            this.c = false;
        }
    }

    @Override // com.google.android.finsky.utils.dq
    public final void c() {
        e();
    }

    @Override // com.google.android.finsky.utils.dq
    public final void d() {
        e();
    }

    private void e() {
        NdefMessage a2;
        if (!this.c && this.f4830a.j() && (a2 = a()) != null) {
            this.f4831b.enableForegroundNdefPush(this.f4830a.f(), a2);
            this.c = true;
        }
    }
}
