package com.android.a.a;

import android.os.Process;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

/* loaded from: classes.dex */
final class ap extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private static final HttpClient f1075a = new DefaultHttpClient();

    /* renamed from: b, reason: collision with root package name */
    private HttpUriRequest f1076b;
    private ao<am> c;

    protected ap(HttpUriRequest httpUriRequest, ao<am> aoVar) {
        this.f1076b = httpUriRequest;
        this.c = aoVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str;
        Process.setThreadPriority(10);
        try {
            synchronized (f1075a) {
                str = (String) f1075a.execute(this.f1076b, new BasicResponseHandler());
            }
            this.c.a(am.a(str));
        } catch (Exception e) {
            this.c.a();
        }
    }
}
