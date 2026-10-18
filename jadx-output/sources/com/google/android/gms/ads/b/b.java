package com.google.android.gms.ads.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.internal.bq;
import com.google.android.gms.internal.br;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b {
    private static boolean h = false;

    /* renamed from: a, reason: collision with root package name */
    com.google.android.gms.common.f f5257a;

    /* renamed from: b, reason: collision with root package name */
    bq f5258b;
    boolean c;
    Object d = new Object();
    d e;
    final long f;
    private final Context g;

    private b(Context context, long j) {
        av.a(context);
        this.g = context;
        this.c = false;
        this.f = -1L;
    }

    public static c a(Context context) {
        b bVar = new b(context, -1L);
        try {
            bVar.b(false);
            return bVar.a();
        } finally {
            bVar.b();
        }
    }

    private static bq a(com.google.android.gms.common.f fVar) {
        try {
            return br.a(fVar.a());
        } catch (InterruptedException e) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static void a(boolean z) {
        h = z;
    }

    private static com.google.android.gms.common.f b(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            if (h) {
                Log.d("Ads", "Skipping gmscore version check");
                com.google.android.gms.common.b.a();
                switch (com.google.android.gms.common.b.a(context)) {
                    case 0:
                    case 2:
                        break;
                    case 1:
                    default:
                        throw new IOException("Google Play services not available");
                }
            } else {
                try {
                    com.google.android.gms.common.c.b(context);
                } catch (GooglePlayServicesNotAvailableException th) {
                    throw new IOException(th);
                }
            }
            com.google.android.gms.common.f fVar = new com.google.android.gms.common.f();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (com.google.android.gms.common.stats.b.a().a(context, intent, fVar, 1)) {
                    return fVar;
                }
                throw new IOException("Connection failure");
            } finally {
                IOException iOException = new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    private void b(boolean z) {
        av.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                b();
            }
            this.f5257a = b(this.g);
            this.f5258b = a(this.f5257a);
            this.c = true;
        }
    }

    public final void b() {
        av.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.g == null || this.f5257a == null) {
                return;
            }
            try {
                if (this.c) {
                    com.google.android.gms.common.stats.b.a().a(this.g, this.f5257a);
                }
            } catch (IllegalArgumentException e) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", e);
            }
            this.c = false;
            this.f5258b = null;
            this.f5257a = null;
        }
    }

    protected final void finalize() {
        b();
        super.finalize();
    }

    public final c a() {
        c cVar;
        av.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.c) {
                synchronized (this.d) {
                    if (this.e == null || !this.e.f5262b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    b(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            av.a(this.f5257a);
            av.a(this.f5258b);
            try {
                cVar = new c(this.f5258b.a(), this.f5258b.a(true));
            } catch (RemoteException e2) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                throw new IOException("Remote exception");
            }
        }
        synchronized (this.d) {
            if (this.e != null) {
                this.e.f5261a.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException e3) {
                }
            }
            if (this.f > 0) {
                this.e = new d(this, this.f);
            }
        }
        return cVar;
    }
}
