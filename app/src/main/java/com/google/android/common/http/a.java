package com.google.android.common.http;

import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

/* loaded from: classes.dex */
public final class a extends HttpEntityWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final String f1427a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1428b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public a(HttpEntity httpEntity, String str, int i, long j, long j2, long j3, long j4) {
        super(httpEntity);
        this.f1427a = str;
        this.f1428b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public final InputStream getContent() {
        return new b(this, super.getContent());
    }
}
