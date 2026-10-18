package com.google.android.play.search;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    int f7048b;
    View.OnClickListener e;

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<n> f7047a = new ArrayList<>();
    int c = 1;
    String d = "";

    public final void a(n nVar) {
        this.f7047a.add(nVar);
    }

    public final void b(n nVar) {
        this.f7047a.remove(nVar);
    }

    public final boolean a() {
        return this.f7048b == this.c;
    }

    public final void b() {
        a(this.c);
    }

    public final void a(int i) {
        if (this.f7048b != i) {
            this.f7048b = i;
            for (int size = this.f7047a.size() - 1; size >= 0; size--) {
                this.f7047a.get(size).a(i);
            }
        }
    }

    public final void c() {
        for (int size = this.f7047a.size() - 1; size >= 0; size--) {
            this.f7047a.get(size).a(this.d);
        }
    }

    final void a(String str, boolean z) {
        if (!this.d.equals(str)) {
            this.d = str;
            a(z);
        }
    }

    final void a(boolean z) {
        for (int size = this.f7047a.size() - 1; size >= 0; size--) {
            this.f7047a.get(size).a(this.d, z);
        }
    }
}
