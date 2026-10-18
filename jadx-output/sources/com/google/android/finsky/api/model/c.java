package com.google.android.finsky.api.model;

import android.os.AsyncTask;

/* loaded from: classes.dex */
final class c extends AsyncTask<byte[], Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f1969a;

    c(a aVar) {
        this.f1969a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Void doInBackground(byte[]... r7) {
        /*
            r6 = this;
            r2 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L17 java.io.IOException -> L2f java.lang.Throwable -> L47
            com.google.android.finsky.api.model.a r0 = r6.f1969a     // Catch: java.io.FileNotFoundException -> L17 java.io.IOException -> L2f java.lang.Throwable -> L47
            java.io.File r0 = r0.f1965a     // Catch: java.io.FileNotFoundException -> L17 java.io.IOException -> L2f java.lang.Throwable -> L47
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> L17 java.io.IOException -> L2f java.lang.Throwable -> L47
            r0 = 0
            r0 = r7[r0]     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56 java.io.FileNotFoundException -> L58
            r1.write(r0)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56 java.io.FileNotFoundException -> L58
            r1.flush()     // Catch: java.io.IOException -> L5a
            r1.close()     // Catch: java.io.IOException -> L5a
        L16:
            return r2
        L17:
            r0 = move-exception
            r1 = r2
        L19:
            java.lang.String r3 = "Failed to save response proto, bad file path."
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L54
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Throwable -> L54
            com.google.android.finsky.utils.FinskyLog.c(r3, r4)     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L16
            r1.flush()     // Catch: java.io.IOException -> L2d
            r1.close()     // Catch: java.io.IOException -> L2d
            goto L16
        L2d:
            r0 = move-exception
            goto L16
        L2f:
            r0 = move-exception
            r1 = r2
        L31:
            java.lang.String r3 = "Failed to save response proto."
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L54
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Throwable -> L54
            com.google.android.finsky.utils.FinskyLog.c(r3, r4)     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L16
            r1.flush()     // Catch: java.io.IOException -> L45
            r1.close()     // Catch: java.io.IOException -> L45
            goto L16
        L45:
            r0 = move-exception
            goto L16
        L47:
            r0 = move-exception
            r1 = r2
        L49:
            if (r1 == 0) goto L51
            r1.flush()     // Catch: java.io.IOException -> L52
            r1.close()     // Catch: java.io.IOException -> L52
        L51:
            throw r0
        L52:
            r1 = move-exception
            goto L51
        L54:
            r0 = move-exception
            goto L49
        L56:
            r0 = move-exception
            goto L31
        L58:
            r0 = move-exception
            goto L19
        L5a:
            r0 = move-exception
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.api.model.c.doInBackground(byte[][]):java.lang.Void");
    }
}
