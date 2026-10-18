package android.support.v7.widget;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
final class cr {

    /* renamed from: b, reason: collision with root package name */
    int f747b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int j;
    boolean l;

    /* renamed from: a, reason: collision with root package name */
    boolean f746a = true;
    int h = 0;
    boolean i = false;
    List<eq> k = null;

    cr() {
    }

    final boolean a(en enVar) {
        return this.d >= 0 && this.d < enVar.a();
    }

    final View a(eh ehVar) {
        if (this.k != null) {
            int size = this.k.size();
            for (int i = 0; i < size; i++) {
                View view = this.k.get(i).f795a;
                ed edVar = (ed) view.getLayoutParams();
                if (!edVar.c.m() && this.d == edVar.c.c()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View b2 = ehVar.b(this.d);
        this.d += this.e;
        return b2;
    }

    public final void a(View view) {
        View view2;
        int i;
        View view3;
        int size = this.k.size();
        View view4 = null;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                view2 = view4;
                break;
            }
            view2 = this.k.get(i3).f795a;
            ed edVar = (ed) view2.getLayoutParams();
            if (view2 != view && !edVar.c.m() && (i = (edVar.c.c() - this.d) * this.e) >= 0 && i < i2) {
                if (i == 0) {
                    break;
                } else {
                    view3 = view2;
                }
            } else {
                i = i2;
                view3 = view4;
            }
            i3++;
            view4 = view3;
            i2 = i;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((ed) view2.getLayoutParams()).c.c();
        }
    }
}
