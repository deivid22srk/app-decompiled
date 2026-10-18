package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.gw;
import java.util.Locale;

@gw
/* loaded from: classes.dex */
public final class e {
    private static e d;
    private final f c;

    /* renamed from: b, reason: collision with root package name */
    private static final String f5344b = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", "InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time");

    /* renamed from: a, reason: collision with root package name */
    static final Object f5343a = new Object();

    private e(Context context) {
        this.c = new f(this, context, "google_inapp_purchase.db");
    }

    public static e a(Context context) {
        e eVar;
        synchronized (f5343a) {
            if (d == null) {
                d = new e(context);
            }
            eVar = d;
        }
        return eVar;
    }

    public final SQLiteDatabase a() {
        try {
            return this.c.getWritableDatabase();
        } catch (SQLiteException e) {
            com.google.android.gms.ads.internal.util.client.b.e("Error opening writable conversion tracking database");
            return null;
        }
    }

    public final void a(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (f5343a) {
            SQLiteDatabase a2 = a();
            if (a2 != null) {
                a2.delete("InAppPurchase", String.format(Locale.US, "%s = %d", "purchase_id", Long.valueOf(dVar.f5341a)), null);
            }
        }
    }

    public final int b() {
        Cursor cursor = null;
        int i = 0;
        synchronized (f5343a) {
            SQLiteDatabase a2 = a();
            if (a2 != null) {
                try {
                    try {
                        cursor = a2.rawQuery("select count(*) from InAppPurchase", null);
                    } catch (SQLiteException e) {
                        com.google.android.gms.ads.internal.util.client.b.e("Error getting record count" + e.getMessage());
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                    if (cursor.moveToFirst()) {
                        i = cursor.getInt(0);
                    } else if (cursor != null) {
                        cursor.close();
                    }
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        }
        return i;
    }
}
