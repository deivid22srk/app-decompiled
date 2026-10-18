package com.google.android.play.apkg;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.volley.guava.UrlRules;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Semaphore;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class v implements af<m> {
    public static final b c = new b();
    public static final HashSet<Account> d = new HashSet<>();
    public volatile long A;
    public ab B;

    /* renamed from: a, reason: collision with root package name */
    public final ac f6789a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f6790b;
    public final Context e;
    public final ContentResolver f;
    public final String g;
    public final ae<m> h;
    public final Handler i;
    public Runnable j;
    public final String k;
    public final String l;
    public final int m;
    public final Account n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final int s;
    public final long t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;
    public final long y;
    public b z;

    @Override // com.google.android.play.apkg.af
    public final /* synthetic */ void a(m mVar, OutputStream outputStream) {
        m mVar2 = mVar;
        if (mVar2.y == this.z) {
            mVar2.y = null;
        } else {
            this.z = mVar2.y;
            if (mVar2.y == null) {
                mVar2.y = c;
            }
        }
        byte[] a2 = com.google.protobuf.nano.c.a(mVar2);
        int length = a2.length;
        while ((length & (-128)) != 0) {
            outputStream.write((length & 127) | 128);
            length >>>= 7;
        }
        outputStream.write(length);
        outputStream.write(a2);
    }

    public v(Context context, String str, aa aaVar, String str2, long j, String str3, String str4, z zVar, Account account) {
        this(context, str, aaVar, str2, j, str3, str4, Locale.getDefault().getCountry(), zVar, account);
    }

    public v(Context context, String str, aa aaVar, String str2, long j, String str3, String str4, String str5, z zVar, Account account) {
        synchronized (d) {
            com.google.android.play.utils.a.a(d.add(account), "Already instantiated an EventLogger for " + account);
        }
        this.e = context;
        this.f = context.getContentResolver();
        this.s = aaVar.p;
        this.p = null;
        this.n = account;
        this.g = str;
        this.f6789a = ac.a();
        this.k = str2;
        this.t = j;
        String string = Settings.Secure.getString(this.f, "android_id");
        long j2 = 0;
        try {
            j2 = new BigInteger(string, 16).longValue();
        } catch (NullPointerException e) {
            Log.e("PlayEventLogger", "Null device id");
        } catch (NumberFormatException e2) {
            Log.e("PlayEventLogger", "Invalid device id " + string);
        }
        this.u = j2;
        this.q = str3;
        this.o = str4;
        this.r = str5;
        this.l = zVar.g;
        this.v = zVar.e;
        this.w = zVar.f;
        this.m = zVar.h;
        this.x = ((zVar.c * 50) / 100) + 1;
        this.y = (zVar.c * 125) / 100;
        File file = new File(this.e.getCacheDir(), zVar.f6794a);
        File file2 = new File(file, Uri.encode(account == null ? "null_account" : account.type + "." + account.name));
        if (account != null && !file2.exists()) {
            File file3 = new File(file, Uri.encode(account.name));
            if (file3.exists() && file3.isDirectory()) {
                file3.renameTo(file2);
            }
        }
        this.h = new ae<>(file2, "eventlog.store", ".log", zVar.c, zVar.f6795b, zVar.d, this);
        this.i = new Handler(Looper.getMainLooper());
        Semaphore semaphore = new Semaphore(0);
        x xVar = new x("PlayEventLogger", semaphore);
        xVar.start();
        semaphore.acquireUninterruptibly();
        this.f6790b = new w(this, xVar.getLooper());
        this.f6790b.sendEmptyMessage(1);
    }

    public final synchronized void a(ab abVar) {
        this.B = abVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized ab b() {
        return this.B;
    }

    public void a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (j > 0) {
            if (currentTimeMillis + j < this.A) {
                j = this.A - currentTimeMillis;
            }
            this.f6790b.sendEmptyMessageDelayed(3, j);
        } else {
            this.f6790b.sendEmptyMessage(3);
        }
        this.A = Math.max(this.A, currentTimeMillis + this.w);
    }

    public void c() {
        ae<m> aeVar = this.h;
        long j = 0;
        for (int i = 0; i < aeVar.e.size(); i++) {
            j += aeVar.e.get(i).length();
        }
        if (j >= this.x) {
            a(0L);
        }
    }

    @Override // com.google.android.play.apkg.af
    public final void a() {
        this.z = null;
    }

    public boolean d() {
        byte[] bArr;
        String str;
        long j;
        long length;
        byte[][] bArr2 = null;
        if (!(!this.h.e.isEmpty())) {
            return false;
        }
        try {
            ArrayList arrayList = new ArrayList();
            long j2 = 0;
            while (true) {
                ae<m> aeVar = this.h;
                if (aeVar.e.isEmpty()) {
                    Log.e("RollingFileStream", "This method should never be called when there are no written files.");
                    bArr = null;
                } else {
                    File remove = aeVar.e.remove(0);
                    byte[] a2 = ae.a(remove);
                    aeVar.f.add(remove);
                    bArr = a2;
                }
                if (bArr != null) {
                    if (bArr.length > 0) {
                        arrayList.add(bArr);
                        j = j2 + bArr.length;
                    } else {
                        j = j2;
                    }
                    ae<m> aeVar2 = this.h;
                    if (aeVar2.e.isEmpty()) {
                        length = -1;
                    } else {
                        length = aeVar2.e.get(0).length();
                    }
                    if (length < 0 || length + j > this.y) {
                        break;
                    }
                    j2 = j;
                } else {
                    break;
                }
            }
            if (!arrayList.isEmpty()) {
                byte[][] bArr3 = new byte[arrayList.size()][];
                arrayList.toArray(bArr3);
                bArr2 = bArr3;
            }
            if (bArr2 == null) {
                return false;
            }
            c cVar = new c();
            cVar.f6752a = this.t;
            cVar.e = this.u;
            if (this.p != null) {
                cVar.c = this.p;
            }
            cVar.g = Build.VERSION.SDK_INT;
            cVar.A = Build.MANUFACTURER;
            cVar.i = Build.MODEL;
            cVar.k = Build.PRODUCT;
            cVar.m = Build.HARDWARE;
            cVar.o = Build.DEVICE;
            cVar.q = Build.ID;
            cVar.C = Build.BRAND;
            cVar.E = Build.BOARD;
            cVar.I = Build.FINGERPRINT;
            if (Build.VERSION.SDK_INT >= 14) {
                str = Build.getRadioVersion();
            } else {
                str = Build.RADIO;
            }
            if (str != null) {
                cVar.G = str;
            }
            if (this.o != null) {
                cVar.u = this.o;
            }
            cVar.w = Locale.getDefault().getLanguage();
            if (this.r != null) {
                cVar.y = this.r;
            }
            if (this.q != null) {
                cVar.s = this.q;
            }
            if (com.google.android.play.utils.j.d(this.e)) {
                cVar.M = true;
            }
            f fVar = new f();
            fVar.f6758a = 4;
            fVar.g = cVar;
            o oVar = new o();
            oVar.f6775a = System.currentTimeMillis();
            oVar.m = bArr2;
            oVar.f = this.s;
            oVar.e = fVar;
            boolean a3 = a(oVar);
            if (a3) {
                this.h.d();
                return a3;
            }
            this.h.e();
            return a3;
        } catch (IOException e) {
            Log.e("PlayEventLogger", "Read failed " + e.getClass() + "(" + e.getMessage() + ")");
            this.h.e();
            return false;
        }
    }

    public boolean a(o oVar) {
        HttpURLConnection httpURLConnection;
        boolean z;
        String a2 = a(this.n);
        if (TextUtils.isEmpty(a2) && this.n != null) {
            Log.w("PlayEventLogger", "deferring log upload because couldn't retrieve auth token");
            if (b() != null) {
                if (this.j == null) {
                    this.j = new y(this);
                }
                this.i.post(this.j);
            }
            return false;
        }
        try {
            String a3 = UrlRules.a(this.f).a(this.l).a(this.l);
            if (TextUtils.isEmpty(a3)) {
                httpURLConnection = null;
            } else {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(a3).openConnection();
                httpURLConnection2.setConnectTimeout(this.m);
                httpURLConnection2.setReadTimeout(this.m);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection2.setRequestProperty("Content-Type", "application/x-gzip");
                httpURLConnection2.setRequestProperty("User-Agent", this.k);
                if (a2 != null) {
                    httpURLConnection2.setRequestProperty("Authorization", (this.g.startsWith("oauth2:") ? "Bearer " : "GoogleLogin auth=") + a2);
                }
                httpURLConnection2.connect();
                httpURLConnection = httpURLConnection2;
            }
            try {
                if (httpURLConnection == null) {
                    return true;
                }
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(httpURLConnection.getOutputStream());
                    gZIPOutputStream.write(com.google.protobuf.nano.c.a(oVar));
                    gZIPOutputStream.flush();
                    gZIPOutputStream.close();
                    z = a(httpURLConnection, a2);
                } catch (IOException e) {
                    Log.e("PlayEventLogger", "Upload failed " + e.getClass() + "(" + e.getMessage() + ")");
                    httpURLConnection.disconnect();
                    z = false;
                }
                return z;
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e2) {
            return false;
        }
    }

    public boolean a(HttpURLConnection httpURLConnection, String str) {
        boolean z;
        int read;
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        if (200 > responseCode || responseCode >= 300) {
            if (300 <= responseCode && responseCode < 400) {
                Log.e("PlayEventLogger", "Too many redirects for HttpUrlConnection. " + responseCode);
                return false;
            }
            if (responseCode == 400) {
                Log.e("PlayEventLogger", "Server returned 400... deleting local malformed logs");
                return true;
            }
            if (responseCode == 401) {
                Log.w("PlayEventLogger", "Server returned 401... invalidating auth token");
                AccountManager.get(this.e).invalidateAuthToken(this.n.type, str);
                return false;
            }
            if (responseCode == 500) {
                Log.w("PlayEventLogger", "Server returned 500... server crashed");
                return false;
            }
            if (responseCode == 501) {
                Log.w("PlayEventLogger", "Server returned 501... service doesn't seem to exist");
                return false;
            }
            if (responseCode == 502) {
                Log.w("PlayEventLogger", "Server returned 502... servers are down");
                return false;
            }
            if (responseCode == 503) {
                String headerField = httpURLConnection.getHeaderField("Retry-After");
                if (headerField != null) {
                    try {
                        long longValue = Long.valueOf(headerField).longValue();
                        Log.w("PlayEventLogger", "Server said to retry after " + longValue + " seconds");
                        b(longValue * 1000);
                        z = true;
                    } catch (NumberFormatException e) {
                        Log.e("PlayEventLogger", "Unknown retry value: " + headerField);
                        z = false;
                    }
                    return z ? false : true;
                }
                Log.e("PlayEventLogger", "Status 503 without retry-after header");
                return true;
            }
            if (responseCode == 504) {
                Log.w("PlayEventLogger", "Server returned 504... timeout");
                return false;
            }
            Log.e("PlayEventLogger", "Unexpected error received from server: " + responseCode + " " + responseMessage);
            return true;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[128];
            do {
                read = inputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } while (read >= 0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            p pVar = (p) com.google.protobuf.nano.c.a(new p(), byteArray, byteArray.length);
            if (pVar.f6777a >= 0) {
                b(pVar.f6777a);
            }
            inputStream.close();
            return true;
        } catch (InvalidProtocolBufferNanoException e2) {
            Log.e("PlayEventLogger", "Error parsing content: " + e2.getMessage());
            return true;
        } catch (IOException e3) {
            Log.e("PlayEventLogger", "Error reading the content of the response body: " + e3.getMessage());
            return true;
        } catch (IllegalStateException e4) {
            Log.e("PlayEventLogger", "Error getting the content of the response body: " + e4.getMessage());
            return true;
        }
    }

    public void b(long j) {
        this.A = Math.max(this.w, j) + System.currentTimeMillis();
    }

    public String a(Account account) {
        if (account == null) {
            Log.w("PlayEventLogger", "No account for auth token provided");
            return null;
        }
        try {
            return AccountManager.get(this.e).blockingGetAuthToken(account, this.g, true);
        } catch (AuthenticatorException e) {
            Log.e("PlayEventLogger", "Failed to get auth token: " + e.getMessage(), e);
            return null;
        } catch (OperationCanceledException e2) {
            Log.e("PlayEventLogger", "Failed to get auth token: " + e2.getMessage(), e2);
            return null;
        } catch (IOException e3) {
            Log.e("PlayEventLogger", "Failed to get auth token: " + e3.getMessage(), e3);
            return null;
        } catch (IllegalArgumentException e4) {
            Log.e("PlayEventLogger", "Failed to get auth token: " + e4.getMessage(), e4);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r4.c != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.google.android.play.apkg.v r10, android.os.Message r11) {
        /*
            r2 = 1
            r1 = 0
            int r0 = r11.what
            switch(r0) {
                case 1: goto L1e;
                case 2: goto L27;
                case 3: goto La8;
                case 4: goto Lbe;
                default: goto L7;
            }
        L7:
            java.lang.String r0 = "PlayEventLogger"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown msg: "
            r1.<init>(r2)
            int r2 = r11.what
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
        L1d:
            return
        L1e:
            r10.c()
            long r0 = r10.v
            r10.a(r0)
            goto L1d
        L27:
            java.lang.Object r0 = r11.obj
            com.google.android.play.apkg.m r0 = (com.google.android.play.apkg.m) r0
            com.google.android.play.apkg.ae<com.google.android.play.apkg.m> r4 = r10.h     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            java.io.File r3 = r4.c     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            if (r3 != 0) goto L38
            r4.a()     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            java.io.File r3 = r4.c     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            if (r3 == 0) goto L6a
        L38:
            com.google.android.play.apkg.af<T> r3 = r4.f6749b     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            java.io.FileOutputStream r5 = r4.d     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            r3.a(r0, r5)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            java.io.FileOutputStream r3 = r4.d     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            r3.flush()     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            java.io.File r3 = r4.c     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            if (r3 == 0) goto L75
            java.io.File r3 = r4.c     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            long r6 = r3.length()     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            long r8 = r4.f6748a     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L75
            r3 = r2
        L55:
            if (r3 == 0) goto L6a
            java.io.FileOutputStream r1 = r4.d     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            r1.close()     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            java.util.ArrayList<java.io.File> r1 = r4.e     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            java.io.File r3 = r4.c     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            r1.add(r3)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            r4.a()     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            r4.b()     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
            r1 = r2
        L6a:
            if (r1 == 0) goto L6f
            r10.c()     // Catch: java.io.IOException -> L77 java.lang.Throwable -> La1
        L6f:
            com.google.android.play.apkg.ac r1 = r10.f6789a
            r1.a(r0)
            goto L1d
        L75:
            r3 = r1
            goto L55
        L77:
            r1 = move-exception
            java.lang.String r2 = "PlayEventLogger"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = "Could not write string ("
            r3.<init>(r4)     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = ") to file: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = r1.getMessage()     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> La1
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> La1
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> La1
            com.google.android.play.apkg.ac r1 = r10.f6789a
            r1.a(r0)
            goto L1d
        La1:
            r1 = move-exception
            com.google.android.play.apkg.ac r2 = r10.f6789a
            r2.a(r0)
            throw r1
        La8:
            android.os.Handler r0 = r10.f6790b
            r1 = 3
            r0.removeMessages(r1)
            boolean r0 = r10.d()
            if (r0 == 0) goto Lb7
            r10.c()
        Lb7:
            long r0 = r10.v
            r10.a(r0)
            goto L1d
        Lbe:
            android.os.Handler r0 = r10.f6790b
            r1 = 4
            r0.removeMessages(r1)
            com.google.android.play.apkg.ae<com.google.android.play.apkg.m> r0 = r10.h
            r0.c()
            boolean r0 = r10.d()
        Lcd:
            if (r0 == 0) goto Ld4
            boolean r0 = r10.d()
            goto Lcd
        Ld4:
            java.lang.Object r0 = r11.obj
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto Ldf
            android.os.Handler r1 = r10.i
            r1.post(r0)
        Ldf:
            long r0 = r10.v
            r10.a(r0)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.apkg.v.a(com.google.android.play.apkg.v, android.os.Message):void");
    }
}
