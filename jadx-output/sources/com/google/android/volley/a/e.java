package com.google.android.volley.a;

import org.apache.http.impl.conn.AbstractPoolEntry;
import org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;

/* loaded from: classes.dex */
public final class e extends BasicPooledConnAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final long f7185a;

    protected e(ThreadSafeClientConnManager threadSafeClientConnManager, AbstractPoolEntry abstractPoolEntry) {
        super(threadSafeClientConnManager, abstractPoolEntry);
        this.f7185a = System.currentTimeMillis();
    }
}
