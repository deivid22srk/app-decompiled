package com.google.android.finsky.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;

@TargetApi(14)
/* loaded from: classes.dex */
public final class dp extends dn implements NfcAdapter.CreateNdefMessageCallback {
    public /* synthetic */ dp(com.google.android.finsky.activities.bh bhVar, byte b2) {
        this(bhVar);
    }

    private dp(com.google.android.finsky.activities.bh bhVar) {
        super(bhVar, (byte) 0);
    }

    @Override // android.nfc.NfcAdapter.CreateNdefMessageCallback
    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        return a();
    }

    @Override // com.google.android.finsky.utils.dq
    public final void b() {
        a(null);
    }

    @Override // com.google.android.finsky.utils.dq
    public final void c() {
        a(this);
    }

    @Override // com.google.android.finsky.utils.dq
    public final void d() {
        a(this);
    }

    private void a(NfcAdapter.CreateNdefMessageCallback createNdefMessageCallback) {
        if (this.f4830a.L() && this.f4831b != null) {
            this.f4831b.setNdefPushMessageCallback(createNdefMessageCallback, this.f4830a.f(), new Activity[0]);
        }
    }
}
