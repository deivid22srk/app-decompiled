package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.hl;
import com.google.android.finsky.protos.hm;
import com.google.android.finsky.protos.hn;
import com.google.android.finsky.protos.ho;
import com.google.android.finsky.protos.ib;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.UrlSpanUtils;

/* loaded from: classes.dex */
public final class cn extends com.google.android.finsky.e.q implements com.android.volley.s, com.android.volley.t<ib>, com.google.android.play.utils.k {

    /* renamed from: a, reason: collision with root package name */
    private ib f1657a;
    private TextView ai;
    private RadioGroup aj;

    /* renamed from: b, reason: collision with root package name */
    private hm f1658b;
    private hm c;
    private String d;
    private boolean e;
    private boolean f;
    private Intent g;
    private ViewGroup h;
    private TextView i;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(ib ibVar) {
        this.f1657a = ibVar;
        m_();
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (!this.M) {
            this.M = true;
            if (q_() && !this.I) {
                this.C.d();
            }
        }
        k();
        if (bundle == null) {
            FinskyApp.a().h().a(0L, (com.google.android.finsky.layout.play.cy) this);
        }
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        this.h = (ViewGroup) a2.findViewById(R.id.teen_purchase_settings_card);
        this.aj = (RadioGroup) a2.findViewById(R.id.purchase_options);
        this.i = (TextView) a2.findViewById(R.id.purchase_card_title);
        this.ai = (TextView) a2.findViewById(R.id.purchase_settings_learn_more_explanation);
        com.google.android.finsky.layout.bz.setMarginsForCardView(this.h);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.family_member_settings_fragment;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        boolean z;
        super.d(bundle);
        if (!com.google.android.finsky.utils.ib.a((Activity) f())) {
            FinskyLog.c("Calling from untrusted package", new Object[0]);
            z = false;
        } else {
            Intent intent = f().getIntent();
            this.d = intent.getStringExtra("memberId");
            hl a2 = com.google.android.finsky.utils.bb.a(this.aq.c());
            if (this.d == null || a2 == null) {
                FinskyLog.c("Invoking Family purchase settings without Gaia ID or family is not available", new Object[0]);
                z = false;
            } else {
                this.c = com.google.android.finsky.utils.bb.a(a2.c, this.d);
                this.f1658b = com.google.android.finsky.utils.bb.a(a2.c);
                if (this.c == null || this.f1658b == null) {
                    FinskyLog.c("Cannot find either viewed member or self in family", new Object[0]);
                    z = false;
                } else {
                    boolean z2 = this.f1658b.f3916a != 1 && this.f1658b == this.c;
                    this.e = z2 || (this.f1658b.f3916a == 1 && this.c != this.f1658b);
                    this.f = z2;
                    this.g = (Intent) intent.getParcelableExtra("removeMemberIntent");
                    if (this.g == null) {
                        FinskyLog.c("removeMemberIntent is required.", new Object[0]);
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (!z) {
            this.ao.j();
            return;
        }
        if ((this.f1657a == null && (this.f1658b.f3916a == 1 && this.f1658b != this.c && FinskyApp.a().d(this.aq.c()).a(12604079L))) ? false : true) {
            u();
        } else {
            this.au.a();
            y();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void a(Menu menu, MenuInflater menuInflater) {
        super.a(menu, menuInflater);
        if (this.e) {
            menuInflater.inflate(R.menu.family_member_settings_menu, menu);
            if (this.f) {
                menu.findItem(R.id.remove_member_menu).setTitle(R.string.leave_family);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        if (i == 1 && (i2 == 6 || i2 == 9)) {
            f().setResult(i2, intent);
            this.ao.j();
        } else {
            super.a(i, i2, intent);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final boolean a(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.remove_member_menu /* 2131887337 */:
                FinskyApp.a().h().a(this.f ? 5223 : 5222, (byte[]) null, this);
                a(this.g, 1);
                return true;
            default:
                return super.a(menuItem);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void p() {
        super.p();
        if (this.f1657a != null) {
            hn hnVar = this.f1657a.f3941a;
            int i = -1;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= this.f1657a.f3942b.length) {
                    break;
                }
                if (((RadioButton) this.aj.getChildAt(i3)).isChecked()) {
                    i = this.f1657a.f3942b[i3].f3920a;
                }
                i2 = i3 + 1;
            }
            if (i != hnVar.g) {
                hnVar.g = i;
                this.aq.b(hnVar.e, hnVar.f3918a, i, new cp(this), new cq(this));
            }
        }
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d() {
        super.d();
        this.h = null;
        this.i = null;
        this.ai = null;
        this.aj = null;
    }

    @Override // com.google.android.play.utils.k
    public final void a(View view, String str) {
        com.google.android.finsky.utils.cp.a(f(), "family_purchaseapprovalsetting_android_ota");
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return com.google.android.finsky.a.i.a(5221);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void y() {
        this.au.a();
        this.aq.l(this.d, this, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void u() {
        ViewGroup viewGroup = this.av;
        com.google.android.finsky.protos.ds a2 = com.google.android.play.utils.c.a(this.c.c, 4);
        if (a2 != null) {
            ((FifeImageView) viewGroup.findViewById(R.id.avatar)).a(a2.f, a2.l, FinskyApp.a().d);
        }
        ((TextView) viewGroup.findViewById(R.id.user_name)).setText(this.c.c.i);
        if (this.f1657a != null && this.f1657a.f3942b != null && this.f1657a.f3942b.length > 0) {
            this.h.setVisibility(0);
            this.aj.removeAllViews();
            this.i.setText(this.f1657a.c);
            Spanned fromHtml = Html.fromHtml(this.f1657a.g);
            UrlSpanUtils.a(fromHtml, null, this);
            this.ai.setText(fromHtml);
            this.ai.setMovementMethod(LinkMovementMethod.getInstance());
            int i = this.f1657a.f3941a.g;
            for (ho hoVar : this.f1657a.f3942b) {
                RadioButton radioButton = (RadioButton) f().getLayoutInflater().inflate(R.layout.family_member_settings_option, (ViewGroup) this.aj, false);
                radioButton.setText(hoVar.c);
                radioButton.setChecked(hoVar.f3920a == i);
                radioButton.setId(hoVar.f3920a);
                if (hoVar.e != null) {
                    radioButton.setOnCheckedChangeListener(new co(this, hoVar));
                }
                this.aj.addView(radioButton);
            }
        }
    }
}
