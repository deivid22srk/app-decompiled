package com.google.android.vending.verifier;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f7149a = {"package_name", "cache_fingerprint", "sha256_digest", "length", "forward_locked", "suppress_user_warning"};

    /* renamed from: b, reason: collision with root package name */
    private final d f7150b;

    public c(Context context) {
        this.f7150b = new d(this, context);
    }

    public final synchronized b a(String str) {
        b a2;
        Cursor query = this.f7150b.getWritableDatabase().query("verification_cache", f7149a, "package_name=?", new String[]{str}, null, null, null);
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

    public final synchronized Map<String, b> a() {
        HashMap hashMap;
        Cursor query = this.f7150b.getWritableDatabase().query("verification_cache", f7149a, null, null, null, null, null);
        hashMap = new HashMap();
        while (query.moveToNext()) {
            b a2 = a(query);
            hashMap.put(a2.f7116a, a2);
        }
        query.close();
        return hashMap;
    }

    public final synchronized void a(b bVar) {
        synchronized (this) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("package_name", bVar.f7116a);
            contentValues.put("cache_fingerprint", Long.valueOf(bVar.f7117b));
            contentValues.put("sha256_digest", bVar.c);
            contentValues.put("length", Long.valueOf(bVar.d));
            contentValues.put("forward_locked", Integer.valueOf(bVar.e ? 1 : 0));
            contentValues.put("suppress_user_warning", Integer.valueOf(bVar.f ? 1 : 0));
            this.f7150b.getWritableDatabase().replace("verification_cache", null, contentValues);
        }
    }

    public final synchronized void b(String str) {
        this.f7150b.getWritableDatabase().delete("verification_cache", "package_name=?", new String[]{str});
    }

    public final synchronized void a(String str, boolean z) {
        synchronized (this) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("suppress_user_warning", Integer.valueOf(z ? 1 : 0));
            this.f7150b.getWritableDatabase().update("verification_cache", contentValues, "package_name=?", new String[]{str});
        }
    }

    private static b a(Cursor cursor) {
        String string = cursor.getString(0);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new b(string, cursor.getLong(1), cursor.getBlob(2), cursor.getLong(3), cursor.getInt(4) == 1, cursor.getInt(5) == 1);
    }
}
