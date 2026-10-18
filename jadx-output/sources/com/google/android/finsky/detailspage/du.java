package com.google.android.finsky.detailspage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.lh;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.js;
import com.google.android.finsky.utils.jx;

/* loaded from: classes.dex */
public class du extends bd<dx> implements dy, com.google.android.finsky.layout.play.cy, jx {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.finsky.a.ai f2627a = com.google.android.finsky.a.i.a(1820);

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.secondary_actions_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2559b != 0 && (((dx) this.f2559b).f2631b || ((dx) this.f2559b).d || ((dx) this.f2559b).e);
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(bf bfVar) {
        super.a(bfVar);
        if (this.f2559b != 0) {
            js.a(this);
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        lh lhVar;
        boolean z2 = false;
        if (z && this.f2559b == 0) {
            this.f2559b = new dx();
            ((dx) this.f2559b).f2630a = document;
            ((dx) this.f2559b).f2631b = !js.a(document, this.f);
            if (((dx) this.f2559b).f2631b) {
                ((dx) this.f2559b).c = js.a(document, FinskyApp.a().i());
            }
            ((dx) this.f2559b).d = !TextUtils.isEmpty(document.f1963a.F);
            dx dxVar = (dx) this.f2559b;
            if (document2.f1963a.C != null && document2.f1963a.C.g != null) {
                z2 = true;
            }
            dxVar.e = z2;
            if (((dx) this.f2559b).e) {
                if (document2.f1963a.C != null) {
                    lhVar = document2.f1963a.C.g;
                } else {
                    lhVar = null;
                }
                ((dx) this.f2559b).f = lhVar.f4080a;
                ((dx) this.f2559b).g = lhVar.c;
            }
            js.a(this);
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        SecondaryActionsModuleLayout secondaryActionsModuleLayout = (SecondaryActionsModuleLayout) view;
        boolean z = ((dx) this.f2559b).f2631b;
        boolean z2 = ((dx) this.f2559b).c;
        int i = ((dx) this.f2559b).f2630a.f1963a.g;
        boolean z3 = ((dx) this.f2559b).d;
        boolean z4 = ((dx) this.f2559b).e;
        long j = ((dx) this.f2559b).g;
        boolean z5 = ((dx) this.f2559b).f;
        if (!z && !z3 && !z4) {
            secondaryActionsModuleLayout.setVisibility(8);
            return;
        }
        secondaryActionsModuleLayout.setVisibility(0);
        secondaryActionsModuleLayout.g = this;
        Resources resources = secondaryActionsModuleLayout.getResources();
        if (z) {
            secondaryActionsModuleLayout.f2511b.setVisibility(0);
            if (z2) {
                secondaryActionsModuleLayout.c.setImageResource(com.google.android.finsky.utils.ai.g(i));
                secondaryActionsModuleLayout.f2511b.setContentDescription(resources.getString(R.string.content_description_wishlist_remove));
            } else {
                secondaryActionsModuleLayout.c.setImageResource(R.drawable.ic_menu_wish_off);
                secondaryActionsModuleLayout.f2511b.setContentDescription(resources.getString(R.string.content_description_wishlist_add));
            }
        } else {
            secondaryActionsModuleLayout.f2511b.setVisibility(8);
        }
        if (z3) {
            secondaryActionsModuleLayout.d.setVisibility(0);
            secondaryActionsModuleLayout.d.setContentDescription(resources.getString(R.string.share));
        } else {
            secondaryActionsModuleLayout.d.setVisibility(8);
        }
        if (z4) {
            secondaryActionsModuleLayout.e.setVisibility(0);
            secondaryActionsModuleLayout.f.setText(resources.getString(R.string.details_secondary_action_plus_one_icon_text, SecondaryActionsModuleLayout.f2510a.format(j == 0 ? 1L : j)));
            if (z5) {
                secondaryActionsModuleLayout.f.setBackgroundResource(R.drawable.plus_one_icon_on);
                secondaryActionsModuleLayout.f.setTextColor(resources.getColor(R.color.white));
                secondaryActionsModuleLayout.e.setContentDescription(resources.getString(R.string.content_description_details_secondary_action_plus_one_set, Long.valueOf(j)));
                return;
            } else {
                secondaryActionsModuleLayout.f.setBackgroundResource(R.drawable.plus_one_icon_off);
                secondaryActionsModuleLayout.f.setTextColor(resources.getColor(R.color.play_fg_primary));
                secondaryActionsModuleLayout.e.setContentDescription(resources.getString(R.string.content_description_details_secondary_action_plus_one, Long.valueOf(j)));
                return;
            }
        }
        secondaryActionsModuleLayout.e.setVisibility(8);
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void f() {
        js.b(this);
    }

    @Override // com.google.android.finsky.utils.jx
    public final void a(String str, boolean z, boolean z2) {
        if (this.f2559b != 0 && ((dx) this.f2559b).f2630a.f1963a.f3890a.equals(str)) {
            ((dx) this.f2559b).c = z;
            ((dx) this.f2559b).f2631b = !js.a(((dx) this.f2559b).f2630a, this.f);
            this.d.a((bd) this, false);
        }
    }

    @Override // com.google.android.finsky.detailspage.dy
    public final void c(View view) {
        int i;
        if (((dx) this.f2559b).c) {
            i = 205;
        } else {
            i = 204;
        }
        FinskyApp.a().h().a(i, (byte[]) null, this);
        js.a(view, ((dx) this.f2559b).f2630a, this.f);
        FinskyApp.a().h().a(i, (byte[]) null, this);
    }

    @Override // com.google.android.finsky.detailspage.dy
    public final void a() {
        com.google.android.finsky.utils.cr.a(this.c, ((dx) this.f2559b).f2630a, this);
    }

    @Override // com.google.android.finsky.detailspage.dy
    public final void d(View view) {
        int i;
        if (((dx) this.f2559b).f) {
            ((dx) this.f2559b).g--;
        } else {
            ((dx) this.f2559b).g++;
        }
        ((dx) this.f2559b).f = !((dx) this.f2559b).f;
        this.g.a(((dx) this.f2559b).f2630a.f1963a.f3890a, ((dx) this.f2559b).f, new dv(this), new dw(this));
        if (((dx) this.f2559b).f) {
            i = R.string.accessibility_event_plus_one_toggle_on;
        } else {
            i = R.string.accessibility_event_plus_one_toggle_off;
        }
        ik.a(this.c, this.c.getString(i), view);
        FinskyApp.a().h().a(208, (byte[]) null, this);
        this.d.a((bd) this, false);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.f2627a;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.s;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }
}
