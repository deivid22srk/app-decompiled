package com.google.android.finsky.activities;

import android.accounts.Account;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.FreeSongOfTheDayAlbumView;
import com.google.android.finsky.layout.FreeSongOfTheDaySummary;

/* loaded from: classes.dex */
public final class di extends bh {
    public static di a(Document document, String str) {
        di diVar = new di();
        diVar.a(FinskyApp.a().g, str);
        diVar.a("finsky.DetailsDataBasedFragment.document", document);
        return diVar;
    }

    @Override // com.google.android.finsky.activities.bh, com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.ao.h().q();
    }

    @Override // com.google.android.finsky.e.q
    public final void o_() {
        this.ao.b_(null);
        this.ao.s_();
        if (((bh) this).f1612a != null) {
            this.ao.a(((bh) this).f1612a.f1963a.g, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.free_song_of_the_day_frame;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.bh
    public final void k_() {
        o_();
        Document document = ((bh) this).f1612a;
        Document a2 = document.a(0);
        com.google.android.finsky.protos.fr frVar = document.aJ().j;
        View view = this.R;
        TextView textView = (TextView) view.findViewById(R.id.header);
        textView.setText(frVar.f3839a.toUpperCase());
        textView.setTextColor(com.google.android.finsky.utils.ai.c(this.ap, document.f1963a.g));
        view.findViewById(R.id.header_separator).setBackgroundColor(com.google.android.finsky.utils.ai.a(this.ap, document.f1963a.g));
        FreeSongOfTheDaySummary freeSongOfTheDaySummary = (FreeSongOfTheDaySummary) view.findViewById(R.id.summary_panel);
        com.google.android.finsky.navigationmanager.b bVar = this.as;
        freeSongOfTheDaySummary.f2995a.setText(a2.f1963a.i);
        freeSongOfTheDaySummary.f2996b.setText(a2.f1963a.m);
        Account i = FinskyApp.a().i();
        Account a3 = com.google.android.finsky.utils.cy.a(a2, FinskyApp.a().p, i);
        if (a3 != null) {
            freeSongOfTheDaySummary.c.a(a2.f1963a.g, R.string.listen, new com.google.android.finsky.layout.bf(freeSongOfTheDaySummary, this, bVar, a3, a2));
        } else {
            String R = a2.R();
            if (!TextUtils.isEmpty(R)) {
                freeSongOfTheDaySummary.c.a(a2.f1963a.g, R, bVar.a(i, a2, 1, null, null, 223, null));
            }
        }
        freeSongOfTheDaySummary.d.setState(5);
        freeSongOfTheDaySummary.e.setText(R.string.track_play);
        freeSongOfTheDaySummary.setOnClickListener(new com.google.android.finsky.layout.bg(freeSongOfTheDaySummary, a2.G()));
        com.google.android.finsky.j.b.a(bVar);
        ((TextView) view.findViewById(R.id.description)).setText(document.u());
        FreeSongOfTheDayAlbumView freeSongOfTheDayAlbumView = (FreeSongOfTheDayAlbumView) view.findViewById(R.id.album_panel);
        if (freeSongOfTheDayAlbumView != null) {
            freeSongOfTheDayAlbumView.a(this.aq, this.as, this.ar);
            String str = a2.f1963a.D;
            freeSongOfTheDayAlbumView.e.setText(R.string.music_from_album);
            freeSongOfTheDayAlbumView.c = document;
            freeSongOfTheDayAlbumView.d = str;
            freeSongOfTheDayAlbumView.f = this;
            freeSongOfTheDayAlbumView.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.bh
    public final int l_() {
        return 8;
    }
}
