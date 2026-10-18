package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.dt;
import android.support.v7.widget.eq;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.layout.CategoryRowV2;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.PlayQuickLinksBannerView;
import com.google.android.finsky.layout.play.cx;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.ik;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class s extends dt {
    private u A;
    final com.google.android.finsky.navigationmanager.b c;
    final int d;
    final DfeToc e;
    final com.google.android.play.image.e f;
    final com.google.android.finsky.protos.ba[] g;
    final Context h;
    public final int i;
    public final int j;
    public Bundle k;
    public HashSet<eq> l;
    private final LayoutInflater m;
    private final com.google.android.finsky.protos.ax[] n;
    private final String o;
    private final String p;
    private final int q;
    private final cy r;
    private final boolean s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private v z;

    public s(Context context, com.google.android.finsky.protos.ax[] axVarArr, com.google.android.finsky.navigationmanager.b bVar, int i, DfeToc dfeToc, com.google.android.play.image.e eVar, com.google.android.finsky.protos.ba[] baVarArr, String str, String str2, int i2, cy cyVar) {
        byte b2 = 0;
        this.m = LayoutInflater.from(context);
        this.n = axVarArr;
        this.c = bVar;
        this.d = i;
        this.e = dfeToc;
        this.f = eVar;
        this.o = str;
        this.p = str2;
        this.h = context;
        this.q = com.google.android.finsky.utils.ai.a(context, i);
        Resources resources = this.h.getResources();
        this.s = resources.getBoolean(R.bool.display_categories_in_two_columns);
        this.g = baVarArr;
        this.t = (this.g != null ? this.g.length : 0) <= 1 ? 0 : 1;
        this.i = (this.t * 2) + 5;
        this.u = FinskyHeaderListLayout.a(context, i2);
        this.v = resources.getDimensionPixelSize(R.dimen.card_list_vpadding);
        this.x = resources.getDimensionPixelSize(R.dimen.category_list_vertical_margin);
        this.y = resources.getDimensionPixelSize(R.dimen.category_list_horizontal_margin);
        this.w = this.x * 2;
        this.r = cyVar;
        if (resources.getBoolean(R.bool.use_wide_layout)) {
            this.j = (resources.getDisplayMetrics().widthPixels - ik.b(resources)) / 2;
        } else {
            this.j = this.y;
        }
        this.z = new v(this);
        this.A = new u(this, b2);
        this.l = new HashSet<>();
    }

    @Override // android.support.v7.widget.dt
    public final int a() {
        return (c() ? 1 : 0) + this.n.length + this.i + 2;
    }

    @Override // android.support.v7.widget.dt
    public final int a(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return 1;
        }
        int i3 = i2 - 1;
        if (this.t > 0) {
            if (i3 == 0) {
                return 2;
            }
            int i4 = i3 - 1;
            if (i4 == 0) {
                return 3;
            }
            i3 = i4 - this.t;
        }
        if (i3 == 0) {
            return 4;
        }
        int i5 = i3 - 1;
        if (i5 == 0) {
            return 5;
        }
        int i6 = i5 - 1;
        if (i6 == 0) {
            return 8;
        }
        int i7 = i6 - 1;
        if (i7 >= 0 && i7 < this.n.length) {
            return 6;
        }
        int length = i7 - this.n.length;
        if (c()) {
            if (length == 0) {
                return 7;
            }
            length--;
        }
        return length != 0 ? 9 : 8;
    }

    @Override // android.support.v7.widget.dt
    public final eq a(ViewGroup viewGroup, int i) {
        View view = null;
        switch (i) {
            case 0:
                view = a(R.layout.play_list_vspacer, viewGroup);
                view.getLayoutParams().height = this.u;
                view.setId(R.id.play_header_spacer);
                break;
            case 1:
                view = a(R.layout.play_list_vspacer, viewGroup);
                view.getLayoutParams().height = this.v;
                break;
            case 2:
            case 4:
                view = a(R.layout.category_subheader, viewGroup);
                break;
            case 3:
                view = a(R.layout.play_quicklinks_banner, viewGroup);
                break;
            case 5:
                view = a(R.layout.play_list_vspacer, viewGroup);
                view.getLayoutParams().height = this.x;
                break;
            case 6:
                view = a(R.layout.category_item_v2, viewGroup);
                break;
            case 7:
                view = a(R.layout.category_spacer, viewGroup);
                view.getLayoutParams().height = this.h.getResources().getDimensionPixelSize(R.dimen.category_row_height_v2);
                break;
            case 8:
                view = a(R.layout.category_spacer, viewGroup);
                break;
            case 9:
                view = a(R.layout.play_list_vspacer, viewGroup);
                view.getLayoutParams().height = this.w;
                break;
        }
        return new cx(view);
    }

    private View a(int i, ViewGroup viewGroup) {
        return this.m.inflate(i, viewGroup, false);
    }

    @Override // android.support.v7.widget.dt
    public final void a(eq eqVar, int i) {
        this.l.add(eqVar);
        int i2 = eqVar.e;
        View view = eqVar.f795a;
        switch (i2) {
            case 2:
                ((TextView) view).setText(this.o);
                break;
            case 3:
                PlayQuickLinksBannerView playQuickLinksBannerView = (PlayQuickLinksBannerView) view;
                playQuickLinksBannerView.b(this.j);
                cy cyVar = this.r;
                if (playQuickLinksBannerView.q == null) {
                    playQuickLinksBannerView.q = com.google.android.finsky.a.i.a(429);
                    com.google.android.finsky.a.i.a(playQuickLinksBannerView.q, (byte[]) null);
                }
                playQuickLinksBannerView.y = cyVar;
                this.A.f1939a = playQuickLinksBannerView;
                playQuickLinksBannerView.a(this.A, this.z, ik.c(this.h.getResources()), true, null, this.k, null);
                break;
            case 4:
                ((TextView) view).setText(this.p);
                break;
            case 6:
                CategoryRowV2 categoryRowV2 = (CategoryRowV2) view;
                com.google.android.finsky.protos.ax axVar = this.n[i - this.i];
                com.google.android.play.image.a b2 = com.google.android.play.image.a.b(this.h.getResources(), axVar.c != null ? ik.a(axVar.c, this.q) : this.q);
                cy cyVar2 = this.r;
                categoryRowV2.f2936a.setText(axVar.f3613a);
                if (axVar.c != null && axVar.c.g) {
                    String str = axVar.c.f;
                    com.google.android.play.image.e eVar = FinskyApp.a().d;
                    categoryRowV2.f2937b.setBitmapTransformation(b2);
                    categoryRowV2.f2937b.a(str, true, eVar);
                }
                categoryRowV2.d = cyVar2;
                com.google.android.finsky.a.i.a(categoryRowV2.c, axVar.f);
                categoryRowV2.d.a(categoryRowV2);
                categoryRowV2.setOnClickListener(new t(this, axVar, categoryRowV2));
                break;
        }
    }

    @Override // android.support.v7.widget.dt
    public final void a(eq eqVar) {
        this.l.remove(eqVar);
        int i = eqVar.e;
        KeyEvent.Callback callback = eqVar.f795a;
        if (i == 3) {
            PlayQuickLinksBannerView playQuickLinksBannerView = (PlayQuickLinksBannerView) callback;
            if (this.k == null) {
                this.k = new Bundle();
            } else {
                this.k.clear();
            }
            playQuickLinksBannerView.a(this.k);
        }
        if (callback instanceof ap) {
            ((ap) callback).ab_();
        }
    }

    private boolean c() {
        return this.s && this.n.length % 2 == 1;
    }

    public final boolean f(int i) {
        if (!this.s) {
            return false;
        }
        int a2 = a(i);
        return a2 == 6 || a2 == 7;
    }
}
