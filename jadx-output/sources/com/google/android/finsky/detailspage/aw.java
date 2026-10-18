package com.google.android.finsky.detailspage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.ExtrasItemSnippet;

/* loaded from: classes.dex */
public class aw extends eb<ax> implements ay, com.google.android.finsky.g.o {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2552a;

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.extras_content_list_module;
    }

    @Override // com.google.android.finsky.detailspage.eb, com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return super.W_() && ((ax) this.f2559b).f.p() != 0;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        boolean z;
        LayoutInflater layoutInflater;
        ExtrasItemSnippet extrasItemSnippet;
        LayoutInflater layoutInflater2;
        ExtrasContentListModuleLayout extrasContentListModuleLayout = (ExtrasContentListModuleLayout) view;
        if (!extrasContentListModuleLayout.f2497a || this.f2552a) {
            this.f2552a = false;
            com.google.android.play.image.e eVar = this.h;
            com.google.android.finsky.layout.play.cy cyVar = this.s;
            com.google.android.finsky.navigationmanager.b bVar = this.i;
            com.google.android.finsky.api.model.i iVar = ((ax) this.f2559b).f;
            Document document = ((ax) this.f2559b).f2553a;
            extrasContentListModuleLayout.f2497a = true;
            extrasContentListModuleLayout.e = this;
            String str = ((com.google.android.finsky.api.model.d) iVar).f1970a.f1963a.i;
            String str2 = ((com.google.android.finsky.api.model.d) iVar).f1970a.f1963a.k;
            boolean isEmpty = TextUtils.isEmpty(str);
            boolean isEmpty2 = TextUtils.isEmpty(str2);
            if (isEmpty && isEmpty2) {
                extrasContentListModuleLayout.f2498b.setVisibility(8);
            } else {
                extrasContentListModuleLayout.f2498b.setVisibility(0);
                extrasContentListModuleLayout.c.setText(str);
                extrasContentListModuleLayout.c.setVisibility(isEmpty ? 8 : 0);
                extrasContentListModuleLayout.d.setText(str2);
                extrasContentListModuleLayout.d.setVisibility(isEmpty2 ? 8 : 0);
            }
            ExtrasItemSnippet extrasItemSnippet2 = null;
            int p = iVar.p();
            int childCount = extrasContentListModuleLayout.getChildCount() - 1;
            LayoutInflater layoutInflater3 = null;
            int i = 0;
            while (i < p) {
                Document c = iVar.c(i);
                if (i < childCount) {
                    ExtrasItemSnippet extrasItemSnippet3 = (ExtrasItemSnippet) extrasContentListModuleLayout.getChildAt(i + 1);
                    if (extrasItemSnippet3.getDocument() == c) {
                        layoutInflater2 = layoutInflater3;
                        i++;
                        layoutInflater3 = layoutInflater2;
                    } else {
                        z = false;
                        layoutInflater = layoutInflater3;
                        extrasItemSnippet = extrasItemSnippet3;
                    }
                } else {
                    if (layoutInflater3 == null) {
                        layoutInflater3 = LayoutInflater.from(extrasContentListModuleLayout.getContext());
                    }
                    z = true;
                    layoutInflater = layoutInflater3;
                    extrasItemSnippet = (ExtrasItemSnippet) layoutInflater3.inflate(R.layout.extras_item_snippet, (ViewGroup) extrasContentListModuleLayout, false);
                }
                ExtrasItemSnippet extrasItemSnippet4 = c == document ? extrasItemSnippet : extrasItemSnippet2;
                extrasItemSnippet.f2984b = c;
                extrasItemSnippet.d = bVar;
                extrasItemSnippet.e = eVar;
                extrasItemSnippet.c = extrasContentListModuleLayout;
                extrasItemSnippet.g = cyVar;
                com.google.android.finsky.a.i.a(extrasItemSnippet.f, c.f1963a.R);
                extrasItemSnippet.g.a(extrasItemSnippet);
                if (z) {
                    extrasContentListModuleLayout.addView(extrasItemSnippet);
                } else {
                    extrasItemSnippet.a();
                }
                extrasItemSnippet.setVisibility(0);
                layoutInflater2 = layoutInflater;
                extrasItemSnippet2 = extrasItemSnippet4;
                i++;
                layoutInflater3 = layoutInflater2;
            }
            for (int i2 = p; i2 < childCount; i2++) {
                extrasContentListModuleLayout.getChildAt(i2 + 1).setVisibility(8);
            }
            if (extrasItemSnippet2 != null && !extrasItemSnippet2.b()) {
                extrasItemSnippet2.setExpandedContentVisibility(0);
            }
            extrasContentListModuleLayout.refreshDrawableState();
        }
    }

    @Override // com.google.android.finsky.detailspage.ay
    public final void b(Document document) {
        ((ax) this.f2559b).f2553a = document;
    }

    @Override // com.google.android.finsky.detailspage.eb
    protected final void e() {
        this.m.a(this);
        super.e();
    }

    @Override // com.google.android.finsky.detailspage.eb, com.google.android.finsky.detailspage.bd
    public final void f() {
        this.m.b(this);
        super.f();
    }

    private void h() {
        if (W_()) {
            this.f2552a = true;
            this.d.a((bd) this, false);
        }
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        h();
    }

    @Override // com.google.android.finsky.g.o
    public final void M_() {
    }

    @Override // com.google.android.finsky.g.o
    public final void L_() {
        h();
    }

    @Override // com.google.android.finsky.detailspage.eb
    protected final /* synthetic */ ax a(Document document) {
        if (document.f1963a.e != 6 || TextUtils.isEmpty(document.aV())) {
            return null;
        }
        ax axVar = new ax();
        axVar.e = document.aV();
        return axVar;
    }
}
