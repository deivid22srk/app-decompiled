package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.cpkg.h;
import com.google.android.gms.internal.mp;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f5775a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static b f5776b;
    private static Integer h;
    private final List<String> c;
    private final List<String> d;
    private final List<String> e;
    private final List<String> f;
    private f g;
    private f i;

    private b() {
        if (b() == com.google.android.gms.common.stats.e.f5782b) {
            this.c = Collections.EMPTY_LIST;
            this.d = Collections.EMPTY_LIST;
            this.e = Collections.EMPTY_LIST;
            this.f = Collections.EMPTY_LIST;
            return;
        }
        String d = com.google.android.gms.common.stats.d.f5780b.d();
        this.c = d == null ? Collections.EMPTY_LIST : Arrays.asList(d.split(","));
        String d2 = com.google.android.gms.common.stats.d.c.d();
        this.d = d2 == null ? Collections.EMPTY_LIST : Arrays.asList(d2.split(","));
        String d3 = com.google.android.gms.common.stats.d.d.d();
        this.e = d3 == null ? Collections.EMPTY_LIST : Arrays.asList(d3.split(","));
        String d4 = com.google.android.gms.common.stats.d.e.d();
        this.f = d4 == null ? Collections.EMPTY_LIST : Arrays.asList(d4.split(","));
        this.g = new f(com.google.android.gms.common.stats.d.f.d().longValue());
        this.i = new f(com.google.android.gms.common.stats.d.f.d().longValue());
    }

    public static b a() {
        synchronized (f5775a) {
            if (f5776b == null) {
                f5776b = new b();
            }
        }
        return f5776b;
    }

    public static String a(ServiceConnection serviceConnection) {
        return String.valueOf((Process.myPid() << 32) | System.identityHashCode(serviceConnection));
    }

    public final void a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
        a(context, a(serviceConnection), (String) null, (Intent) null, 1);
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public final boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if ((component == null || (com.google.android.gms.common.internal.g.f5709a && "com.google.android.gms".equals(component.getPackageName()))) ? false : com.google.android.gms.common.cpkg.e.a(context, component.getPackageName())) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        boolean bindService = context.bindService(intent, serviceConnection, i);
        if (bindService) {
            a(context, a(serviceConnection), str, intent, 2);
        }
        return bindService;
    }

    public final void a(Context context, String str, String str2, Intent intent, int i) {
        String str3;
        String str4;
        String str5;
        ServiceInfo serviceInfo;
        if (!(!com.google.android.gms.common.internal.g.f5709a ? false : b() != com.google.android.gms.common.stats.e.f5782b) || this.g == null) {
            return;
        }
        if (i != 4 && i != 1) {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
            if (queryIntentServices == null || queryIntentServices.size() == 0) {
                Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", intent.toUri(0), com.google.android.gms.common.cpkg.h.a(20)));
                serviceInfo = null;
            } else {
                if (queryIntentServices.size() > 1) {
                    Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", intent.toUri(0), com.google.android.gms.common.cpkg.h.a(20)));
                    Iterator<ResolveInfo> it = queryIntentServices.iterator();
                    if (it.hasNext()) {
                        Log.w("ConnectionTracker", it.next().serviceInfo.name);
                        serviceInfo = null;
                    }
                }
                serviceInfo = queryIntentServices.get(0).serviceInfo;
            }
            if (serviceInfo == null) {
                Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", str2, intent.toUri(0)));
                return;
            }
            str3 = serviceInfo.processName;
            str4 = serviceInfo.name;
            str5 = com.google.android.gms.common.cpkg.h.a(context, Binder.getCallingPid());
            if (!((this.c.contains(str5) || this.d.contains(str2) || this.e.contains(str3) || this.f.contains(str4) || (str3.equals(str5) && (b() & com.google.android.gms.common.stats.e.g) != 0)) ? false : true)) {
                return;
            } else {
                this.g.a(str);
            }
        } else {
            if (!this.g.b(str)) {
                return;
            }
            str3 = null;
            str4 = null;
            str5 = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str6 = null;
        if ((b() & com.google.android.gms.common.stats.e.f) != 0 && i != 13) {
            str6 = com.google.android.gms.common.cpkg.h.a(5);
        }
        long nativeHeapAllocatedSize = (b() & com.google.android.gms.common.stats.e.h) != 0 ? Debug.getNativeHeapAllocatedSize() : 0L;
        context.startService(new Intent().setComponent(com.google.android.gms.common.stats.e.f5781a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", (i == 1 || i == 4 || i == 14) ? new ConnectionEvent(currentTimeMillis, i, null, null, null, null, str6, str, SystemClock.elapsedRealtime(), nativeHeapAllocatedSize) : new ConnectionEvent(currentTimeMillis, i, str5, str2, str3, str4, str6, str, SystemClock.elapsedRealtime(), nativeHeapAllocatedSize)));
    }

    private static int b() {
        if (h == null) {
            try {
                h = Integer.valueOf(com.google.android.gms.common.internal.g.f5709a && mp.b() && mp.a() == Process.myUid() ? com.google.android.gms.common.stats.d.f5779a.d().intValue() : com.google.android.gms.common.stats.e.f5782b);
            } catch (SecurityException e) {
                h = Integer.valueOf(com.google.android.gms.common.stats.e.f5782b);
            }
        }
        return h.intValue();
    }
}
