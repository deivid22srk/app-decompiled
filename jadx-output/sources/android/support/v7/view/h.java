package android.support.v7.view;

import android.content.Context;
import android.support.v4.h.r;
import android.support.v7.view.menu.ab;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    final ActionMode.Callback f563a;

    /* renamed from: b, reason: collision with root package name */
    final Context f564b;
    final ArrayList<g> c = new ArrayList<>();
    final r<Menu, Menu> d = new r<>();

    public h(Context context, ActionMode.Callback callback) {
        this.f564b = context;
        this.f563a = callback;
    }

    @Override // android.support.v7.view.c
    public final boolean a(b bVar, Menu menu) {
        return this.f563a.onCreateActionMode(b(bVar), a(menu));
    }

    @Override // android.support.v7.view.c
    public final boolean b(b bVar, Menu menu) {
        return this.f563a.onPrepareActionMode(b(bVar), a(menu));
    }

    @Override // android.support.v7.view.c
    public final boolean a(b bVar, MenuItem menuItem) {
        return this.f563a.onActionItemClicked(b(bVar), ab.a(this.f564b, (android.support.v4.e.a.b) menuItem));
    }

    @Override // android.support.v7.view.c
    public final void a(b bVar) {
        this.f563a.onDestroyActionMode(b(bVar));
    }

    private Menu a(Menu menu) {
        Menu menu2 = this.d.get(menu);
        if (menu2 == null) {
            Menu a2 = ab.a(this.f564b, (android.support.v4.e.a.a) menu);
            this.d.put(menu, a2);
            return a2;
        }
        return menu2;
    }

    public final ActionMode b(b bVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            g gVar = this.c.get(i);
            if (gVar != null && gVar.f562b == bVar) {
                return gVar;
            }
        }
        g gVar2 = new g(this.f564b, bVar);
        this.c.add(gVar2);
        return gVar2;
    }
}
