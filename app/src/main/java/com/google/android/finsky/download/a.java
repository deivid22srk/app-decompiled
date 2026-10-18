package com.google.android.finsky.download;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import java.io.File;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class a extends d {
    private final com.google.android.finsky.bpkg.a h;
    private final com.google.android.finsky.installer.s i;

    public a(com.google.android.finsky.bpkg.a aVar, com.google.android.finsky.installer.s sVar, String str, com.google.android.finsky.protos.aa aaVar) {
        super(str, aaVar.f3576a, aaVar.e, aaVar.g, aaVar.c, aaVar.i, aaVar.x);
        this.h = aVar;
        this.i = sVar;
    }

    @Override // com.google.android.finsky.download.d
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.finsky.download.d
    public final File b() {
        try {
            ApplicationInfo applicationInfo = FinskyApp.a().getPackageManager().getApplicationInfo(this.f2697a, 0);
            String str = applicationInfo.sourceDir;
            String str2 = applicationInfo.publicSourceDir;
            if (TextUtils.isEmpty(str) || !str.equals(str2)) {
                return null;
            }
            return new File(str);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @Override // com.google.android.finsky.download.d
    public final int c() {
        return this.h.f2061b.h(this.f2697a);
    }

    @Override // com.google.android.finsky.download.d
    public final OutputStream d() {
        return this.i.a(this.f2697a, this.f2697a, this.f2698b);
    }

    @Override // com.google.android.finsky.download.d
    public final void a(OutputStream outputStream) {
        this.i.a(outputStream);
    }

    @Override // com.google.android.finsky.download.d
    public final boolean a(boolean z) {
        return this.i.a(z);
    }

    @Override // com.google.android.finsky.download.d
    public final String a(String str) {
        return str;
    }

    @Override // com.google.android.finsky.download.d
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.finsky.download.d
    public final boolean f() {
        return true;
    }
}
