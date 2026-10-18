package com.google.android.finsky.activities.a;

import android.content.res.Resources;
import android.support.v4.view.by;
import android.support.v7.widget.dt;
import android.support.v7.widget.eq;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.PlayCreditGiftingFooter;
import com.google.android.finsky.layout.PlayCreditGiftingHeader;
import com.google.android.finsky.layout.PlayCreditGiftingRow;
import com.google.android.finsky.layout.cw;
import com.google.android.finsky.layout.cx;
import com.google.android.finsky.layout.play.ad;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.ju;
import com.google.android.finsky.utils.ik;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.e;

/* loaded from: classes.dex */
public final class a extends dt<eq> {
    private final Resources c;
    private final LayoutInflater d;
    private final e e;
    private final cx f;
    private final cy g;
    private final ju h;
    private final int i;
    private final int j;
    private final int k;

    public a(Resources resources, LayoutInflater layoutInflater, e eVar, cx cxVar, cy cyVar, ju juVar) {
        this.c = resources;
        this.d = layoutInflater;
        this.e = eVar;
        this.f = cxVar;
        this.g = cyVar;
        this.h = juVar;
        this.i = this.h.h != null ? this.h.h.length : 0;
        this.j = ik.e(this.c);
        this.k = (this.i / this.j) + (this.i % this.j != 0 ? 1 : 0);
    }

    @Override // android.support.v7.widget.dt
    public final eq a(ViewGroup viewGroup, int i) {
        View inflate;
        switch (i) {
            case R.layout.play_credit_gifting_footer /* 2130968988 */:
                inflate = this.d.inflate(i, viewGroup, false);
                break;
            case R.layout.play_credit_gifting_header /* 2130968989 */:
                inflate = this.d.inflate(i, viewGroup, false);
                inflate.setId(R.id.play_header_spacer);
                break;
            case R.layout.play_credit_gifting_row /* 2130968990 */:
                inflate = this.d.inflate(i, viewGroup, false);
                int a2 = ik.a(this.c);
                by.a(inflate, a2, 0, a2, 0);
                PlayCreditGiftingRow playCreditGiftingRow = (PlayCreditGiftingRow) inflate;
                LayoutInflater layoutInflater = this.d;
                int i2 = this.j;
                playCreditGiftingRow.f3044b = i2;
                playCreditGiftingRow.c = new FifeImageView[i2];
                playCreditGiftingRow.d = new TextView[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    View inflate2 = layoutInflater.inflate(R.layout.play_credit_gifting_card, (ViewGroup) playCreditGiftingRow, false);
                    playCreditGiftingRow.addView(inflate2);
                    playCreditGiftingRow.c[i3] = (FifeImageView) inflate2.findViewById(R.id.image);
                    playCreditGiftingRow.d[i3] = (TextView) inflate2.findViewById(R.id.price);
                }
                break;
            default:
                throw new IllegalStateException("Unknown viewType specified " + i);
        }
        return new com.google.android.finsky.layout.play.cx(inflate);
    }

    @Override // android.support.v7.widget.dt
    public final void a(eq eqVar, int i) {
        int a2 = a(i);
        View view = eqVar.f795a;
        switch (a2) {
            case R.layout.play_credit_gifting_footer /* 2130968988 */:
                PlayCreditGiftingFooter playCreditGiftingFooter = (PlayCreditGiftingFooter) view;
                playCreditGiftingFooter.setText(Html.fromHtml(this.h.f));
                playCreditGiftingFooter.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            case R.layout.play_credit_gifting_header /* 2130968989 */:
                PlayCreditGiftingHeader playCreditGiftingHeader = (PlayCreditGiftingHeader) view;
                String str = this.h.f4010a;
                String str2 = this.h.c;
                ds dsVar = this.h.e;
                e eVar = this.e;
                playCreditGiftingHeader.f3041a.setText(str);
                playCreditGiftingHeader.f3042b.setText(Html.fromHtml(str2));
                playCreditGiftingHeader.c.setOnLoadedListener(playCreditGiftingHeader);
                playCreditGiftingHeader.c.a(dsVar.f, dsVar.l, eVar);
                return;
            case R.layout.play_credit_gifting_row /* 2130968990 */:
                PlayCreditGiftingRow playCreditGiftingRow = (PlayCreditGiftingRow) view;
                e eVar2 = this.e;
                int i2 = this.i;
                gx[] gxVarArr = this.h.h;
                int i3 = i - 1;
                cx cxVar = this.f;
                cy cyVar = this.g;
                playCreditGiftingRow.f3043a = cxVar;
                int i4 = playCreditGiftingRow.f3044b * i3;
                for (int i5 = 0; i5 < playCreditGiftingRow.f3044b; i5++) {
                    View childAt = playCreditGiftingRow.getChildAt(i5);
                    if (i4 < i2) {
                        int i6 = i4 + 1;
                        gx gxVar = gxVarArr[i4];
                        ds dsVar2 = gxVar.w[0];
                        playCreditGiftingRow.c[i5].a(dsVar2.f, dsVar2.l, eVar2);
                        playCreditGiftingRow.d[i5].setText(gxVar.u[0].h);
                        ad adVar = new ad(500, gxVar.R, cyVar);
                        adVar.a();
                        childAt.setOnClickListener(new cw(playCreditGiftingRow, gxVar, adVar));
                        i4 = i6;
                    } else {
                        childAt.setVisibility(4);
                    }
                }
                if (i3 != 0) {
                    return;
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, playCreditGiftingRow.getResources().getDimensionPixelOffset(R.dimen.play_credit_first_row_top_margin), 0, 0);
                playCreditGiftingRow.setLayoutParams(layoutParams);
                return;
            case R.layout.play_list_vspacer /* 2130969018 */:
                return;
            default:
                throw new IllegalStateException("Unknown viewType specified " + a2);
        }
    }

    @Override // android.support.v7.widget.dt
    public final int a() {
        return this.k + 2;
    }

    @Override // android.support.v7.widget.dt
    public final int a(int i) {
        if (i == 0) {
            return R.layout.play_credit_gifting_header;
        }
        if (i - 1 == this.k) {
            return R.layout.play_credit_gifting_footer;
        }
        return R.layout.play_credit_gifting_row;
    }
}
