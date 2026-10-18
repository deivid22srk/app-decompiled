package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class dz {

    /* renamed from: a, reason: collision with root package name */
    public int f777a;

    /* renamed from: b, reason: collision with root package name */
    public int f778b;
    public int c;
    public int d;

    public final dz a(eq eqVar) {
        View view = eqVar.f795a;
        this.f777a = view.getLeft();
        this.f778b = view.getTop();
        this.c = view.getRight();
        this.d = view.getBottom();
        return this;
    }
}
