package android.support.v7.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;

/* loaded from: classes.dex */
final class gb implements android.support.v7.view.menu.x {

    /* renamed from: a, reason: collision with root package name */
    android.support.v7.view.menu.i f842a;

    /* renamed from: b, reason: collision with root package name */
    android.support.v7.view.menu.m f843b;
    final /* synthetic */ Toolbar c;

    private gb(Toolbar toolbar) {
        this.c = toolbar;
    }

    /* synthetic */ gb(Toolbar toolbar, byte b2) {
        this(toolbar);
    }

    @Override // android.support.v7.view.menu.x
    public final void a(Context context, android.support.v7.view.menu.i iVar) {
        if (this.f842a != null && this.f843b != null) {
            this.f842a.b(this.f843b);
        }
        this.f842a = iVar;
    }

    @Override // android.support.v7.view.menu.x
    public final void b(boolean z) {
        boolean z2 = false;
        if (this.f843b != null) {
            if (this.f842a != null) {
                int size = this.f842a.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (this.f842a.getItem(i) != this.f843b) {
                        i++;
                    } else {
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                c(this.f843b);
            }
        }
    }

    @Override // android.support.v7.view.menu.x
    public final boolean a(android.support.v7.view.menu.ad adVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.x
    public final void a(android.support.v7.view.menu.i iVar, boolean z) {
    }

    @Override // android.support.v7.view.menu.x
    public final boolean a() {
        return false;
    }

    @Override // android.support.v7.view.menu.x
    public final boolean b(android.support.v7.view.menu.m mVar) {
        ImageButton imageButton;
        int i;
        ImageButton imageButton2;
        Toolbar.b(this.c);
        imageButton = this.c.s;
        if (imageButton.getParent() != this.c) {
            Toolbar toolbar = this.c;
            imageButton2 = this.c.s;
            toolbar.addView(imageButton2);
        }
        this.c.d = mVar.getActionView();
        this.f843b = mVar;
        if (this.c.d.getParent() != this.c) {
            gc f = Toolbar.f();
            i = this.c.t;
            f.f491a = 8388611 | (i & 112);
            f.f844b = 2;
            this.c.d.setLayoutParams(f);
            this.c.addView(this.c.d);
        }
        Toolbar toolbar2 = this.c;
        for (int childCount = toolbar2.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar2.getChildAt(childCount);
            if (((gc) childAt.getLayoutParams()).f844b != 2 && childAt != toolbar2.f634a) {
                toolbar2.removeViewAt(childCount);
                toolbar2.j.add(childAt);
            }
        }
        this.c.requestLayout();
        mVar.d(true);
        if (this.c.d instanceof android.support.v7.view.d) {
            ((android.support.v7.view.d) this.c.d).onActionViewExpanded();
        }
        return true;
    }

    @Override // android.support.v7.view.menu.x
    public final boolean c(android.support.v7.view.menu.m mVar) {
        ImageButton imageButton;
        if (this.c.d instanceof android.support.v7.view.d) {
            ((android.support.v7.view.d) this.c.d).onActionViewCollapsed();
        }
        this.c.removeView(this.c.d);
        Toolbar toolbar = this.c;
        imageButton = this.c.s;
        toolbar.removeView(imageButton);
        this.c.d = null;
        Toolbar toolbar2 = this.c;
        for (int size = toolbar2.j.size() - 1; size >= 0; size--) {
            toolbar2.addView(toolbar2.j.get(size));
        }
        toolbar2.j.clear();
        this.f843b = null;
        this.c.requestLayout();
        mVar.d(false);
        return true;
    }
}
