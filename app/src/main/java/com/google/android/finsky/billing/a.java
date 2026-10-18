package com.google.android.finsky.billing;

import java.io.UnsupportedEncodingException;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class a implements com.android.a.a.z {

    /* renamed from: a, reason: collision with root package name */
    private final com.android.volley.a f2141a;

    public a(com.android.volley.a aVar) {
        this.f2141a = aVar;
    }

    @Override // com.android.a.a.z
    public final String a(String str) {
        com.android.volley.b a2 = this.f2141a.a("AddressMetadataCacheManager-" + str);
        if (a2 == null || a2.a()) {
            return "";
        }
        try {
            return new String(a2.f1228a, Keyczar.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    @Override // com.android.a.a.z
    public final void a(String str, String str2) {
        com.android.volley.b bVar = new com.android.volley.b();
        try {
            bVar.f1228a = str2.getBytes(Keyczar.DEFAULT_ENCODING);
            bVar.c = System.currentTimeMillis();
            bVar.e = bVar.c + 604800000;
            this.f2141a.a("AddressMetadataCacheManager-" + str, bVar);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    @Override // com.android.a.a.z
    public final String a() {
        return com.google.android.finsky.cpkg.d.ai.b();
    }
}
