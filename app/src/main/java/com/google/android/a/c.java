package com.google.android.a;

import android.content.ContentResolver;
import android.net.Uri;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f1407a = Uri.parse("content://com.google.settings/partner");

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.ContentResolver r7, java.lang.String r8) {
        /*
            r6 = 0
            android.net.Uri r1 = com.google.android.a.c.f1407a     // Catch: android.database.SQLException -> L2d java.lang.Throwable -> L56
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: android.database.SQLException -> L2d java.lang.Throwable -> L56
            r0 = 0
            java.lang.String r3 = "value"
            r2[r0] = r3     // Catch: android.database.SQLException -> L2d java.lang.Throwable -> L56
            java.lang.String r3 = "name=?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: android.database.SQLException -> L2d java.lang.Throwable -> L56
            r0 = 0
            r4[r0] = r8     // Catch: android.database.SQLException -> L2d java.lang.Throwable -> L56
            r5 = 0
            r0 = r7
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch: android.database.SQLException -> L2d java.lang.Throwable -> L56
            if (r1 == 0) goto L64
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L5e android.database.SQLException -> L60
            if (r0 == 0) goto L64
            r0 = 0
            java.lang.String r6 = r1.getString(r0)     // Catch: java.lang.Throwable -> L5e android.database.SQLException -> L60
            r0 = r6
        L27:
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            return r0
        L2d:
            r0 = move-exception
            r1 = r6
        L2f:
            java.lang.String r2 = "GoogleSettings"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "Can't get key "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = " from "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L5e
            android.net.Uri r4 = com.google.android.a.c.f1407a     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5e
            android.util.Log.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L62
            r1.close()
            r0 = r6
            goto L2c
        L56:
            r0 = move-exception
            r1 = r6
        L58:
            if (r1 == 0) goto L5d
            r1.close()
        L5d:
            throw r0
        L5e:
            r0 = move-exception
            goto L58
        L60:
            r0 = move-exception
            goto L2f
        L62:
            r0 = r6
            goto L2c
        L64:
            r0 = r6
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.a.c.a(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        String a2 = a(contentResolver, str);
        return a2 == null ? str2 : a2;
    }
}
