package com.google.android.wallet.nfc;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.nfc.NfcAdapter;

/* loaded from: classes.dex */
public final class f implements c, e {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f7372a;

    /* renamed from: b, reason: collision with root package name */
    private final NfcAdapter f7373b;
    private final PendingIntent c;
    private final c d;
    private d e;
    private boolean f = false;

    @TargetApi(10)
    public f(Activity activity, c cVar) {
        this.f7372a = activity;
        this.f7373b = NfcAdapter.getDefaultAdapter(this.f7372a);
        this.c = PendingIntent.getActivity(this.f7372a, 0, new Intent(this.f7372a, this.f7372a.getClass()).addFlags(536870912), 0);
        this.d = cVar;
    }

    @Override // com.google.android.wallet.nfc.e
    public final boolean d() {
        return this.f;
    }

    @Override // com.google.android.wallet.nfc.e
    public final void a(Intent intent) {
        this.f = true;
        this.e = new d(this);
        this.e.execute(intent);
    }

    @Override // com.google.android.wallet.nfc.e
    @TargetApi(10)
    public final void a() {
        this.f7373b.enableForegroundDispatch(this.f7372a, this.c, null, null);
    }

    @Override // com.google.android.wallet.nfc.e
    @TargetApi(10)
    public final void b() {
        this.f7373b.disableForegroundDispatch(this.f7372a);
    }

    @Override // com.google.android.wallet.nfc.e
    public final boolean c() {
        return this.f7373b.isEnabled();
    }

    @Override // com.google.android.wallet.nfc.c
    public final void a(int i, a aVar, long j) {
        this.f = false;
        this.d.a(i, aVar, j);
    }
}
