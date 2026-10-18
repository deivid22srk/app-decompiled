package com.google.android.finsky.utils;

import android.annotation.TargetApi;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import com.google.android.finsky.api.model.Document;
import java.io.UnsupportedEncodingException;
import org.keyczar.Keyczar;

@TargetApi(10)
/* loaded from: classes.dex */
abstract class dn implements dq {

    /* renamed from: a, reason: collision with root package name */
    protected final com.google.android.finsky.activities.bh f4830a;

    /* renamed from: b, reason: collision with root package name */
    protected final NfcAdapter f4831b;

    /* synthetic */ dn(com.google.android.finsky.activities.bh bhVar, byte b2) {
        this(bhVar);
    }

    private dn(com.google.android.finsky.activities.bh bhVar) {
        this.f4830a = bhVar;
        this.f4831b = NfcAdapter.getDefaultAdapter(bhVar.f());
    }

    protected final NdefMessage a() {
        byte[] bytes;
        Document document = this.f4830a.f1612a;
        if (document == null) {
            return null;
        }
        String str = document.f1963a.F;
        try {
            bytes = str.getBytes(Keyczar.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e) {
            bytes = str.getBytes();
        }
        byte[] bArr = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        return new NdefMessage(new NdefRecord[]{new NdefRecord((short) 1, new byte[]{85}, new byte[0], bArr)});
    }
}
