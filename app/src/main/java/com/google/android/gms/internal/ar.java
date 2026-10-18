package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class ar extends aq {
    com.google.android.gms.ads.bpkg.c e;
    private ax f;

    ar(Context context, av avVar, aw awVar) {
        super(context, avVar, awVar);
        this.f = new ax(1000);
    }

    public final String a(String str, String str2) {
        try {
            this.f.a();
            this.f.a(1, str.length() < 3 ? str.getBytes(Keyczar.DEFAULT_ENCODING) : this.c.a(str, true));
            this.f.a(2, str2.length() < 3 ? str2.getBytes(Keyczar.DEFAULT_ENCODING) : this.c.a(str2, true));
            return this.c.a(this.f.b());
        } catch (IOException e) {
            return Integer.toString(3);
        }
    }

    @Override // com.google.android.gms.internal.aq
    protected final void c(Context context) {
    }

    @Override // com.google.android.gms.internal.aq
    protected final void b(Context context) {
        try {
            if (this.e != null) {
                a(24, a(this.e.f5259a));
                a(26, 5L);
                a(28, this.e.f5260b ? 1L : 0L);
            }
        } catch (IOException e) {
        } finally {
            this.e = null;
        }
    }
}
