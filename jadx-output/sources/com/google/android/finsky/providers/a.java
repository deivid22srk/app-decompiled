package com.google.android.finsky.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
class a extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    String f4423a;

    /* renamed from: b, reason: collision with root package name */
    int f4424b;
    boolean c;
    Uri d;
    UriMatcher e;
    String f;
    String[] g;
    private SQLiteOpenHelper h;

    a() {
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = this.h.getWritableDatabase();
        if (uri.getPathSegments().size() != 1) {
            throw new IllegalArgumentException("Unknown Uri");
        }
        if (uri.getPathSegments().get(0).equals("suggestions")) {
            int delete = writableDatabase.delete("suggestions", str, strArr);
            getContext().getContentResolver().notifyChange(uri, null);
            return delete;
        }
        throw new IllegalArgumentException("Unknown Uri");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        if (this.e.match(uri) == 1) {
            return "vnd.android.cursor.dir/vnd.android.search.suggest";
        }
        int size = uri.getPathSegments().size();
        if (size > 0 && uri.getPathSegments().get(0).equals("suggestions")) {
            if (size == 1) {
                return "vnd.android.cursor.dir/suggestion";
            }
            if (size == 2) {
                return "vnd.android.cursor.item/suggestion";
            }
        }
        throw new IllegalArgumentException("Unknown Uri");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.net.Uri insert(android.net.Uri r11, android.content.ContentValues r12) {
        /*
            r10 = this;
            r8 = 0
            r1 = 0
            android.database.sqlite.SQLiteOpenHelper r0 = r10.h
            android.database.sqlite.SQLiteDatabase r4 = r0.getWritableDatabase()
            java.util.List r0 = r11.getPathSegments()
            int r5 = r0.size()
            if (r5 > 0) goto L1b
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown Uri"
            r0.<init>(r1)
            throw r0
        L1b:
            r2 = -1
            java.util.List r0 = r11.getPathSegments()
            r6 = 0
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = "suggestions"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L61
            r0 = 1
            if (r5 != r0) goto L61
            java.lang.String r0 = "suggestions"
            java.lang.String r2 = "query"
            long r2 = r4.insert(r0, r2, r12)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L61
            android.net.Uri r0 = r10.d
            java.lang.String r4 = java.lang.String.valueOf(r2)
            android.net.Uri r0 = android.net.Uri.withAppendedPath(r0, r4)
        L49:
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L55
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown Uri"
            r0.<init>(r1)
            throw r0
        L55:
            android.content.Context r2 = r10.getContext()
            android.content.ContentResolver r2 = r2.getContentResolver()
            r2.notifyChange(r0, r1)
            return r0
        L61:
            r0 = r1
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.providers.a.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (this.f4423a == null || this.f4424b == 0) {
            throw new IllegalArgumentException("Provider not configured");
        }
        this.h = new b(getContext(), this.f4424b + 512);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String[] strArr3;
        String[] strArr4;
        String str3;
        String[] strArr5;
        SQLiteDatabase readableDatabase = this.h.getReadableDatabase();
        if (this.e.match(uri) == 1) {
            if (TextUtils.isEmpty(strArr2[0])) {
                strArr5 = null;
                str3 = null;
            } else {
                String str4 = "%" + strArr2[0] + "%";
                if (this.c) {
                    strArr4 = new String[]{str4, str4};
                } else {
                    strArr4 = new String[]{str4};
                }
                str3 = this.f;
                strArr5 = strArr4;
            }
            Cursor query = readableDatabase.query("suggestions", this.g, str3, strArr5, null, null, "date DESC", null);
            query.setNotificationUri(getContext().getContentResolver(), uri);
            return query;
        }
        int size = uri.getPathSegments().size();
        if (size != 1 && size != 2) {
            throw new IllegalArgumentException("Unknown Uri");
        }
        String str5 = uri.getPathSegments().get(0);
        if (!str5.equals("suggestions")) {
            throw new IllegalArgumentException("Unknown Uri");
        }
        if (strArr == null || strArr.length <= 0) {
            strArr3 = null;
        } else {
            strArr3 = new String[strArr.length + 1];
            System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
            strArr3[strArr.length] = "_id AS _id";
        }
        StringBuilder sb = new StringBuilder(256);
        if (size == 2) {
            sb.append("(_id = ").append(uri.getPathSegments().get(1)).append(")");
        }
        if (str != null && str.length() > 0) {
            if (sb.length() > 0) {
                sb.append(" AND ");
            }
            sb.append('(');
            sb.append(str);
            sb.append(')');
        }
        Cursor query2 = readableDatabase.query(str5, strArr3, sb.toString(), strArr2, null, null, str2, null);
        query2.setNotificationUri(getContext().getContentResolver(), uri);
        return query2;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
