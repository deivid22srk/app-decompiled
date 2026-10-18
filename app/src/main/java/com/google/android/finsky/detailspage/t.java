package com.google.android.finsky.detailspage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Pair;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.ContentFilterActivity;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.detailspage.TextModule;
import com.google.android.finsky.protos.gr;
import com.google.android.finsky.protos.gs;
import com.google.android.finsky.protos.gt;
import com.google.android.finsky.protos.jl;
import com.google.android.finsky.protos.jy;
import com.google.android.finsky.protos.sq;
import com.google.android.finsky.protos.sr;
import com.google.android.finsky.utils.FinskyLog;
import java.text.ParseException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class t extends TextModule implements com.google.android.finsky.installer.p {

    /* renamed from: a, reason: collision with root package name */
    private Document f2671a;
    private Document u;

    @Override // com.google.android.finsky.detailspage.TextModule
    protected final TextModule.ExpandedData a(Document document, boolean z, ek ekVar) {
        TextModule.ExpandedData a2 = super.a(document, z, ekVar);
        if (a2 == null) {
            return null;
        }
        b(document, a2);
        a(document, a2);
        d(document, a2);
        e(document, a2);
        f(document, a2);
        c(document, a2);
        a(a2);
        return a2;
    }

    @Override // com.google.android.finsky.detailspage.bd
    protected final void a_(String str, Object obj) {
        if ("EpisodeListModule.SeasonDocument".equals(str)) {
            this.u = (Document) obj;
            if (this.f2559b != 0) {
                a(((ek) this.f2559b).n);
            }
        }
    }

    private void a(TextModule.ExpandedData expandedData) {
        if (expandedData != null && this.u != null) {
            b(this.u, expandedData);
            a(this.u, expandedData);
            d(this.u, expandedData);
            e(this.u, expandedData);
            f(this.u, expandedData);
            c(this.u, expandedData);
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void f() {
        super.f();
        FinskyApp.a().k.b(this);
    }

    @Override // com.google.android.finsky.installer.p
    public final void a(String str, int i, int i2) {
        com.google.android.finsky.protos.ag E = this.f2671a.E();
        if (E != null && str.equals(E.w)) {
            ((ek) this.f2559b).j = !a(this.f2671a);
            this.d.a((bd) this, true);
        }
    }

    private static void c(Document document, TextModule.ExpandedData expandedData) {
        if (!document.M()) {
            return;
        }
        gr grVar = document.f1963a.A;
        int length = grVar.c.length;
        for (int i = 0; i < length; i++) {
            gt gtVar = grVar.c[i];
            int length2 = gtVar.c.length;
            for (int i2 = 0; i2 < length2; i2++) {
                gs gsVar = gtVar.c[i2];
                if (gsVar.f3880a != null) {
                    expandedData.m.add(new TextModule.DetailsExtraPrimary(gtVar.f3882a, gsVar.f3881b, null, gsVar.f3880a, false));
                } else {
                    expandedData.n.add(new TextModule.DetailsExtraSecondary(gtVar.f3882a, gsVar.f3881b));
                }
            }
        }
    }

    private static void d(Document document, TextModule.ExpandedData expandedData) {
        if (document.Y()) {
            for (com.google.android.finsky.protos.an anVar : document.aa()) {
                expandedData.m.add(new TextModule.DetailsExtraPrimary(anVar.f3598a, anVar.c, anVar.g, anVar.f != null ? anVar.f : com.google.android.finsky.utils.v.a(anVar), true));
            }
        }
        if (document.ab()) {
            for (com.google.android.finsky.protos.an anVar2 : document.f1963a.C.m) {
                expandedData.m.add(new TextModule.DetailsExtraPrimary(anVar2.f3598a, anVar2.c, anVar2.g, anVar2.f != null ? anVar2.f : com.google.android.finsky.utils.v.a(anVar2), true));
            }
        }
        if (document.ad()) {
            com.google.android.finsky.protos.ao ae = document.ae();
            int length = ae.d.length;
            for (int i = 0; i < length; i++) {
                com.google.android.finsky.protos.an anVar3 = ae.d[i];
                expandedData.m.add(new TextModule.DetailsExtraPrimary(anVar3.f3598a, anVar3.c, anVar3.g, anVar3.f != null ? anVar3.f : com.google.android.finsky.utils.v.a(anVar3), false));
            }
        }
        if (document.af()) {
            for (com.google.android.finsky.protos.an anVar4 : document.ag()) {
                expandedData.m.add(new TextModule.DetailsExtraPrimary(anVar4.f3598a, anVar4.c, anVar4.g, anVar4.f != null ? anVar4.f : com.google.android.finsky.utils.v.a(anVar4), true));
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.TextModule
    protected final ek a(Document document, boolean z) {
        CharSequence charSequence;
        com.google.android.finsky.protos.an anVar = null;
        String str = document.f1963a.s;
        if (TextUtils.isEmpty(str) && !z) {
            return null;
        }
        com.google.android.finsky.receivers.f fVar = FinskyApp.a().k;
        fVar.b(this);
        fVar.a(this);
        this.f2671a = document;
        ek ekVar = new ek();
        ekVar.f2646a = document.f1963a.g;
        ekVar.f2647b = document.f1963a.e;
        CharSequence u = document.u();
        String str2 = document.f1963a.q;
        Spanned fromHtml = TextUtils.isEmpty(str2) ? null : Html.fromHtml(str2);
        ekVar.c = str;
        ekVar.d = 1;
        ekVar.e = false;
        if (TextUtils.isEmpty(ekVar.c) && document.f1963a.e != 1) {
            ekVar.c = u;
            ekVar.d = 8388611;
            ekVar.e = true;
            u = null;
        }
        ekVar.f = null;
        ekVar.g = u;
        ekVar.h = fromHtml;
        if (!((!document.D() || document.E() == null || TextUtils.isEmpty(document.E().y)) ? false : true)) {
            charSequence = null;
        } else if (!document.D() || document.E() == null) {
            charSequence = "";
        } else {
            charSequence = com.google.android.finsky.utils.bc.a(document.E().y);
        }
        ekVar.i = charSequence;
        ekVar.j = !a(document);
        if (document.f1963a.e == 8 && document.Y()) {
            anVar = document.aa()[0];
        }
        ekVar.k = anVar;
        ArrayList arrayList = new ArrayList();
        if (document.ad()) {
            for (com.google.android.finsky.protos.an anVar2 : document.ae().d) {
                com.google.android.finsky.protos.ds a2 = com.google.android.finsky.utils.v.a(anVar2);
                if (a2 != null) {
                    arrayList.add(new Pair(a2, anVar2.f3598a));
                }
            }
        }
        if (document.af()) {
            for (com.google.android.finsky.protos.an anVar3 : document.ag()) {
                com.google.android.finsky.protos.ds a3 = com.google.android.finsky.utils.v.a(anVar3);
                if (a3 != null) {
                    arrayList.add(new Pair(a3, anVar3.f3598a));
                }
            }
        }
        if (document.M()) {
            for (gt gtVar : document.f1963a.A.c) {
                for (gs gsVar : gtVar.c) {
                    com.google.android.finsky.protos.ds dsVar = gsVar.f3880a;
                    if (dsVar != null) {
                        arrayList.add(new Pair(dsVar, gtVar.f3882a));
                    }
                }
            }
        }
        ekVar.l = arrayList;
        ekVar.m = Integer.valueOf(this.c.getResources().getColor(R.color.play_white));
        return ekVar;
    }

    private boolean a(Document document) {
        if (document.f1963a.e == 1) {
            String str = document.E().w;
            return (FinskyApp.a().v.a(str) != null) || (FinskyApp.a().k.i(str) != 0);
        }
        return com.google.android.finsky.utils.cy.a(document, this.m.a(this.f.b()));
    }

    private void a(Document document, TextModule.ExpandedData expandedData) {
        sr I = document.I();
        sq[] sqVarArr = I != null ? I.f4398a : null;
        if (sqVarArr != null && sqVarArr.length != 0) {
            expandedData.k = this.c.getString(R.string.details_cast_crew);
            expandedData.l = new ArrayList();
            for (sq sqVar : sqVarArr) {
                expandedData.l.add(new TextModule.DetailsExtraCredits(sqVar.c, TextUtils.join(", ", sqVar.e)));
            }
        }
    }

    private void b(Document document, TextModule.ExpandedData expandedData) {
        int i = document.f1963a.e;
        com.google.android.finsky.protos.an ac = document.ac();
        if (i == 1 || ((i == 6 || i == 18) && ac != null)) {
            if (ac == null) {
                expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.app_content_rating), ContentFilterActivity.a(this.c, document.E() == null ? -1 : r0.l - 1)));
                return;
            }
            if ((i == 18 || i == 6) && ((ac.e == null || ac.e.length == 0) && TextUtils.isEmpty(ac.c))) {
                expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.movie_rating), ac.f3598a));
            } else {
                expandedData.m.add(new TextModule.DetailsExtraPrimary(ac.f3598a, ac.c, null, (ac.e == null || ac.e.length <= 0) ? null : ac.e[0], true));
            }
        }
    }

    private void e(Document document, TextModule.ExpandedData expandedData) {
        String string;
        jl K;
        int i = document.f1963a.e;
        switch (i) {
            case 1:
                com.google.android.finsky.protos.ag E = document.E();
                if (!TextUtils.isEmpty(E.g)) {
                    expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.app_version), E.g));
                }
                if (!TextUtils.isEmpty(E.A)) {
                    expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.app_update_date), E.A));
                }
                if (!TextUtils.isEmpty(E.u)) {
                    expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.app_downloads), E.u));
                }
                if (document.s() > 0) {
                    expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.app_size), Formatter.formatFileSize(this.c, document.s())));
                    break;
                } else {
                    expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.app_size), this.c.getString(R.string.no_app_size)));
                    break;
                }
            case 2:
                com.google.android.finsky.protos.w F = document.F();
                if (F != null) {
                    jy jyVar = F.c;
                    if (!TextUtils.isEmpty(jyVar.f)) {
                        try {
                            expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.album_release_date), com.google.android.finsky.utils.aj.a(jyVar.f)));
                        } catch (ParseException e) {
                            FinskyLog.a(e, "Cannot parse ISO 8601 date", new Object[0]);
                        }
                    }
                    if (!TextUtils.isEmpty(jyVar.j)) {
                        if (!TextUtils.isEmpty(jyVar.h) && jyVar.h.length() >= 4) {
                            string = this.c.getString(R.string.music_copyright_with_year, jyVar.h.substring(0, 4), jyVar.j);
                        } else {
                            string = this.c.getString(R.string.music_copyright, jyVar.j);
                        }
                        expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.album_copyright), string));
                    }
                    if (jyVar.m.length > 0) {
                        expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.album_genre), TextUtils.join(",", jyVar.m)));
                        break;
                    }
                }
                break;
            case 6:
                sr I = document.I();
                if (document.ac() == null) {
                    if (!TextUtils.isEmpty(I.f)) {
                        expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.movie_rating), I.f));
                    } else {
                        expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.movie_rating), this.c.getString(R.string.no_movie_rating)));
                    }
                }
                if (!TextUtils.isEmpty(I.d)) {
                    expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.movie_release_date), I.d));
                }
                if (!TextUtils.isEmpty(I.f4399b)) {
                    expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.movie_duration), I.f4399b));
                }
                if (I.o.length > 0) {
                    expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.movie_audio_languages), TextUtils.join(",", I.o)));
                }
                if (I.p.length > 0) {
                    expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.movie_subtitle_languages), TextUtils.join(",", I.p)));
                    break;
                }
                break;
            case 16:
            case 17:
            case 24:
            case 25:
                jl K2 = document.K();
                if (K2 != null) {
                    if (!TextUtils.isEmpty(K2.g)) {
                        expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.magazine_delivery_frequency), K2.g));
                    }
                    if (!TextUtils.isEmpty(K2.e)) {
                        expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.magazine_print_subscription_verification), K2.e));
                    }
                }
                if (i == 16 || i == 24) {
                    document = com.google.android.finsky.utils.as.b(document);
                }
                if (document != null && (K = document.K()) != null && !TextUtils.isEmpty(K.c)) {
                    expandedData.n.add(new TextModule.DetailsExtraSecondary(this.c.getString(R.string.magazine_device_availability), K.c));
                    break;
                }
                break;
        }
    }

    private static void f(Document document, TextModule.ExpandedData expandedData) {
        expandedData.o = document.f1963a.C != null ? document.f1963a.C.A : "";
    }
}
