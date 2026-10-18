package com.a.a.apkg.bpkg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class al extends com.a.a.apkg.c implements c {

    /* renamed from: b, reason: collision with root package name */
    b f940b;
    public final /* synthetic */ ac c;

    /* synthetic */ al(ac acVar, byte b2) {
        this(acVar);
    }

    public al(com.a.a.apkg.bpkg.ac cVar) {
        super("OkHttp %s", new Object[]{ac.a(cVar)});
        this.c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.a.a.apkg.c
    public final void a() {
        a aVar;
        a aVar2 = a.INTERNAL_ERROR;
        a aVar3 = a.INTERNAL_ERROR;
        try {
            try {
                this.f940b = this.c.g.a(okio2.o.a(okio2.o.b(this.c.h)), this.c.f930b);
                if (!this.c.f930b) {
                    this.f940b.a();
                }
                while (this.f940b.a(this)) {
                }
                aVar2 = a.NO_ERROR;
                try {
                    this.c.a(aVar2, a.CANCEL);
                } catch (IOException e) {
                }
                com.a.a.apkg.l.a(this.f940b);
            } catch (Throwable th) {
                aVar = aVar2;
                th = th;
                try {
                    this.c.a(aVar, aVar3);
                } catch (IOException e2) {
                }
                com.a.a.apkg.l.a(this.f940b);
                throw th;
            }
        } catch (IOException e3) {
            aVar = a.PROTOCOL_ERROR;
            try {
                try {
                    this.c.a(aVar, a.PROTOCOL_ERROR);
                } catch (IOException e4) {
                }
                com.a.a.apkg.l.a(this.f940b);
            } catch (Throwable th2) {
                th = th2;
                this.c.a(aVar, aVar3);
                com.a.a.apkg.l.a(this.f940b);
                throw th;
            }
        }
    }

    @Override // com.a.a.apkg.bpkg.c
    public final void a(boolean z, int i, okio2.i iVar, int i2) {
        if (ac.a(this.c, i)) {
            ac.a(this.c, i, iVar, i2, z);
            return;
        }
        ao a2 = this.c.a(i);
        if (a2 == null) {
            this.c.a(i, a.INVALID_STREAM);
            iVar.f(i2);
        } else {
            if (!ao.i && Thread.holdsLock(a2)) {
                throw new AssertionError();
            }
            a2.f.a(iVar, i2);
            if (z) {
                a2.e();
            }
        }
    }

    @Override // com.a.a.apkg.bpkg.c
    public final void a(boolean z, boolean z2, int i, List<e> list, f fVar) {
        boolean z3;
        int i2;
        int i3;
        Map map;
        ExecutorService executorService;
        String str;
        boolean z4 = true;
        if (!ac.a(this.c, i)) {
            synchronized (this.c) {
                z3 = this.c.r;
                if (!z3) {
                    ao a2 = this.c.a(i);
                    if (a2 == null) {
                        if (!(fVar == f.SPDY_REPLY || fVar == f.SPDY_HEADERS)) {
                            i2 = this.c.p;
                            if (i > i2) {
                                int i4 = i % 2;
                                i3 = this.c.q;
                                if (i4 != i3 % 2) {
                                    ao aoVar = new ao(i, this.c, z, z2, list);
                                    this.c.p = i;
                                    map = this.c.n;
                                    map.put(Integer.valueOf(i), aoVar);
                                    executorService = ac.l;
                                    str = this.c.o;
                                    executorService.submit(new am(this, "OkHttp %s stream %d", new Object[]{str, Integer.valueOf(i)}, aoVar));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        this.c.a(i, a.INVALID_STREAM);
                        return;
                    }
                    if (fVar == f.SPDY_SYN_STREAM) {
                        a2.b(a.PROTOCOL_ERROR);
                        this.c.b(i);
                        return;
                    }
                    if (!ao.i && Thread.holdsLock(a2)) {
                        throw new AssertionError();
                    }
                    a aVar = null;
                    synchronized (a2) {
                        if (a2.e == null) {
                            if (fVar == f.SPDY_HEADERS) {
                                aVar = a.PROTOCOL_ERROR;
                            } else {
                                a2.e = list;
                                z4 = a2.a();
                                a2.notifyAll();
                            }
                        } else {
                            if (fVar == f.SPDY_REPLY) {
                                aVar = a.STREAM_IN_USE;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                arrayList.addAll(a2.e);
                                arrayList.addAll(list);
                                a2.e = arrayList;
                            }
                        }
                    }
                    if (aVar != null) {
                        a2.b(aVar);
                    } else if (!z4) {
                        a2.d.b(a2.c);
                    }
                    if (z2) {
                        a2.e();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.c.t.submit(new ah(this.c, "OkHttp %s Push Headers[%s]", new Object[]{this.c.o, Integer.valueOf(i)}, i, list, z2));
    }

    @Override // com.a.a.apkg.bpkg.c
    public final void a(int i, a aVar) {
        if (!ac.a(this.c, i)) {
            ao b2 = this.c.b(i);
            if (b2 != null) {
                b2.c(aVar);
                return;
            }
            return;
        }
        this.c.t.submit(new aj(this.c, "OkHttp %s Push Reset[%s]", new Object[]{this.c.o, Integer.valueOf(i)}, i, aVar));
    }

    @Override // com.a.a.apkg.bpkg.c
    public final void a(boolean z, y yVar) {
        ao[] aoVarArr;
        long j;
        boolean z2;
        Map map;
        Map map2;
        Map map3;
        ExecutorService executorService;
        String str;
        synchronized (this.c) {
            int b2 = this.c.f.b();
            if (z) {
                y yVar2 = this.c.f;
                yVar2.c = 0;
                yVar2.f982b = 0;
                yVar2.f981a = 0;
                Arrays.fill(yVar2.d, 0);
            }
            y yVar3 = this.c.f;
            for (int i = 0; i < 10; i++) {
                if (yVar.a(i)) {
                    yVar3.a(i, yVar.b(i), yVar.d[i]);
                }
            }
            if (this.c.f929a == com.a.a.aa.HTTP_2) {
                executorService = ac.l;
                str = this.c.o;
                executorService.submit(new an(this, "OkHttp %s ACK Settings", new Object[]{str}, yVar));
            }
            int b3 = this.c.f.b();
            if (b3 == -1 || b3 == b2) {
                aoVarArr = null;
                j = 0;
            } else {
                long j2 = b3 - b2;
                z2 = this.c.x;
                if (!z2) {
                    ac acVar = this.c;
                    acVar.d += j2;
                    if (j2 > 0) {
                        acVar.notifyAll();
                    }
                    ac.h(this.c);
                }
                map = this.c.n;
                if (!map.isEmpty()) {
                    map2 = this.c.n;
                    Collection values = map2.values();
                    map3 = this.c.n;
                    ao[] aoVarArr2 = (ao[]) values.toArray(new ao[map3.size()]);
                    j = j2;
                    aoVarArr = aoVarArr2;
                } else {
                    j = j2;
                    aoVarArr = null;
                }
            }
        }
        if (aoVarArr != null && j != 0) {
            for (ao aoVar : aoVarArr) {
                synchronized (aoVar) {
                    aoVar.a(j);
                }
            }
        }
    }

    @Override // com.a.a.apkg.bpkg.c
    public final void a(boolean z, int i, int i2) {
        v c;
        if (z) {
            c = this.c.c(i);
            if (c != null) {
                if (c.c != -1 || c.f979b == -1) {
                    throw new IllegalStateException();
                }
                c.c = System.nanoTime();
                c.f978a.countDown();
                return;
            }
            return;
        }
        ac.l.submit(new af(r0, "OkHttp %s ping %08x%08x", new Object[]{this.c.o, Integer.valueOf(i), Integer.valueOf(i2)}, i, i2));
    }


    @Override // com.a.a.apkg.bpkg.c
    public final void a(int i, List<e> list) {
        ac.a(this.c, i, list);
    }

    @Override // com.a.a.apkg.bpkg.c
    public final void a(int i, okio2.j jVar) {
        Map map;
        Map map2;
        ao[] aoVarArr;
        byte[] bArr = jVar.f13b;
        synchronized (this.c) {
            map = this.c.n;
            Collection values = map.values();
            map2 = this.c.n;
            aoVarArr = (ao[]) values.toArray(new ao[map2.size()]);
            ac.i(this.c);
        }
        for (ao aoVar : aoVarArr) {
            if (aoVar.c > i && aoVar.b()) {
                aoVar.c(a.REFUSED_STREAM);
                this.c.b(aoVar.c);
            }
        }
    }

    public final void a(int i, long j) {
        if (i == 0) {
            synchronized (this.c) {
                this.c.d += j;
                this.c.notifyAll();
            }
            return;
        }
        ao b2 = this.c.a(i);
        if (b2 != null) {
            synchronized (b2) {
                b2.a(j);
            }
        }
    }
}
