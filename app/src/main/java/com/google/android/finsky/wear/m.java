package com.google.android.finsky.wear;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.il;
import com.google.android.finsky.protos.pf;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.hz;
import com.google.android.finsky.utils.jm;
import com.google.android.gms.wearable.Asset;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class m {
    private static final String[] n = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f5136a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5137b;
    long c;
    int d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    com.google.android.finsky.apkg.n i;
    String j;
    int k;
    final com.google.android.finsky.bpkg.a l;
    final com.google.android.finsky.bpkg.s m;
    private long o;
    private long p;
    private boolean q;
    private pf r = null;
    private File s;
    private final Context t;
    private final h u;
    private final com.google.android.finsky.download.w v;
    private final com.google.android.finsky.installer.n w;
    private final com.google.android.gms.common.api.m x;

    public m(String str, String str2, Context context, h hVar, com.google.android.finsky.bpkg.a aVar, com.google.android.finsky.download.w wVar, com.google.android.finsky.installer.n nVar, com.google.android.gms.common.api.m mVar) {
        this.f5136a = str;
        this.f5137b = str2;
        this.t = context;
        this.u = hVar;
        this.l = aVar;
        this.v = wVar;
        this.w = nVar;
        this.x = mVar;
        this.m = aVar.f2060a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0136, code lost:
    
        a(r1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0139, code lost:
    
        a(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.wear.m.a():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, String str) {
        this.m.a(this.f5136a, i, str);
    }

    final void a(int i, Uri uri) {
        a(i, uri != null ? uri.toString() : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(com.google.android.finsky.bpkg.b bVar) {
        FinskyLog.a("Cancel running installation of %s (%s)", this.f5136a, this.f5137b);
        com.google.android.finsky.download.b a2 = this.v.a(this.f5136a, this.f5137b);
        if (a2 != null) {
            this.v.g(a2);
        }
        d();
        this.u.a(bVar);
        this.u.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OutputStream c() {
        File file = new File(new File(this.t.getCacheDir(), "wear"), Uri.encode(this.f5137b));
        file.mkdirs();
        File file2 = new File(file, this.f5136a + ".apk");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            this.s = file2;
            return fileOutputStream;
        } catch (IOException e) {
            file2.delete();
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.s != null) {
            this.s.delete();
            this.s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.google.android.finsky.bpkg.b bVar) {
        com.google.android.finsky.bpkg.t tVar = bVar.d;
        bh.a(106, this.f5136a, null, 0, null, this.i, this.f5137b);
        String str = this.f5137b + "-" + System.currentTimeMillis();
        String str2 = this.f5136a + "-v" + tVar.c + "-" + this.f5137b;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
            ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
            String str3 = "/wearable_info/" + this.f5136a + "/" + str2;
            FinskyLog.a("Writing Asset to install %s (%s) to %s", this.f5136a, this.f5137b, str3);
            com.google.android.gms.wearable.y a2 = com.google.android.gms.wearable.y.a(str3);
            a2.f6636a.a("asset", Asset.a(parcelFileDescriptor));
            com.google.android.gms.wearable.aa.f6462a.a(this.x, a2.a()).a(new s(this, str3, bVar));
            jm.a(new t(this, bVar, str, str2), this.s, parcelFileDescriptor2);
        } catch (IOException e) {
            FinskyLog.e("Could not create a pipe.", e);
            a(bVar);
        }
    }

    public final void b() {
        com.google.android.finsky.bpkg.b a2 = this.l.a(this.f5136a);
        if (a2 != null && a2.d != null && a2.d.g >= 50) {
            FinskyLog.a("Cannot cancel installing %s (%s) - too late", this.f5136a, this.f5137b);
        } else {
            a(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, int i) {
        bh.a(104, str, null, i, null, this.i, this.f5137b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(com.google.android.finsky.bpkg.t tVar, boolean z) {
        this.o = tVar.e.f3576a;
        this.p = this.o;
        this.c = 0L;
        int i = tVar.m;
        if ((i & 2048) != 0) {
            this.q = false;
            return;
        }
        this.q = (i & 2) != 0;
        if (z && !this.q) {
            this.q = this.p < this.w.d;
            if (this.q) {
                h hVar = this.u;
                String str = this.f5137b;
                String str2 = this.f5136a;
                com.google.android.finsky.bpkg.ab abVar = hVar.f5127a.a(str).f2060a;
                com.google.android.finsky.bpkg.t a2 = abVar.a(str2);
                int i2 = a2 != null ? a2.m : 0;
                int i3 = i2 | 2;
                if (i3 == i2) {
                    return;
                }
                abVar.d(str2, i3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.google.android.finsky.bpkg.t tVar) {
        boolean z;
        if (com.google.android.finsky.installer.n.a(tVar.e.f3576a, Environment.getDataDirectory(), FinskyApp.a().getContentResolver())) {
            z = false;
        } else {
            FinskyLog.d("Cancel download of %s (%s) because insufficient free space", this.f5136a, this.f5137b);
            b();
            bh.a(112, this.f5136a, "no-internal-storage", 908, null, this.i, this.f5137b);
            z = true;
        }
        if (z) {
            return;
        }
        com.google.android.finsky.protos.aa aaVar = tVar.e;
        pf pfVar = new pf();
        pfVar.c = aaVar.f3576a;
        pfVar.e = aaVar.c;
        pfVar.i = aaVar.g;
        pfVar.g = aaVar.e;
        pfVar.i = aaVar.g;
        pfVar.k = aaVar.i;
        pfVar.m = aaVar.x;
        this.r = pfVar;
        this.m.e(this.f5136a, this.f5136a);
        String str = tVar.l;
        String str2 = tVar.f2130a;
        il ilVar = aaVar.m[0];
        int i = tVar.m;
        int i2 = i & (-4613);
        String str3 = this.r.i;
        long j = this.r.c;
        if (i2 != i) {
            this.m.d(str2, i2);
        }
        com.google.android.finsky.download.e eVar = new com.google.android.finsky.download.e(str3, str, str2, this.f5137b, ilVar.f3955a, ilVar.c, null, j, j, null, !this.q, !this.e);
        this.v.e(eVar);
        bh.a(100, eVar.p(), null, 0, null, this.i, this.f5137b);
        a(40, (String) null);
    }

    static /* synthetic */ int a(int i) {
        switch (i) {
            case 2:
                return 940;
            case 3:
                return 941;
            case 4:
                return 942;
            case 5:
                return 944;
            case 6:
                return 945;
            default:
                return 943;
        }
    }

    static /* synthetic */ void a(OutputStream outputStream) {
        outputStream.flush();
        outputStream.close();
    }

    static /* synthetic */ int a(m mVar, String str, hz hzVar, long j, String str2) {
        if (hzVar == null) {
            FinskyLog.d("No digestResult for %s (%s)", str, mVar.f5137b);
            return 961;
        }
        if (j != hzVar.f4980a) {
            FinskyLog.d("Signature check of %s (%s) failed, size expected=%d actual=%d", str, mVar.f5137b, Long.valueOf(j), Long.valueOf(hzVar.f4980a));
            return 919;
        }
        if (str2.equals(hzVar.f4981b)) {
            return 0;
        }
        FinskyLog.d("Signature check of %s (%s) failed, hash expected=%s actual=%s", str, mVar.f5137b, str2, hzVar.f4981b);
        return 960;
    }
}
