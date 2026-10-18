package com.google.android.gms.internal;

import com.google.android.gms.internal.aa;
import java.io.IOException;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class ab<M extends aa<M>, T> {

    /* renamed from: a, reason: collision with root package name */
    protected final int f5859a;

    /* renamed from: b, reason: collision with root package name */
    protected final Class<T> f5860b;
    public final int c;
    protected final boolean d;

    final void a(Object obj, zzaic zzaicVar) {
        if (!this.d) {
            b(obj, zzaicVar);
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                b(obj2, zzaicVar);
            }
        }
    }

    private void b(Object obj, zzaic zzaicVar) {
        try {
            zzaicVar.c(this.c);
            switch (this.f5859a) {
                case 10:
                    int b2 = ai.b(this.c);
                    ((af) obj).a(zzaicVar);
                    zzaicVar.c(b2, 4);
                    return;
                case 11:
                    zzaicVar.a((af) obj);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.f5859a);
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    final int a(Object obj) {
        int i = 0;
        if (!this.d) {
            return b(obj);
        }
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += b(Array.get(obj, i2));
            }
        }
        return i;
    }

    private int b(Object obj) {
        int b2 = ai.b(this.c);
        switch (this.f5859a) {
            case 10:
                return (zzaic.b(b2) * 2) + ((af) obj).d();
            case 11:
                return zzaic.b(b2, (af) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.f5859a);
        }
    }
}
