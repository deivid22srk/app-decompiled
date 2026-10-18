package com.google.android.finsky.download;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.safemode.SafeModeDownloadBroadcastReceiver;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.el;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jm;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f2716a = Uri.parse("content://downloads/my_downloads");

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f2717b = Uri.parse("content://downloads/download");
    private static Boolean c = null;
    private static final String[] d = {"_data"};
    private final ContentResolver e;
    private final Handler f;
    private final String g;
    private final String[] h;
    private Cursor i;
    private ContentObserver j;
    private h k;

    protected j(Context context) {
        this.e = context.getContentResolver();
        HandlerThread a2 = com.google.android.finsky.utils.t.a("download-manager-thread");
        a2.start();
        this.f = new Handler(a2.getLooper());
        this.j = new k(this, this.f);
        if (com.google.android.finsky.safemode.a.a()) {
            this.g = SafeModeDownloadBroadcastReceiver.class.getName();
        } else {
            this.g = DownloadBroadcastReceiver.class.getName();
        }
        this.h = new String[]{this.g};
    }

    @Override // com.google.android.finsky.download.g
    public final void a(b bVar, el<Uri> elVar) {
        if (Build.MODEL.equals("google_sdk")) {
            FinskyLog.b("Skip download of %s because emulator", bVar.toString());
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("otheruid", (Integer) 1000);
        contentValues.put("uri", bVar.c());
        Uri f = bVar.f();
        if (f != null) {
            contentValues.put("destination", (Integer) 4);
            contentValues.put("hint", f.toString());
        } else {
            contentValues.put("destination", (Integer) 2);
        }
        contentValues.put("notificationpackage", FinskyApp.a().getPackageName());
        contentValues.put("notificationclass", this.g);
        String g = bVar.g();
        String h = bVar.h();
        if (g != null && h != null) {
            contentValues.put("cookiedata", g + "=" + h);
        }
        boolean i = bVar.i();
        String d2 = bVar.d();
        if (i || TextUtils.isEmpty(d2)) {
            contentValues.put("visibility", (Integer) 2);
        } else {
            contentValues.put("visibility", (Integer) 0);
            contentValues.put("title", d2);
        }
        if (bVar.j()) {
            if (Build.VERSION.SDK_INT >= 16 && ik.a()) {
                contentValues.put("allow_metered", (Boolean) false);
                contentValues.put("allowed_network_types", (Integer) (-1));
            } else {
                contentValues.put("allowed_network_types", (Integer) 2);
            }
            contentValues.put("is_public_api", (Boolean) true);
            contentValues.put("allow_roaming", (Boolean) true);
        }
        this.f.post(new l(this, contentValues, elVar));
    }

    @Override // com.google.android.finsky.download.g
    public final void a(Uri uri) {
        this.f.post(new m(this, uri));
    }

    @Override // com.google.android.finsky.download.g
    public final List<r> a(Uri uri, h hVar) {
        Uri uri2;
        List<r> list;
        Uri uri3;
        jm.b();
        if (uri == null) {
            if (hVar != null && c()) {
                uri3 = f2717b;
            } else {
                uri3 = f2716a;
            }
            uri2 = uri3;
        } else {
            uri2 = uri;
        }
        Cursor query = this.e.query(uri2, null, "notificationclass=?", this.h, null);
        if (query == null) {
            FinskyLog.c("Download progress cursor null", new Object[0]);
            return Collections.emptyList();
        }
        if (query.getCount() <= 0) {
            list = Collections.emptyList();
        } else {
            ArrayList a2 = com.google.android.play.utils.a.a.a(query.getCount());
            int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("status");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("current_bytes");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("total_bytes");
            int columnIndex = query.getColumnIndex("allowed_network_types");
            while (query.moveToNext()) {
                Uri parse = Uri.parse(a(String.valueOf(query.getLong(columnIndexOrThrow))));
                int i = query.getInt(columnIndexOrThrow2);
                long j = query.getLong(columnIndexOrThrow3);
                long j2 = query.getLong(columnIndexOrThrow4);
                if (i == 195 && columnIndex != -1 && query.getInt(columnIndex) == 2) {
                    i = 196;
                }
                a2.add(new r(parse, j, j2, i));
            }
            list = a2;
        }
        if (hVar == null) {
            query.close();
            return list;
        }
        if (this.i != null) {
            this.i.unregisterContentObserver(this.j);
            this.i.close();
        }
        this.i = query;
        this.i.registerContentObserver(this.j);
        this.k = hVar;
        return list;
    }

    @Override // com.google.android.finsky.download.g
    public final void a() {
        if (this.i != null) {
            this.i.unregisterContentObserver(this.j);
            this.i.close();
        }
        this.k = null;
    }

    @Override // com.google.android.finsky.download.g
    public final Uri b(Uri uri) {
        Cursor cursor = null;
        if (!"file".equalsIgnoreCase(uri.getScheme())) {
            try {
                Cursor query = this.e.query(uri, d, null, null, null);
                try {
                    String string = query.moveToFirst() ? query.getString(0) : null;
                    if (query != null) {
                        query.close();
                    }
                    if (string == null) {
                        return null;
                    }
                    return Uri.fromFile(new File(Uri.parse(string).getPath()));
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            return uri;
        }
    }

    @Override // com.google.android.finsky.download.g
    @TargetApi(11)
    public final Uri a(Intent intent) {
        long[] longArrayExtra;
        Uri data = intent.getData();
        if (data == null) {
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            if (longExtra == -1 && (longArrayExtra = intent.getLongArrayExtra("extra_click_download_ids")) != null && longArrayExtra.length == 1) {
                longExtra = longArrayExtra[0];
            }
            if (longExtra == -1) {
                return null;
            }
            return Uri.parse(a(String.valueOf(longExtra)));
        }
        return data;
    }

    private static boolean c() {
        if (Build.VERSION.SDK_INT > 10) {
            return false;
        }
        if (c != null) {
            return c.booleanValue();
        }
        return bg.ac.a().booleanValue();
    }

    private static String a(String str) {
        return c() ? "content://downloads/download/" + str : "content://downloads/my_downloads/" + str;
    }

    static /* synthetic */ void a(j jVar) {
        h hVar = jVar.k;
        jVar.a();
        if (hVar == null) {
            return;
        }
        hVar.a();
    }

    static /* synthetic */ void c(Uri uri) {
        if (Build.VERSION.SDK_INT <= 10 && c == null) {
            String lowerCase = uri.toString().toLowerCase(Locale.US);
            if (lowerCase.startsWith("content://downloads/download")) {
                c = Boolean.TRUE;
                bg.ac.a((com.google.android.finsky.c.o<Boolean>) true);
            } else if (lowerCase.startsWith("content://downloads/my_downloads")) {
                c = Boolean.FALSE;
                bg.ac.a((com.google.android.finsky.c.o<Boolean>) false);
            } else {
                FinskyLog.c("Unknown download manager URI string: %s", lowerCase);
            }
        }
    }

    static /* synthetic */ void a(j jVar, Uri uri) {
        jm.b();
        if (uri != null) {
            try {
                if (uri.toString() != null && !uri.equals(Uri.EMPTY)) {
                    jVar.e.delete(uri, null, null);
                }
            } catch (Exception e) {
                FinskyLog.c("Exception while deleting %s: %s", uri, e);
            }
        }
    }
}
