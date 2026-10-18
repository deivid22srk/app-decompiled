package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.zzam;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class as extends zzam {
    private static com.google.android.gms.ads.b.b m = null;
    private static CountDownLatch n = new CountDownLatch(1);
    private static volatile boolean o;
    private boolean p;

    private as(Context context, av avVar, aw awVar, boolean z) {
        super(context, avVar, awVar);
        this.p = false;
    }

    public static as a(String str, Context context) {
        d dVar = new d();
        a(str, context, dVar);
        return new as(context, dVar, new ax(239), false);
    }

    private at c() {
        at atVar;
        try {
            if (!n.await(2L, TimeUnit.SECONDS)) {
                return new at(this, null, false);
            }
            synchronized (as.class) {
                if (m == null) {
                    atVar = new at(this, null, false);
                } else {
                    com.google.android.gms.ads.b.c a2 = m.a();
                    atVar = new at(this, a(a2.f5259a), a2.f5260b);
                }
            }
            return atVar;
        } catch (InterruptedException e) {
            return new at(this, null, false);
        }
    }

    @Override // com.google.android.gms.internal.zzam, com.google.android.gms.internal.aq
    protected final void b(Context context) {
        super.b(context);
        try {
            if (o || !this.p) {
                a(24, d(context));
                a(24, h);
            } else {
                at c = c();
                String str = c.f5882a;
                if (str != null) {
                    a(28, c.f5883b ? 1L : 0L);
                    a(26, 5L);
                    a(24, str);
                    a(28, h);
                }
            }
        } catch (zzam.zza e) {
        } catch (IOException e2) {
        }
    }
}
