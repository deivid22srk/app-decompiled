package com.a.a;

import java.net.SocketException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f1038a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1039b;
    public final long c;
    public final LinkedList<l> d = new LinkedList<>();
    public Executor e = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.a.a.apkg.l.b("OkHttp ConnectionPool"));
    public final Runnable f = new n(this);

    static {
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long parseLong = property2 != null ? Long.parseLong(property2) : 300000L;
        if (property != null && !Boolean.parseBoolean(property)) {
            f1038a = new m(0, parseLong);
        } else if (property3 != null) {
            f1038a = new m(Integer.parseInt(property3), parseLong);
        } else {
            f1038a = new m(5, parseLong);
        }
    }

    public m(int i, long j) {
        this.f1039b = i;
        this.c = j * 1000 * 1000;
    }

    public static m a() {
        return f1038a;
    }

    public final synchronized l a(aA2 aVar) {
        l lVar;
        ListIterator<l> listIterator = this.d.listIterator(this.d.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lVar = null;
                break;
            }
            lVar = listIterator.previous();
            if (lVar.f1037b.f1016a.equals(aVar) && lVar.b() && System.nanoTime() - lVar.d() < this.c) {
                listIterator.remove();
                if (lVar.e()) {
                    break;
                }
                try {
                    com.a.a.apkg.g.a().a(lVar.c);
                    break;
                } catch (SocketException e) {
                    com.a.a.apkg.l.a(lVar.c);
                    com.a.a.apkg.g.a();
                    com.a.a.apkg.g.a("Unable to tagSocket(): " + e);
                }
            }
        }
        if (lVar != null && lVar.e()) {
            this.d.addFirst(lVar);
        }
        return lVar;
    }

    public final void a(l lVar) {
        boolean isEmpty = this.d.isEmpty();
        this.d.addFirst(lVar);
        if (isEmpty) {
            this.e.execute(this.f);
        } else {
            notifyAll();
        }
    }

    public boolean b() {
        int i;
        int i2;
        long j;
        synchronized (this) {
            if (this.d.isEmpty()) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            long nanoTime = System.nanoTime();
            long j2 = this.c;
            ListIterator<l> listIterator = this.d.listIterator(this.d.size());
            while (listIterator.hasPrevious()) {
                l previous = listIterator.previous();
                long d = previous.d() == Long.MAX_VALUE ? Long.MAX_VALUE : (previous.d() - nanoTime) + this.c;
                if (d <= 0 || !previous.b()) {
                    listIterator.remove();
                    arrayList.add(previous);
                } else {
                    if (previous.c()) {
                        j = Math.min(j2, d);
                        i2 = i3 + 1;
                    } else {
                        long j3 = j2;
                        i2 = i3;
                        j = j3;
                    }
                    i3 = i2;
                    j2 = j;
                }
            }
            ListIterator<l> listIterator2 = this.d.listIterator(this.d.size());
            while (listIterator2.hasPrevious() && i3 > this.f1039b) {
                l previous2 = listIterator2.previous();
                if (previous2.c()) {
                    arrayList.add(previous2);
                    listIterator2.remove();
                    i = i3 - 1;
                } else {
                    i = i3;
                }
                i3 = i;
            }
            if (arrayList.isEmpty()) {
                try {
                    long j4 = j2 / 1000000;
                    wait(j4, (int) (j2 - (1000000 * j4)));
                    return true;
                } catch (InterruptedException e) {
                }
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                com.a.a.apkg.l.a(((l) arrayList.get(i4)).c);
            }
            return true;
        }
    }

    public static /* synthetic */ void a(m mVar) {
        while (mVar.b()) {
        }
    }
}
