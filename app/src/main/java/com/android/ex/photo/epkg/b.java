package com.android.ex.photo.epkg;

import android.content.ContentResolver;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import com.android.ex.photo.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final e f1151a;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f1152b = Pattern.compile("^(?:.*;)?base64,.*");

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f1151a = e.NORMAL;
            return;
        }
        if (k.f1161a >= 32) {
            f1151a = e.NORMAL;
        } else if (k.f1161a >= 24) {
            f1151a = e.SMALL;
        } else {
            f1151a = e.EXTRA_SMALL;
        }
    }

    public static com.android.ex.photo.cpkg.c a(ContentResolver contentResolver, Uri uri, int i) {
        f cVar;
        com.android.ex.photo.cpkg.c cVar2 = new com.android.ex.photo.cpkg.c();
        if ("data".equals(uri.getScheme())) {
            cVar = new d(contentResolver, uri);
        } else {
            cVar = new c(contentResolver, uri);
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            a(cVar, options);
            Point point = new Point(options.outWidth, options.outHeight);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = Math.max(point.x / i, point.y / i);
            cVar2.f1146b = a(cVar, options2);
            cVar2.c = 0;
            return cVar2;
        } catch (FileNotFoundException e) {
            return cVar2;
        } catch (IOException e2) {
            cVar2.c = 1;
            return cVar2;
        } catch (IllegalArgumentException e3) {
            return cVar2;
        } catch (SecurityException e4) {
            cVar2.c = 1;
            return cVar2;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0089: MOVE (r8 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:64:0x0089 */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(com.android.ex.photo.epkg.f r9, android.graphics.BitmapFactory.Options r10) {
        /*
            r7 = 0
            java.io.InputStream r1 = r9.a()     // Catch: java.io.IOException -> L6a java.lang.Throwable -> L7a java.lang.OutOfMemoryError -> L92
            int r2 = com.android.ex.photo.epkg.a.a(r1)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8d java.lang.OutOfMemoryError -> L95
            if (r1 == 0) goto Le
            r1.close()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8d java.lang.OutOfMemoryError -> L95
        Le:
            java.io.InputStream r8 = r9.a()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8d java.lang.OutOfMemoryError -> L95
            r0 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r8, r0, r10)     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Throwable -> L8b java.io.IOException -> L90
            if (r8 == 0) goto L3e
            if (r0 != 0) goto L3e
            boolean r1 = r10.inJustDecodeBounds     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Throwable -> L8b java.io.IOException -> L90
            if (r1 != 0) goto L3e
            java.lang.String r0 = "ImageUtils"
            java.lang.String r1 = "ImageUtils#decodeStream(InputStream, Rect, Options): Image bytes cannot be decoded into a Bitmap"
            android.util.Log.w(r0, r1)     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Throwable -> L8b java.io.IOException -> L90
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Throwable -> L8b java.io.IOException -> L90
            java.lang.String r1 = "Image bytes cannot be decoded into a Bitmap."
            r0.<init>(r1)     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Throwable -> L8b java.io.IOException -> L90
            throw r0     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Throwable -> L8b java.io.IOException -> L90
        L2e:
            r0 = move-exception
            r1 = r8
        L30:
            java.lang.String r2 = "ImageUtils"
            java.lang.String r3 = "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME"
            android.util.Log.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L3c
            r1.close()     // Catch: java.io.IOException -> L82
        L3c:
            r0 = r7
        L3d:
            return r0
        L3e:
            if (r0 == 0) goto L62
            if (r2 == 0) goto L62
            android.graphics.Matrix r5 = new android.graphics.Matrix     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Throwable -> L8b java.io.IOException -> L90
            r5.<init>()     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Throwable -> L8b java.io.IOException -> L90
            float r1 = (float) r2     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Throwable -> L8b java.io.IOException -> L90
            r5.postRotate(r1)     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Throwable -> L8b java.io.IOException -> L90
            r1 = 0
            r2 = 0
            int r3 = r0.getWidth()     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Throwable -> L8b java.io.IOException -> L90
            int r4 = r0.getHeight()     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Throwable -> L8b java.io.IOException -> L90
            r6 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.OutOfMemoryError -> L2e java.lang.Throwable -> L8b java.io.IOException -> L90
            if (r8 == 0) goto L3d
            r8.close()     // Catch: java.io.IOException -> L60
            goto L3d
        L60:
            r1 = move-exception
            goto L3d
        L62:
            if (r8 == 0) goto L3d
            r8.close()     // Catch: java.io.IOException -> L68
            goto L3d
        L68:
            r1 = move-exception
            goto L3d
        L6a:
            r0 = move-exception
            r8 = r7
        L6c:
            java.lang.String r1 = "ImageUtils"
            java.lang.String r2 = "ImageUtils#decodeStream(InputStream, Rect, Options) threw an IOE"
            android.util.Log.e(r1, r2, r0)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L78
            r8.close()     // Catch: java.io.IOException -> L84
        L78:
            r0 = r7
            goto L3d
        L7a:
            r0 = move-exception
            r8 = r7
        L7c:
            if (r8 == 0) goto L81
            r8.close()     // Catch: java.io.IOException -> L86
        L81:
            throw r0
        L82:
            r0 = move-exception
            goto L3c
        L84:
            r0 = move-exception
            goto L78
        L86:
            r1 = move-exception
            goto L81
        L88:
            r0 = move-exception
            r8 = r1
            goto L7c
        L8b:
            r0 = move-exception
            goto L7c
        L8d:
            r0 = move-exception
            r8 = r1
            goto L6c
        L90:
            r0 = move-exception
            goto L6c
        L92:
            r0 = move-exception
            r1 = r7
            goto L30
        L95:
            r0 = move-exception
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ex.photo.epkg.b.a(com.android.ex.photo.epkg.f, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }
}
