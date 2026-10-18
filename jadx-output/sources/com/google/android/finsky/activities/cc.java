package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.DetailsSummaryDynamic;
import com.google.android.finsky.layout.DocImageView;
import com.google.android.finsky.layout.WishlistPlayActionButton;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.js;
import com.google.android.play.layout.PlayActionButton;
import com.google.android.play.layout.PlayCardThumbnail;

/* loaded from: classes.dex */
public class cc {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.play.image.e f1646a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f1647b;
    protected com.google.android.finsky.navigationmanager.b c;
    protected com.google.android.finsky.e.q d;
    protected Context e;
    protected final Account f;
    protected Document g;
    protected boolean h;
    protected DetailsSummaryDynamic i;
    protected ViewGroup j;
    protected boolean k;
    boolean l;
    protected String m;
    protected DfeToc n;
    protected com.google.android.finsky.api.b o;
    protected boolean p;
    boolean q;
    protected final com.google.android.finsky.a.i r;
    protected com.google.android.finsky.layout.play.cy s;
    private View[] t;
    private String u;
    private boolean v;

    public cc(DfeToc dfeToc, Account account) {
        this.f = account;
        this.n = dfeToc;
        this.o = FinskyApp.a().b(account.name);
        this.r = FinskyApp.a().c(account);
    }

    public void a(Context context, com.google.android.finsky.navigationmanager.b bVar, com.google.android.play.image.e eVar, com.google.android.finsky.e.q qVar, boolean z, String str, String str2, boolean z2, com.google.android.finsky.layout.play.cy cyVar) {
        this.e = context;
        this.c = bVar;
        this.f1646a = eVar;
        this.d = qVar;
        this.m = str;
        this.u = str2;
        this.v = z2;
        this.s = cyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x0561  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.google.android.finsky.api.model.Document r16, boolean r17, android.view.View... r18) {
        /*
            Method dump skipped, instructions count: 1676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.cc.a(com.google.android.finsky.api.model.Document, boolean, android.view.View[]):void");
    }

    public void a() {
        this.f1647b = true;
        if (this.j != null) {
            int childCount = this.j.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.j.getChildAt(i);
                if (childAt instanceof PlayActionButton) {
                    ((PlayActionButton) childAt).a();
                }
            }
        }
    }

    protected final View b(int i) {
        View findViewById;
        if (this.t == null) {
            return null;
        }
        for (View view : this.t) {
            if (view != null && (findViewById = view.findViewById(i)) != null) {
                return findViewById;
            }
        }
        return null;
    }

    public final void e() {
        if (!this.f1647b) {
            a(this.g, this.p, this.t);
        }
    }

    public static boolean c(int i) {
        return i == 6 || i == 16 || i == 17 || i == 44;
    }

    public final void a(Bitmap bitmap) {
        PlayCardThumbnail playCardThumbnail = (PlayCardThumbnail) b(R.id.title_thumbnail_frame);
        if (playCardThumbnail != null) {
            ((DocImageView) playCardThumbnail.getImageView()).setImageBitmap(bitmap);
        }
    }

    public final void f() {
        PlayCardThumbnail playCardThumbnail = (PlayCardThumbnail) b(R.id.title_thumbnail_frame);
        if (playCardThumbnail != null) {
            ((DocImageView) playCardThumbnail.getImageView()).a(this.g, this.f1646a, com.google.android.finsky.utils.ex.f);
        }
        this.v = false;
    }

    private static void c(LayoutInflater layoutInflater, ViewGroup viewGroup, CharSequence charSequence) {
        TextView textView = (TextView) layoutInflater.inflate(R.layout.details_summary_byline_label, viewGroup, false);
        textView.setText(charSequence);
        viewGroup.addView(textView);
    }

    protected final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, CharSequence charSequence) {
        TextView textView = (TextView) layoutInflater.inflate(R.layout.details_summary_extra_label, viewGroup, false);
        textView.setText(charSequence);
        textView.setTextColor(com.google.android.finsky.utils.ai.a(this.e, this.g.f1963a.g));
        viewGroup.addView(textView);
    }

    protected static void b(LayoutInflater layoutInflater, ViewGroup viewGroup, CharSequence charSequence) {
        TextView textView = (TextView) layoutInflater.inflate(R.layout.details_summary_extra_label_bottom, viewGroup, false);
        textView.setText(charSequence);
        viewGroup.addView(textView);
    }

    protected boolean d() {
        return com.google.android.finsky.utils.cy.a(this.g, FinskyApp.a().p, this.f) == null;
    }

    protected final String b(boolean z) {
        if (z) {
            return this.e.getString(R.string.install);
        }
        boolean S = this.g.S();
        if (!S) {
            if (this.g.f1963a.g == 3) {
                return this.e.getString(R.string.install);
            }
            if (this.g.f1963a.g == 1) {
                return this.e.getString(R.string.open);
            }
        }
        boolean a2 = FinskyApp.a().e().a(12602328L);
        com.google.android.finsky.protos.ea d = this.g.d(1);
        if (d != null && d.i) {
            String str = d.h;
            return (a2 && S) ? this.e.getString(R.string.buy, str) : str;
        }
        return "";
    }

    protected final int c(boolean z) {
        if (z) {
            return 221;
        }
        if (!this.g.S()) {
            if (this.g.f1963a.g == 3) {
                return 221;
            }
            if (this.g.f1963a.g == 1) {
                return 225;
            }
        }
        return 200;
    }

    protected void a(boolean z) {
        PlayActionButton playActionButton = (PlayActionButton) b(R.id.try_button);
        PlayActionButton playActionButton2 = (PlayActionButton) b(R.id.buy_button);
        PlayActionButton playActionButton3 = (PlayActionButton) b(R.id.buy_button2);
        PlayActionButton playActionButton4 = (PlayActionButton) b(R.id.launch_button);
        PlayActionButton playActionButton5 = (PlayActionButton) b(R.id.download_button);
        WishlistPlayActionButton wishlistPlayActionButton = (WishlistPlayActionButton) b(R.id.wishlist_action_button);
        playActionButton4.setVisibility(8);
        if (playActionButton != null) {
            playActionButton.setVisibility(8);
        }
        playActionButton2.setVisibility(8);
        if (playActionButton3 != null) {
            playActionButton3.setVisibility(8);
        }
        if (playActionButton5 != null) {
            playActionButton5.setVisibility(8);
        }
        if (wishlistPlayActionButton != null) {
            wishlistPlayActionButton.setVisibility(8);
        }
        if (!this.k && !z && a(playActionButton4, playActionButton2, playActionButton3, playActionButton, playActionButton5, wishlistPlayActionButton)) {
            g();
        }
    }

    protected void c() {
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < this.j.getChildCount(); i2++) {
            PlayActionButton playActionButton = (PlayActionButton) this.j.getChildAt(i2);
            if (playActionButton.getVisibility() == 0 && playActionButton.getPriority() < i) {
                i = playActionButton.getPriority();
            }
        }
        for (int i3 = 0; i3 < this.j.getChildCount(); i3++) {
            PlayActionButton playActionButton2 = (PlayActionButton) this.j.getChildAt(i3);
            if (playActionButton2.getVisibility() == 0) {
                if (playActionButton2.getPriority() == i) {
                    playActionButton2.setActionStyle(0);
                } else {
                    playActionButton2.setActionStyle(2);
                }
            }
        }
    }

    protected boolean a(PlayActionButton playActionButton, PlayActionButton playActionButton2, PlayActionButton playActionButton3, PlayActionButton playActionButton4, PlayActionButton playActionButton5, WishlistPlayActionButton wishlistPlayActionButton) {
        boolean z;
        int c;
        String str;
        int i;
        com.google.android.finsky.g.h hVar = FinskyApp.a().p;
        com.google.android.finsky.g.a a2 = hVar.a(this.f);
        Account a3 = com.google.android.finsky.utils.cy.a(this.g, hVar, this.f);
        if (a3 != null) {
            if (com.google.android.finsky.utils.cy.c(this.g, a2)) {
                Document document = this.g;
                playActionButton.setVisibility(0);
                playActionButton.setEnabled(!this.q);
                playActionButton.a(document.f1963a.g, R.string.cancel_preorder, b(document, a3));
            } else {
                Document document2 = this.g;
                playActionButton.setVisibility(0);
                playActionButton.setEnabled(true);
                int i2 = document2.f1963a.g;
                switch (document2.f1963a.g) {
                    case 1:
                    case 6:
                        i = R.string.read;
                        break;
                    case 2:
                        i = R.string.listen;
                        break;
                    case 3:
                    case 5:
                    default:
                        i = R.string.open;
                        break;
                    case 4:
                        i = R.string.play;
                        break;
                }
                playActionButton.a(i2, i, this.c.a(document2, a3, this.d));
            }
            return true;
        }
        if (!com.google.android.finsky.utils.cy.a(this.g, this.n, a2)) {
            return false;
        }
        Account account = this.f;
        com.google.android.finsky.protos.ea d = this.g.d(1);
        if (d != null) {
            playActionButton2.setVisibility(0);
            if (this.g.O()) {
                c = 234;
                str = this.e.getString(R.string.preorder, d.h);
            } else {
                String b2 = b(false);
                c = c(false);
                str = b2;
            }
            playActionButton2.a(this.g.f1963a.g, str, this.c.a(account, this.g, d.A, null, this.m, c, null));
        }
        com.google.android.finsky.protos.ea[] eaVarArr = this.g.f1963a.u;
        int length = eaVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                if (eaVarArr[i3].A != 2) {
                    i3++;
                } else {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z && playActionButton4 != null) {
            playActionButton4.setVisibility(0);
            if (com.google.android.finsky.utils.cy.a(this.g, a2, 2)) {
                playActionButton4.a(this.g.f1963a.g, R.string.sample, this.c.a(this.g, this.f, this.d));
            } else {
                playActionButton4.a(this.g.f1963a.g, R.string.sample, this.c.a(this.f, this.g, 2, null, this.m, 222, null));
            }
        }
        return true;
    }

    protected final boolean b(PlayActionButton playActionButton, PlayActionButton playActionButton2, PlayActionButton playActionButton3, PlayActionButton playActionButton4, PlayActionButton playActionButton5, WishlistPlayActionButton wishlistPlayActionButton) {
        com.google.android.finsky.g.h hVar = FinskyApp.a().p;
        com.google.android.finsky.utils.gq gqVar = new com.google.android.finsky.utils.gq();
        com.google.android.finsky.utils.gl.a(this.f, null, hVar, null, this.n, 3, this.g, gqVar);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i >= gqVar.d) {
                break;
            }
            if (i2 >= 2) {
                FinskyLog.c("Not supposed to have more than %d actions available", 2);
                break;
            }
            com.google.android.finsky.utils.gp a2 = gqVar.a(i);
            if (a2.f4913a == 6 || a2.f4913a == 9) {
                a(playActionButton, a2, gqVar.f4916b);
            } else if (a2.f4913a == 11 || a2.f4913a == 10) {
                a(playActionButton4, a2, gqVar.f4916b);
            } else if (a2.f4913a == 12) {
                a(playActionButton5, a2, gqVar.f4916b);
            } else {
                if (i3 == 0) {
                    a(playActionButton2, a2, gqVar.f4916b);
                } else {
                    a(playActionButton3, a2, gqVar.f4916b);
                }
                i3++;
            }
            i2++;
            i++;
        }
        if (gqVar.b() || !this.g.f1963a.aa) {
            return gqVar.b();
        }
        Document document = this.g;
        com.google.android.finsky.navigationmanager.b bVar = this.c;
        if (js.a(document, FinskyApp.a().b((String) null))) {
            wishlistPlayActionButton.setVisibility(8);
        } else {
            wishlistPlayActionButton.f3102a = document;
            wishlistPlayActionButton.setVisibility(0);
            Account i4 = FinskyApp.a().i();
            wishlistPlayActionButton.a(js.a(document, i4), document.f1963a.g);
            wishlistPlayActionButton.c = new com.google.android.finsky.layout.er(wishlistPlayActionButton, document, i4, bVar);
            wishlistPlayActionButton.f3103b = true;
        }
        return true;
    }

    private void a(PlayActionButton playActionButton, com.google.android.finsky.utils.gp gpVar, int i) {
        View.OnClickListener onClickListener = null;
        playActionButton.setVisibility(0);
        com.google.android.finsky.utils.gr grVar = new com.google.android.finsky.utils.gr();
        if (this.e.getResources().getBoolean(R.bool.use_wide_layout)) {
            com.google.android.finsky.utils.gl.a(gpVar, i, grVar);
        } else {
            com.google.android.finsky.utils.gl.a(gpVar, i, false, true, grVar);
        }
        if (com.google.android.finsky.utils.gl.a(gpVar)) {
            onClickListener = com.google.android.finsky.utils.gl.a(gpVar, i, this.c, this.m, (com.google.android.finsky.layout.play.cy) null, this.e);
        } else if (gpVar.f4913a == 9) {
            onClickListener = b(gpVar.h, gpVar.i);
        } else if (gpVar.f4913a == 12) {
            onClickListener = a(gpVar.h, gpVar.i);
        } else if (gpVar.f4913a == 16) {
            onClickListener = a(gpVar.h);
        } else {
            FinskyLog.e("Can't create a click listener for action %d", Integer.valueOf(gpVar.f4913a));
        }
        playActionButton.a(i, grVar.a(this.e), onClickListener);
    }

    private View.OnClickListener b(Document document, Account account) {
        return new ce(this, document, account);
    }

    protected View.OnClickListener a(Document document, Account account) {
        return null;
    }

    protected View.OnClickListener a(Document document) {
        return null;
    }

    protected void b() {
        d(com.google.android.finsky.utils.cy.a(this.g, this.n, FinskyApp.a().p.a(this.f)));
        this.j.setVisibility(4);
        if (!this.k) {
            if (this.h) {
                a(R.string.refunding);
            } else {
                a(false);
            }
        }
    }

    protected final void g() {
        ik.a(this.j, 4);
    }

    protected void a(int i) {
        TextView textView = (TextView) this.i.findViewById(R.id.summary_dynamic_status);
        this.j.setVisibility(8);
        textView.setVisibility(0);
        textView.setText(this.e.getResources().getString(i));
    }

    public final void d(boolean z) {
        this.k = !z;
    }

    public void a(int i, Bundle bundle) {
        if (i == 7) {
            Document document = (Document) bundle.getParcelable("DetailsSummaryViewBinder.doc");
            com.google.android.finsky.api.b b2 = FinskyApp.a().b(bundle.getString("DetailsSummaryViewBinder.ownerAccountName"));
            com.google.android.finsky.g.au auVar = new com.google.android.finsky.g.au(FinskyApp.a().q, b2.b(), new cf(this));
            cg cgVar = new cg(this);
            this.q = true;
            e();
            b2.f(document.f1963a.f3890a, auVar, cgVar);
        }
    }
}
