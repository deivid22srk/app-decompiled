package com.google.android.play.search;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ay;
import android.support.v4.view.by;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.gc;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class PlaySearchToolbar extends Toolbar implements ay {
    private ah A;
    private int B;
    private int C;
    private int D;
    private int E;
    private final Map<View, Integer> o;
    public PlaySearch p;
    public boolean q;
    public View r;
    public MenuItem s;
    public int t;
    private PlaySearch u;
    private Drawable v;
    private android.support.v4.view.n w;
    private n x;
    private int y;
    private gc z;

    public static int a(Context context) {
        return context.getResources().getDimensionPixelSize(com.google.android.play.i.play_search_toolbar_height);
    }

    public PlaySearchToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new HashMap();
        Resources resources = getContext().getResources();
        this.y = resources.getDimensionPixelSize(com.google.android.play.i.play_card_default_inset) + resources.getDimensionPixelSize(com.google.android.play.i.play_search_toolbar_padding_top);
    }

    public final void a(ag agVar) {
        int c = agVar.c();
        this.p = (PlaySearch) LayoutInflater.from(getContext()).inflate(agVar.b(), (ViewGroup) this, false);
        this.z = new gc((byte) 0);
        this.p.a(c, this.y, c, 0, true);
        this.p.a(agVar.a());
        this.p.setSteadyStateMode(1);
        this.p.c.b();
        this.p.setListener(new ab(this));
        this.v = getBackground();
        this.u = agVar.a(this);
        this.u.a(agVar.a());
        this.u.setSteadyStateMode(2);
        this.u.c.b();
        this.u.setListener(new ac(this));
    }

    public void setIdleModeDrawerIconState(int i) {
        this.p.setIdleModeDrawerIconState(i);
    }

    public boolean g() {
        return false;
    }

    public void a(boolean z, int i) {
        if (z != this.q || i != this.p.getSteadyStateMode()) {
            if (z) {
                if (c()) {
                    d();
                }
                this.p.setSteadyStateMode(i);
                this.p.c.b();
                if (this.p.getParent() == null) {
                    addView(this.p, this.z);
                }
            } else if (this.p.getParent() == this) {
                this.p.c.b();
                removeView(this.p);
            }
            if (this.q != z) {
                this.q = z;
                super.setBackgroundDrawable(this.q ? null : this.v);
            }
            j();
        }
    }

    public void setPlaySearchListener(n nVar) {
        this.x = nVar;
    }

    public void setPlaySearchToolbarActionListener(ah ahVar) {
        this.A = ahVar;
    }

    public void setQuery(String str) {
        this.p.setQuery(str);
    }

    public void setSuggestions(List<? extends v> list) {
        (c() ? this.u : this.p).setSuggestions(list);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        this.v = drawable;
        if (this.q) {
            drawable = null;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.support.v7.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        this.p.setOnNavButtonClickListener(new ae(this, onClickListener));
    }

    public final boolean k() {
        return this.q || c();
    }

    public PlaySearch getSearchView() {
        return this.p;
    }

    public PlaySearch getActionView() {
        return this.u;
    }

    public void h() {
        if (this.A != null) {
            this.A.c();
        }
    }

    public void i() {
        if (this.A != null) {
            this.A.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("play_search_toolbar.parent_instance_state", super.onSaveInstanceState());
        bundle.putInt("play_search_toolbar.expanded_menu_item_id", this.t);
        bundle.putParcelable("play_search_toolbar.search_view_state", this.p.onSaveInstanceState());
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.t = bundle.getInt("play_search_toolbar.expanded_menu_item_id");
            this.p.onRestoreInstanceState(bundle.getParcelable("play_search_toolbar.search_view_state"));
            super.onRestoreInstanceState(bundle.getParcelable("play_search_toolbar.parent_instance_state"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public android.support.v4.view.n getActionProvider() {
        if (this.w == null) {
            this.w = new af(this, getContext());
        }
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        a(k());
    }

    private void a(boolean z) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int a2 = z ? -2 : a(getContext());
            int a3 = z ? 0 : a(getContext());
            if (layoutParams.height != a2 || by.s(this) != a3) {
                layoutParams.height = a2;
                setMinimumHeight(a3);
            }
            if (z) {
                int n = by.n(this);
                int o = by.o(this);
                if (n != 0) {
                    this.B = n;
                }
                if (o != 0) {
                    this.C = o;
                }
                if (getPaddingTop() != 0) {
                    this.D = getPaddingTop();
                }
                if (getPaddingBottom() != 0) {
                    this.E = getPaddingBottom();
                }
                setPadding(0, 0, 0, 0);
                return;
            }
            by.a(this, this.B, this.D, this.C, this.E);
        }
    }

    @Override // android.support.v4.view.ay
    public final boolean a(MenuItem menuItem) {
        View findViewById;
        if (Build.VERSION.SDK_INT >= 21 && (findViewById = findViewById(menuItem.getItemId())) != null) {
            Rect rect = new Rect();
            findViewById.getGlobalVisibleRect(rect);
            this.u.setRevealCenter(new Point(rect.centerX(), rect.centerY()));
        }
        this.t = menuItem.getItemId();
        a(true);
        h();
        return true;
    }

    @Override // android.support.v4.view.ay
    public final boolean b(MenuItem menuItem) {
        this.t = -1;
        return true;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        if (k()) {
            if (c()) {
                gc gcVar = (gc) this.u.getLayoutParams();
                if (gcVar.width != -1) {
                    gcVar.width = -1;
                    this.u.setLayoutParams(gcVar);
                }
            }
            PlaySearch playSearch = c() ? this.u : this.p;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt != playSearch && childAt.getVisibility() != 8) {
                    this.o.put(childAt, Integer.valueOf(childAt.getVisibility()));
                    childAt.setVisibility(8);
                }
            }
        } else if (this.o.size() != 0) {
            for (Map.Entry<View, Integer> entry : this.o.entrySet()) {
                if (entry.getKey() != null) {
                    entry.getKey().setVisibility(entry.getValue().intValue());
                }
            }
            this.o.clear();
        }
        this.p.setVisibility(this.q ? 0 : 8);
        super.onMeasure(i, i2);
    }
}
