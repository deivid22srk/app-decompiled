package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class k extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f6371a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(j jVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f6371a = jVar;
    }

    private static Set<String> b(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (Build.VERSION.SDK_INT >= 9) {
            File file = new File(sQLiteDatabase.getPath());
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        Map<String, String> map;
        if (Build.VERSION.SDK_INT < 15) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
            try {
                rawQuery.moveToFirst();
            } finally {
                rawQuery.close();
            }
        }
        a(sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", null);
        a(sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", null);
        map = j.f6369a;
        a(sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", map);
        a(sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        c cVar;
        c cVar2;
        String x;
        c cVar3;
        boolean z = true;
        cVar = this.f6371a.c;
        i.t();
        if (cVar.f6362b != 0 && cVar.f6361a.b() - cVar.f6362b < 3600000) {
            z = false;
        }
        if (!z) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            cVar2 = this.f6371a.c;
            cVar2.a();
            this.f6371a.l().f6388a.a("Opening the database failed, dropping and recreating it");
            x = this.f6371a.x();
            this.f6371a.i().getDatabasePath(x).delete();
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                cVar3 = this.f6371a.c;
                cVar3.f6362b = 0L;
                return writableDatabase;
            } catch (SQLiteException e2) {
                this.f6371a.l().f6388a.a("Failed to open freshly created database", e2);
                throw e2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(android.database.sqlite.SQLiteDatabase r11, java.lang.String r12) {
        /*
            r10 = this;
            r8 = 0
            r9 = 0
            java.lang.String r1 = "SQLITE_MASTER"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: android.database.sqlite.SQLiteException -> L26 java.lang.Throwable -> L3c
            r0 = 0
            java.lang.String r3 = "name"
            r2[r0] = r3     // Catch: android.database.sqlite.SQLiteException -> L26 java.lang.Throwable -> L3c
            java.lang.String r3 = "name=?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: android.database.sqlite.SQLiteException -> L26 java.lang.Throwable -> L3c
            r0 = 0
            r4[r0] = r12     // Catch: android.database.sqlite.SQLiteException -> L26 java.lang.Throwable -> L3c
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r11
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L26 java.lang.Throwable -> L3c
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L43 android.database.sqlite.SQLiteException -> L46
            if (r1 == 0) goto L25
            r1.close()
        L25:
            return r0
        L26:
            r0 = move-exception
            r1 = r9
        L28:
            com.google.android.gms.measurement.internal.j r2 = r10.f6371a     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.measurement.internal.z r2 = r2.l()     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.measurement.internal.ab r2 = r2.f6389b     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "Error querying for table"
            r2.a(r3, r12, r0)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L3a
            r1.close()
        L3a:
            r0 = r8
            goto L25
        L3c:
            r0 = move-exception
        L3d:
            if (r9 == 0) goto L42
            r9.close()
        L42:
            throw r0
        L43:
            r0 = move-exception
            r9 = r1
            goto L3d
        L46:
            r0 = move-exception
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.a(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, Map<String, String> map) {
        if (!a(sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set<String> b2 = b(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!b2.remove(str4)) {
                    throw new SQLiteException("Database " + str + " is missing required column: " + str4);
                }
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (!b2.remove(entry.getKey())) {
                        sQLiteDatabase.execSQL(entry.getValue());
                    }
                }
            }
            if (!b2.isEmpty()) {
                throw new SQLiteException("Database " + str + " table has extra columns");
            }
        } catch (SQLiteException e) {
            this.f6371a.l().f6388a.a("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }
}
