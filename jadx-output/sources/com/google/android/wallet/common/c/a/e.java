package com.google.android.wallet.common.c.a;

import android.util.Log;
import android.util.Pair;
import com.android.volley.ParseError;
import com.android.volley.a.l;
import com.android.volley.k;
import com.android.volley.r;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.wallet.common.c.a.e;
import com.google.android.wallet.common.util.m;
import com.google.protobuf.nano.c;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e<RequestT extends e<RequestT, ResponseT>, ResponseT extends com.google.protobuf.nano.c> extends c<Pair<RequestT, ResponseT>> {
    public final byte[] j;
    public final a k;
    private final Map<String, String> l;
    private final Class<ResponseT> m;

    public abstract com.google.protobuf.nano.c q();

    public abstract String r();

    public e(a aVar, Map<String, String> map, byte[] bArr, Class<ResponseT> cls, t<Pair<RequestT, ResponseT>> tVar, s sVar) {
        super(tVar, sVar);
        this.k = aVar;
        this.l = map;
        this.j = bArr;
        this.m = cls;
        if (this.l.isEmpty()) {
            throw new IllegalArgumentException("There must be at least an EES serialization header.");
        }
    }

    @Override // com.android.volley.l
    public final Map<String, String> f() {
        android.support.v4.h.a aVar = new android.support.v4.h.a(this.l.size() + this.k.b().size());
        aVar.putAll(this.k.b());
        aVar.putAll(this.l);
        return aVar;
    }

    @Override // com.android.volley.l
    public final String j() {
        return "application/protobuf";
    }

    @Override // com.android.volley.l
    public final byte[] k() {
        com.google.protobuf.nano.c q = q();
        m.a(q, "SecureRequestProto=");
        return com.google.protobuf.nano.c.a(q);
    }

    @Override // com.android.volley.l
    public final String b() {
        return this.k.c.buildUpon().appendEncodedPath(r()).appendQueryParameter("s7e_mode", "proto").toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final r<Pair<RequestT, ResponseT>> a(k kVar) {
        try {
            Class<ResponseT> cls = this.m;
            ResponseT newInstance = this.m.newInstance();
            byte[] bArr = kVar.f1244b;
            ResponseT cast = cls.cast(com.google.protobuf.nano.c.a(newInstance, bArr, bArr.length));
            m.b(cast, b());
            return r.a(Pair.create(this, cast), l.a(kVar));
        } catch (IOException e) {
            String valueOf = String.valueOf(b());
            Log.e("SecureRequest", valueOf.length() != 0 ? "Couldn't parse proto response for url=".concat(valueOf) : new String("Couldn't parse proto response for url="));
            return r.a(new ParseError(kVar));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Failed to access proto constructor.", e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to instantiate proto object.", e3);
        }
    }
}
