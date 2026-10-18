package com.google.android.finsky.detailspage;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.detailspage.TextModule;
import com.google.android.finsky.layout.ContentFrame;
import com.google.android.finsky.layout.DecoratedTextView;
import com.google.android.finsky.layout.DetailsExpandedContainer;
import com.google.android.finsky.layout.DetailsExpandedExtraCreditsView;
import com.google.android.finsky.layout.DetailsExpandedExtraPrimaryView;
import com.google.android.finsky.layout.DetailsExpandedExtraSecondaryView;
import com.google.android.finsky.layout.DetailsTextBlock;
import com.google.android.finsky.layout.SeparatorLinearLayout;
import java.util.List;

/* loaded from: classes.dex */
public final class av extends com.google.android.finsky.e.q {

    /* renamed from: a, reason: collision with root package name */
    private TextModule.ExpandedData f2550a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.finsky.a.ai f2551b = com.google.android.finsky.a.i.a(0);

    public static av a(TextModule.ExpandedData expandedData, DfeToc dfeToc) {
        av avVar = new av();
        Bundle bundle = new Bundle();
        bundle.putParcelable("expanded_data", expandedData);
        avVar.f(bundle);
        avVar.a("finsky.PageFragment.toc", dfeToc);
        return avVar;
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.f2550a = (TextModule.ExpandedData) this.r.getParcelable("expanded_data");
        o_();
        u();
        this.at.q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final Transition v() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final com.google.android.finsky.layout.bv a(ContentFrame contentFrame) {
        return new com.google.android.finsky.layout.bv(contentFrame, R.id.page_content, R.id.loading_indicator, this, 2);
    }

    @Override // com.google.android.finsky.e.q
    public final void o_() {
        this.ao.b_(this.f2550a.f2523b);
        this.ao.a(this.f2550a.f2522a, false);
        this.ao.s_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.expanded_description_fragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void y() {
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d() {
        this.at.v();
        super.d();
    }

    @Override // com.google.android.finsky.e.q
    public final int D() {
        return this.ap.getResources().getColor(R.color.play_fg_secondary);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.f2551b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final void u() {
        DetailsTextBlock detailsTextBlock;
        DetailsTextBlock detailsTextBlock2;
        int i;
        DetailsExpandedContainer detailsExpandedContainer = (DetailsExpandedContainer) this.R.findViewById(R.id.details_expanded_container);
        TextModule.ExpandedData expandedData = this.f2550a;
        com.google.android.finsky.navigationmanager.b bVar = this.as;
        int i2 = this.f2550a.f2522a;
        detailsExpandedContainer.f = expandedData.f;
        detailsExpandedContainer.g = expandedData.g;
        if (!TextUtils.isEmpty(expandedData.c)) {
            detailsExpandedContainer.f2947a.setText(expandedData.c);
            detailsExpandedContainer.f2947a.setGravity(expandedData.d);
            android.support.v4.view.by.a(detailsExpandedContainer.f2947a, android.support.v4.view.by.n(detailsExpandedContainer.f2947a), 0, android.support.v4.view.by.o(detailsExpandedContainer.f2947a), 0);
            detailsExpandedContainer.f2947a.setVisibility(0);
        } else {
            detailsExpandedContainer.f2947a.setVisibility(8);
        }
        if (expandedData.j) {
            detailsTextBlock2 = detailsExpandedContainer.f2948b;
            detailsTextBlock = detailsExpandedContainer.c;
        } else {
            detailsTextBlock = detailsExpandedContainer.f2948b;
            detailsTextBlock2 = detailsExpandedContainer.c;
        }
        detailsExpandedContainer.e = detailsTextBlock;
        detailsTextBlock2.a(expandedData.h, expandedData.i, Integer.MAX_VALUE);
        if (detailsTextBlock2.b()) {
            int dimensionPixelSize = detailsExpandedContainer.getResources().getDimensionPixelSize(R.dimen.details_whatsnew_vmargin);
            detailsTextBlock2.a(expandedData.f2522a, dimensionPixelSize / 2, (dimensionPixelSize * 3) / 2);
            detailsTextBlock2.setVisibility(0);
        } else {
            detailsTextBlock2.setVisibility(8);
        }
        detailsTextBlock.a(expandedData.e, (!detailsExpandedContainer.h || TextUtils.isEmpty(detailsExpandedContainer.g)) ? detailsExpandedContainer.f : detailsExpandedContainer.g, Integer.MAX_VALUE);
        detailsTextBlock.a();
        android.support.v4.view.by.a(detailsTextBlock, android.support.v4.view.by.n(detailsTextBlock), 0, android.support.v4.view.by.o(detailsTextBlock), 0);
        detailsExpandedContainer.d.removeAllViews();
        LayoutInflater from = LayoutInflater.from(detailsExpandedContainer.getContext());
        String str = expandedData.k;
        List<TextModule.DetailsExtraCredits> list = expandedData.l;
        int size = list.size();
        if (!TextUtils.isEmpty(str) && size != 0) {
            ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.details_extra_credits_header, detailsExpandedContainer.d, false);
            ((DecoratedTextView) viewGroup.findViewById(R.id.section_header)).setText(str.toUpperCase());
            detailsExpandedContainer.d.addView(viewGroup);
            for (int i3 = 0; i3 < size; i3++) {
                DetailsExpandedExtraCreditsView detailsExpandedExtraCreditsView = (DetailsExpandedExtraCreditsView) from.inflate(R.layout.details_text_extra_credits, detailsExpandedContainer.d, false);
                TextModule.DetailsExtraCredits detailsExtraCredits = list.get(i3);
                detailsExpandedExtraCreditsView.f2949a.setText(detailsExtraCredits.f2516a);
                if (TextUtils.isEmpty(detailsExtraCredits.f2517b)) {
                    detailsExpandedExtraCreditsView.f2950b.setVisibility(8);
                } else {
                    detailsExpandedExtraCreditsView.f2950b.setVisibility(0);
                    detailsExpandedExtraCreditsView.f2950b.setText(Html.fromHtml(detailsExtraCredits.f2517b));
                }
                detailsExpandedContainer.d.addView(detailsExpandedExtraCreditsView);
            }
        }
        com.google.android.play.image.e eVar = FinskyApp.a().d;
        List<TextModule.DetailsExtraPrimary> list2 = expandedData.m;
        int size2 = list2.size();
        int integer = detailsExpandedContainer.getResources().getInteger(R.integer.details_extra_primary_items_per_row);
        int i4 = ((size2 + integer) - 1) / integer;
        boolean[] zArr = new boolean[integer];
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= i4) {
                break;
            }
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i8 < integer && (i = (integer * i6) + i8) < size2) {
                    if (list2.get(i).d != null) {
                        zArr[i8] = true;
                    }
                    i7 = i8 + 1;
                }
            }
            i5 = i6 + 1;
        }
        int i9 = 0;
        while (true) {
            int i10 = i9;
            if (i10 >= i4) {
                break;
            }
            SeparatorLinearLayout separatorLinearLayout = (SeparatorLinearLayout) from.inflate(R.layout.details_text_extra_row, detailsExpandedContainer.d, false);
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i12 < integer) {
                    int i13 = (integer * i10) + i12;
                    DetailsExpandedExtraPrimaryView detailsExpandedExtraPrimaryView = (DetailsExpandedExtraPrimaryView) from.inflate(R.layout.details_text_extra_primary, (ViewGroup) separatorLinearLayout, false);
                    if (i13 >= size2) {
                        detailsExpandedExtraPrimaryView.setVisibility(4);
                    } else {
                        TextModule.DetailsExtraPrimary detailsExtraPrimary = list2.get(i13);
                        com.google.android.finsky.layout.ah ahVar = TextUtils.isEmpty(detailsExtraPrimary.c) ? null : new com.google.android.finsky.layout.ah(detailsExpandedContainer, bVar, detailsExtraPrimary, i2, this);
                        boolean z = zArr[i12];
                        if (detailsExtraPrimary.d == null) {
                            if (z) {
                                detailsExpandedExtraPrimaryView.f2951a.setVisibility(4);
                            } else {
                                detailsExpandedExtraPrimaryView.f2951a.setVisibility(8);
                            }
                        } else {
                            com.google.android.finsky.utils.a.a.a(detailsExpandedExtraPrimaryView.f2951a, detailsExtraPrimary.d);
                            detailsExpandedExtraPrimaryView.f2951a.setVisibility(0);
                            detailsExpandedExtraPrimaryView.f2951a.a(detailsExtraPrimary.d.f, detailsExtraPrimary.d.l, eVar);
                        }
                        detailsExpandedExtraPrimaryView.f2952b.setText(detailsExtraPrimary.f2518a);
                        if (TextUtils.isEmpty(detailsExtraPrimary.f2519b)) {
                            detailsExpandedExtraPrimaryView.c.setVisibility(8);
                        } else {
                            detailsExpandedExtraPrimaryView.c.setVisibility(0);
                            detailsExpandedExtraPrimaryView.c.setText(Html.fromHtml(detailsExtraPrimary.f2519b));
                        }
                        if (ahVar != null) {
                            detailsExpandedExtraPrimaryView.setOnClickListener(ahVar);
                        } else {
                            detailsExpandedExtraPrimaryView.setOnClickListener(null);
                            detailsExpandedExtraPrimaryView.setClickable(false);
                        }
                    }
                    boolean z2 = i10 == 0;
                    boolean z3 = i10 == i4 + (-1);
                    if (!z2) {
                        separatorLinearLayout.b();
                    }
                    android.support.v4.view.by.a(separatorLinearLayout, android.support.v4.view.by.n(separatorLinearLayout), z2 ? separatorLinearLayout.getPaddingTop() : 0, android.support.v4.view.by.o(separatorLinearLayout), z3 ? separatorLinearLayout.getPaddingBottom() : 0);
                    separatorLinearLayout.addView(detailsExpandedExtraPrimaryView);
                    i11 = i12 + 1;
                }
            }
            detailsExpandedContainer.d.addView(separatorLinearLayout);
            i9 = i10 + 1;
        }
        List<TextModule.DetailsExtraSecondary> list3 = expandedData.n;
        int size3 = list3.size();
        int integer2 = detailsExpandedContainer.getResources().getInteger(R.integer.details_extra_secondary_items_per_row);
        int i14 = ((size3 + integer2) - 1) / integer2;
        int i15 = 0;
        while (i15 < i14) {
            SeparatorLinearLayout separatorLinearLayout2 = (SeparatorLinearLayout) from.inflate(R.layout.details_text_extra_row, detailsExpandedContainer.d, false);
            for (int i16 = 0; i16 < integer2; i16++) {
                int i17 = (integer2 * i15) + i16;
                DetailsExpandedExtraSecondaryView detailsExpandedExtraSecondaryView = (DetailsExpandedExtraSecondaryView) from.inflate(R.layout.details_text_extra_secondary, (ViewGroup) separatorLinearLayout2, false);
                if (i17 >= size3) {
                    detailsExpandedExtraSecondaryView.setVisibility(4);
                } else {
                    TextModule.DetailsExtraSecondary detailsExtraSecondary = list3.get(i17);
                    detailsExpandedExtraSecondaryView.f2953a.setText(detailsExtraSecondary.f2520a);
                    if (TextUtils.isEmpty(detailsExtraSecondary.f2521b)) {
                        detailsExpandedExtraSecondaryView.f2954b.setVisibility(8);
                    } else {
                        detailsExpandedExtraSecondaryView.f2954b.setVisibility(0);
                        detailsExpandedExtraSecondaryView.f2954b.setText(Html.fromHtml(detailsExtraSecondary.f2521b));
                    }
                }
                separatorLinearLayout2.addView(detailsExpandedExtraSecondaryView);
            }
            boolean z4 = i15 == 0;
            boolean z5 = i15 == i14 + (-1);
            if (!z4) {
                separatorLinearLayout2.b();
            }
            android.support.v4.view.by.a(separatorLinearLayout2, android.support.v4.view.by.n(separatorLinearLayout2), z4 ? separatorLinearLayout2.getPaddingTop() : 0, android.support.v4.view.by.o(separatorLinearLayout2), z5 ? separatorLinearLayout2.getPaddingBottom() : 0);
            detailsExpandedContainer.d.addView(separatorLinearLayout2);
            i15++;
        }
        String str2 = expandedData.o;
        if (!TextUtils.isEmpty(str2)) {
            SeparatorLinearLayout separatorLinearLayout3 = (SeparatorLinearLayout) from.inflate(R.layout.details_text_extra_row, detailsExpandedContainer.d, false);
            TextView textView = (TextView) from.inflate(R.layout.details_text_extra_attributions, (ViewGroup) separatorLinearLayout3, false);
            textView.setVisibility(0);
            textView.setText(Html.fromHtml(str2));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            separatorLinearLayout3.addView(textView);
            detailsExpandedContainer.d.addView(separatorLinearLayout3);
        }
        this.at.a(this.f2550a.f2523b, detailsExpandedContainer);
    }
}
