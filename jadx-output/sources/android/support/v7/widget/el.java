package android.support.v7.widget;

import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
public abstract class el {
    RecyclerView h;
    ec i;
    boolean j;
    boolean k;
    View l;
    public int g = -1;

    /* renamed from: a, reason: collision with root package name */
    private final em f788a = new em();

    public abstract void a();

    public abstract void a(int i, int i2, em emVar);

    public abstract void a(View view, em emVar);

    protected final void b() {
        if (this.k) {
            a();
            this.h.n.f791a = -1;
            this.l = null;
            this.g = -1;
            this.j = false;
            this.k = false;
            ec.a(this.i, this);
            this.i = null;
            this.h = null;
        }
    }

    static /* synthetic */ void a(el elVar, int i, int i2) {
        RecyclerView recyclerView = elVar.h;
        if (!elVar.k || elVar.g == -1 || recyclerView == null) {
            elVar.b();
        }
        elVar.j = false;
        if (elVar.l != null) {
            if (RecyclerView.d(elVar.l) == elVar.g) {
                View view = elVar.l;
                en enVar = recyclerView.n;
                elVar.a(view, elVar.f788a);
                em.a(elVar.f788a, recyclerView);
                elVar.b();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                elVar.l = null;
            }
        }
        if (elVar.k) {
            en enVar2 = recyclerView.n;
            elVar.a(i, i2, elVar.f788a);
            boolean z = elVar.f788a.c >= 0;
            em.a(elVar.f788a, recyclerView);
            if (z) {
                if (elVar.k) {
                    elVar.j = true;
                    recyclerView.ab.a();
                } else {
                    elVar.b();
                }
            }
        }
    }
}
