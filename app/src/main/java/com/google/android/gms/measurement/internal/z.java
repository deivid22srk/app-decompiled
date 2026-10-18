package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

/* loaded from: classes.dex */
public final class z extends ba {

    /* renamed from: a, reason: collision with root package name */
    public final ab f6388a;

    /* renamed from: b, reason: collision with root package name */
    public final ab f6389b;
    final ab c;
    final ab d;
    final ab e;
    final ab f;
    public final ab g;
    private final String j;
    private final char k;
    private final long l;
    private final ab m;
    private final ab n;

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    private static String a(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        Object valueOf = obj instanceof Integer ? Long.valueOf(((Integer) obj).intValue()) : obj;
        if (valueOf instanceof Long) {
            if (z && Math.abs(((Long) valueOf).longValue()) >= 100) {
                String str = String.valueOf(valueOf).charAt(0) == '-' ? "-" : "";
                String valueOf2 = String.valueOf(Math.abs(((Long) valueOf).longValue()));
                return str + Math.round(Math.pow(10.0d, valueOf2.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, valueOf2.length()) - 1.0d);
            }
            return String.valueOf(valueOf);
        }
        if (valueOf instanceof Boolean) {
            return String.valueOf(valueOf);
        }
        if (!(valueOf instanceof Throwable)) {
            return z ? "-" : String.valueOf(valueOf);
        }
        Throwable th = (Throwable) valueOf;
        StringBuilder sb = new StringBuilder(th.toString());
        String a2 = a(com.google.android.gms.measurement.a.class.getCanonicalName());
        String a3 = a(ap.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                String a4 = a(className);
                if (a4.equals(a2) || a4.equals(a3)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb.toString();
    }

    private static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String a2 = a(z, obj);
        String a3 = a(z, obj2);
        String a4 = a(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a4)) {
            sb.append(str2);
            sb.append(a4);
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.ba
    protected final void a() {
    }

    protected final void a(int i, String str) {
        Log.println(i, this.j, str);
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ x f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ bg g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.cpkg.a h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ Context i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ g j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ al k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ z l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ ai m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ i n() {
        return super.n();
    }

    z(ap apVar) {
        super(apVar);
        this.j = com.google.android.gms.measurement.internal.i.a();
        this.l = com.google.android.gms.measurement.internal.i.A();
        if (super.n().C()) {
            this.k = com.google.android.gms.measurement.internal.i.B() ? 'P' : 'C';
        } else {
            this.k = com.google.android.gms.measurement.internal.i.B() ? 'p' : 'c';
        }
        this.f6388a = new ab(this, 6, false, false);
        this.m = new ab(this, 6, true, false);
        this.n = new ab(this, 6, false, true);
        this.f6389b = new ab(this, 5, false, false);
        this.c = new ab(this, 5, true, false);
        this.d = new ab(this, 5, false, true);
        this.e = new ab(this, 4, false, false);
        this.f = new ab(this, 3, false, false);
        this.g = new ab(this, 2, false, false);
    }

    protected final void a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(this.j, i)) {
            a(i, a(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        com.google.android.gms.common.internal.av.a(str);
        al alVar = this.h.c;
        if (alVar == null || !alVar.t() || alVar.i) {
            a(6, "Scheduler not initialized or shutdown. Not logging error/warn.");
            return;
        }
        int i2 = i < 0 ? 0 : i;
        if (i2 >= 9) {
            i2 = 8;
        }
        String str2 = "1" + "01VDIWEA?".charAt(i2) + this.k + this.l + ":" + a(true, str, obj, obj2, obj3);
        if (str2.length() > 1024) {
            str2 = str.substring(0, 1024);
        }
        alVar.a(new aa(this, str2));
    }

    public final String b() {
        long abs;
        SharedPreferences s;
        SharedPreferences s2;
        Pair<String, Long> pair;
        ak akVar = super.m().f6302b;
        akVar.e.e();
        akVar.e.e();
        long b2 = akVar.b();
        if (b2 == 0) {
            akVar.a();
            abs = 0;
        } else {
            abs = Math.abs(b2 - akVar.e.h().a());
        }
        if (abs < akVar.d) {
            pair = null;
        } else if (abs > akVar.d * 2) {
            akVar.a();
            pair = null;
        } else {
            s = akVar.e.s();
            String string = s.getString(akVar.c, null);
            s2 = akVar.e.s();
            long j = s2.getLong(akVar.f6306b, 0L);
            akVar.a();
            pair = (string == null || j <= 0) ? ai.f6301a : new Pair<>(string, Long.valueOf(j));
        }
        if (pair == null) {
            return null;
        }
        return String.valueOf(pair.second) + ":" + ((String) pair.first);
    }
}
