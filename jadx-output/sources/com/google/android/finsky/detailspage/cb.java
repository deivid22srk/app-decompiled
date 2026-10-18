package com.google.android.finsky.detailspage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.Toast;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.RateReviewActivity;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.MyReviewReplyLayout;
import com.google.android.finsky.layout.RateReviewEditor;
import com.google.android.finsky.layout.RateReviewEditor2;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.ny;
import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
public class cb extends bd<ci> implements View.OnFocusChangeListener, cl, cr, com.google.android.finsky.g.o, com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2572a;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private com.google.android.finsky.utils.ac y = FinskyApp.a().a(FinskyApp.a().j());
    private com.google.android.finsky.a.ai z = com.google.android.finsky.a.i.a(1200);

    static /* synthetic */ boolean e(cb cbVar) {
        cbVar.x = true;
        return true;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return RateReviewEditor.a() ? R.layout.rate_review_v2_module : R.layout.rate_review_module;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2559b != 0 && ((ci) this.f2559b).f2581a && ((ci) this.f2559b).f;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(bf bfVar) {
        boolean z;
        super.a(bfVar);
        if (this.f2559b != 0) {
            this.m.a(this);
            if (!((ci) this.f2559b).f && ((ci) this.f2559b).f2581a) {
                i();
                return;
            }
            ny a2 = this.y.a(((ci) this.f2559b).c.f1963a.f3890a, ((ci) this.f2559b).e);
            ny nyVar = ((ci) this.f2559b).e;
            if (nyVar == a2) {
                z = true;
            } else {
                z = (nyVar == null || a2 == null || nyVar.q != a2.q) ? false : true;
            }
            if (!z) {
                this.u = true;
                ((ci) this.f2559b).i = false;
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void b(View view) {
        super.b(view);
        if ((view instanceof RateReviewModuleV2Layout) && this.f2559b != 0) {
            if (((ci) this.f2559b).i) {
                ((ci) this.f2559b).j = new SparseArray<>();
                view.saveHierarchyState(((ci) this.f2559b).j);
                return;
            }
            ((ci) this.f2559b).j = null;
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        ny nyVar;
        if (z && this.f2559b == 0) {
            this.f2559b = new ci();
            ((ci) this.f2559b).c = document2;
            ((ci) this.f2559b).f2582b = hVar.f1976a == null ? true : hVar.f1976a.i;
            ((ci) this.f2559b).f2581a = com.google.android.finsky.utils.as.a(this.m, ((ci) this.f2559b).c) && ((ci) this.f2559b).f2582b;
            ci ciVar = (ci) this.f2559b;
            if (hVar2.f1976a == null || hVar2.f1976a.c == null) {
                nyVar = null;
            } else {
                nyVar = hVar2.f1976a.c;
            }
            ciVar.d = nyVar;
            ((ci) this.f2559b).h = this.e.f1961a.D;
            ((ci) this.f2559b).e = this.y.a(document2.f1963a.f3890a, ((ci) this.f2559b).d);
            this.m.a(this);
            if (((ci) this.f2559b).f2581a) {
                i();
            }
        }
    }

    private void i() {
        FinskyApp.a().a((Account) null).a(new cc(this), new cd(this), true);
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        int i;
        String a2;
        boolean z = ((ci) this.f2559b).h && !com.google.android.finsky.utils.bm.a();
        if (view instanceof RateReviewModuleLayout) {
            RateReviewModuleLayout rateReviewModuleLayout = (RateReviewModuleLayout) view;
            if (!rateReviewModuleLayout.f2503b || this.f2572a) {
                ny nyVar = ((ci) this.f2559b).e;
                Document document = ((ci) this.f2559b).c;
                gx gxVar = ((ci) this.f2559b).g;
                com.google.android.finsky.navigationmanager.b bVar = this.i;
                rateReviewModuleLayout.f2502a = this;
                rateReviewModuleLayout.f.setVerticalPadding(R.dimen.details_review_section_rating_vpadding);
                rateReviewModuleLayout.f.a(0, document.f1963a.g, new cj(rateReviewModuleLayout));
                rateReviewModuleLayout.g.setActionClickListener(new ck(rateReviewModuleLayout));
                Resources resources = rateReviewModuleLayout.getResources();
                if (nyVar != null) {
                    int i2 = nyVar.d;
                    rateReviewModuleLayout.g.a(document, nyVar, Integer.MAX_VALUE, bVar, true, false, false, false, this);
                    rateReviewModuleLayout.g.setVisibility(0);
                    rateReviewModuleLayout.h.setVisibility(8);
                    i = i2;
                } else {
                    rateReviewModuleLayout.g.setVisibility(8);
                    rateReviewModuleLayout.h.setVisibility(0);
                    i = 0;
                }
                if (i > 0) {
                    a2 = resources.getString(R.string.my_review);
                    rateReviewModuleLayout.setContentDescription(resources.getQuantityString(R.plurals.content_description_rated, i, Integer.valueOf(i)));
                } else {
                    a2 = com.google.android.finsky.utils.ai.a(resources, document.f1963a.e);
                    rateReviewModuleLayout.setContentDescription(resources.getString(R.string.content_description_rate_and_review));
                }
                if (rateReviewModuleLayout.h.getVisibility() != 8) {
                    rateReviewModuleLayout.f.setRating(i);
                    rateReviewModuleLayout.e.setText(jm.f(a2));
                }
                if (gxVar != null) {
                    rateReviewModuleLayout.d.setText(gxVar.i);
                    com.google.android.finsky.protos.ds a3 = com.google.android.play.utils.c.a(gxVar, 4);
                    rateReviewModuleLayout.c.a(a3.f, a3.l, FinskyApp.a().d);
                } else {
                    rateReviewModuleLayout.c.setVisibility(8);
                    rateReviewModuleLayout.d.setVisibility(8);
                }
                if (rateReviewModuleLayout.i != null) {
                    rateReviewModuleLayout.i.setVisibility(z ? 0 : 8);
                }
                rateReviewModuleLayout.f2503b = true;
                this.f2572a = false;
            }
        } else if (view instanceof RateReviewModuleV2Layout) {
            RateReviewModuleV2Layout rateReviewModuleV2Layout = (RateReviewModuleV2Layout) view;
            if (!rateReviewModuleV2Layout.f2505b || this.f2572a) {
                Document document2 = ((ci) this.f2559b).c;
                gx gxVar2 = ((ci) this.f2559b).g;
                com.google.android.finsky.navigationmanager.b bVar2 = this.i;
                rateReviewModuleV2Layout.c = this;
                rateReviewModuleV2Layout.f2504a = this;
                rateReviewModuleV2Layout.d = bVar2;
                rateReviewModuleV2Layout.e = document2;
                rateReviewModuleV2Layout.f = gxVar2;
                rateReviewModuleV2Layout.n.setCommentFocusChangeListener(this);
                if (((ci) this.f2559b).i) {
                    ny nyVar2 = ((ci) this.f2559b).e;
                    int i3 = ((ci) this.f2559b).e.d;
                    boolean z2 = ((ci) this.f2559b).d == null;
                    boolean z3 = !((ci) this.f2559b).h;
                    rateReviewModuleV2Layout.getResources();
                    rateReviewModuleV2Layout.j.setVisibility(8);
                    rateReviewModuleV2Layout.k.setVisibility(8);
                    rateReviewModuleV2Layout.h.setVisibility(8);
                    rateReviewModuleV2Layout.i.setVisibility(8);
                    rateReviewModuleV2Layout.q.setVisibility(8);
                    rateReviewModuleV2Layout.m.setVisibility(8);
                    rateReviewModuleV2Layout.g.setToFadeInAfterLoad(false);
                    rateReviewModuleV2Layout.a(true);
                    String str = nyVar2.i == null ? "" : nyVar2.i;
                    RateReviewEditor2 rateReviewEditor2 = rateReviewModuleV2Layout.n;
                    int i4 = z3 ? 1 : 2;
                    int i5 = rateReviewModuleV2Layout.e.f1963a.g;
                    gx gxVar3 = rateReviewModuleV2Layout.e.f1963a;
                    rateReviewEditor2.a(i4, i5, i3, nyVar2.i, z2);
                    rateReviewModuleV2Layout.n.setClickListener(new cn(rateReviewModuleV2Layout, str));
                    rateReviewModuleV2Layout.n.setVisibility(0);
                    rateReviewModuleV2Layout.n.setReviewChangeListener(new co(rateReviewModuleV2Layout));
                    rateReviewModuleV2Layout.a();
                    rateReviewModuleV2Layout.f2505b = true;
                    if (((ci) this.f2559b).j != null && !this.w) {
                        rateReviewModuleV2Layout.restoreHierarchyState(((ci) this.f2559b).j);
                    }
                    ((ci) this.f2559b).j = null;
                } else if (((ci) this.f2559b).e != null) {
                    ny nyVar3 = ((ci) this.f2559b).e;
                    Resources resources2 = rateReviewModuleV2Layout.getResources();
                    int i6 = nyVar3.d;
                    rateReviewModuleV2Layout.n.setVisibility(8);
                    rateReviewModuleV2Layout.j.setRating(i6);
                    rateReviewModuleV2Layout.i.setVisibility(8);
                    rateReviewModuleV2Layout.j.setVisibility(0);
                    rateReviewModuleV2Layout.m.setVisibility(8);
                    rateReviewModuleV2Layout.a(false);
                    String a4 = RateReviewEditor2.a(nyVar3.g, nyVar3.i);
                    if (TextUtils.isEmpty(a4)) {
                        rateReviewModuleV2Layout.k.setVisibility(8);
                    } else {
                        rateReviewModuleV2Layout.k.setText(com.google.android.finsky.utils.bc.a(a4));
                        rateReviewModuleV2Layout.k.setVisibility(0);
                    }
                    rateReviewModuleV2Layout.setContentDescription(resources2.getQuantityString(R.plurals.content_description_rated, i6, Integer.valueOf(i6)));
                    rateReviewModuleV2Layout.h.setText(jm.f(resources2.getString(R.string.my_rate_review, com.google.android.finsky.utils.aj.a(nyVar3.q))));
                    rateReviewModuleV2Layout.h.setVisibility(0);
                    rateReviewModuleV2Layout.q.setVisibility(0);
                    rateReviewModuleV2Layout.a();
                    if (nyVar3.v) {
                        if (rateReviewModuleV2Layout.o == null) {
                            rateReviewModuleV2Layout.o = (MyReviewReplyLayout) rateReviewModuleV2Layout.p.inflate();
                        }
                        MyReviewReplyLayout myReviewReplyLayout = rateReviewModuleV2Layout.o;
                        Document document3 = rateReviewModuleV2Layout.e;
                        if (!nyVar3.v) {
                            myReviewReplyLayout.setVisibility(8);
                        }
                        Context context = myReviewReplyLayout.getContext();
                        myReviewReplyLayout.f3037a.setText(document3.f1963a.m);
                        if (nyVar3.x) {
                            long j = nyVar3.w;
                            String a5 = com.google.android.finsky.utils.aj.a(j);
                            myReviewReplyLayout.f3038b.setVisibility(0);
                            if (!nyVar3.r || nyVar3.q <= j) {
                                myReviewReplyLayout.f3038b.setText(context.getString(R.string.review_reply_date, a5));
                            } else {
                                myReviewReplyLayout.f3038b.setText(context.getString(R.string.review_reply_after_edit_subtitle, a5));
                            }
                        } else {
                            myReviewReplyLayout.f3038b.setVisibility(8);
                        }
                        myReviewReplyLayout.c.setText(nyVar3.u);
                        myReviewReplyLayout.c.setVisibility(8);
                        myReviewReplyLayout.d.setTextColor(com.google.android.play.utils.h.a(context, document3.f1963a.g));
                        myReviewReplyLayout.d.setOnClickListener(new com.google.android.finsky.layout.cn(myReviewReplyLayout));
                        myReviewReplyLayout.d.setVisibility(0);
                        myReviewReplyLayout.setVisibility(0);
                    } else if (rateReviewModuleV2Layout.o != null) {
                        rateReviewModuleV2Layout.o.setVisibility(8);
                    }
                    rateReviewModuleV2Layout.f2505b = true;
                } else {
                    rateReviewModuleV2Layout.i.setVerticalPadding(R.dimen.details_review_section_rating_vpadding);
                    rateReviewModuleV2Layout.i.a(0, rateReviewModuleV2Layout.e.f1963a.g, new cm(rateReviewModuleV2Layout));
                    Resources resources3 = rateReviewModuleV2Layout.getResources();
                    rateReviewModuleV2Layout.n.setVisibility(8);
                    rateReviewModuleV2Layout.i.setVisibility(0);
                    rateReviewModuleV2Layout.h.setText("");
                    rateReviewModuleV2Layout.h.setVisibility(4);
                    rateReviewModuleV2Layout.j.setVisibility(8);
                    rateReviewModuleV2Layout.l.setVisibility(8);
                    rateReviewModuleV2Layout.k.setVisibility(8);
                    rateReviewModuleV2Layout.q.setVisibility(8);
                    rateReviewModuleV2Layout.setContentDescription(resources3.getString(R.string.content_description_rate_and_review));
                    rateReviewModuleV2Layout.a();
                    if (rateReviewModuleV2Layout.m != null) {
                        rateReviewModuleV2Layout.m.setVisibility(z ? 0 : 8);
                    }
                    rateReviewModuleV2Layout.f2505b = true;
                }
                this.f2572a = false;
            }
        }
        if (this.u) {
            this.u = false;
            new Handler().post(new ce(this));
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void f() {
        this.m.b(this);
        this.v = true;
    }

    @Override // com.google.android.finsky.detailspage.cl, com.google.android.finsky.detailspage.cr
    public final void a(int i) {
        FinskyApp.a().h().a(1201, (byte[]) null, this);
        String j = FinskyApp.a().j();
        if (((ci) this.f2559b).h) {
            if (!((ci) this.f2559b).i) {
                com.google.android.finsky.utils.gx.a(this.j.f(), new cf(this, i, ((ci) this.f2559b).e), false);
                return;
            }
            a(j, i, "", ((ci) this.f2559b).e.i, new Document(((ci) this.f2559b).g), 1201, false);
            return;
        }
        a(j, i, "", "", null, 1201, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Document document, ny nyVar, int i) {
        this.j.a(RateReviewActivity.a(FinskyApp.a().j(), ((ci) this.f2559b).c, document, nyVar, i, false, document == null, this.c), 43);
    }

    @Override // com.google.android.finsky.detailspage.cl, com.google.android.finsky.detailspage.cr
    public final void e() {
        if (((ci) this.f2559b).e != null) {
            FinskyApp.a().h().a(1202, (byte[]) null, this);
            if (RateReviewEditor.a()) {
                ((ci) this.f2559b).i = true;
                j();
            } else {
                a(((ci) this.f2559b).h ? new Document(((ci) this.f2559b).g) : null, ((ci) this.f2559b).e, ((ci) this.f2559b).e.d);
            }
        }
    }

    @Override // com.google.android.finsky.detailspage.cr
    public final void g() {
        FinskyApp.a().h().a(1209, (byte[]) null, this);
        if (((ci) this.f2559b).k) {
            Toast.makeText(this.c, R.string.review_delete_retry, 0).show();
        } else {
            a(FinskyApp.a().j());
        }
    }

    @Override // com.google.android.finsky.detailspage.cr
    public final void a(int i, String str) {
        if (this.x) {
            a(true);
            return;
        }
        FinskyApp.a().h().a(1204, (byte[]) null, this);
        ((ci) this.f2559b).i = false;
        if (((ci) this.f2559b).d == null || !TextUtils.equals(str, ((ci) this.f2559b).d.i)) {
            a(FinskyApp.a().j(), i, "", str, new Document(((ci) this.f2559b).g), 1200, false);
        }
        j();
    }

    protected final void a(boolean z) {
        if (z) {
            Toast.makeText(this.c, R.string.review_error, 0).show();
        }
        ((ci) this.f2559b).e = ((ci) this.f2559b).d;
        ((ci) this.f2559b).i = false;
        this.x = false;
        j();
    }

    @Override // com.google.android.finsky.detailspage.cr
    public final void h() {
        if (this.x) {
            a(true);
            return;
        }
        ((ci) this.f2559b).e = ((ci) this.f2559b).d;
        ((ci) this.f2559b).i = false;
        j();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        this.w = z;
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(int i, int i2, Intent intent) {
        if (i == 43) {
            String j = FinskyApp.a().j();
            switch (i2) {
                case 1:
                    a(j, intent.getIntExtra("rating", 0), intent.getStringExtra("review_title"), intent.getStringExtra("review_comment"), (Document) intent.getParcelableExtra("author"), 312, true);
                    break;
                case 2:
                    a(j);
                    break;
                case 3:
                    j();
                    break;
            }
        }
    }

    private void a(String str) {
        ((ci) this.f2559b).i = false;
        com.google.android.finsky.utils.gx.a(str, ((ci) this.f2559b).c.f1963a.f3890a, ((ci) this.f2559b).c.f1963a.D, this.c, new cg(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i, String str2, String str3, Document document, int i2, boolean z) {
        if (((ci) this.f2559b).h && !com.google.android.finsky.utils.bm.a()) {
            com.google.android.finsky.utils.bg.ad.b(FinskyApp.a().j()).a((com.google.android.finsky.c.o<Boolean>) true);
        }
        com.google.android.finsky.utils.gx.a(str, ((ci) this.f2559b).c.f1963a.f3890a, ((ci) this.f2559b).c.f1963a.D, i, str2, str3, document, this.c, new ch(this, z), i2);
    }

    @Override // com.google.android.finsky.g.o
    public final void M_() {
    }

    @Override // com.google.android.finsky.g.o
    public final void L_() {
        if (this.f2559b != 0 && !((ci) this.f2559b).f2581a) {
            ((ci) this.f2559b).f2581a = com.google.android.finsky.utils.as.a(this.m, ((ci) this.f2559b).c) && ((ci) this.f2559b).f2582b;
            if (((ci) this.f2559b).f2581a) {
                i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        k();
        if (!this.v) {
            this.f2572a = true;
            this.d.a((bd) this, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ((ci) this.f2559b).d = ((ci) this.f2559b).e;
        ((ci) this.f2559b).e = this.y.a(((ci) this.f2559b).c.f1963a.f3890a, ((ci) this.f2559b).d);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.z;
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
