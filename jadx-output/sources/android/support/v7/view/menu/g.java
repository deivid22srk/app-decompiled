package android.support.v7.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
public final class g implements x, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    Context f588a;

    /* renamed from: b, reason: collision with root package name */
    LayoutInflater f589b;
    i c;
    ExpandedMenuView d;
    int e;
    int f;
    public y g;
    h h;
    private int i;

    public g(Context context, int i) {
        this(i);
        this.f588a = context;
        this.f589b = LayoutInflater.from(this.f588a);
    }

    private g(int i) {
        this.f = i;
        this.e = 0;
    }

    @Override // android.support.v7.view.menu.x
    public final void a(Context context, i iVar) {
        if (this.e != 0) {
            this.f588a = new ContextThemeWrapper(context, this.e);
            this.f589b = LayoutInflater.from(this.f588a);
        } else if (this.f588a != null) {
            this.f588a = context;
            if (this.f589b == null) {
                this.f589b = LayoutInflater.from(this.f588a);
            }
        }
        this.c = iVar;
        if (this.h != null) {
            this.h.notifyDataSetChanged();
        }
    }

    public final z a(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.f589b.inflate(android.support.v7.b.i.abc_expanded_menu_layout, viewGroup, false);
            if (this.h == null) {
                this.h = new h(this);
            }
            this.d.setAdapter((ListAdapter) this.h);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    public final ListAdapter b() {
        if (this.h == null) {
            this.h = new h(this);
        }
        return this.h;
    }

    @Override // android.support.v7.view.menu.x
    public final void b(boolean z) {
        if (this.h != null) {
            this.h.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.x
    public final boolean a(ad adVar) {
        if (!adVar.hasVisibleItems()) {
            return false;
        }
        l lVar = new l(adVar);
        i iVar = lVar.f594a;
        android.support.v7.a.ad adVar2 = new android.support.v7.a.ad(iVar.f592a);
        lVar.c = new g(adVar2.f473a.f543a, android.support.v7.b.i.abc_list_menu_item_layout);
        lVar.c.g = lVar;
        lVar.f594a.a(lVar.c);
        adVar2.f473a.t = lVar.c.b();
        adVar2.f473a.u = lVar;
        View view = iVar.h;
        if (view != null) {
            adVar2.f473a.g = view;
        } else {
            adVar2.f473a.d = iVar.g;
            adVar2.a(iVar.f);
        }
        adVar2.a(lVar);
        lVar.f595b = adVar2.a();
        lVar.f595b.setOnDismissListener(lVar);
        WindowManager.LayoutParams attributes = lVar.f595b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        lVar.f595b.show();
        if (this.g != null) {
            this.g.a(adVar);
        }
        return true;
    }

    @Override // android.support.v7.view.menu.x
    public final void a(i iVar, boolean z) {
        if (this.g != null) {
            this.g.a(iVar, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c.a(this.h.a(i), this, 0);
    }

    @Override // android.support.v7.view.menu.x
    public final boolean a() {
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
