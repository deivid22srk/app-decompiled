package com.google.android.finsky.activities.b;

import android.view.View;
import com.google.android.finsky.layout.cl;

/* loaded from: classes.dex */
public final class af implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    int f1570a = -1;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.finsky.a.i f1571b;
    private cl c;

    public af(com.google.android.finsky.a.i iVar) {
        this.f1571b = iVar;
    }

    public final void a(cl clVar, int i) {
        if (this.c == clVar) {
            this.c = null;
        }
        if (i == this.f1570a) {
            this.c = clVar;
        }
        clVar.setRowPosition(i);
        clVar.setOnClickListener(this);
        if (i == this.f1570a) {
            clVar.setClickable(false);
        }
    }

    public final void b(cl clVar, int i) {
        if (this.f1570a == -1) {
            this.c = clVar;
            this.f1570a = i;
            clVar.d = true;
            clVar.getLayoutParams().height = clVar.f3195a;
            clVar.c();
            clVar.setClickable(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cl clVar = (cl) view;
        if (!clVar.d) {
            this.f1571b.a(clVar.getPlayStoreUiElement().f1453a, (byte[]) null, clVar);
            clVar.b();
            if (this.f1570a != -1 && this.c != null) {
                this.c.b();
            }
            this.f1570a = clVar.getRowPosition();
            this.c = clVar;
        }
    }

    public final boolean a() {
        return this.f1570a != -1;
    }
}
