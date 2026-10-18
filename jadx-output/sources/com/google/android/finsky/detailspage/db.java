package com.google.android.finsky.detailspage;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.ReviewsActivity;
import com.google.android.finsky.activities.fb;
import com.google.android.finsky.activities.ff;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ny;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ic;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class db extends bd<dg> implements com.google.android.finsky.api.model.x, dl, com.google.android.finsky.layout.play.cy {
    private boolean u;
    private boolean v;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.finsky.utils.ac f2603a = FinskyApp.a().a(FinskyApp.a().j());
    private com.google.android.finsky.a.ai w = com.google.android.finsky.a.i.a(1210);

    static /* synthetic */ boolean b(db dbVar) {
        dbVar.u = true;
        return true;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.reviews_samples_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return (this.f2559b == 0 || ((dg) this.f2559b).f2611b == null || !((dg) this.f2559b).f2611b.a() || ((dg) this.f2559b).f2611b.p() == 0) ? false : true;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        if (document2 != null && !TextUtils.isEmpty(document2.f1963a.H) && TextUtils.isEmpty(document2.f1963a.J) && z) {
            if (this.f2559b == 0) {
                this.f2559b = new dg();
                com.google.android.finsky.api.model.l lVar = new com.google.android.finsky.api.model.l(this.g, document2.f1963a.H, document.d(), false);
                lVar.d = 4;
                lVar.a(this);
                lVar.q();
                ((dg) this.f2559b).f2611b = lVar;
            }
            ((dg) this.f2559b).f2610a = document2;
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(bf bfVar) {
        super.a(bfVar);
        if (this.f2559b != 0 && ((dg) this.f2559b).f2611b != null) {
            if (!((dg) this.f2559b).f2611b.a()) {
                ((dg) this.f2559b).f2611b.a(this);
                ((dg) this.f2559b).f2611b.q();
            } else {
                a();
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void f() {
        if (this.f2559b != 0 && ((dg) this.f2559b).f2611b != null) {
            ((dg) this.f2559b).f2611b.b((com.google.android.finsky.api.model.x) this);
        }
        this.v = true;
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        if (W_()) {
            a();
            this.d.a((bd) this, true);
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        List<dk> list;
        ReviewsSamplesModuleLayout reviewsSamplesModuleLayout = (ReviewsSamplesModuleLayout) view;
        if (!reviewsSamplesModuleLayout.a() || this.u) {
            reviewsSamplesModuleLayout.setReviewFeedbackListener(this);
            if (ReviewsActivity.o()) {
                ArrayList arrayList = new ArrayList(((dg) this.f2559b).c.size());
                for (int i = 0; i < ((dg) this.f2559b).c.size(); i++) {
                    dk dkVar = ((dg) this.f2559b).c.get(i);
                    if (!dkVar.c) {
                        arrayList.add(dkVar);
                    }
                }
                list = arrayList;
            } else {
                list = ((dg) this.f2559b).c;
            }
            boolean z = !ic.b(reviewsSamplesModuleLayout.getContext());
            Document document = ((dg) this.f2559b).f2610a;
            Document document2 = ((dg) this.f2559b).f2610a;
            reviewsSamplesModuleLayout.a(list, document, (document2.f1963a == null || document2.f1963a.X == null || document2.f1963a.X.length <= 0) ? false : true, z, this.i, this.s, this);
            this.u = false;
        }
    }

    @Override // com.google.android.finsky.detailspage.dl
    public final void a(ny nyVar) {
        android.support.v4.app.ad adVar = this.j.B;
        if (adVar.a("rate_review_dialog") == null) {
            FinskyApp.a().h().a(1211, (byte[]) null, this);
            fb a2 = fb.a(((dg) this.f2559b).f2610a.f1963a.f3890a, nyVar);
            a2.a(this.j, 0);
            a2.a(adVar, "rate_review_dialog");
        }
    }

    @Override // com.google.android.finsky.detailspage.bd, com.google.android.finsky.activities.fe
    public final void a(String str, String str2, ff ffVar) {
        int i;
        com.google.android.finsky.api.model.k kVar = new com.google.android.finsky.api.model.k(FinskyApp.a().b((String) null), str, str2, ffVar.d);
        boolean o = ReviewsActivity.o();
        if (o) {
            if (ffVar == ff.SPAM) {
                Snackbar.a(this.j.R).a(new dc(this, str, str2, ffVar)).a();
            } else {
                Toast.makeText(this.c, R.string.review_feedback_posted, 0).show();
            }
            if (this.f2603a.c(str, str2, ffVar)) {
                b(str, str2, ffVar);
                return;
            }
            this.f2603a.a(str, str2, ffVar);
        }
        kVar.a(new dd(this, o, ffVar));
        if (o) {
            a(ffVar == ff.SPAM);
        } else {
            kVar.a(new de(this));
        }
        switch (ffVar) {
            case HELPFUL:
                i = 1212;
                break;
            case NOT_HELPFUL:
                i = 1213;
                break;
            case SPAM:
                i = 1214;
                break;
            default:
                FinskyLog.e("Unknown review rating selected in reviews samples section: %d", ffVar.toString());
                return;
        }
        FinskyApp.a().h().a(i, (byte[]) null, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, ff ffVar) {
        this.f2603a.b(str, str2, ffVar);
        a(ffVar == ff.SPAM);
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i == 45 && i2 == -1 && W_()) {
            a(false);
        }
    }

    private void a(boolean z) {
        a();
        this.u = true;
        this.d.a(this, z);
    }

    private void a() {
        if (((dg) this.f2559b).c == null) {
            dg dgVar = (dg) this.f2559b;
            ArrayList arrayList = new ArrayList();
            com.google.android.finsky.api.model.l lVar = ((dg) this.f2559b).f2611b;
            String str = ((dg) this.f2559b).f2610a.f1963a.f3890a;
            int p = lVar.p();
            for (int i = 0; i < p; i++) {
                ny c = lVar.c(i);
                arrayList.add(new dk(c, b(str, c), a(str, c)));
            }
            dgVar.c = arrayList;
            return;
        }
        String str2 = ((dg) this.f2559b).f2610a.f1963a.f3890a;
        for (dk dkVar : ((dg) this.f2559b).c) {
            dkVar.f2619b = b(str2, dkVar.f2618a);
            dkVar.c = a(str2, dkVar.f2618a);
        }
    }

    private boolean a(String str, ny nyVar) {
        return this.f2603a.c(str, nyVar.f4191a, ff.SPAM);
    }

    private boolean b(String str, ny nyVar) {
        return this.f2603a.c(str, nyVar.f4191a, ff.HELPFUL);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.w;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.s;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }
}
