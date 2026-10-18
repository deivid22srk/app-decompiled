package com.google.android.finsky.utils;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bu implements com.google.android.gms.common.api.p, com.google.android.gms.common.api.q {

    /* renamed from: a, reason: collision with root package name */
    final bx f4786a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.m f4787b;
    boolean c;
    boolean d;
    ArrayList<AudienceMember> e;
    String[] f;
    private final String g;
    private final String h;

    public bu(com.google.android.gms.common.api.m mVar, String str, String str2, bx bxVar) {
        this.f4787b = mVar;
        this.g = str;
        this.h = str2;
        this.f4786a = bxVar;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(int i) {
        this.f4787b.b((com.google.android.gms.common.api.p) this);
        this.f4787b.b((com.google.android.gms.common.api.q) this);
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(ConnectionResult connectionResult) {
        jm.a();
        this.f4787b.b((com.google.android.gms.common.api.p) this);
        this.f4787b.b((com.google.android.gms.common.api.q) this);
        this.f4786a.a();
    }

    final void a() {
        if (!this.c || !this.d) {
            return;
        }
        ArrayList<AudienceMember> arrayList = new ArrayList<>();
        if (this.f != null) {
            int length = this.f.length;
            for (int i = 0; i < length; i++) {
                String str = this.f[i];
                int size = this.e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AudienceMember audienceMember = this.e.get(i2);
                    if (str.equals(audienceMember.d)) {
                        arrayList.add(audienceMember);
                    }
                }
            }
        }
        this.f4787b.b((com.google.android.gms.common.api.p) this);
        this.f4787b.b((com.google.android.gms.common.api.q) this);
        this.f4786a.a(arrayList);
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Bundle bundle) {
        com.google.android.gms.people.d dVar = new com.google.android.gms.people.d();
        dVar.f6395b = -1;
        com.google.android.gms.people.m.e.a(this.f4787b, this.g, dVar).a(new bv(this));
        com.google.android.gms.people.f fVar = new com.google.android.gms.people.f();
        ArrayList arrayList = new ArrayList();
        arrayList.add(bp.a(this.h));
        fVar.c = arrayList;
        com.google.android.gms.people.m.e.a(this.f4787b, this.g, fVar).a(new bw(this));
    }
}
