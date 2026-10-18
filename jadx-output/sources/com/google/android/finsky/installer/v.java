package com.google.android.finsky.installer;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInstaller;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ea;
import com.google.android.finsky.utils.ht;
import com.google.android.finsky.utils.jm;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes.dex */
public final class v implements s {

    /* renamed from: a, reason: collision with root package name */
    final Context f2872a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInstaller f2873b;
    private final Map<String, PackageInstaller.SessionInfo> c = new HashMap();
    private final Map<String, PackageInstaller.Session> d;

    public v(Context context) {
        this.f2872a = context;
        this.f2873b = this.f2872a.getPackageManager().getPackageInstaller();
        for (PackageInstaller.SessionInfo sessionInfo : this.f2873b.getMySessions()) {
            String appPackageName = sessionInfo.getAppPackageName();
            PackageInstaller.SessionInfo put = this.c.put(appPackageName, sessionInfo);
            if (put != null) {
                FinskyLog.c("Multiple sessions for %s found. Removing %d & keeping %d.", appPackageName, Integer.valueOf(put.getSessionId()), Integer.valueOf(sessionInfo.getSessionId()));
            }
        }
        this.d = new HashMap();
    }

    @Override // com.google.android.finsky.installer.s
    public final void a(String str, long j, String str2, int i) {
        try {
            b(str, j, str2, i);
        } catch (IOException e) {
            FinskyLog.a(e, "Couldn't create session for %s: %s", str, e.getMessage());
        }
    }

    private synchronized void b(String str, long j, String str2, int i) {
        if (this.c.containsKey(str)) {
            FinskyLog.e("Creating session for %s when one already exists", str);
        } else {
            PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
            if (!TextUtils.isEmpty(str2)) {
                sessionParams.setAppLabel(str2);
            }
            sessionParams.setAppPackageName(str);
            sessionParams.setInstallLocation(i);
            if (j > 0) {
                sessionParams.setSize(j);
            }
            if (c(str)) {
                try {
                    PackageInstaller.SessionParams.class.getMethod("setGrantedRuntimePermissions", String[].class).invoke(sessionParams, new String[]{"android.permission.SYSTEM_ALERT_WINDOW"});
                } catch (IllegalAccessException e) {
                    FinskyLog.c("Can't invoke setGrantedRuntimePermissions for %s: %s", str, e);
                } catch (NoSuchMethodException e2) {
                    FinskyLog.c("Can't find setGrantedRuntimePermissions for %s: %s", str, e2);
                } catch (InvocationTargetException e3) {
                    FinskyLog.c("Can't invoke setGrantedRuntimePermissions for %s: %s", str, e3);
                }
            }
            int createSession = this.f2873b.createSession(sessionParams);
            this.c.put(str, this.f2873b.getSessionInfo(createSession));
            FinskyLog.a("Created session %d for %s", Integer.valueOf(createSession), str);
        }
    }

    private static boolean c(String str) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23 && FinskyApp.a().e().a(12604360L)) {
            String[] d = jm.d(com.google.android.finsky.c.d.M.b());
            if (d.length != 0) {
                int length = d.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (str.equals(d[i])) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.finsky.installer.s
    public final synchronized boolean a(String str) {
        return this.c.containsKey(str);
    }

    @Override // com.google.android.finsky.installer.s
    public final synchronized void b(String str) {
        PackageInstaller.SessionInfo sessionInfo = this.c.get(str);
        if (sessionInfo != null) {
            a(sessionInfo.getSessionId(), str);
        }
    }

    final synchronized void a(int i, String str) {
        e(str);
        this.c.remove(str);
        try {
            this.f2873b.abandonSession(i);
            FinskyLog.a("Canceling session %d for %s", Integer.valueOf(i), str);
        } catch (SecurityException e) {
        }
    }

    @Override // com.google.android.finsky.installer.s
    public final synchronized void a(List<String> list) {
        HashSet<String> a2 = ht.a(this.c.keySet());
        a2.removeAll(list);
        for (String str : a2) {
            FinskyLog.a("Pruning stale session for %s", str);
            b(str);
        }
    }

    @Override // com.google.android.finsky.installer.s
    public final synchronized void a(String str, long j, long j2) {
        PackageInstaller.Session d = d(str);
        if (d != null && j2 > 0) {
            try {
                d.setStagingProgress(j / j2);
            } catch (Exception e) {
                FinskyLog.d("Session for %s unexpectedly closed: %s", e.getMessage());
                this.d.remove(str);
            }
        }
    }

    @Override // com.google.android.finsky.installer.s
    public final int a() {
        return ((ActivityManager) this.f2872a.getSystemService("activity")).getLauncherLargeIconSize();
    }

    @Override // com.google.android.finsky.installer.s
    public final synchronized void a(String str, Bitmap bitmap) {
        PackageInstaller.SessionInfo sessionInfo = this.c.get(str);
        if (sessionInfo != null) {
            try {
                this.f2873b.updateSessionAppIcon(sessionInfo.getSessionId(), bitmap);
            } catch (SecurityException e) {
                FinskyLog.c("Stale session id %d for %s", Integer.valueOf(sessionInfo.getSessionId()), str);
            }
        }
    }

    private synchronized PackageInstaller.Session d(String str) {
        PackageInstaller.Session session;
        session = this.d.get(str);
        if (session != null) {
            try {
                session.getNames();
            } catch (IOException e) {
                FinskyLog.d("Stale open session for %s: %s", str, e.getMessage());
                this.d.remove(str);
            } catch (SecurityException e2) {
                FinskyLog.d("Stale open session for %s: %s", str, e2.getMessage());
                this.d.remove(str);
            }
        }
        PackageInstaller.SessionInfo sessionInfo = this.c.get(str);
        if (sessionInfo == null) {
            session = null;
        } else {
            try {
                session = this.f2873b.openSession(sessionInfo.getSessionId());
                this.d.put(str, session);
            } catch (IOException e3) {
                FinskyLog.c("IOException opening old session for %s - deleting info", e3.getMessage());
                this.c.remove(str);
                session = null;
            } catch (SecurityException e4) {
                FinskyLog.c("SessionInfo was stale for %s - deleting info", str);
                this.c.remove(str);
                session = null;
            }
        }
        return session;
    }

    private synchronized void e(String str) {
        PackageInstaller.Session remove = this.d.remove(str);
        if (remove != null) {
            try {
                remove.close();
            } catch (Exception e) {
                FinskyLog.d("Unexpected error closing session for %s: %s", str, e.getMessage());
            }
        }
    }

    @Override // com.google.android.finsky.installer.s
    public final boolean a(boolean z) {
        return true;
    }

    @Override // com.google.android.finsky.installer.s
    public final OutputStream a(String str, String str2, long j) {
        PackageInstaller.Session d = d(str);
        if (d == null) {
            FinskyLog.d("Can't open session for %s", str);
            throw new IOException();
        }
        return new y(d.openWrite(str2, 0L, j), d);
    }

    @Override // com.google.android.finsky.installer.s
    public final void a(OutputStream outputStream) {
        OutputStream outputStream2;
        PackageInstaller.Session session;
        y yVar = (y) outputStream;
        outputStream2 = yVar.f2878a;
        session = yVar.f2879b;
        session.fsync(outputStream2);
        outputStream2.close();
    }

    @Override // com.google.android.finsky.installer.s
    public final void a(String str, Uri uri) {
        FinskyLog.e("Cannot install %s from uri %s", str, uri);
    }

    @Override // com.google.android.finsky.installer.s
    public final synchronized void a(String str, boolean z, t tVar) {
        PackageInstaller.SessionInfo sessionInfo = this.c.get(str);
        PackageInstaller.Session session = this.d.get(str);
        if (sessionInfo == null || session == null) {
            FinskyLog.e("Unexpected missing open session for %s", str);
            new Handler(Looper.getMainLooper()).post(new w(this, tVar));
        } else {
            x xVar = new x(this, str, sessionInfo.getSessionId(), tVar);
            String str2 = "com.android.vending.INTENT_PACKAGE_INSTALL_COMMIT." + str;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(str2);
            this.f2872a.registerReceiver(xVar, intentFilter);
            session.commit(PendingIntent.getBroadcast(this.f2872a, str.hashCode(), new Intent(str2), 1207959552).getIntentSender());
            session.close();
            this.d.remove(str);
        }
    }

    @Override // com.google.android.finsky.installer.s
    public final void a(String str, boolean z) {
        ea.a(str, z);
    }
}
