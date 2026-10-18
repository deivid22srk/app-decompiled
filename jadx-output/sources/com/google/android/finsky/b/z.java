package com.google.android.finsky.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class z implements s {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f2139a = {"package_name", "auto_update", "desired_version", "download_uri", "delivery_data", "delivery_data_timestamp_ms", "installer_state", "first_download_ms", "referrer", "account", "title", "flags", "continue_url", "last_notified_version", "last_update_timestamp_ms", "account_for_update", "auto_acquire_tags", "external_referrer_timestamp_ms", "persistent_flags", "permissions_version", "delivery_token", "completed_split_ids", "active_split_id", "request_id"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f2140b = new String[0];
    private final aa c;

    public z(Context context, String str) {
        this.c = new aa(this, context, str);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "localappstate.db" : "node-appstate-" + Uri.encode(str) + ".db";
    }

    public static String[] a(Context context) {
        ArrayList arrayList = null;
        for (String str : context.databaseList()) {
            if (str.startsWith("node-appstate-") && str.endsWith(".db")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(Uri.decode(str.substring(14, str.length() - 3)));
            }
        }
        return arrayList == null ? f2140b : (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void a(Context context, String str) {
        context.deleteDatabase(b(str));
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized t a(String str) {
        t a2;
        Cursor query = this.c.getWritableDatabase().query("appstate", f2139a, "package_name=?", new String[]{str}, null, null, null);
        try {
            if (query.getCount() == 1) {
                query.moveToNext();
                a2 = a(query);
            } else {
                query.close();
                a2 = null;
            }
        } finally {
            query.close();
        }
        return a2;
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized Collection<t> a() {
        ArrayList arrayList;
        Cursor query = this.c.getWritableDatabase().query("appstate", f2139a, null, null, null, null, null);
        arrayList = new ArrayList(query.getCount());
        while (query.moveToNext()) {
            try {
                arrayList.add(a(query));
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(t tVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", tVar.f2130a);
        contentValues.put("auto_update", Integer.valueOf(tVar.f2131b));
        contentValues.put("desired_version", Integer.valueOf(tVar.c));
        contentValues.put("download_uri", tVar.h);
        if (tVar.e != null) {
            contentValues.put("delivery_data", com.google.protobuf.nano.c.a(tVar.e));
        } else {
            contentValues.putNull("delivery_data");
        }
        contentValues.put("delivery_data_timestamp_ms", Long.valueOf(tVar.f));
        contentValues.put("installer_state", Integer.valueOf(tVar.g));
        contentValues.put("first_download_ms", Long.valueOf(tVar.j));
        contentValues.put("referrer", tVar.k);
        contentValues.put("account", tVar.i);
        contentValues.put("title", tVar.l);
        contentValues.put("flags", Integer.valueOf(tVar.m));
        contentValues.put("continue_url", tVar.n);
        contentValues.put("last_notified_version", Integer.valueOf(tVar.d));
        contentValues.put("last_update_timestamp_ms", Long.valueOf(tVar.o));
        contentValues.put("account_for_update", tVar.p);
        contentValues.put("auto_acquire_tags", jm.a(tVar.a()));
        contentValues.put("external_referrer_timestamp_ms", Long.valueOf(tVar.q));
        contentValues.put("persistent_flags", Integer.valueOf(tVar.r));
        contentValues.put("permissions_version", Integer.valueOf(tVar.s));
        contentValues.put("delivery_token", tVar.t);
        contentValues.put("completed_split_ids", jm.a(tVar.b()));
        contentValues.put("active_split_id", tVar.u);
        contentValues.put("request_id", tVar.v);
        this.c.getWritableDatabase().replace("appstate", null, contentValues);
    }

    private static t a(Cursor cursor) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        String string = cursor.getString(0);
        if (cursor.isNull(1)) {
            i = 0;
        } else {
            i = cursor.getInt(1);
        }
        if (cursor.isNull(2)) {
            i2 = -1;
        } else {
            i2 = cursor.getInt(2);
        }
        if (cursor.isNull(13)) {
            i3 = -1;
        } else {
            i3 = cursor.getInt(13);
        }
        com.google.android.finsky.protos.aa aaVar = null;
        if (!cursor.isNull(4)) {
            try {
                byte[] blob = cursor.getBlob(4);
                aaVar = (com.google.android.finsky.protos.aa) com.google.protobuf.nano.c.a(new com.google.android.finsky.protos.aa(), blob, blob.length);
            } catch (InvalidProtocolBufferNanoException e) {
                FinskyLog.c("Couldn't parse blob as AndroidAppDeliveryData", e);
            }
        }
        long j = cursor.getLong(5);
        int i6 = cursor.getInt(6);
        String string2 = cursor.getString(3);
        long j2 = cursor.getLong(7);
        String string3 = cursor.getString(8);
        String string4 = cursor.getString(9);
        String string5 = cursor.getString(10);
        int i7 = cursor.getInt(11);
        String string6 = cursor.getString(12);
        long j3 = cursor.getLong(14);
        String string7 = cursor.getString(15);
        String str = null;
        if (!cursor.isNull(16)) {
            str = cursor.getString(16);
        }
        String[] d = jm.d(str);
        long j4 = cursor.getLong(17);
        int i8 = cursor.getInt(18);
        int i9 = cursor.getInt(19);
        String string8 = cursor.getString(20);
        String str2 = null;
        if (!cursor.isNull(21)) {
            str2 = cursor.getString(21);
        }
        t tVar = new t(string, i, i2, i3, aaVar, j, i6, string2, j2, string3, string6, string4, string5, i7, j3, string7, d, j4, i8, i9, string8, jm.d(str2), cursor.getString(22), cursor.getString(23));
        int i10 = tVar.m;
        int i11 = tVar.r;
        int i12 = tVar.s;
        if ((i10 & 64) == 0) {
            i4 = i10;
            z = false;
            i5 = i11;
        } else {
            int i13 = i11 | 1;
            i4 = i10 & (-65);
            z = true;
            i5 = i13;
        }
        if ((i4 & 256) != 0) {
            z = true;
            i4 &= -257;
            i12 = 1;
        }
        if (!z) {
            return tVar;
        }
        u uVar = new u(tVar.f2130a);
        uVar.e(i4);
        uVar.f(i5);
        uVar.g(i12);
        return uVar.f2132a;
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(String str, int i) {
        a(u.a(a(str), str).a(i).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(String str, com.google.android.finsky.protos.aa aaVar, long j) {
        a(u.a(a(str), str).a(aaVar, j).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void b(String str, int i) {
        a(u.a(a(str), str).b(i).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void c(String str, int i) {
        a(u.a(a(str), str).c(i).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(String str, int i, String str2) {
        a(u.a(a(str), str).d(i).a(str2).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(String str, long j) {
        a(u.a(a(str), str).a(j).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(String str, String str2) {
        a(u.a(a(str), str).b(str2).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void d(String str, int i) {
        a(u.a(a(str), str).e(i).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void b(String str, String str2) {
        a(u.a(a(str), str).e(str2).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final void b(String str, long j) {
        a(u.a(a(str), str).b(j).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void c(String str, String str2) {
        a(u.a(a(str), str).f(str2).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void a(String str, String[] strArr) {
        a(u.a(a(str), str).a(strArr).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final void c(String str, long j) {
        a(u.a(a(str), str).c(j).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final void e(String str, int i) {
        a(u.a(a(str), str).f(i).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final void f(String str, int i) {
        a(u.a(a(str), str).g(i).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final void d(String str, String str2) {
        a(u.a(a(str), str).g(str2).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void b(String str, String[] strArr) {
        a(u.a(a(str), str).b(strArr).f2132a);
    }

    @Override // com.google.android.finsky.b.s
    public final synchronized void e(String str, String str2) {
        a(u.a(a(str), str).h(str2).f2132a);
    }
}
