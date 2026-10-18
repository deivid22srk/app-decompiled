package com.google.android.finsky.detailspage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class eu extends bd<ev> implements com.google.android.finsky.g.o {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2652a;

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.warning_message_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2559b != 0 && ((ev) this.f2559b).f2654b;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(bf bfVar) {
        super.a(bfVar);
        if (this.f2559b != 0) {
            this.m.a(this);
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (this.f2559b == 0) {
            this.f2559b = new ev();
            this.m.a(this);
        }
        ((ev) this.f2559b).f2653a = document;
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e() {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.detailspage.eu.e():void");
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        WarningMessageModuleLayout warningMessageModuleLayout = (WarningMessageModuleLayout) view;
        if (!warningMessageModuleLayout.c || this.f2652a) {
            String str = ((ev) this.f2559b).c;
            boolean z = ((ev) this.f2559b).d;
            int i = ((ev) this.f2559b).e;
            int i2 = ((ev) this.f2559b).f2653a.f1963a.g;
            warningMessageModuleLayout.c = true;
            warningMessageModuleLayout.f2526a.setText(str);
            warningMessageModuleLayout.f2527b.setImageResource(i);
            if (z) {
                warningMessageModuleLayout.f2526a.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                warningMessageModuleLayout.f2526a.setMovementMethod(null);
            }
            Context context = warningMessageModuleLayout.getContext();
            warningMessageModuleLayout.f2526a.setTextColor(com.google.android.finsky.utils.ai.c(context, i2));
            int b2 = ik.b(com.google.android.finsky.utils.ai.a(context, i2));
            int paddingTop = warningMessageModuleLayout.getPaddingTop();
            int paddingBottom = warningMessageModuleLayout.getPaddingBottom();
            int o = android.support.v4.view.by.o(warningMessageModuleLayout);
            int n = android.support.v4.view.by.n(warningMessageModuleLayout);
            warningMessageModuleLayout.setBackgroundDrawable(new LayerDrawable(new Drawable[]{new ColorDrawable(b2), android.support.v4.b.g.a(context, R.drawable.play_highlight_overlay_dark)}));
            android.support.v4.view.by.a(warningMessageModuleLayout, n, paddingTop, o, paddingBottom);
            this.f2652a = false;
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void f() {
        this.m.b(this);
    }

    @Override // com.google.android.finsky.g.o
    public final void M_() {
    }

    @Override // com.google.android.finsky.g.o
    public final void L_() {
        e();
        if (((ev) this.f2559b).f2654b) {
            this.d.a((bd) this, true);
            this.f2652a = true;
        } else {
            this.d.a(this);
        }
    }
}
