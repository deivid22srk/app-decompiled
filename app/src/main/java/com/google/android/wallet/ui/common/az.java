package com.google.android.wallet.ui.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.wallet.common.util.ParcelableProto;

/* loaded from: classes.dex */
public final class az extends c {
    public static az a(com.google.b.a.a.a.b.a.bpkg.t tVar, int i) {
        az azVar = new az();
        Bundle c = c(i);
        azVar.f(c);
        c.putParcelable("tooltipProto", ParcelableProto.a(tVar));
        return azVar;
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        com.google.b.a.a.a.b.a.bpkg.t tVar = (com.google.b.a.a.a.b.a.bpkg.t) ParcelableProto.a(this.r, "tooltipProto");
        View inflate = v().inflate(com.google.android.wallet.e.h.view_tooltip_dialog, (ViewGroup) null);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(com.google.android.wallet.e.g.container);
        InfoMessageTextView infoMessageTextView = (InfoMessageTextView) inflate.findViewById(com.google.android.wallet.e.g.info_message);
        infoMessageTextView.setInfoMessage(tVar.c);
        infoMessageTextView.setUrlClickListener((e) this.s);
        for (com.google.b.a.a.a.b.a.bpkg.p pVar : tVar.d) {
            ImageWithCaptionView imageWithCaptionView = new ImageWithCaptionView(u());
            if (com.google.android.wallet.common.util.i.b(pVar.f7684a)) {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
            } else if (pVar.f7685b > 0 && pVar.c > 0) {
                layoutParams = new LinearLayout.LayoutParams(pVar.f7685b, pVar.c);
            } else {
                layoutParams = new LinearLayout.LayoutParams(g().getDimensionPixelSize(com.google.android.wallet.e.f.wallet_uic_tooltip_dialog_image_default_width), -2);
            }
            LinearLayout.LayoutParams layoutParams2 = layoutParams;
            layoutParams2.topMargin = g().getDimensionPixelSize(com.google.android.wallet.e.f.wallet_uic_tooltip_image_top_margin);
            imageWithCaptionView.a(pVar, com.google.android.wallet.common.util.i.b(f().getApplicationContext()), com.google.android.wallet.a.d.f7228a.b().booleanValue());
            imageWithCaptionView.setFadeIn(true);
            imageWithCaptionView.setAdjustViewBounds(true);
            viewGroup.addView(imageWithCaptionView, layoutParams2);
        }
        return new a(u()).a(tVar.f7689b).a(inflate).a(com.google.android.wallet.e.j.wallet_uic_close, (DialogInterface.OnClickListener) null).a();
    }
}
