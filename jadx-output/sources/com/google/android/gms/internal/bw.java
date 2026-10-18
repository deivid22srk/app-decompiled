package com.google.android.gms.internal;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

@gw
/* loaded from: classes.dex */
public final class bw extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final bu f5905a;

    /* renamed from: b, reason: collision with root package name */
    final gv f5906b;
    final int c;
    final int d;
    final int e;
    final int f;
    private boolean g;
    private boolean h;
    private final Object i;
    private final bv j;
    private final int k;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!this.h) {
            try {
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.b.b("Error in ContentFetchTask", th);
                this.f5906b.a(th, true);
            }
            if (a()) {
                Activity activity = this.j.f5903a;
                if (activity == null) {
                    com.google.android.gms.ads.internal.util.client.b.a("ContentFetchThread: no activity");
                } else if (activity != null) {
                    View view = null;
                    if (activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
                        view = activity.getWindow().getDecorView().findViewById(R.id.content);
                    }
                    if (view != null && view != null) {
                        view.post(new bx(this, view));
                    }
                }
            } else {
                com.google.android.gms.ads.internal.util.client.b.a("ContentFetchTask: sleeping");
                synchronized (this.i) {
                    this.g = true;
                    com.google.android.gms.ads.internal.util.client.b.a("ContentFetchThread: paused, mPause = " + this.g);
                }
            }
            Thread.sleep(this.k * 1000);
            synchronized (this.i) {
                while (this.g) {
                    try {
                        com.google.android.gms.ads.internal.util.client.b.a("ContentFetchTask: waiting");
                        this.i.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r0.importance != 100) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r0 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r1.inKeyguardRestrictedInputMode() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        r0 = (android.os.PowerManager) r4.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r0 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r0 = r0.isScreenOn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a() {
        /*
            r8 = this;
            r3 = 1
            r2 = 0
            com.google.android.gms.internal.bv r0 = r8.j     // Catch: java.lang.Throwable -> L67
            android.content.Context r4 = r0.f5904b     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto La
            r0 = r2
        L9:
            return r0
        La:
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch: java.lang.Throwable -> L67
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "keyguard"
            java.lang.Object r1 = r4.getSystemService(r1)     // Catch: java.lang.Throwable -> L67
            android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L1e
            if (r1 != 0) goto L20
        L1e:
            r0 = r2
            goto L9
        L20:
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L28
            r0 = r2
            goto L9
        L28:
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L67
        L2c:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L65
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L67
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0     // Catch: java.lang.Throwable -> L67
            int r6 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L67
            int r7 = r0.pid     // Catch: java.lang.Throwable -> L67
            if (r6 != r7) goto L2c
            int r0 = r0.importance     // Catch: java.lang.Throwable -> L67
            r5 = 100
            if (r0 != r5) goto L5e
            r0 = r3
        L47:
            if (r0 == 0) goto L65
            boolean r0 = r1.inKeyguardRestrictedInputMode()     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L65
            java.lang.String r0 = "power"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch: java.lang.Throwable -> L67
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L60
            r0 = r2
        L5a:
            if (r0 == 0) goto L65
            r0 = r3
            goto L9
        L5e:
            r0 = r2
            goto L47
        L60:
            boolean r0 = r0.isScreenOn()     // Catch: java.lang.Throwable -> L67
            goto L5a
        L65:
            r0 = r2
            goto L9
        L67:
            r0 = move-exception
            r0 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bw.a():boolean");
    }

    final ca a(View view, bt btVar) {
        boolean z;
        if (view == null) {
            return new ca(this, 0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new ca(this, 0, 0);
            }
            btVar.b(text.toString());
            return new ca(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof im)) {
            btVar.b();
            WebView webView = (WebView) view;
            if (com.google.android.gms.common.c.g.a(19)) {
                btVar.b();
                webView.post(new by(this, btVar, webView));
                z = true;
            } else {
                z = false;
            }
            return z ? new ca(this, 0, 1) : new ca(this, 0, 0);
        }
        if (!(view instanceof ViewGroup)) {
            return new ca(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            ca a2 = a(viewGroup.getChildAt(i3), btVar);
            i2 += a2.f5912a;
            i += a2.f5913b;
        }
        return new ca(this, i2, i);
    }
}
