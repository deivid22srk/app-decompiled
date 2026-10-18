package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.ay;
import android.support.v7.widget.ao;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class m implements android.support.v4.e.a.b {
    static String f;
    static String g;
    static String h;
    static String i;

    /* renamed from: a, reason: collision with root package name */
    final int f596a;

    /* renamed from: b, reason: collision with root package name */
    i f597b;
    int c;
    public android.support.v4.view.n d;
    ContextMenu.ContextMenuInfo e;
    private final int j;
    private final int k;
    private final int l;
    private CharSequence m;
    private CharSequence n;
    private Intent o;
    private char p;
    private char q;
    private Drawable r;
    private ad t;
    private Runnable u;
    private MenuItem.OnMenuItemClickListener v;
    private View x;
    private ay y;
    private int s = 0;
    private int w = 16;
    private boolean z = false;

    m(i iVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.c = 0;
        this.f597b = iVar;
        this.j = i3;
        this.k = i2;
        this.l = i4;
        this.f596a = i5;
        this.m = charSequence;
        this.c = i6;
    }

    public final boolean b() {
        if ((this.v != null && this.v.onMenuItemClick(this)) || this.f597b.a(this.f597b.k(), this)) {
            return true;
        }
        if (this.u != null) {
            this.u.run();
            return true;
        }
        if (this.o != null) {
            try {
                this.f597b.f592a.startActivity(this.o);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.d != null && this.d.d();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.w & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.w |= 16;
        } else {
            this.w &= -17;
        }
        this.f597b.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.k;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.o = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.q != c) {
            this.q = Character.toLowerCase(c);
            this.f597b.b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.p;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.p != c) {
            this.p = c;
            this.f597b.b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.p = c;
        this.q = Character.toLowerCase(c2);
        this.f597b.b(false);
        return this;
    }

    final char c() {
        return this.f597b.b() ? this.q : this.p;
    }

    final boolean d() {
        return this.f597b.c() && c() != 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.t != null;
    }

    public final void a(ad adVar) {
        this.t = adVar;
        adVar.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.m;
    }

    final CharSequence a(aa aaVar) {
        return (aaVar == null || !aaVar.a()) ? getTitle() : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.m = charSequence;
        this.f597b.b(false);
        if (this.t != null) {
            this.t.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        return setTitle(this.f597b.f592a.getString(i2));
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.n != null ? this.n : this.m;
        if (Build.VERSION.SDK_INT < 18 && charSequence != null && !(charSequence instanceof String)) {
            return charSequence.toString();
        }
        return charSequence;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.n = charSequence;
        this.f597b.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        if (this.r != null) {
            return this.r;
        }
        if (this.s == 0) {
            return null;
        }
        Drawable a2 = ao.a().a(this.f597b.f592a, this.s, false);
        this.s = 0;
        this.r = a2;
        return a2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.s = 0;
        this.r = drawable;
        this.f597b.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.r = null;
        this.s = i2;
        this.f597b.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.w & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i2 = this.w;
        this.w = (z ? 1 : 0) | (this.w & (-2));
        if (i2 != this.w) {
            this.f597b.b(false);
        }
        return this;
    }

    public final void a(boolean z) {
        this.w = (z ? 4 : 0) | (this.w & (-5));
    }

    public final boolean e() {
        return (this.w & 4) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.w & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.w & 4) != 0) {
            i iVar = this.f597b;
            int groupId = getGroupId();
            int size = iVar.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                m mVar = iVar.c.get(i2);
                if (mVar.getGroupId() == groupId && mVar.e() && mVar.isCheckable()) {
                    mVar.e(mVar == this);
                }
            }
        } else {
            e(z);
        }
        return this;
    }

    private void e(boolean z) {
        int i2 = this.w;
        this.w = (z ? 2 : 0) | (this.w & (-3));
        if (i2 != this.w) {
            this.f597b.b(false);
        }
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.d == null || !this.d.b()) ? (this.w & 8) == 0 : (this.w & 8) == 0 && this.d.c();
    }

    final boolean b(boolean z) {
        int i2 = this.w;
        this.w = (z ? 0 : 8) | (this.w & (-9));
        return i2 != this.w;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (b(z)) {
            this.f597b.f();
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.v = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        if (this.m != null) {
            return this.m.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.e;
    }

    public final boolean f() {
        return (this.w & 32) == 32;
    }

    public final boolean g() {
        return (this.c & 1) == 1;
    }

    public final boolean h() {
        return (this.c & 2) == 2;
    }

    public final void c(boolean z) {
        if (z) {
            this.w |= 32;
        } else {
            this.w &= -33;
        }
    }

    @Override // android.support.v4.e.a.b, android.view.MenuItem
    public final void setShowAsAction(int i2) {
        switch (i2 & 3) {
            case 0:
            case 1:
            case 2:
                this.c = i2;
                this.f597b.g();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.v4.e.a.b, android.view.MenuItem
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public android.support.v4.e.a.b setActionView(View view) {
        this.x = view;
        this.d = null;
        if (view != null && view.getId() == -1 && this.j > 0) {
            view.setId(this.j);
        }
        this.f597b.g();
        return this;
    }

    @Override // android.support.v4.e.a.b, android.view.MenuItem
    public final View getActionView() {
        if (this.x != null) {
            return this.x;
        }
        if (this.d != null) {
            this.x = this.d.a(this);
            return this.x;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.support.v4.e.a.b
    public final android.support.v4.view.n a() {
        return this.d;
    }

    @Override // android.support.v4.e.a.b
    public final android.support.v4.e.a.b a(android.support.v4.view.n nVar) {
        if (this.d != null) {
            android.support.v4.view.n nVar2 = this.d;
            nVar2.f398b = null;
            nVar2.f397a = null;
        }
        this.x = null;
        this.d = nVar;
        this.f597b.b(true);
        if (this.d != null) {
            this.d.a(new n(this));
        }
        return this;
    }

    @Override // android.support.v4.e.a.b, android.view.MenuItem
    public final boolean expandActionView() {
        if (!i()) {
            return false;
        }
        if (this.y == null || this.y.a(this)) {
            return this.f597b.a(this);
        }
        return false;
    }

    @Override // android.support.v4.e.a.b, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.c & 8) == 0) {
            return false;
        }
        if (this.x == null) {
            return true;
        }
        if (this.y == null || this.y.b(this)) {
            return this.f597b.b(this);
        }
        return false;
    }

    @Override // android.support.v4.e.a.b
    public final android.support.v4.e.a.b a(ay ayVar) {
        this.y = ayVar;
        return this;
    }

    public final boolean i() {
        if ((this.c & 8) == 0) {
            return false;
        }
        if (this.x == null && this.d != null) {
            this.x = this.d.a(this);
        }
        return this.x != null;
    }

    public final void d(boolean z) {
        this.z = z;
        this.f597b.b(false);
    }

    @Override // android.support.v4.e.a.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.z;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }

    @Override // android.support.v4.e.a.b, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i2) {
        Context context = this.f597b.f592a;
        setActionView(LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // android.support.v4.e.a.b, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }
}
