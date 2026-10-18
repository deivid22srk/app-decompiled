package com.google.android.finsky.layout.play;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.pt;
import com.google.android.play.utils.PlayCommonLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FinskyDrawerLayout extends com.google.android.play.drawer.r implements cy, com.google.android.play.drawer.u {
    private DfeToc A;
    private final Runnable B;
    private final Handler C;
    public MainActivity n;
    public com.google.android.finsky.navigationmanager.b o;
    private final com.google.android.finsky.a.ai w;
    private final AccountManager x;
    private final OnAccountsUpdateListener y;
    private int z;

    public FinskyDrawerLayout(Context context) {
        this(context, null);
    }

    public FinskyDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = com.google.android.finsky.a.i.a(5302);
        this.x = AccountManager.get(context);
        this.y = new b(this, context);
        this.z = 0;
        this.B = new l(this);
        this.C = new Handler(Looper.myLooper());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.widget.DrawerLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x.addOnAccountsUpdatedListener(this.y, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.widget.DrawerLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.x.removeOnAccountsUpdatedListener(this.y);
        this.C.removeCallbacks(this.B);
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.play.drawer.r, android.support.v4.widget.v
    public final void b_(View view) {
        super.b_(view);
        this.n.x();
    }

    @Override // com.google.android.play.drawer.r, android.support.v4.widget.v
    public final void c_(View view) {
        super.c_(view);
        com.google.android.finsky.layout.actionbar.e o = this.n.o();
        if (o.c != null && o.c.j()) {
            FinskySearchToolbar finskySearchToolbar = o.c;
            if (finskySearchToolbar.o != null) {
                finskySearchToolbar.o.setVisibility(8);
            }
            com.google.android.finsky.c.o<Integer> b2 = com.google.android.finsky.utils.bg.aV.b(com.google.android.finsky.utils.av.e());
            if (b2.a().intValue() == 0) {
                b2.a((com.google.android.finsky.c.o<Integer>) 1);
            }
        }
        if (com.google.android.finsky.utils.av.c()) {
            FinskyApp.a().h().b(299, null, new ad(127, this));
        } else {
            FinskyApp.a().h().b(127, null, this);
        }
        this.n.w();
    }

    @Override // com.google.android.play.drawer.u
    public final boolean a(boolean z, gx gxVar) {
        if (!z) {
            return false;
        }
        if (gxVar == null) {
            if (!this.A.f1961a.D) {
                return false;
            }
            com.google.android.finsky.utils.bm.a(this.o.f3539b, getContext());
            return false;
        }
        if (TextUtils.isEmpty(gxVar.D)) {
            return false;
        }
        this.o.a(gxVar.D);
        FinskyApp.a().h().a(123, (byte[]) null, this.o.s());
        return true;
    }

    @Override // com.google.android.play.drawer.u
    public final boolean a(com.google.android.play.drawer.w wVar) {
        if (!wVar.d) {
            wVar.f.run();
            return true;
        }
        return true;
    }

    @Override // com.google.android.play.drawer.u
    public final boolean a(com.google.android.play.drawer.x xVar) {
        xVar.f6879b.run();
        return true;
    }

    @Override // com.google.android.play.drawer.u
    public final boolean a(String str) {
        View findViewById = this.n.findViewById(R.id.survey_prompt);
        if (findViewById != null) {
            ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        }
        this.n.a(str);
        return true;
    }

    @Override // com.google.android.play.drawer.u
    public final void a(boolean z) {
        d(z ? 284 : 283);
    }

    public final void e() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        this.A = FinskyApp.a().g;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.A != null) {
            Context context = getContext();
            int q = this.o.q();
            if (this.A != null) {
                boolean z4 = this.A.b().size() == 1;
                if (i()) {
                    boolean z5 = q == 1 || (z4 && q == 2);
                    i = R.color.play_icon_default;
                    i2 = R.raw.ic_drawer_home;
                    i3 = R.color.play_icon_selected;
                    i4 = R.string.menu_home;
                    z2 = z5;
                } else {
                    boolean z6 = q == 1 && this.z == 3;
                    i = R.color.play_apps_secondary;
                    i2 = R.raw.ic_apps_24px;
                    i3 = R.color.play_apps_secondary;
                    i4 = R.string.menu_home_v2;
                    z2 = z6;
                }
                arrayList.add(new com.google.android.play.drawer.w(context.getString(i4), new v(i2, i, i3), R.color.play_icon_selected, z2, new i(this)));
                if (this.z == 3) {
                    arrayList.add(c(3));
                }
                com.google.android.finsky.navigationmanager.b bVar = this.o;
                if (bVar.c != null && !bVar.c.isEmpty()) {
                    String str = bVar.c.peek().c;
                }
                if (!TextUtils.isEmpty(this.A.f1961a.n)) {
                    arrayList.add(new com.google.android.play.drawer.w(context.getString(R.string.entertainment_menu), new u(13), com.google.android.finsky.utils.ai.b(13), q == 1 && this.z == 13, new o(this)));
                }
                arrayList.add(new com.google.android.play.drawer.w());
                ArrayList arrayList3 = new ArrayList();
                List<pt> b2 = this.A.b();
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i6 < b2.size()) {
                        pt ptVar = b2.get(i6);
                        switch (ptVar.f4268a) {
                            case 1:
                            case 2:
                            case 4:
                            case 6:
                                z3 = true;
                                break;
                            case 3:
                            case 5:
                            default:
                                z3 = false;
                                break;
                        }
                        if (z3) {
                            arrayList3.add(new com.google.android.play.drawer.w(ptVar.c, new u(ptVar.f4268a), com.google.android.finsky.utils.ai.b(ptVar.f4268a), this.z == ptVar.f4268a && (q == 1 || q == 2), new p(this, ptVar)));
                            if (this.z == ptVar.f4268a) {
                                arrayList3.add(c(ptVar.f4268a));
                            }
                        }
                        i5 = i6 + 1;
                    } else {
                        if (!arrayList3.isEmpty()) {
                            arrayList.addAll(arrayList3);
                            arrayList.add(new com.google.android.play.drawer.w());
                        }
                        boolean c = com.google.android.finsky.utils.av.c();
                        arrayList.add(new com.google.android.play.drawer.w(context.getString(R.string.side_drawer_my_account), new v(R.raw.ic_account_box_24px, R.color.play_icon_default, R.color.play_icon_selected), null, R.color.play_icon_selected, q == 13, false, c, new q(this, c, this)));
                        arrayList.add(new com.google.android.play.drawer.w(context.getString(R.string.redeem_gift_card_menu), new v(R.raw.ic_redeem_24px, R.color.play_icon_default, R.color.play_icon_selected), R.color.play_icon_selected, false, new r(this)));
                        if (FinskyApp.a().e().a(12605131L)) {
                            arrayList.add(new com.google.android.play.drawer.w(context.getString(R.string.send_gift), new v(R.raw.ic_card_giftcard_24px, R.color.play_icon_default, R.color.play_icon_selected), R.color.play_icon_selected, q == 20, new s(this)));
                        }
                        arrayList.add(new com.google.android.play.drawer.w(context.getString(R.string.menu_wishlist), new v(R.raw.ic_wishlist_24px, R.color.play_icon_default, R.color.play_icon_selected), R.color.play_icon_selected, q == 10, new t(this)));
                        if (!TextUtils.isEmpty(this.A.f1961a.z)) {
                            arrayList.add(new com.google.android.play.drawer.w(context.getString(R.string.side_drawer_social_home), new v(R.raw.ic_people_24px, R.color.play_icon_default, R.color.play_icon_selected), R.color.play_icon_selected, q == 12, new c(this)));
                        }
                    }
                }
            }
            arrayList.add(new com.google.android.play.drawer.w(context.getString(R.string.settings), new v(R.raw.ic_settings_24px, R.color.play_icon_default, R.color.play_icon_selected), R.color.play_icon_selected, false, new d(this)));
            a(arrayList2);
        } else {
            Context context2 = getContext();
            arrayList2.add(new com.google.android.play.drawer.x(context2.getString(R.string.redeem_gift_card_menu), new k(this)));
            arrayList2.add(new com.google.android.play.drawer.x(context2.getString(R.string.settings), new m(this)));
            a(arrayList2);
        }
        String j = FinskyApp.a().j();
        Account[] a2 = com.google.android.finsky.api.a.a(getContext());
        super.f();
        com.google.android.play.drawer.a aVar = ((com.google.android.play.drawer.r) this).s;
        int length = a2.length;
        if (length == 0) {
            aVar.f = null;
            aVar.g = new Account[0];
        } else {
            aVar.g = new Account[length - 1];
            int length2 = a2.length;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 < length2) {
                    Account account = a2[i7];
                    if (j.equals(account.name)) {
                        aVar.f = account;
                    } else if (i8 == length - 1) {
                        PlayCommonLog.d("current account not found in accounts", new Object[0]);
                        aVar.f = account;
                    } else {
                        aVar.g[i8] = account;
                        i8++;
                    }
                    i7++;
                }
            }
        }
        aVar.e = length > 0;
        aVar.f6850a.clear();
        aVar.f6851b.clear();
        aVar.f6850a.addAll(arrayList);
        aVar.f6851b.addAll(arrayList2);
        aVar.c = null;
        aVar.d = false;
        if (aVar.d) {
            com.google.android.play.drawer.v vVar = null;
            z = vVar.e;
        } else {
            z = false;
        }
        aVar.i = z;
        aVar.notifyDataSetChanged();
        ((com.google.android.play.drawer.r) this).q.setVisibility(8);
        ((com.google.android.play.drawer.r) this).q.setOnClickListener(null);
        this.n.y();
    }

    private void a(List<com.google.android.play.drawer.x> list) {
        Context context = getContext();
        list.add(new com.google.android.play.drawer.x(context.getString(R.string.help_and_feedback), new e(this)));
        if (FinskyApp.a().e().a(12602795L)) {
            list.add(new com.google.android.play.drawer.x(context.getString(R.string.parent_guide), new f(this)));
        }
        String b2 = com.google.android.finsky.c.d.l.b();
        if (!TextUtils.isEmpty(b2)) {
            String b3 = com.google.android.finsky.c.d.k.b();
            if (TextUtils.isEmpty(b3)) {
                b3 = getContext().getString(R.string.legal_notice_title);
            }
            list.add(new com.google.android.play.drawer.x(b3, new g(this, b2)));
        }
        if (com.google.android.finsky.c.d.f.b().booleanValue()) {
            list.add(new com.google.android.play.drawer.x(context.getString(R.string.menu_debug_settings), new h(this, context)));
        }
    }

    public final void b(int i) {
        if (this.z != i) {
            this.z = i;
            this.C.post(this.B);
        }
    }

    private boolean i() {
        return this.A != null && this.A.f1961a.J == 1;
    }

    private com.google.android.play.drawer.w c(int i) {
        int i2;
        Context context = getContext();
        String d = com.google.android.finsky.utils.ai.d(i);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        boolean z = i == 3 && this.o.q() == 3;
        boolean z2 = i != 3;
        j jVar = new j(this, i, context);
        switch (i) {
            case 1:
                i2 = R.raw.ic_library_books_24px;
                break;
            case 2:
                i2 = R.raw.ic_library_music_24px;
                break;
            case 3:
                i2 = R.raw.ic_library_apps_24px;
                break;
            case 4:
                i2 = R.raw.ic_library_movies_24px;
                break;
            case 5:
            default:
                i2 = -1;
                break;
            case 6:
                i2 = R.raw.ic_library_newsstand_24px;
                break;
        }
        return new com.google.android.play.drawer.w(d, new v(i2, R.color.play_icon_default, com.google.android.finsky.utils.ai.b(i)), z2 ? new v(R.raw.ic_exit_to_app_24px, R.color.play_icon_default, R.color.play_icon_selected) : null, com.google.android.finsky.utils.ai.b(i), z, i() ? false : true, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        FinskyApp.a().h().a(i, (byte[]) null, this.o.s());
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.w;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return this.o.s();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }

    static /* synthetic */ void b(FinskyDrawerLayout finskyDrawerLayout, int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = 136;
                break;
            case 2:
                i2 = 134;
                break;
            case 3:
            case 5:
            default:
                i2 = 132;
                break;
            case 4:
                i2 = 135;
                break;
            case 6:
                i2 = 137;
                break;
        }
        finskyDrawerLayout.d(i2);
    }
}
