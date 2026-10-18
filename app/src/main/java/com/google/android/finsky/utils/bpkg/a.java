package com.google.android.finsky.utils.bpkg;

import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final File f4760a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4761b;

    public a(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("A dataStoreId must be specified");
        }
        this.f4760a = file;
        this.f4761b = str;
    }

    @Override // com.google.android.finsky.utils.bpkg.b
    public final void a(String str) {
        if (!new File(this.f4760a, this.f4761b + str).delete()) {
            FinskyLog.d("Attempt to delete '%s' failed!", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005a A[Catch: IOException -> 0x0064, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x0064, blocks: (B:38:0x005a, B:43:0x0060), top: B:36:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005e  */
    @Override // com.google.android.finsky.utils.bpkg.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r6 = this;
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L56
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L56
            java.io.File r1 = r6.f4760a     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L56
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L56
            r4.<init>()     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L56
            java.lang.String r5 = r6.f4761b     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L56
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L56
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L56
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L56
            r0.<init>(r1, r4)     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L56
            r3.<init>(r0)     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L56
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L71
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L71
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L75
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L75
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L75
            r1.writeUTF(r0)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L75
            r1.flush()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L75
            r1.close()     // Catch: java.io.IOException -> L66
        L37:
            return
        L38:
            r0 = move-exception
            r1 = r2
        L3a:
            java.lang.String r3 = "Couldn't write value store for key %s: %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L6d
            r5 = 0
            r4[r5] = r7     // Catch: java.lang.Throwable -> L6d
            r5 = 1
            r4[r5] = r0     // Catch: java.lang.Throwable -> L6d
            com.google.android.finsky.utils.FinskyLog.c(r3, r4)     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L50
            r1.close()     // Catch: java.io.IOException -> L4e
            goto L37
        L4e:
            r0 = move-exception
            goto L37
        L50:
            if (r2 == 0) goto L37
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L37
        L56:
            r0 = move-exception
            r3 = r2
        L58:
            if (r2 == 0) goto L5e
            r2.close()     // Catch: java.io.IOException -> L64
        L5d:
            throw r0
        L5e:
            if (r3 == 0) goto L5d
            r3.close()     // Catch: java.io.IOException -> L64
            goto L5d
        L64:
            r1 = move-exception
            goto L5d
        L66:
            r0 = move-exception
            goto L37
        L68:
            r0 = move-exception
            goto L58
        L6a:
            r0 = move-exception
            r2 = r1
            goto L58
        L6d:
            r0 = move-exception
            r3 = r2
            r2 = r1
            goto L58
        L71:
            r0 = move-exception
            r1 = r2
            r2 = r3
            goto L3a
        L75:
            r0 = move-exception
            r2 = r3
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.utils.bpkg.a.a(java.lang.String, java.util.Map):void");
    }

    @Override // com.google.android.finsky.utils.bpkg.b
    public final Map<String, Map<String, String>> a() {
        HashMap hashMap = new HashMap();
        File[] listFiles = this.f4760a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                try {
                    if (name.startsWith(this.f4761b)) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        String replace = name.replace(this.f4761b, "");
                        JSONObject jSONObject = new JSONObject(objectInputStream.readUTF());
                        fileInputStream.close();
                        hashMap.put(replace, a(jSONObject));
                    }
                } catch (IOException e) {
                    FinskyLog.c("IOException when reading file '%s'. Deleting.", name);
                    if (!file.delete()) {
                        FinskyLog.d("Attempt to delete '%s' failed!", name);
                    }
                } catch (JSONException e2) {
                    FinskyLog.d("JSONException when reading file '%s'. Deleting. error=[%s]", name, e2.toString());
                    if (!file.delete()) {
                        FinskyLog.d("Attempt to delete '%s' failed!", name);
                    }
                }
            }
        }
        return hashMap;
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject.isNull(next)) {
                hashMap.put(next, jSONObject.getString(next));
            } else {
                hashMap.put(next, null);
            }
        }
        return hashMap;
    }
}
