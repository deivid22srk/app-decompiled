package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.oo;
import com.google.android.gms.internal.zzaic;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class j extends ba {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f6369a;

    /* renamed from: b, reason: collision with root package name */
    private final k f6370b;
    private final c c;

    static {
        android.support.v4.h.a aVar = new android.support.v4.h.a(5);
        f6369a = aVar;
        aVar.put("app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;");
        f6369a.put("app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;");
        f6369a.put("gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;");
        f6369a.put("dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;");
        f6369a.put("measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;");
    }

    j(ap apVar) {
        super(apVar);
        this.c = new c(h());
        this.f6370b = new k(this, i(), x());
    }

    private boolean y() {
        return i().getDatabasePath(x()).exists();
    }

    @Override // com.google.android.gms.measurement.internal.ba
    protected final void a() {
    }

    public final void b() {
        u();
        w().beginTransaction();
    }

    public final void o() {
        u();
        w().setTransactionSuccessful();
    }

    public final void p() {
        u();
        w().endTransaction();
    }

    final long a(String str) {
        Cursor rawQuery;
        Cursor cursor = null;
        try {
            try {
                rawQuery = w().rawQuery(str, null);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException e) {
            e = e;
        }
        try {
            if (!rawQuery.moveToFirst()) {
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return 0L;
            }
            long j = rawQuery.getLong(0);
            if (rawQuery == null) {
                return j;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e2) {
            e = e2;
            l().f6388a.a("Database error", str, e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            cursor = rawQuery;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private SQLiteDatabase w() {
        e();
        try {
            return this.f6370b.getWritableDatabase();
        } catch (SQLiteException e) {
            l().f6389b.a("Error opening database", e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String x() {
        if (i.B() && !n().C()) {
            l().c.a("Using secondary database");
            return i.z();
        }
        return i.y();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.p a(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r10 = 0
            com.google.android.gms.common.internal.av.a(r13)
            com.google.android.gms.common.internal.av.a(r14)
            r12.e()
            r12.u()
            android.database.sqlite.SQLiteDatabase r0 = r12.w()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L85
            java.lang.String r1 = "events"
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L85
            r3 = 0
            java.lang.String r4 = "lifetime_count"
            r2[r3] = r4     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L85
            r3 = 1
            java.lang.String r4 = "current_bundle_count"
            r2[r3] = r4     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L85
            r3 = 2
            java.lang.String r4 = "last_fire_timestamp"
            r2[r3] = r4     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L85
            java.lang.String r3 = "app_id=? and name=?"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L85
            r5 = 0
            r4[r5] = r13     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L85
            r5 = 1
            r4[r5] = r14     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L85
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r11 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L85
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L92
            if (r0 != 0) goto L44
            if (r11 == 0) goto L42
            r11.close()
        L42:
            r1 = r10
        L43:
            return r1
        L44:
            r0 = 0
            long r4 = r11.getLong(r0)     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L92
            r0 = 1
            long r6 = r11.getLong(r0)     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L92
            r0 = 2
            long r8 = r11.getLong(r0)     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L92
            com.google.android.gms.measurement.internal.p r1 = new com.google.android.gms.measurement.internal.p     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L92
            r2 = r13
            r3 = r14
            r1.<init>(r2, r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L92
            boolean r0 = r11.moveToNext()     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L92
            if (r0 == 0) goto L6b
            com.google.android.gms.measurement.internal.z r0 = r12.l()     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L92
            com.google.android.gms.measurement.internal.ab r0 = r0.f6388a     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L92
            java.lang.String r2 = "Got multiple records for event aggregates, expected one"
            r0.a(r2)     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L92
        L6b:
            if (r11 == 0) goto L43
            r11.close()
            goto L43
        L71:
            r0 = move-exception
            r1 = r10
        L73:
            com.google.android.gms.measurement.internal.z r2 = r12.l()     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.measurement.internal.ab r2 = r2.f6388a     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = "Error querying events"
            r2.a(r3, r13, r14, r0)     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L83
            r1.close()
        L83:
            r1 = r10
            goto L43
        L85:
            r0 = move-exception
        L86:
            if (r10 == 0) goto L8b
            r10.close()
        L8b:
            throw r0
        L8c:
            r0 = move-exception
            r10 = r11
            goto L86
        L8f:
            r0 = move-exception
            r10 = r1
            goto L86
        L92:
            r0 = move-exception
            r1 = r11
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.a(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.p");
    }

    public final void a(p pVar) {
        com.google.android.gms.common.internal.av.a(pVar);
        e();
        u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", pVar.f6379a);
        contentValues.put("name", pVar.f6380b);
        contentValues.put("lifetime_count", Long.valueOf(pVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(pVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(pVar.e));
        try {
            if (w().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                l().f6388a.a("Failed to insert/update event aggregates (got -1)");
            }
        } catch (SQLiteException e) {
            l().f6388a.a("Error storing event aggregates", e);
        }
    }

    public final void b(String str, String str2) {
        com.google.android.gms.common.internal.av.a(str);
        com.google.android.gms.common.internal.av.a(str2);
        e();
        u();
        try {
            l().g.a("Deleted user attribute rows:", Integer.valueOf(w().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            l().f6388a.a("Error deleting user attribute", str, str2, e);
        }
    }

    public final void a(e eVar) {
        com.google.android.gms.common.internal.av.a(eVar);
        e();
        u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", eVar.f6365a);
        contentValues.put("name", eVar.f6366b);
        contentValues.put("set_timestamp", Long.valueOf(eVar.c));
        Object obj = eVar.d;
        com.google.android.gms.common.internal.av.a("value");
        com.google.android.gms.common.internal.av.a(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Float)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Float) obj);
        }
        try {
            if (w().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                l().f6388a.a("Failed to insert/update user attribute (got -1)");
            }
        } catch (SQLiteException e) {
            l().f6388a.a("Error storing user attribute", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.e> b(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.b(java.lang.String):java.util.List");
    }

    public final void a(b bVar) {
        com.google.android.gms.common.internal.av.a(bVar);
        e();
        u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", bVar.f6333a);
        contentValues.put("app_instance_id", bVar.f6334b);
        contentValues.put("gmp_app_id", bVar.c);
        contentValues.put("resettable_device_id_hash", bVar.d);
        contentValues.put("last_bundle_index", Long.valueOf(bVar.e));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(bVar.f));
        contentValues.put("app_version", bVar.g);
        contentValues.put("app_store", bVar.h);
        contentValues.put("gmp_version", Long.valueOf(bVar.i));
        contentValues.put("dev_cert_hash", Long.valueOf(bVar.j));
        contentValues.put("measurement_enabled", Boolean.valueOf(bVar.k));
        try {
            if (w().insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                l().f6388a.a("Failed to insert/update app (got -1)");
            }
        } catch (SQLiteException e) {
            l().f6388a.a("Error storing app", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.b c(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.c(java.lang.String):com.google.android.gms.measurement.internal.b");
    }

    public final void a(oo ooVar) {
        e();
        u();
        com.google.android.gms.common.internal.av.a(ooVar);
        com.google.android.gms.common.internal.av.a(ooVar.o);
        com.google.android.gms.common.internal.av.a(ooVar.f);
        r();
        long a2 = h().a();
        if (ooVar.f.longValue() < a2 - i.D() || ooVar.f.longValue() > i.D() + a2) {
            l().f6389b.a("Storing bundle outside of the max uploading time span. now, timestamp", Long.valueOf(a2), ooVar.f);
        }
        try {
            byte[] bArr = new byte[ooVar.d()];
            zzaic a3 = zzaic.a(bArr, bArr.length);
            ooVar.a(a3);
            a3.a();
            byte[] a4 = j().a(bArr);
            l().g.a("Saving bundle, size", Integer.valueOf(a4.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", ooVar.o);
            contentValues.put("bundle_end_timestamp", ooVar.f);
            contentValues.put("data", a4);
            try {
                if (w().insert("queue", null, contentValues) == -1) {
                    l().f6388a.a("Failed to insert bundle (got -1)");
                }
            } catch (SQLiteException e) {
                l().f6388a.a("Error storing bundle", e);
            }
        } catch (IOException e2) {
            l().f6388a.a("Data loss. Failed to serialize bundle", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String q() {
        /*
            r5 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.w()
            java.lang.String r2 = "SELECT q.app_id FROM queue q JOIN apps a ON a.app_id=q.app_id WHERE a.measurement_enabled!=0 ORDER BY q.rowid LIMIT 1;"
            r3 = 0
            android.database.Cursor r2 = r1.rawQuery(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L23 java.lang.Throwable -> L36
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            if (r1 == 0) goto L1d
            r1 = 0
            java.lang.String r0 = r2.getString(r1)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            if (r2 == 0) goto L1c
            r2.close()
        L1c:
            return r0
        L1d:
            if (r2 == 0) goto L1c
            r2.close()
            goto L1c
        L23:
            r1 = move-exception
            r2 = r0
        L25:
            com.google.android.gms.measurement.internal.z r3 = r5.l()     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.measurement.internal.ab r3 = r3.f6388a     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.a(r4, r1)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L1c
            r2.close()
            goto L1c
        L36:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L39:
            if (r2 == 0) goto L3e
            r2.close()
        L3e:
            throw r0
        L3f:
            r0 = move-exception
            goto L39
        L41:
            r1 = move-exception
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.q():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.oo, java.lang.Long>> a(java.lang.String r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.a(java.lang.String, int, int):java.util.List");
    }

    public final void a(long j) {
        e();
        u();
        if (w().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) != 1) {
            l().f6388a.a("Deleted fewer rows from queue than expected");
        }
    }

    final void r() {
        int delete;
        e();
        u();
        if (y()) {
            long a2 = m().f.a();
            long b2 = h().b();
            if (Math.abs(b2 - a2) > i.E()) {
                m().f.a(b2);
                e();
                u();
                if (!y() || (delete = w().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(h().a()), String.valueOf(i.D())})) <= 0) {
                    return;
                }
                l().g.a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }
}
