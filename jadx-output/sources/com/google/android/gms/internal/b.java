package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class b extends jn<String> {

    /* renamed from: a, reason: collision with root package name */
    private final jw<String> f5888a;

    private b(String str, jw<String> jwVar, jv jvVar) {
        super(str, jvVar);
        this.f5888a = jwVar;
    }

    public b(String str, jw<String> jwVar, jv jvVar, byte b2) {
        this(str, jwVar, jvVar);
    }

    @Override // com.google.android.gms.internal.jn
    protected final ju<String> a(gy gyVar) {
        String str;
        try {
            str = new String(gyVar.f6011b, qf.a(gyVar.c, "ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            str = new String(gyVar.f6011b);
        }
        return new ju<>(str, qf.a(gyVar));
    }

    @Override // com.google.android.gms.internal.jn
    protected final /* synthetic */ void a(String str) {
        this.f5888a.a(str);
    }
}
