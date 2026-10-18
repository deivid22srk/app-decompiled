package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.av;

/* loaded from: classes.dex */
public abstract class zzg<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f5793a;

    /* renamed from: b, reason: collision with root package name */
    private T f5794b;

    public class zza extends Exception {
        public zza(String str) {
            super(str);
        }

        public zza(String str, Throwable th) {
            super(str, th);
        }
    }

    public zzg(String str) {
        this.f5793a = str;
    }

    public final T a(Context context) {
        if (this.f5794b == null) {
            av.a(context);
            Context e = com.google.android.gms.common.c.e(context);
            if (e == null) {
                throw new zza("Could not get remote context.");
            }
            try {
                this.f5794b = a((IBinder) e.getClassLoader().loadClass(this.f5793a).newInstance());
            } catch (ClassNotFoundException e2) {
                throw new zza("Could not load creator class.", e2);
            } catch (IllegalAccessException e3) {
                throw new zza("Could not access creator.", e3);
            } catch (InstantiationException e4) {
                throw new zza("Could not instantiate creator.", e4);
            }
        }
        return this.f5794b;
    }

    public abstract T a(IBinder iBinder);
}
