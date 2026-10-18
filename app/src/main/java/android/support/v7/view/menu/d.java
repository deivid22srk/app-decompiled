package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.view.by;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class d implements x {

    /* renamed from: a, reason: collision with root package name */
    public Context f584a;

    /* renamed from: b, reason: collision with root package name */
    public Context f585b;
    public i c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    public y f;
    public z g;
    public int h;
    private int i;
    private int j;

    public abstract void a(m mVar, aa aaVar);

    public d(Context context, int i, int i2) {
        this.f584a = context;
        this.d = LayoutInflater.from(context);
        this.i = i;
        this.j = i2;
    }

    @Override // android.support.v7.view.menu.x
    public void a(Context context, i iVar) {
        this.f585b = context;
        this.e = LayoutInflater.from(this.f585b);
        this.c = iVar;
    }

    public z a(ViewGroup viewGroup) {
        if (this.g == null) {
            this.g = (z) this.d.inflate(this.i, viewGroup, false);
            this.g.a(this.c);
            b(true);
        }
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.view.menu.x
    public void b(boolean z) {
        int i;
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.g;
        if (viewGroup != null) {
            if (this.c != null) {
                this.c.i();
                ArrayList<m> h = this.c.h();
                int size = h.size();
                int i3 = 0;
                i = 0;
                while (i3 < size) {
                    m mVar = h.get(i3);
                    if (a(mVar)) {
                        View childAt = viewGroup.getChildAt(i);
                        m itemData = childAt instanceof aa ? ((aa) childAt).getItemData() : null;
                        View a2 = a(mVar, childAt, viewGroup);
                        if (mVar != itemData) {
                            a2.setPressed(false);
                            by.z(a2);
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.g).addView(a2, i);
                        }
                        i2 = i + 1;
                    } else {
                        i2 = i;
                    }
                    i3++;
                    i = i2;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    public boolean a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View a(m mVar, View view, ViewGroup viewGroup) {
        aa aaVar;
        if (view instanceof aa) {
            aaVar = (aa) view;
        } else {
            aaVar = (aa) this.d.inflate(this.j, viewGroup, false);
        }
        a(mVar, aaVar);
        return (View) aaVar;
    }

    public boolean a(m mVar) {
        return true;
    }

    @Override // android.support.v7.view.menu.x
    public void a(i iVar, boolean z) {
        if (this.f != null) {
            this.f.a(iVar, z);
        }
    }

    @Override // android.support.v7.view.menu.x
    public boolean a(ad adVar) {
        if (this.f != null) {
            return this.f.a(adVar);
        }
        return false;
    }

    @Override // android.support.v7.view.menu.x
    public boolean a() {
        return false;
    }

    @Override // android.support.v7.view.menu.x
    public final boolean b(m mVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.x
    public final boolean c(m mVar) {
        return false;
    }
}
