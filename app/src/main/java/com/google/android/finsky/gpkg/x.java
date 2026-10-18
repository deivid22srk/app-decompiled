package com.google.android.finsky.gpkg;

import android.os.Handler;
import com.android.volley.VolleyError;
import com.google.android.finsky.protos.iv;
import com.google.android.finsky.protos.jb;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public final class x {
    public static final long d = com.google.android.finsky.cpkg.d.dC.b().intValue();

    /* renamed from: a, reason: collision with root package name */
    public final Handler f2843a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2844b;
    Queue<ab> c;
    public final com.google.android.finsky.api.b e;
    public final Handler f;
    public final av g;
    public ag j;
    public final boolean k;
    public final List<af> h = new ArrayList();
    public final List<ag> i = new ArrayList();
    public final Runnable l = new y(this);

    public x(com.google.android.finsky.api.b bVar, av avVar, a aVar, Handler handler, Handler handler2, boolean z) {
        this.e = bVar;
        this.g = avVar;
        this.f2844b = aVar;
        this.f = handler;
        this.f2843a = handler2;
        this.k = z;
    }

    public final synchronized void a(af afVar) {
        this.h.add(afVar);
    }

    public final synchronized void a(String[] strArr, Runnable runnable, String str) {
        if (this.k) {
            str = str + " libraryIds=" + Arrays.toString(strArr);
            a(1, (jb) null, (VolleyError) null, str);
        }
        String[] a2 = a(strArr);
        if (a2 == null) {
            FinskyLog.a("Skipping replication request since all libraries are unsupported.", new Object[0]);
            this.f.post(runnable);
        } else {
            this.i.add(new ag(a2, runnable, str));
            a(0L);
        }
    }

    public String[] a(String[] strArr) {
        int i = 0;
        for (String str : strArr) {
            if (!this.f2844b.c(str)) {
                i++;
            }
        }
        if (i == strArr.length) {
            return null;
        }
        if (i > 0) {
            String[] strArr2 = new String[strArr.length - i];
            int i2 = 0;
            for (String str2 : strArr) {
                if (this.f2844b.c(str2)) {
                    strArr2[i2] = str2;
                    i2++;
                }
            }
            return strArr2;
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(ag agVar) {
        if (this.k) {
            a(1, (jb) null, (VolleyError) null, agVar.c);
        }
        this.i.add(0, agVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(long j) {
        this.f2843a.removeCallbacks(this.l);
        this.f2843a.postDelayed(this.l, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e A[Catch: all -> 0x0221, TRY_LEAVE, TryCatch #0 {all -> 0x0221, blocks: (B:17:0x006a, B:18:0x006e, B:19:0x0071, B:20:0x0087, B:22:0x008e, B:25:0x00c8, B:26:0x00e0, B:29:0x00ff, B:31:0x0131, B:33:0x0135, B:34:0x0137, B:36:0x01b6, B:37:0x013a, B:39:0x0142, B:40:0x014a, B:42:0x0150, B:43:0x0158, B:45:0x015e, B:49:0x0169, B:51:0x0175, B:52:0x0177, B:54:0x017f, B:55:0x0181, B:57:0x0189, B:58:0x018d, B:59:0x0194, B:61:0x019a, B:63:0x01ad, B:64:0x027a, B:72:0x0230, B:74:0x0236, B:75:0x01c5, B:77:0x01cf, B:78:0x01d5, B:80:0x01d9, B:81:0x01dd, B:83:0x01e4, B:84:0x0204, B:87:0x0253, B:88:0x0257, B:91:0x0283, B:94:0x029d, B:95:0x02a6), top: B:16:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019a A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:17:0x006a, B:18:0x006e, B:19:0x0071, B:20:0x0087, B:22:0x008e, B:25:0x00c8, B:26:0x00e0, B:29:0x00ff, B:31:0x0131, B:33:0x0135, B:34:0x0137, B:36:0x01b6, B:37:0x013a, B:39:0x0142, B:40:0x014a, B:42:0x0150, B:43:0x0158, B:45:0x015e, B:49:0x0169, B:51:0x0175, B:52:0x0177, B:54:0x017f, B:55:0x0181, B:57:0x0189, B:58:0x018d, B:59:0x0194, B:61:0x019a, B:63:0x01ad, B:64:0x027a, B:72:0x0230, B:74:0x0236, B:75:0x01c5, B:77:0x01cf, B:78:0x01d5, B:80:0x01d9, B:81:0x01dd, B:83:0x01e4, B:84:0x0204, B:87:0x0253, B:88:0x0257, B:91:0x0283, B:94:0x029d, B:95:0x02a6), top: B:16:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x027a A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:17:0x006a, B:18:0x006e, B:19:0x0071, B:20:0x0087, B:22:0x008e, B:25:0x00c8, B:26:0x00e0, B:29:0x00ff, B:31:0x0131, B:33:0x0135, B:34:0x0137, B:36:0x01b6, B:37:0x013a, B:39:0x0142, B:40:0x014a, B:42:0x0150, B:43:0x0158, B:45:0x015e, B:49:0x0169, B:51:0x0175, B:52:0x0177, B:54:0x017f, B:55:0x0181, B:57:0x0189, B:58:0x018d, B:59:0x0194, B:61:0x019a, B:63:0x01ad, B:64:0x027a, B:72:0x0230, B:74:0x0236, B:75:0x01c5, B:77:0x01cf, B:78:0x01d5, B:80:0x01d9, B:81:0x01dd, B:83:0x01e4, B:84:0x0204, B:87:0x0253, B:88:0x0257, B:91:0x0283, B:94:0x029d, B:95:0x02a6), top: B:16:0x006a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.google.android.finsky.protos.jb r52, java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.gpkg.x.a(com.google.android.finsky.protos.jb, java.lang.String):boolean");
    }

    public synchronized void a(String str) {
        Iterator<af> it = this.h.iterator();
        while (it.hasNext()) {
            this.f.post(new aa(this, it.next(), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(int i, jb jbVar, VolleyError volleyError, String str) {
        if (this.c == null) {
            this.c = new LinkedList();
        }
        ab abVar = new ab((byte) 0);
        abVar.f2786a = System.currentTimeMillis();
        abVar.f2787b = i;
        abVar.c = str;
        abVar.d = jbVar;
        abVar.e = volleyError;
        this.c.add(abVar);
        if (this.c.size() > 100) {
            this.c.remove();
        }
    }

    public static /* synthetic */ iv a(x xVar, String str) {
        g j = xVar.f2844b.j(str);
        iv ivVar = new iv();
        ivVar.f3973a = a.a(str);
        ivVar.f3974b = true;
        ivVar.c = str;
        ivVar.d = true;
        ivVar.g = j.c.a();
        ivVar.h = true;
        ivVar.i = j.g();
        ivVar.j = true;
        byte[] i = xVar.f2844b.i(str);
        if (i != null) {
            ivVar.e = i;
            ivVar.f = true;
        }
        return ivVar;
    }
}
