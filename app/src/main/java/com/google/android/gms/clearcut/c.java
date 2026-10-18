package com.google.android.gms.clearcut;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.u;
import com.google.android.gms.internal.an;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final an f5554a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f5555b;
    private int c;
    private String d;
    private String e;
    private String f;
    private int g;
    private final d h;
    private d i;
    private ArrayList<Integer> j;
    private boolean k;

    private c(a aVar, byte[] bArr) {
        this(aVar, bArr, (byte) 0);
    }

    /* synthetic */ c(a aVar, byte[] bArr, char c) {
        this(aVar, bArr);
    }

    private c(a aVar, byte[] bArr, byte b2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        String str5;
        com.google.android.gms.common.cpkg.a aVar2;
        com.google.android.gms.common.cpkg.a aVar3;
        e unused;
        this.f5555b = aVar;
        i = this.f5555b.j;
        this.c = i;
        str = this.f5555b.i;
        this.d = str;
        str2 = this.f5555b.k;
        this.e = str2;
        str3 = this.f5555b.l;
        this.f = str3;
        i2 = this.f5555b.n;
        this.g = i2;
        this.j = null;
        this.f5554a = new an();
        this.k = false;
        str4 = aVar.k;
        this.e = str4;
        str5 = aVar.l;
        this.f = str5;
        an anVar = this.f5554a;
        aVar2 = aVar.o;
        anVar.f5876a = aVar2.a();
        an anVar2 = this.f5554a;
        aVar3 = aVar.o;
        anVar2.f5877b = aVar3.b();
        an anVar3 = this.f5554a;
        unused = aVar.p;
        anVar3.q = TimeZone.getDefault().getOffset(this.f5554a.f5876a) / 1000;
        if (bArr != null) {
            this.f5554a.j = bArr;
        }
        this.h = null;
    }

    public final u<Status> a(m mVar) {
        f fVar;
        String str;
        int i;
        boolean z;
        if (this.k) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.k = true;
        fVar = this.f5555b.e;
        str = this.f5555b.g;
        i = this.f5555b.h;
        int i2 = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        z = this.f5555b.m;
        return fVar.a(mVar, new LogEventParcelable(new PlayLoggerContext(str, i, i2, str2, str3, str4, z, this.g), this.f5554a, this.h, this.i, a.a(this.j)));
    }
}
