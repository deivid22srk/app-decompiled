package com.google.android.libraries.bind.data;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class ab implements Runnable {
    protected final ac g;
    final Executor h;
    protected final k i;
    final AtomicBoolean j = new AtomicBoolean();
    boolean k;

    protected abstract List<Data> b();

    public ab(k kVar, Executor executor) {
        this.i = kVar;
        this.h = executor;
        com.google.android.libraries.bind.apkg.a.a();
        this.g = kVar.e;
    }

    protected void a(ac acVar, j jVar) {
        this.i.a(this, acVar, jVar, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        ac acVar;
        j jVar;
        List<Data> b2;
        boolean z;
        boolean z2;
        if (!this.j.get()) {
            try {
                b2 = b();
            } catch (DataException e) {
                acVar = new ac(this.i.f6696b, e);
                jVar = new j(e);
            }
            if (b2 != null && !this.j.get()) {
                j[] jVarArr = new j[1];
                if (this.g.f6684b == ac.f6683a) {
                    jVarArr[0] = j.f6694b;
                    z = true;
                } else {
                    List<Data> list = this.g.f6684b;
                    if (b2.size() != list.size()) {
                        jVarArr[0] = j.f6694b;
                        z = true;
                    } else {
                        int size = list.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                if (com.google.android.libraries.bind.dpkg.a.a(list.get(i).b(this.g.c), b2.get(i).b(this.i.f6696b))) {
                                    i++;
                                } else {
                                    jVarArr[0] = j.f6694b;
                                    z = true;
                                    break;
                                }
                            } else {
                                jVarArr[0] = j.c;
                                int[] g = this.i.g();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= size) {
                                        z = false;
                                        break;
                                    }
                                    Data data = list.get(i2);
                                    Data data2 = b2.get(i2);
                                    if (g == null) {
                                        z2 = data.equals(data2);
                                    } else {
                                        int length = g.length;
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= length) {
                                                z2 = true;
                                                break;
                                            }
                                            int i4 = g[i3];
                                            if (!com.google.android.libraries.bind.dpkg.a.a(data.b(i4), data2.b(i4))) {
                                                z2 = false;
                                                break;
                                            }
                                            i3++;
                                        }
                                    }
                                    if (!z2) {
                                        z = true;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                }
                if (z) {
                    acVar = new ac(this.i.f6696b, b2);
                    jVar = jVarArr[0];
                    if (!this.j.get()) {
                        a(acVar, jVar);
                    }
                }
            }
        }
    }
}
