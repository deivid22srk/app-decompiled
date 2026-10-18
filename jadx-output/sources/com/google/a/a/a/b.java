package com.google.a.a.a;

import com.google.android.gms.internal.af;
import com.google.android.gms.internal.ai;
import com.google.android.gms.internal.z;
import com.google.android.gms.internal.zzaic;

/* loaded from: classes.dex */
public final class b extends af {

    /* renamed from: a, reason: collision with root package name */
    public String f1406a = "";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.af
    public final int a() {
        int a2 = super.a();
        return !this.f1406a.equals("") ? a2 + zzaic.b(1, this.f1406a) : a2;
    }

    @Override // com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        if (!this.f1406a.equals("")) {
            zzaicVar.a(1, this.f1406a);
        }
        super.a(zzaicVar);
    }

    public b() {
        this.p = -1;
    }

    @Override // com.google.android.gms.internal.af
    public final /* synthetic */ af a(z zVar) {
        while (true) {
            int a2 = zVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.f1406a = zVar.c();
                    break;
                default:
                    if (!ai.a(zVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
