package com.google.android.finsky.detailspage;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bu extends android.support.v7.widget.dt<bx> {
    List<bw> c;
    Handler d = new Handler();

    @Override // android.support.v7.widget.dt
    public final /* synthetic */ void a(bx bxVar) {
        bx bxVar2 = bxVar;
        if (bxVar2.l != null) {
            bxVar2.l.b(bxVar2.f795a);
            if (bxVar2.l.t == bxVar2) {
                bxVar2.l.t = null;
            }
            bxVar2.l = null;
        }
        super.a((bu) bxVar2);
    }

    @Override // android.support.v7.widget.dt
    public final /* synthetic */ void a(bx bxVar, int i) {
        bx bxVar2 = bxVar;
        bw bwVar = this.c.get(i);
        bwVar.t = bxVar2;
        bxVar2.l = bwVar;
        bwVar.a(bxVar2.f795a);
    }

    public bu(List<bw> list) {
        if (list != null) {
            this.c = com.google.android.finsky.utils.cz.a(list);
        } else {
            this.c = new ArrayList();
        }
    }

    @Override // android.support.v7.widget.dt
    public final int a(int i) {
        return this.c.get(i).c();
    }

    @Override // android.support.v7.widget.dt
    public final int a() {
        return this.c.size();
    }

    @Override // android.support.v7.widget.dt
    public final /* synthetic */ bx a(ViewGroup viewGroup, int i) {
        return new bx(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
