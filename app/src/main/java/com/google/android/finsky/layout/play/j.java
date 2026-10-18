package com.google.android.finsky.layout.play;

import android.content.Context;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f3500a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f3501b;
    final /* synthetic */ FinskyDrawerLayout c;

    j(FinskyDrawerLayout finskyDrawerLayout, int i, Context context) {
        this.c = finskyDrawerLayout;
        this.f3500a = i;
        this.f3501b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        com.google.android.finsky.navigationmanager.b bVar;
        com.google.android.finsky.navigationmanager.b bVar2;
        switch (this.f3500a) {
            case 1:
                i = 106;
                break;
            case 2:
                i = 104;
                break;
            case 3:
            case 5:
            default:
                i = 103;
                break;
            case 4:
                i = 105;
                break;
            case 6:
                i = 107;
                break;
        }
        this.c.d(i);
        switch (this.f3500a) {
            case 1:
            case 2:
            case 4:
            case 6:
                if (!com.google.android.finsky.utils.cr.a(this.f3501b.getPackageManager(), this.f3500a)) {
                    bVar = this.c.o;
                    bVar.b(this.f3500a);
                    break;
                } else {
                    this.f3501b.startActivity(com.google.android.finsky.utils.cr.a(this.f3501b, this.f3500a, FinskyApp.a().j()));
                    break;
                }
            case 3:
            case 5:
            default:
                bVar2 = this.c.o;
                bVar2.a(FinskyApp.a().g, false);
                break;
        }
    }
}
