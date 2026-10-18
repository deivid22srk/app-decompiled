package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.cu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class v implements x, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    static final int f602a = android.support.v7.b.i.abc_popup_menu_item_layout;

    /* renamed from: b, reason: collision with root package name */
    public View f603b;
    public cu c;
    public y d;
    public boolean e;
    public int f;
    private final Context g;
    private final LayoutInflater h;
    private final i i;
    private final w j;
    private final boolean k;
    private final int l;
    private final int m;
    private final int n;
    private ViewTreeObserver o;
    private ViewGroup p;
    private boolean q;
    private int r;

    private v(Context context, i iVar, View view) {
        this(context, iVar, view, false, android.support.v7.b.b.popupMenuStyle);
    }

    public v(Context context, i iVar, View view, boolean z, int i) {
        this(context, iVar, view, z, i, (byte) 0);
    }

    private v(Context context, i iVar, View view, boolean z, int i, byte b2) {
        this.f = 0;
        this.g = context;
        this.h = LayoutInflater.from(context);
        this.i = iVar;
        this.j = new w(this, this.i);
        this.k = z;
        this.m = i;
        this.n = 0;
        Resources resources = context.getResources();
        this.l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(android.support.v7.b.e.abc_config_prefDialogWidth));
        this.f603b = view;
        iVar.a(this, context);
    }

    public final boolean b() {
        View view;
        int i = 0;
        this.c = new cu(this.g, null, this.m, this.n);
        this.c.a(this);
        this.c.m = this;
        this.c.a(this.j);
        this.c.c();
        View view2 = this.f603b;
        if (view2 == null) {
            return false;
        }
        boolean z = this.o == null;
        this.o = view2.getViewTreeObserver();
        if (z) {
            this.o.addOnGlobalLayoutListener(this);
        }
        this.c.l = view2;
        this.c.i = this.f;
        if (!this.q) {
            w wVar = this.j;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = wVar.getCount();
            int i2 = 0;
            int i3 = 0;
            View view3 = null;
            while (true) {
                if (i2 >= count) {
                    break;
                }
                int itemViewType = wVar.getItemViewType(i2);
                if (itemViewType != i3) {
                    i3 = itemViewType;
                    view = null;
                } else {
                    view = view3;
                }
                if (this.p == null) {
                    this.p = new FrameLayout(this.g);
                }
                view3 = wVar.getView(i2, view, this.p);
                view3.measure(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view3.getMeasuredWidth();
                if (measuredWidth >= this.l) {
                    i = this.l;
                    break;
                }
                if (measuredWidth <= i) {
                    measuredWidth = i;
                }
                i2++;
                i = measuredWidth;
            }
            this.r = i;
            this.q = true;
        }
        this.c.a(this.r);
        this.c.e();
        this.c.b();
        this.c.d.setOnKeyListener(this);
        return true;
    }

    public final void c() {
        if (d()) {
            this.c.d();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.c = null;
        this.i.close();
        if (this.o != null) {
            if (!this.o.isAlive()) {
                this.o = this.f603b.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener(this);
            this.o = null;
        }
    }

    public final boolean d() {
        return this.c != null && this.c.c.isShowing();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        w wVar = this.j;
        wVar.f605b.a(wVar.getItem(i), (x) null, 0);
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        c();
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (d()) {
            View view = this.f603b;
            if (view == null || !view.isShown()) {
                c();
            } else if (d()) {
                this.c.b();
            }
        }
    }

    @Override // android.support.v7.view.menu.x
    public final void a(Context context, i iVar) {
    }

    @Override // android.support.v7.view.menu.x
    public final void b(boolean z) {
        this.q = false;
        if (this.j != null) {
            this.j.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.x
    public final boolean a(ad adVar) {
        boolean z;
        if (adVar.hasVisibleItems()) {
            v vVar = new v(this.g, adVar, this.f603b);
            vVar.d = this.d;
            int size = adVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = adVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            vVar.e = z;
            if (vVar.b()) {
                if (this.d == null) {
                    return true;
                }
                this.d.a(adVar);
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.view.menu.x
    public final void a(i iVar, boolean z) {
        if (iVar == this.i) {
            c();
            if (this.d != null) {
                this.d.a(iVar, z);
            }
        }
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
