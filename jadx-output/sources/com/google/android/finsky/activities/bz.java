package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.layout.WishlistPlayActionButton;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public final class bz extends cc {
    public bz(DfeToc dfeToc, Account account) {
        super(dfeToc, account);
    }

    @Override // com.google.android.finsky.activities.cc
    protected final boolean a(PlayActionButton playActionButton, PlayActionButton playActionButton2, PlayActionButton playActionButton3, PlayActionButton playActionButton4, PlayActionButton playActionButton5, WishlistPlayActionButton wishlistPlayActionButton) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean a2 = super.a(playActionButton, playActionButton2, playActionButton3, playActionButton4, playActionButton5, wishlistPlayActionButton);
        boolean a3 = FinskyApp.a().e().a(87L);
        boolean a4 = FinskyApp.a().e().a(12602761L);
        if (!a3 && !a4) {
            return a2;
        }
        com.google.android.finsky.protos.ea d = this.g.d(11);
        if (d == null || d.H == null) {
            z = false;
        } else {
            com.google.android.finsky.protos.dp dpVar = d.H.f3781a;
            int i = dpVar.e;
            if (!new com.google.android.finsky.g.r(com.google.android.finsky.g.r.f, com.google.android.finsky.g.a.a(i), i, dpVar.f3740a, dpVar.c, 1).equals(com.google.android.finsky.utils.cy.a())) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!z) {
            return a2;
        }
        com.google.android.finsky.g.h hVar = FinskyApp.a().p;
        Account i2 = FinskyApp.a().i();
        boolean b2 = hVar.a(i2).b(com.google.android.finsky.utils.cy.a());
        boolean z4 = playActionButton2.getVisibility() != 0;
        Resources resources = this.e.getResources();
        LayoutInflater from = LayoutInflater.from(this.e);
        ViewGroup viewGroup = (ViewGroup) b(R.id.title_extra_labels_bottom);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.extra_labels_bottom_leading);
        viewGroup2.removeAllViews();
        if (!b2) {
            playActionButton5.setVisibility(0);
            playActionButton5.setEnabled(true);
            z3 = true;
            ca caVar = new ca(this, i2);
            if (a4) {
                playActionButton5.a(this.g.f1963a.g, R.string.all_access_button_subscribe, caVar);
                b(from, viewGroup2, resources.getString(R.string.all_access_label_bottom_alternate_try_all_access));
            } else {
                playActionButton5.a(this.g.f1963a.g, R.string.all_access_button_free_trial, caVar);
                b(from, viewGroup2, resources.getString(R.string.all_access_label_bottom_try_all_access));
            }
            z2 = true;
        } else if (z4) {
            z2 = false;
            z3 = a2;
        } else {
            playActionButton5.setVisibility(0);
            playActionButton5.setEnabled(true);
            z3 = true;
            playActionButton5.a(this.g.f1963a.g, R.string.listen, new cb(this, i2));
            b(from, viewGroup2, resources.getString(R.string.all_access_label_bottom_available_in_all_access));
            z2 = true;
        }
        viewGroup.setVisibility(z2 ? 0 : 8);
        return z3;
    }
}
