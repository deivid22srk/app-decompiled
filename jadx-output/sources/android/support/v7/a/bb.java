package android.support.v7.a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class bb {

    /* renamed from: a, reason: collision with root package name */
    int f493a;

    /* renamed from: b, reason: collision with root package name */
    int f494b;
    int c;
    int d;
    int e;
    int f;
    ViewGroup g;
    View h;
    View i;
    android.support.v7.view.menu.i j;
    android.support.v7.view.menu.g k;
    Context l;
    boolean m;
    boolean n;
    boolean o;
    public boolean p;
    boolean q = false;
    boolean r;
    Bundle s;

    bb(int i) {
        this.f493a = i;
    }

    final void a(android.support.v7.view.menu.i iVar) {
        if (iVar != this.j) {
            if (this.j != null) {
                this.j.b(this.k);
            }
            this.j = iVar;
            if (iVar == null || this.k == null) {
                return;
            }
            iVar.a(this.k);
        }
    }
}
