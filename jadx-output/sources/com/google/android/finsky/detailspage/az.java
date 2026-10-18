package com.google.android.finsky.detailspage;

import android.accounts.Account;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.FamilyShareTextBlock;
import com.google.android.finsky.layout.FamilyShareToggle;
import com.google.android.finsky.protos.gy;
import com.google.android.finsky.protos.hl;
import com.google.android.finsky.protos.hm;

/* loaded from: classes.dex */
public class az extends bd<bb> implements com.android.volley.s, com.android.volley.t<gy>, bc {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.finsky.g.r f2554a;
    private boolean u;
    private boolean v;
    private Account w;

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(gy gyVar) {
        FinskyApp.a().q.a(this.w, "FamilyShareModule.setShareState", new ba(this), gyVar.f3892a);
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.details_family_share_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2559b != 0 && (((bb) this.f2559b).f2558b || ((bb) this.f2559b).c);
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (this.f2559b == 0 && FinskyApp.a().e().a(12603252L)) {
            this.f2559b = new bb();
            ((bb) this.f2559b).f2557a = document;
            a(document);
            if (((bb) this.f2559b).f2558b || ((bb) this.f2559b).c) {
                ((bb) this.f2559b).e = com.google.android.finsky.utils.ai.f(document.f1963a.g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Document document) {
        this.w = FinskyApp.a().i();
        this.f2554a = com.google.android.finsky.utils.cy.b(document.c(), this.m.a(this.w));
        hl a2 = com.google.android.finsky.utils.bb.a(this.w.name);
        if (this.f2554a != null && a2 != null) {
            if (this.f2554a.r == 1 || document.f1963a.Y) {
                ((bb) this.f2559b).f2558b = true;
                ((bb) this.f2559b).d = this.c.getString(R.string.family_sharing_toggle_action_text);
                ((bb) this.f2559b).c = this.f2554a.p;
                return;
            }
            String str = this.f2554a.q;
            ((bb) this.f2559b).c = !TextUtils.isEmpty(str);
            if (((bb) this.f2559b).c) {
                hm a3 = com.google.android.finsky.utils.bb.a(a2.c, str);
                if (a3 == null) {
                    ((bb) this.f2559b).d = this.c.getString(R.string.family_sharing_shared_by_unknown);
                } else {
                    ((bb) this.f2559b).d = this.c.getString(R.string.family_sharing_shared_with_you_action_text, a3.c.i);
                }
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void f() {
        this.u = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (W_()) {
            this.v = true;
            this.d.a((bd) this, true);
        } else {
            this.d.a(this);
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        FamilyShareModuleLayout familyShareModuleLayout = (FamilyShareModuleLayout) view;
        if (!familyShareModuleLayout.f2500b || this.v) {
            Document document = ((bb) this.f2559b).f2557a;
            String str = ((bb) this.f2559b).d;
            int i = ((bb) this.f2559b).e;
            boolean z = ((bb) this.f2559b).f2558b;
            boolean z2 = ((bb) this.f2559b).c;
            familyShareModuleLayout.f2500b = true;
            familyShareModuleLayout.removeAllViews();
            if (z) {
                FamilyShareToggle familyShareToggle = (FamilyShareToggle) familyShareModuleLayout.f2499a.inflate(R.layout.details_family_share_toggle, (ViewGroup) familyShareModuleLayout, false);
                familyShareToggle.f2987a = this;
                familyShareToggle.c.setText(str);
                familyShareToggle.f2988b.setChecked(z2);
                familyShareToggle.f2988b.setVisibility(0);
                familyShareToggle.f2988b.setOnCheckedChangeListener(new com.google.android.finsky.layout.be(familyShareToggle));
                if (i < 0) {
                    familyShareToggle.d.setVisibility(4);
                } else {
                    familyShareToggle.d.setVisibility(0);
                    familyShareToggle.d.setImageResource(i);
                }
                familyShareModuleLayout.addView(familyShareToggle);
            } else {
                FamilyShareTextBlock familyShareTextBlock = (FamilyShareTextBlock) familyShareModuleLayout.f2499a.inflate(R.layout.details_family_share_text_block, (ViewGroup) familyShareModuleLayout, false);
                int i2 = document.f1963a.g;
                if (TextUtils.isEmpty(str)) {
                    familyShareTextBlock.f2986b.setVisibility(8);
                } else {
                    familyShareTextBlock.f2986b.setText(str);
                    familyShareTextBlock.f2986b.setVisibility(0);
                }
                if (i < 0) {
                    familyShareTextBlock.f2985a.setVisibility(4);
                } else {
                    familyShareTextBlock.f2985a.setVisibility(0);
                    familyShareTextBlock.f2985a.setImageResource(i);
                }
                familyShareTextBlock.setCorpusStyle(i2);
                familyShareModuleLayout.addView(familyShareTextBlock);
            }
            this.v = false;
        }
    }

    @Override // com.google.android.finsky.detailspage.bc
    public final void a(boolean z) {
        if (this.f2554a != null) {
            FinskyApp.a().b(this.w.name).a(((bb) this.f2559b).f2557a.f1963a.f3890a, this.f2554a.l, z, this, this);
        }
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        if (!this.u) {
            a();
        }
    }
}
