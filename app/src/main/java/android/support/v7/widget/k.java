package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class k extends android.support.v7.view.menu.d implements android.support.v4.view.o {
    private final SparseBooleanArray A;
    private View B;
    private m C;
    o i;
    Drawable j;
    boolean k;
    int l;
    boolean m;
    boolean n;
    q o;
    l p;
    n q;
    final r r;
    int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private int z;

    public k(Context context) {
        super(context, android.support.v7.b.i.abc_action_menu_layout, android.support.v7.b.i.abc_action_menu_item_layout);
        this.A = new SparseBooleanArray();
        this.r = new r(this, (byte) 0);
    }

    @Override // android.support.v7.view.menu.d, android.support.v7.view.menu.x
    public final void a(Context context, android.support.v7.view.menu.i iVar) {
        boolean z = true;
        super.a(context, iVar);
        Resources resources = context.getResources();
        android.support.v7.view.a a2 = android.support.v7.view.a.a(context);
        if (!this.u) {
            if (Build.VERSION.SDK_INT < 19 && android.support.v4.view.cq.b(ViewConfiguration.get(a2.f556a))) {
                z = false;
            }
            this.t = z;
        }
        if (!this.y) {
            this.v = a2.f556a.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.m) {
            this.l = a2.f556a.getResources().getInteger(android.support.v7.b.h.abc_max_action_buttons);
        }
        int i = this.v;
        if (this.t) {
            if (this.i == null) {
                this.i = new o(this, this.f584a);
                if (this.k) {
                    this.i.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.w = i;
        this.z = (int) (56.0f * resources.getDisplayMetrics().density);
        this.B = null;
    }

    public final void b() {
        this.t = true;
        this.u = true;
    }

    @Override // android.support.v7.view.menu.d
    public final android.support.v7.view.menu.z a(ViewGroup viewGroup) {
        android.support.v7.view.menu.z a2 = super.a(viewGroup);
        ((ActionMenuView) a2).setPresenter(this);
        return a2;
    }

    @Override // android.support.v7.view.menu.d
    public final View a(android.support.v7.view.menu.m mVar, View view, ViewGroup viewGroup) {
        View actionView = mVar.getActionView();
        if (actionView == null || mVar.i()) {
            actionView = super.a(mVar, view, viewGroup);
        }
        actionView.setVisibility(mVar.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.a(layoutParams));
        }
        return actionView;
    }

    @Override // android.support.v7.view.menu.d
    public final void a(android.support.v7.view.menu.m mVar, android.support.v7.view.menu.aa aaVar) {
        aaVar.a(mVar);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aaVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.g);
        if (this.C == null) {
            this.C = new m(this, (byte) 0);
        }
        actionMenuItemView.setPopupCallback(this.C);
    }

    @Override // android.support.v7.view.menu.d
    public final boolean a(android.support.v7.view.menu.m mVar) {
        return mVar.f();
    }

    @Override // android.support.v7.view.menu.d, android.support.v7.view.menu.x
    public final void b(boolean z) {
        boolean z2 = false;
        ((View) this.g).getParent();
        super.b(z);
        ((View) this.g).requestLayout();
        if (this.c != null) {
            android.support.v7.view.menu.i iVar = this.c;
            iVar.i();
            ArrayList<android.support.v7.view.menu.m> arrayList = iVar.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                android.support.v4.view.n nVar = arrayList.get(i).d;
                if (nVar != null) {
                    nVar.f397a = this;
                }
            }
        }
        ArrayList<android.support.v7.view.menu.m> j = this.c != null ? this.c.j() : null;
        if (this.t && j != null) {
            int size2 = j.size();
            if (size2 == 1) {
                z2 = !j.get(0).isActionViewExpanded();
            } else {
                z2 = size2 > 0;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new o(this, this.f584a);
            }
            ViewGroup viewGroup = (ViewGroup) this.i.getParent();
            if (viewGroup != this.g) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.i);
                }
                ((ActionMenuView) this.g).addView(this.i, ActionMenuView.a());
            }
        } else if (this.i != null && this.i.getParent() == this.g) {
            ((ViewGroup) this.g).removeView(this.i);
        }
        ((ActionMenuView) this.g).setOverflowReserved(this.t);
    }

    @Override // android.support.v7.view.menu.d
    public final boolean a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.i) {
            return false;
        }
        return super.a(viewGroup, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    @Override // android.support.v7.view.menu.d, android.support.v7.view.menu.x
    public final boolean a(android.support.v7.view.menu.ad adVar) {
        o oVar;
        if (!adVar.hasVisibleItems()) {
            return false;
        }
        android.support.v7.view.menu.ad adVar2 = adVar;
        while (adVar2.l != this.c) {
            adVar2 = (android.support.v7.view.menu.ad) adVar2.l;
        }
        MenuItem item = adVar2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.g;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof android.support.v7.view.menu.aa) && ((android.support.v7.view.menu.aa) childAt).getItemData() == item) {
                    
                    break;
                }
            }
        }
        oVar = null;
        if (oVar == null) {
            if (this.i == null) {
                return false;
            }
            oVar = this.i;
        }
        this.s = adVar.getItem().getItemId();
        this.p = new l(this, this.f585b, adVar);
        this.p.f603b = oVar;
        if (this.p.b()) {
            super.a(adVar);
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public final boolean c() {
        if (!this.t || g() || this.c == null || this.g == null || this.q != null || this.c.j().isEmpty()) {
            return false;
        }
        this.q = new n(this, new q(this, this.f585b, this.c, this.i));
        ((View) this.g).post(this.q);
        super.a((android.support.v7.view.menu.ad) null);
        return true;
    }

    public final boolean d() {
        if (this.q != null && this.g != null) {
            ((View) this.g).removeCallbacks(this.q);
            this.q = null;
            return true;
        }
        q qVar = this.o;
        if (qVar != null) {
            qVar.c();
            return true;
        }
        return false;
    }

    public final boolean e() {
        return d() | f();
    }

    public final boolean f() {
        if (this.p == null) {
            return false;
        }
        this.p.c();
        return true;
    }

    public final boolean g() {
        return this.o != null && this.o.d();
    }

    @Override // android.support.v7.view.menu.d, android.support.v7.view.menu.x
    public final boolean a() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        ArrayList<android.support.v7.view.menu.m> h = this.c.h();
        int size = h.size();
        int i9 = this.l;
        int i10 = this.w;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.g;
        int i11 = 0;
        int i12 = 0;
        boolean z3 = false;
        int i13 = 0;
        while (i13 < size) {
            android.support.v7.view.menu.m mVar = h.get(i13);
            if (mVar.h()) {
                i11++;
            } else if (mVar.g()) {
                i12++;
            } else {
                z3 = true;
            }
            i13++;
            i9 = (this.n && mVar.isActionViewExpanded()) ? 0 : i9;
        }
        if (this.t && (z3 || i11 + i12 > i9)) {
            i9--;
        }
        int i14 = i9 - i11;
        SparseBooleanArray sparseBooleanArray = this.A;
        sparseBooleanArray.clear();
        int i15 = 0;
        if (!this.x) {
            i = 0;
        } else {
            i15 = i10 / this.z;
            i = ((i10 % this.z) / i15) + this.z;
        }
        int i16 = 0;
        int i17 = 0;
        int i18 = i15;
        while (i16 < size) {
            android.support.v7.view.menu.m mVar2 = h.get(i16);
            if (mVar2.h()) {
                View a2 = a(mVar2, this.B, viewGroup);
                if (this.B == null) {
                    this.B = a2;
                }
                if (this.x) {
                    i18 -= ActionMenuView.a(a2, i, i18, makeMeasureSpec, 0);
                } else {
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                i2 = a2.getMeasuredWidth();
                int i19 = i10 - i2;
                if (i17 != 0) {
                    i2 = i17;
                }
                int groupId = mVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                mVar2.c(true);
                i3 = i19;
                i4 = i14;
            } else if (mVar2.g()) {
                int groupId2 = mVar2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i14 > 0 || z4) && i10 > 0 && (!this.x || i18 > 0);
                if (z5) {
                    View a3 = a(mVar2, this.B, viewGroup);
                    if (this.B == null) {
                        this.B = a3;
                    }
                    if (this.x) {
                        int a4 = ActionMenuView.a(a3, i, i18, makeMeasureSpec, 0);
                        int i20 = i18 - a4;
                        z2 = a4 == 0 ? false : z5;
                        i8 = i20;
                    } else {
                        a3.measure(makeMeasureSpec, makeMeasureSpec);
                        boolean z6 = z5;
                        i8 = i18;
                        z2 = z6;
                    }
                    int measuredWidth = a3.getMeasuredWidth();
                    i10 -= measuredWidth;
                    if (i17 == 0) {
                        i17 = measuredWidth;
                    }
                    if (this.x) {
                        z = z2 & (i10 >= 0);
                        i5 = i17;
                        i6 = i8;
                    } else {
                        z = z2 & (i10 + i17 > 0);
                        i5 = i17;
                        i6 = i8;
                    }
                } else {
                    z = z5;
                    i5 = i17;
                    i6 = i18;
                }
                if (z && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                    i7 = i14;
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    int i21 = i14;
                    for (int i22 = 0; i22 < i16; i22++) {
                        android.support.v7.view.menu.m mVar3 = h.get(i22);
                        if (mVar3.getGroupId() == groupId2) {
                            if (mVar3.f()) {
                                i21++;
                            }
                            mVar3.c(false);
                        }
                    }
                    i7 = i21;
                } else {
                    i7 = i14;
                }
                if (z) {
                    i7--;
                }
                mVar2.c(z);
                i2 = i5;
                i3 = i10;
                int i23 = i6;
                i4 = i7;
                i18 = i23;
            } else {
                mVar2.c(false);
                i2 = i17;
                i3 = i10;
                i4 = i14;
            }
            i16++;
            i10 = i3;
            i14 = i4;
            i17 = i2;
        }
        return true;
    }

    @Override // android.support.v7.view.menu.d, android.support.v7.view.menu.x
    public final void a(android.support.v7.view.menu.i iVar, boolean z) {
        e();
        super.a(iVar, z);
    }

    @Override // android.support.v4.view.o
    public final void a(boolean z) {
        if (z) {
            super.a((android.support.v7.view.menu.ad) null);
        } else {
            this.c.a(false);
        }
    }

    public final void a(ActionMenuView actionMenuView) {
        this.g = actionMenuView;
        actionMenuView.f610a = this.c;
    }
}
