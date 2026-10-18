package com.google.android.finsky.widget.consumption;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

@TargetApi(16)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f5170b = Executors.newSingleThreadExecutor(new com.google.android.finsky.utils.t());

    /* renamed from: a, reason: collision with root package name */
    volatile Map<k, Bitmap> f5171a;
    private final com.android.volley.a e;
    private final Context f;
    private LinkedBlockingQueue<j> c = new LinkedBlockingQueue<>();
    private final Semaphore g = new Semaphore(0);
    private int i = 0;
    private final com.google.android.play.image.e h = FinskyApp.a().d;
    private final Thread d = com.google.android.finsky.utils.t.a("BatchedImageLoader.mProcessingThread", new b(this));

    public a(Context context, com.android.volley.a aVar) {
        this.e = aVar;
        this.f = context;
        this.d.start();
    }

    private static int a(int i, int i2, int i3, int i4) {
        float f = 1.0f;
        while (f * 2.0f <= Math.min(i / i3, i2 / i4)) {
            f *= 2.0f;
        }
        return (int) f;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap a(com.google.android.finsky.widget.consumption.k r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.widget.consumption.a.a(com.google.android.finsky.widget.consumption.k):android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] b(k kVar) {
        int i = 1;
        byte[] bArr = null;
        while (i < 3 && bArr == null) {
            try {
                ParcelFileDescriptor openFileDescriptor = this.f.getContentResolver().openFileDescriptor(kVar.f5183a.buildUpon().appendQueryParameter("w", String.valueOf(kVar.f5184b)).appendQueryParameter("h", String.valueOf(kVar.c)).build(), "r");
                if (openFileDescriptor != null) {
                    bArr = jm.a((InputStream) new FileInputStream(openFileDescriptor.getFileDescriptor()));
                    openFileDescriptor.close();
                }
                i++;
            } catch (IOException e) {
                FinskyLog.c("IOException parsing [%s]", kVar);
                i++;
            }
        }
        return bArr;
    }

    public final void a(j jVar) {
        this.c.add(jVar);
    }

    static /* synthetic */ void a(a aVar, j jVar) {
        int i;
        int i2;
        Bitmap bitmap;
        Bitmap bitmap2;
        aVar.i = 0;
        HashMap hashMap = new HashMap();
        if (aVar.f5171a != null) {
            Iterator<k> it = jVar.f5182b.iterator();
            i = 0;
            i2 = 0;
            while (it.hasNext()) {
                k next = it.next();
                Iterator<k> it2 = aVar.f5171a.keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        k next2 = it2.next();
                        if (next2.a(next.f5183a, next.f5184b, next.c) && (bitmap2 = aVar.f5171a.get(next2)) != null) {
                            hashMap.put(next2, bitmap2);
                            it.remove();
                            i++;
                            i2 += bitmap2.getByteCount();
                            break;
                        }
                    }
                }
            }
            aVar.f5171a = null;
        } else {
            i = 0;
            i2 = 0;
        }
        for (k kVar : jVar.f5182b) {
            Uri uri = kVar.f5183a;
            if (!"http".equals(uri.getScheme()) && !"https".equals(uri.getScheme())) {
                bitmap = aVar.a(kVar);
            } else {
                Bitmap[] bitmapArr = new Bitmap[1];
                Semaphore semaphore = new Semaphore(0);
                com.google.android.play.image.j a2 = aVar.h.a(kVar.f5183a.toString(), 0, 0, new d(aVar, bitmapArr, semaphore));
                if (a2.f6944a != null) {
                    bitmapArr[0] = a2.f6944a;
                } else {
                    semaphore.acquireUninterruptibly();
                }
                bitmap = bitmapArr[0];
            }
            if (bitmap == null) {
                bitmap = BitmapFactory.decodeResource(aVar.f.getResources(), R.drawable.bg_widget_gradient);
            }
            hashMap.put(kVar, bitmap);
        }
        Object[] objArr = {Integer.valueOf(jVar.f5182b.size() + i), Integer.valueOf((aVar.i + i2) / 1024), Integer.valueOf(jVar.f5181a), Integer.valueOf(i), Integer.valueOf(i2 / 1024)};
        new Handler(Looper.getMainLooper()).post(new c(aVar, jVar.c, hashMap));
        aVar.g.acquire();
        aVar.f5171a = hashMap;
    }
}
