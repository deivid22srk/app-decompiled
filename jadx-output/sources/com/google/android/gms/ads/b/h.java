package com.google.android.gms.ads.b;

import android.content.ContentResolver;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    private static String f5268a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f5269b = null;
    private static Boolean c = null;
    private final Context d;
    private AsyncTask<Void, Object, c> e;
    private int f = 1;

    static /* synthetic */ int b(h hVar) {
        hVar.f = 3;
        return 3;
    }

    static /* synthetic */ AsyncTask c(h hVar) {
        hVar.e = null;
        return null;
    }

    public h(ContentResolver contentResolver, Context context) {
        this.d = context;
        f5269b = Settings.Secure.getString(contentResolver, "android_id");
        new Handler(Looper.getMainLooper()).post(new i(this));
    }

    @Override // com.google.android.gms.ads.b.a
    public final synchronized void a(boolean z) {
        if (d() != 2) {
            String str = z ? "changed_by_user" : "app";
            this.f = 2;
            if (FinskyApp.a().e().a(12602796L)) {
                FinskyApp.a().h().b(new com.google.android.finsky.a.b(1102).f1473a);
            }
            this.e = new j(this, str);
            jm.a(this.e, new Void[0]);
        }
    }

    private synchronized int d() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093 A[Catch: all -> 0x0116, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0006, B:6:0x0017, B:8:0x0025, B:10:0x0029, B:15:0x0034, B:16:0x0045, B:19:0x004d, B:21:0x005b, B:25:0x007b, B:27:0x0085, B:28:0x008d, B:30:0x0093, B:35:0x0103, B:37:0x009a, B:39:0x009e, B:40:0x00b1, B:42:0x00b7, B:43:0x00cb, B:45:0x00d7, B:46:0x00f1), top: B:3:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(com.google.android.gms.ads.b.c r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.b.h.a(com.google.android.gms.ads.b.c, java.lang.String):void");
    }

    private synchronized void a(String str, Boolean bool) {
        f5268a = str;
        c = bool;
    }

    private synchronized String e() {
        return f5268a;
    }

    @Override // com.google.android.gms.ads.b.a
    public final synchronized String a() {
        String e;
        jm.b();
        if (!TextUtils.isEmpty(e())) {
            e = e();
        } else {
            this.f = 2;
            try {
                if (this.e != null) {
                    this.e.cancel(true);
                    this.e = null;
                }
                b.a(true);
                a(b.a(this.d), "blocking_by_app");
            } catch (Exception e2) {
                String simpleName = e2.getClass().getSimpleName();
                b(!TextUtils.isEmpty(e2.getMessage()) ? simpleName + ": " + e2.getMessage() : simpleName, "blocking_by_app");
            }
            this.f = 3;
            e = e();
        }
        return e;
    }

    @Override // com.google.android.gms.ads.b.a
    public final synchronized Boolean b() {
        return c;
    }

    @Override // com.google.android.gms.ads.b.a
    public final String c() {
        return f5269b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, String str2) {
        if (FinskyApp.a().e().a(12602796L)) {
            com.google.android.finsky.a.b bVar = new com.google.android.finsky.a.b(6);
            bVar.b(str2);
            if (!TextUtils.isEmpty(str)) {
                bVar.c(str);
            }
            FinskyApp.a().h().b(bVar.f1473a);
        }
    }
}
