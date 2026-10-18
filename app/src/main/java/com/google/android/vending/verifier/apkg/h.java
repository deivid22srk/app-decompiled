package com.google.android.vending.verifier.apkg;

import android.net.Uri;
import com.google.android.vending.verifier.bpkg.k;
import com.google.android.vending.verifier.bpkg.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f7114a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7115b;
    public final Uri c;
    public final byte[] d;
    public final boolean e;
    public final int f;

    public h(int i, String str, Uri uri, byte[] bArr, boolean z, int i2) {
        this.f7114a = i;
        this.f7115b = str;
        this.c = uri;
        this.d = bArr;
        this.e = z;
        this.f = i2;
    }

    public static h a(k kVar) {
        String str;
        Uri uri = null;
        l lVar = kVar.c;
        int i = 0;
        if (lVar != null) {
            str = lVar.f7138a;
            i = lVar.e;
            if (lVar.c != null) {
                uri = Uri.parse(lVar.c);
            }
        } else {
            str = null;
        }
        return new h(kVar.f7136a, str, uri, kVar.d, kVar.h, i);
    }
}
