package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.internal.ka;
import com.google.android.gms.internal.kj;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final h<kj> f5552a = new h<>();

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.common.api.f<kj, Object> f5553b = new b();
    public static final com.google.android.gms.common.api.a<Object> c = new com.google.android.gms.common.api.a<>("ClearcutLogger.API", f5553b, f5552a);
    public static final f d = new ka();
    public final f e;
    private final Context f;
    private final String g;
    private final int h;
    private String i;
    private int j;
    private String k;
    private String l;
    private final boolean m;
    private int n;
    private final com.google.android.gms.common.cpkg.a o;
    private e p;

    @Deprecated
    public a(Context context, String str) {
        this(context, str, d, com.google.android.gms.common.cpkg.f.c());
    }

    private a(Context context, String str, f fVar, com.google.android.gms.common.cpkg.a aVar) {
        this.j = -1;
        this.n = 0;
        this.f = context.getApplicationContext();
        this.g = context.getPackageName();
        this.h = a(context);
        this.j = -1;
        this.i = str;
        this.k = null;
        this.l = null;
        this.m = false;
        this.e = fVar;
        this.o = aVar;
        this.p = new e();
        this.n = 0;
        if (this.m) {
            av.b(this.k == null, "can't be anonymous with an upload account");
        }
    }

    private static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return 0;
        }
    }

    public final c a(byte[] bArr) {
        return new c(this, bArr, (char) 0);
    }

    static /* synthetic */ int[] a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int i = 0;
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return iArr;
            }
            i = i2 + 1;
            iArr[i2] = ((Integer) it.next()).intValue();
        }
    }
}
