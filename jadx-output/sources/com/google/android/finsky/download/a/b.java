package com.google.android.finsky.download.a;

import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.ah;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b extends com.google.android.finsky.download.d {
    private final a h;
    private int i;

    public b(String str, a aVar, ah ahVar) {
        super(str, ahVar.e, ahVar.g, ahVar.k, ahVar.i, ahVar.m, ahVar.o);
        this.i = -2;
        this.h = aVar;
    }

    @Override // com.google.android.finsky.download.d
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.finsky.download.d
    public final File b() {
        return new File(c.a(this.f2697a), d.a(this.h.a(), c(), this.f2697a));
    }

    @Override // com.google.android.finsky.download.d
    public final synchronized int c() {
        if (this.i == -2) {
            String str = this.f2697a;
            boolean a2 = this.h.a();
            File[] listFiles = c.a(str).listFiles();
            int i = -1;
            if (listFiles != null) {
                for (File file : listFiles) {
                    Integer a3 = d.a(file.getName(), str, a2);
                    if (a3 != null && a3.intValue() > i) {
                        i = a3.intValue();
                    }
                }
            }
            this.i = i;
        }
        return this.i;
    }

    @Override // com.google.android.finsky.download.d
    public final OutputStream d() {
        File g = this.h.g();
        g.delete();
        return new FileOutputStream(g);
    }

    @Override // com.google.android.finsky.download.d
    public final void a(OutputStream outputStream) {
        outputStream.flush();
        outputStream.close();
    }

    @Override // com.google.android.finsky.download.d
    public final boolean a(boolean z) {
        return false;
    }

    @Override // com.google.android.finsky.download.d
    public final File g() {
        return this.h.g();
    }

    @Override // com.google.android.finsky.download.d
    public final String a(String str) {
        return FinskyApp.a().getString(R.string.notification_additional_data, new Object[]{str});
    }

    @Override // com.google.android.finsky.download.d
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.finsky.download.d
    public final boolean f() {
        this.h.e();
        return this.h.d() == 4;
    }

    @Override // com.google.android.finsky.download.d
    public final a h() {
        return this.h;
    }

    @Override // com.google.android.finsky.download.d
    public final boolean i() {
        return FinskyApp.a().e().a(12605417L);
    }
}
