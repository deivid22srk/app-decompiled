package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.by;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.gq;
import com.google.android.finsky.activities.gy;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.model.d;
import com.google.android.finsky.layout.BucketRow;
import com.google.android.finsky.layout.HeroGraphicView;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.PlayCardBannerWithContentClusterView;
import com.google.android.finsky.layout.play.PlayCardClusterView;
import com.google.android.finsky.layout.play.PlayCardClusterViewHeader;
import com.google.android.finsky.layout.play.PlayCardMerchClusterView;
import com.google.android.finsky.layout.play.PlayCardOrderedClusterView;
import com.google.android.finsky.layout.play.PlayCardViewPerson;
import com.google.android.finsky.layout.play.PlayRecyclerView;
import com.google.android.finsky.layout.play.PlayYoutubeCardContentView;
import com.google.android.finsky.layout.play.TopChartsClusterContentView;
import com.google.android.finsky.layout.play.WarmWelcomeCard;
import com.google.android.finsky.layout.play.WarmWelcomeV2Card;
import com.google.android.finsky.layout.play.bd;
import com.google.android.finsky.layout.play.be;
import com.google.android.finsky.layout.play.bf;
import com.google.android.finsky.layout.play.bg;
import com.google.android.finsky.layout.play.cx;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.bx;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.eu;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.nd;
import com.google.android.finsky.protos.ny;
import com.google.android.finsky.protos.po;
import com.google.android.finsky.protos.sw;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.fe;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.ip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CardRecyclerViewAdapter<T extends com.google.android.finsky.api.model.d<?>> extends ac<T> implements gy, com.google.android.finsky.layout.play.az {
    private final boolean A;
    private final int B;
    private final boolean C;
    private final String D;
    private final boolean E;
    private final boolean F;
    private final String G;
    private final boolean H;
    private int I;
    private int J;
    private boolean K;
    private final boolean L;
    private final Map<Integer, cy> M;
    private final List<Document> N;
    private final int O;
    private final int P;
    private final gq Q;
    private final int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private ip V;
    public final com.google.android.play.image.e c;
    protected final int d;
    public final cy e;
    protected final com.google.android.finsky.api.b f;
    protected final com.google.android.finsky.protos.ba[] g;
    protected final int h;
    protected final boolean i;
    protected final com.google.android.finsky.layout.play.bc j;
    protected final DfeToc k;
    protected final com.google.android.finsky.utils.ac l;
    public ArrayList<ItemEntry> m;
    protected int n;
    protected int o;
    protected boolean p;
    protected HashSet<eq> q;
    private final int x;
    private final int y;
    private final boolean z;

    public CardRecyclerViewAdapter(Context context, com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, DfeToc dfeToc, com.google.android.finsky.utils.ac acVar, com.google.android.finsky.api.model.s<T> sVar, String str, boolean z, boolean z2, cy cyVar) {
        this(context, bVar, bVar2, eVar, dfeToc, acVar, sVar, null, str, z, z2, 2, cyVar, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CardRecyclerViewAdapter(android.content.Context r7, com.google.android.finsky.api.b r8, com.google.android.finsky.navigationmanager.b r9, com.google.android.play.image.e r10, com.google.android.finsky.api.model.DfeToc r11, com.google.android.finsky.utils.ac r12, com.google.android.finsky.api.model.s<T> r13, com.google.android.finsky.protos.ba[] r14, java.lang.String r15, boolean r16, boolean r17, int r18, com.google.android.finsky.layout.play.cy r19, com.google.android.finsky.activities.gq r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.adapters.CardRecyclerViewAdapter.<init>(android.content.Context, com.google.android.finsky.api.b, com.google.android.finsky.navigationmanager.b, com.google.android.play.image.e, com.google.android.finsky.api.model.DfeToc, com.google.android.finsky.utils.ac, com.google.android.finsky.api.model.s, com.google.android.finsky.protos.ba[], java.lang.String, boolean, boolean, int, com.google.android.finsky.layout.play.cy, com.google.android.finsky.activities.gq, boolean):void");
    }

    public static boolean a(Bundle bundle) {
        return bundle != null && bundle.containsKey("CardRecyclerViewAdapter.itemEntriesList");
    }

    protected void a(Resources resources) {
        T t = this.r.f1988a;
        Document document = t.f1970a;
        boolean z = (!this.i || this.A || this.F) ? false : true;
        boolean z2 = t.c() == 9;
        if (document.am()) {
            this.o = R.layout.play_card_avatar;
            this.n = com.google.android.finsky.layout.play.ar.a(this.h, this.z).a();
            return;
        }
        if (z2) {
            this.o = R.layout.play_card_person;
            this.n = bf.a(this.h, this.z).a();
        } else if (this.A) {
            this.o = R.layout.play_card_small;
            this.n = this.h;
        } else if (z) {
            this.o = R.layout.play_card_mini;
            this.n = resources.getInteger(R.integer.related_items_per_row);
        } else {
            this.o = R.layout.play_card_listing;
            this.n = ik.d(resources);
        }
    }

    @Deprecated
    public int f() {
        int a2;
        return (this.Q == null || (a2 = this.Q.a()) <= 0) ? FinskyHeaderListLayout.a(this.t, this.R) : a2;
    }

    @Override // com.google.android.finsky.activities.gy
    public boolean c() {
        return this.L;
    }

    @Override // com.google.android.finsky.activities.gy
    public void a(HeroGraphicView heroGraphicView) {
        heroGraphicView.a(this.r.f1988a.f1970a);
    }

    protected boolean h() {
        return false;
    }

    public boolean i() {
        return !this.L;
    }

    public boolean j() {
        return (this.H || this.L) ? false : true;
    }

    protected boolean k() {
        return this.S;
    }

    protected boolean l() {
        return false;
    }

    protected boolean m() {
        return false;
    }

    @Override // com.google.android.finsky.adapters.ac
    public void a(PlayRecyclerView playRecyclerView, Bundle bundle) {
        int i;
        int i2;
        super.a(playRecyclerView, bundle);
        if (this.m.size() != 0) {
            int n = playRecyclerView.getLayoutManager() instanceof LinearLayoutManager ? ((LinearLayoutManager) playRecyclerView.getLayoutManager()).n() : 0;
            if (playRecyclerView.getChildCount() > 0) {
                View childAt = playRecyclerView.getChildAt(0);
                i2 = childAt.getTop();
                i = childAt.getHeight();
            } else {
                i = 0;
                i2 = 0;
            }
            int a2 = a(i2, i, n) - q();
            bundle.putInt("CardRecyclerViewAdapter.firstVisibleRow", n);
            bundle.putInt("CardRecyclerViewAdapter.firstVisibleItemEntry", a2);
            bundle.putInt("CardRecyclerViewAdapter.rowPixelOffset", i2);
            bundle.putInt("CardRecyclerViewAdapter.rowPixelHeight", i);
            bundle.putInt("CardRecyclerViewAdapter.looseItemColumnCount", this.n);
            bundle.putInt("CardRecyclerViewAdapter.columnCount", this.h);
            bundle.putInt("CardRecyclerViewAdapter.prependedRowsCount", p());
            bundle.putParcelableArrayList("CardRecyclerViewAdapter.itemEntriesList", this.m);
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            T t = this.r.f1988a;
            for (int i3 = 0; i3 < t.p(); i3++) {
                Document document = (Document) t.a(i3, false);
                if (i(c(document))) {
                    sparseArray.append(i3, document);
                }
            }
            bundle.putSparseParcelableArray("CardRecyclerViewAdapter.splitDocList", sparseArray);
        }
    }

    @Override // com.google.android.finsky.adapters.ac
    public void b(PlayRecyclerView playRecyclerView, Bundle bundle) {
        int a2;
        int i;
        int i2;
        ArrayList<ItemEntry> parcelableArrayList = bundle.getParcelableArrayList("CardRecyclerViewAdapter.itemEntriesList");
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("CardRecyclerViewAdapter.splitDocList");
        int i3 = bundle.getInt("CardRecyclerViewAdapter.firstVisibleRow");
        int i4 = bundle.getInt("CardRecyclerViewAdapter.firstVisibleItemEntry", -1);
        int i5 = bundle.getInt("CardRecyclerViewAdapter.rowPixelOffset");
        int i6 = bundle.getInt("CardRecyclerViewAdapter.rowPixelHeight");
        int i7 = bundle.getInt("CardRecyclerViewAdapter.columnCount", -1);
        int i8 = bundle.getInt("CardRecyclerViewAdapter.looseItemColumnCount", -1);
        int i9 = bundle.getInt("CardRecyclerViewAdapter.prependedRowsCount", -1);
        if (parcelableArrayList == null || parcelableArrayList.size() == 0 || i8 == -1 || i9 == -1 || i7 == -1) {
            n();
            this.f774a.a();
            this.r.f1988a.q();
            super.b(playRecyclerView, bundle);
            return;
        }
        if (!((i7 == this.h && i8 == this.n && i9 == p()) ? false : true)) {
            this.m = parcelableArrayList;
            this.f774a.a();
            if (playRecyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                ((LinearLayoutManager) playRecyclerView.getLayoutManager()).a(i3, i5);
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= parcelableArrayList.size()) {
                break;
            }
            ItemEntry itemEntry = parcelableArrayList.get(i11);
            int i12 = itemEntry.f1879a;
            Document document = (Document) sparseParcelableArray.get(i12);
            if (document != null) {
                int i13 = i11 + 1;
                int i14 = 0;
                while (true) {
                    int i15 = i13;
                    if (i15 >= parcelableArrayList.size() || parcelableArrayList.get(i15).f1879a != i12) {
                        break;
                    }
                    i14++;
                    i13 = i15 + 1;
                }
                a(i12, c(document), document);
                i2 = i14 + i11;
            } else if (itemEntry.b()) {
                int i16 = 0;
                i2 = i11;
                for (int i17 = i11; i17 < parcelableArrayList.size(); i17++) {
                    ItemEntry itemEntry2 = parcelableArrayList.get(i17);
                    if (!itemEntry2.b()) {
                        break;
                    }
                    i16 += (itemEntry2.f1880b + 1) - itemEntry2.f1879a;
                    i2 = i17;
                }
                int i18 = ((i16 + r0) - 1) / this.n;
                int i19 = parcelableArrayList.get(i11).f1879a;
                int i20 = parcelableArrayList.get(i2).f1880b;
                for (int i21 = 0; i21 < i18; i21++) {
                    int min = Math.min((this.n + i19) - 1, i20);
                    ItemEntry itemEntry3 = new ItemEntry();
                    itemEntry3.f1879a = i19;
                    itemEntry3.f1880b = min;
                    itemEntry3.c = 6;
                    this.m.add(itemEntry3);
                    i19 += this.n;
                }
            } else {
                this.m.add(parcelableArrayList.get(i11));
                i2 = i11;
            }
            i10 = i2 + 1;
        }
        if (i4 < 0) {
            a2 = a(i5, i6, i3);
            if (a2 >= y() + p()) {
                a2 = (y() + p()) - 1;
            }
        } else {
            ItemEntry itemEntry4 = parcelableArrayList.get(i4);
            int i22 = itemEntry4.d;
            int i23 = 0;
            while (true) {
                i = i23;
                if (i >= this.m.size()) {
                    break;
                }
                ItemEntry itemEntry5 = this.m.get(i);
                if (itemEntry5.f1879a >= itemEntry4.f1879a) {
                    if (itemEntry5.f1879a > itemEntry4.f1879a) {
                        break;
                    }
                    if (i22 != -1) {
                        if (itemEntry5.d <= i22 && i22 <= itemEntry5.e) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i23 = i + 1;
            }
            i--;
            a2 = q() + i;
        }
        if (a2 >= a()) {
            a2 = a() - 1;
        }
        this.f774a.a();
        playRecyclerView.getLayoutManager().b(a2);
    }

    private static int a(int i, int i2, int i3) {
        return ((((float) (i2 + i)) / ((float) i2)) > 0.5f ? 1 : ((((float) (i2 + i)) / ((float) i2)) == 0.5f ? 0 : -1)) > 0 ? i3 : i3 + 1;
    }

    @Override // com.google.android.finsky.adapters.al, com.google.android.finsky.api.model.x
    public void m_() {
        n();
        super.m_();
    }

    @Override // com.google.android.finsky.adapters.ac
    public final void a(T t) {
        super.a((CardRecyclerViewAdapter<T>) t);
        this.m.clear();
        n();
        this.f774a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void n() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.adapters.CardRecyclerViewAdapter.n():void");
    }

    private void a(int i, int i2, Document document) {
        switch (i2) {
            case 36:
                int d = ik.d(this.t.getResources());
                int a2 = document.a() / this.h;
                ItemEntry itemEntry = new ItemEntry();
                itemEntry.f1879a = i;
                itemEntry.f1880b = i;
                itemEntry.c = 38;
                this.m.add(itemEntry);
                int a3 = document.a();
                ItemEntry itemEntry2 = null;
                int i3 = 0;
                for (int i4 = 0; i4 < a3 && i3 < a2; i4++) {
                    if (!(itemEntry2 != null && itemEntry2.a() && i4 - itemEntry2.d < d)) {
                        k(i4);
                        itemEntry2 = new ItemEntry();
                        itemEntry2.f1879a = i;
                        itemEntry2.f1880b = i;
                        itemEntry2.c = 37;
                        itemEntry2.d = i4;
                        this.m.add(itemEntry2);
                        i3++;
                    }
                }
                int min = Math.min(i3 * d, document.a());
                if (a3 > 0) {
                    k(min);
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Splitting of this viewType is not supported");
        }
    }

    private static boolean i(int i) {
        return i == 36;
    }

    private void j(int i) {
        int size = this.m.size();
        if (size > 0) {
            ItemEntry itemEntry = this.m.get(size - 1);
            if (!itemEntry.b()) {
                return;
            }
            itemEntry.f1880b = i - 1;
        }
    }

    private void k(int i) {
        int size = this.m.size();
        if (size > 0) {
            ItemEntry itemEntry = this.m.get(size - 1);
            if (!itemEntry.a()) {
                return;
            }
            itemEntry.e = i - 1;
        }
    }

    private int w() {
        int size = this.m.size();
        if (v() != 0) {
            return size + 1;
        }
        return size;
    }

    private int x() {
        return (h() ? 1 : 0) + this.y + (z() ? 1 : 0) + (this.H ? 1 : 0) + (k() ? 1 : 0) + (this.L ? 1 : 0) + (this.K ? 1 : 0);
    }

    @Override // android.support.v7.widget.dt
    public final int a() {
        int o = o();
        int p = p();
        if (o + p == 0) {
            return 0;
        }
        return o + p + y();
    }

    private int y() {
        return (i() ? 1 : 0) + (j() ? 1 : 0);
    }

    public int o() {
        return w();
    }

    public int p() {
        return x();
    }

    private boolean z() {
        if (!this.E) {
            return false;
        }
        if (this.r.f1988a.p() > 0) {
            return true;
        }
        int v = v();
        if (l() && v == 1) {
            return false;
        }
        return (m() && v == 0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v22, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v30, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v32, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v34, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.view.ViewGroup, com.google.android.finsky.layout.BucketRow] */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v40, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v47, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v49, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v51, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v53, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v55, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v57, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v59, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v61, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v63, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v65, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v67, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v69, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v71, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v72, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v74, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v76, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v77, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v78, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v79, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v80, types: [android.view.View] */
    @Override // android.support.v7.widget.dt
    public eq a(ViewGroup viewGroup, int i) {
        ?? a2;
        switch (i) {
            case 0:
                a2 = h(viewGroup);
                break;
            case 1:
                a2 = g(viewGroup);
                break;
            case 2:
                a2 = a(R.layout.play_quicklinks_banner_v2, viewGroup, false);
                break;
            case 3:
                a2 = a(R.layout.play_merch_banner, viewGroup, false);
                break;
            case 4:
                a2 = d(viewGroup);
                break;
            case 5:
                a2 = a(R.layout.play_card_merch_cluster, viewGroup, false);
                break;
            case 6:
                if (this.A) {
                    a2 = a(R.layout.play_card_cluster, viewGroup, false);
                    break;
                } else {
                    a2 = a(viewGroup, false);
                    break;
                }
            case 7:
            case 38:
                a2 = a(R.layout.play_card_cluster_header, viewGroup, false);
                break;
            case 8:
                a2 = a(R.layout.play_selector_header, viewGroup, false);
                break;
            case 9:
                a2 = b(viewGroup);
                break;
            case 10:
                a2 = a(R.layout.play_card_add_to_circles_cluster, viewGroup, false);
                break;
            case 11:
                a2 = a(R.layout.play_card_trusted_source_cluster, viewGroup, false);
                break;
            case 12:
                a2 = a(R.layout.play_card_rate_cluster, viewGroup, false);
                break;
            case 13:
                a2 = a(R.layout.play_card_rate_and_suggest_cluster, viewGroup, false);
                break;
            case 14:
                a2 = a(R.layout.play_card_action_banner_cluster, viewGroup, false);
                break;
            case 15:
                a2 = a(R.layout.play_card_empty_cluster, viewGroup, false);
                break;
            case 16:
                a2 = a(R.layout.banner_header, viewGroup, false);
                break;
            case 17:
                a2 = a(R.layout.social_header, viewGroup, false);
                break;
            case 18:
                a2 = a(this.B == 1 ? R.layout.warm_welcome_card_single_column : R.layout.warm_welcome_card_double_column, viewGroup, false);
                break;
            case 19:
                a2 = a(R.layout.play_card_my_circles_cluster, viewGroup, false);
                break;
            case 20:
            case 36:
            default:
                a2 = c(viewGroup);
                break;
            case 21:
                a2 = f(viewGroup);
                break;
            case 22:
                a2 = a(R.layout.play_list_vspacer, viewGroup, false);
                break;
            case 23:
                a2 = a(viewGroup, true);
                break;
            case 24:
                a2 = a(R.layout.play_bundle_banner_view, viewGroup, false);
                break;
            case 25:
                a2 = a(R.layout.loading_spinner, viewGroup, false);
                break;
            case 26:
                a2 = e(viewGroup);
                break;
            case 27:
                a2 = a(R.layout.play_card_banner_with_content_cluster, viewGroup, false);
                break;
            case 28:
                a2 = a(R.layout.padding_footer, viewGroup, false);
                break;
            case 29:
                a2 = a(viewGroup);
                break;
            case 30:
                a2 = a(this.B == 1 ? R.layout.warm_welcome_v2_card_single_column : R.layout.warm_welcome_v2_card_double_column, viewGroup, false);
                break;
            case 31:
                a2 = a(R.layout.play_card_friend_review_cluster, viewGroup, false);
                break;
            case 32:
                a2 = a(R.layout.play_card_cluster_with_notice, viewGroup, false);
                break;
            case 33:
                View a3 = a(R.layout.play_card_promo_cluster, viewGroup, false);
                a(R.layout.play_youtube_video_card, (ViewGroup) a3.findViewById(R.id.play_promo_cluster_content), true);
                a2 = a3;
                break;
            case 34:
                View a4 = a(R.layout.play_card_promo_cluster, viewGroup, false);
                a(R.layout.top_charts_cluster_content_view, (ViewGroup) a4.findViewById(R.id.play_promo_cluster_content), true);
                a2 = a4;
                break;
            case 35:
                View a5 = a(R.layout.play_card_promo_cluster, viewGroup, false);
                a(R.layout.play_newsstand_card, (ViewGroup) a5.findViewById(R.id.play_promo_cluster_content), true);
                a2 = a5;
                break;
            case 37:
                a2 = (BucketRow) a(R.layout.bucket_row, viewGroup, false);
                a2.setContentHorizontalPadding(this.d);
                int d = ik.d(this.t.getResources());
                for (int i2 = 0; i2 < d; i2++) {
                    View a6 = a(R.layout.play_card_listing, (ViewGroup) a2, false);
                    a6.setVisibility(8);
                    a2.addView(a6);
                }
                break;
            case 39:
                a2 = a(R.layout.tab_bubble_spacer_view, viewGroup, false);
                break;
        }
        return new cx(a2);
    }

    final int q() {
        return p() + y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0500  */
    @Override // android.support.v7.widget.dt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.support.v7.widget.eq r16, int r17) {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.adapters.CardRecyclerViewAdapter.a(android.support.v7.widget.eq, int):void");
    }

    protected View a(ViewGroup viewGroup) {
        return null;
    }

    protected View b(ViewGroup viewGroup) {
        PlayCardOrderedClusterView playCardOrderedClusterView = (PlayCardOrderedClusterView) a(R.layout.play_card_ordered_cluster, viewGroup, false);
        playCardOrderedClusterView.a(this.t.getResources().getInteger(R.integer.search_bucket_rows), ik.d(this.t.getResources()), this.d);
        return playCardOrderedClusterView;
    }

    protected View c(ViewGroup viewGroup) {
        return a(R.layout.play_card_cluster, viewGroup, false);
    }

    protected View d(ViewGroup viewGroup) {
        return a(R.layout.play_card_merch_cluster, viewGroup, false);
    }

    protected View e(ViewGroup viewGroup) {
        return a(R.layout.play_card_avatar_cluster, viewGroup, false);
    }

    private void a(View view, ItemEntry itemEntry) {
        cy cyVar;
        BucketRow bucketRow = (BucketRow) view;
        Document a2 = this.r.a(itemEntry.f1879a);
        bucketRow.setIdentifier(a2.f1963a.f3890a);
        bucketRow.setVisibility(0);
        int d = ik.d(this.t.getResources());
        cy cyVar2 = this.M.get(Integer.valueOf(itemEntry.f1879a));
        if (cyVar2 == null) {
            cyVar = new com.google.android.finsky.layout.play.ad(400, a2.f1963a.R, this.e);
            this.M.put(Integer.valueOf(itemEntry.f1879a), cyVar);
        } else {
            cyVar = cyVar2;
        }
        for (int i = 0; i < d; i++) {
            com.google.android.play.layout.a aVar = (com.google.android.play.layout.a) bucketRow.getChildAt(i);
            int i2 = itemEntry.d + i;
            if (i2 < a2.a()) {
                fe.a(aVar, a2.a(i2), a2.f1963a.f3890a, this.c, this.u, false, null, cyVar, true, -1, false);
                aVar.setVisibility(0);
            } else {
                aVar.setVisibility(4);
            }
        }
    }

    protected void a(int i, eq eqVar) {
        PlayCardOrderedClusterView playCardOrderedClusterView = (PlayCardOrderedClusterView) eqVar.f795a;
        Document a2 = this.r.a(i);
        playCardOrderedClusterView.setIdentifier(a2.f1963a.f3890a);
        Document[] b2 = a2.b();
        com.google.android.play.image.e eVar = this.c;
        com.google.android.finsky.navigationmanager.b bVar = this.u;
        View.OnClickListener a3 = a(a2, playCardOrderedClusterView);
        cy cyVar = this.e;
        com.google.android.finsky.a.i.a(playCardOrderedClusterView.c, a2.f1963a.R);
        playCardOrderedClusterView.d = cyVar;
        playCardOrderedClusterView.a(a2, b2, eVar, bVar);
        playCardOrderedClusterView.a((int) a2.f1963a.y.g, a2.f1963a.g, a2.f1963a.i, a3);
    }

    protected void a(View view) {
        view.getLayoutParams().height = f();
        view.setId(R.id.play_header_spacer);
    }

    protected void b(View view) {
    }

    private void a(View view, int i) {
        ItemEntry itemEntry = this.m.get(i);
        int i2 = itemEntry.f1879a;
        Document a2 = this.r.a(itemEntry.f1879a);
        PlayCardClusterViewHeader playCardClusterViewHeader = (PlayCardClusterViewHeader) view;
        cy cyVar = this.M.get(Integer.valueOf(itemEntry.f1879a));
        if (cyVar == null) {
            cyVar = new com.google.android.finsky.layout.play.ad(400, a2.f1963a.R, this.e);
            this.M.put(Integer.valueOf(i2), cyVar);
        }
        View.OnClickListener a3 = a(a2, cyVar);
        int i3 = i + 1;
        int i4 = 0;
        while (true) {
            int i5 = i3;
            if (i5 >= this.m.size()) {
                break;
            }
            ItemEntry itemEntry2 = this.m.get(i5);
            if (itemEntry2.f1879a != i2) {
                break;
            }
            i4 += (itemEntry2.e - itemEntry2.d) + 1;
            i3 = i5 + 1;
        }
        playCardClusterViewHeader.a(a2.f1963a.g, a2.f1963a.i, a2.f1963a.k, a(this.t, a2, i4, a3), a3, (this.p && a2.m()) ? a2.f1963a.y.n : null, this.c);
        playCardClusterViewHeader.setExtraHorizontalPadding(this.d);
        playCardClusterViewHeader.setIdentifier("container_cluster_header:" + this.D);
        by.a(playCardClusterViewHeader, by.n(playCardClusterViewHeader), playCardClusterViewHeader.e, by.o(playCardClusterViewHeader), playCardClusterViewHeader.getPaddingBottom());
    }

    private View a(ViewGroup viewGroup, boolean z) {
        int i = (!z || this.U) ? this.n : 1;
        BucketRow bucketRow = (BucketRow) a(R.layout.bucket_row, viewGroup, false);
        bucketRow.setContentHorizontalPadding(this.d);
        for (int i2 = 0; i2 < i; i2++) {
            bucketRow.addView(a(this.o, (ViewGroup) bucketRow, false));
        }
        return bucketRow;
    }

    private void a(int i, int i2, View view, boolean z) {
        int i3 = (!z || this.U) ? this.n : 1;
        BucketRow bucketRow = (BucketRow) view;
        int i4 = 0;
        String str = null;
        while (i4 < i3) {
            int i5 = i + i4;
            boolean z2 = i5 > i2;
            Document a2 = z2 ? null : this.r.a(i5);
            String str2 = (!TextUtils.isEmpty(str) || a2 == null) ? str : a2.f1963a.f3890a;
            com.google.android.play.layout.a aVar = (com.google.android.play.layout.a) bucketRow.getChildAt(i4);
            T t = this.r.f1988a;
            if (a2 == null) {
                if (!z2 || i5 < t.p()) {
                    aVar.setVisibility(0);
                    aVar.a();
                } else {
                    aVar.d();
                }
            } else {
                fe.a(aVar, a2, this.G, this.c, this.u, a(a2), s(), this.e, true, f(i5), false);
                if (aVar instanceof PlayCardViewPerson) {
                    ((PlayCardViewPerson) aVar).a(!t.f1970a.al());
                }
            }
            i4++;
            str = str2;
        }
        bucketRow.setIdentifier(str);
        a(bucketRow);
    }

    protected void a(BucketRow bucketRow) {
    }

    protected int f(int i) {
        int i2 = 0;
        if (this.T) {
            i2 = -(this.U ? 1 : this.n);
        }
        if (!this.F) {
            i = -1;
        }
        return i2 + i;
    }

    protected boolean a(Document document) {
        return document.aR() && this.l.c(document.f1963a.f3890a);
    }

    private static int c(Document document) {
        if (document == null) {
            return 6;
        }
        if ((document.aJ() == null || document.aJ().n == null) ? false : true) {
            return 3;
        }
        if (document.ah()) {
            return 5;
        }
        if (document.aj()) {
            return 12;
        }
        if (document.ak()) {
            return 13;
        }
        if ((document.aJ() == null || document.aJ().q == null) ? false : true) {
            return 10;
        }
        if (document.al()) {
            return 19;
        }
        if (document.am()) {
            return 26;
        }
        if ((document.aJ() == null || document.aJ().s == null || document.aJ().s.f4283a == null) ? false : true) {
            return 11;
        }
        if ((document.aJ() == null || document.aJ().y == null) ? false : true) {
            return 15;
        }
        if (document.az()) {
            return 31;
        }
        if (document.aX()) {
            return 33;
        }
        if (document.aY()) {
            return 35;
        }
        if (document.ay()) {
            return 14;
        }
        if (document.aB()) {
            return 34;
        }
        if (document.aC()) {
            return 18;
        }
        if (document.aD()) {
            return 30;
        }
        if (document.aF()) {
            return 23;
        }
        if (document.aE()) {
            return 24;
        }
        if (document.aW() != null) {
            return 27;
        }
        if ((document.aJ() == null || document.aJ().L == null) ? false : true) {
            return 32;
        }
        po aJ = document.aJ();
        if ((aJ == null || aJ.S == null) ? false : true) {
            return 36;
        }
        boolean m = document.m();
        if ((m || document.ai()) && document.c(14)) {
            return 4;
        }
        if (!m) {
            return 6;
        }
        if (document.f1963a.y.k) {
            return 9;
        }
        return 20;
    }

    private void a(int i, int i2, View view) {
        int i3;
        String str;
        PlayCardClusterView playCardClusterView = (PlayCardClusterView) view;
        this.N.clear();
        Document document = null;
        while (i <= i2) {
            Document a2 = this.r.a(i);
            if (a2 != null) {
                if (document == null) {
                    document = a2;
                }
                this.N.add(a2);
            }
            i++;
        }
        if (document == null) {
            i3 = -1;
        } else {
            i3 = document.f1963a.e;
        }
        if (document == null) {
            str = "";
        } else {
            str = document.f1963a.f3890a;
        }
        playCardClusterView.setIdentifier(str);
        playCardClusterView.a(this.N, this.G).a(i3 == 28 ? bf.a(this.h, this.z) : com.google.android.finsky.layout.play.av.a(i3, this.h, this.z, 0), this.l, this.f, this.u, this.c, s(), this.j, this.e);
        playCardClusterView.setCardContentHorizontalPadding(this.d);
        playCardClusterView.h();
    }

    protected void b(int i, eq eqVar) {
        PlayCardClusterView playCardClusterView = (PlayCardClusterView) eqVar.f795a;
        Document a2 = this.r.a(i);
        a(a2, a(a2, b(a2)), playCardClusterView, true);
    }

    private void a(int i, View view, boolean z) {
        PlayCardClusterView playCardClusterView = (PlayCardClusterView) view;
        a(this.r.a(i), bf.a(this.h, this.z), playCardClusterView, true);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < playCardClusterView.getCardChildCount()) {
                ((PlayCardViewPerson) playCardClusterView.a(i3)).a(z);
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    protected void c(int i, eq eqVar) {
        a(this.r.a(i), com.google.android.finsky.layout.play.ar.a(this.h, this.z), (PlayCardClusterView) eqVar.f795a, true);
    }

    protected void c(View view) {
        throw new UnsupportedOperationException("This is not supported by the base adapter");
    }

    protected void a(int i, View view) {
        bg bgVar = (bg) view;
        Document a2 = this.r.a(i);
        bgVar.a(a2, this.c, this.u, this.e, d(view), 426, R.drawable.ic_h2o_topcharts, null, false);
        bgVar.setContentHorizontalPadding(this.d);
        ((TopChartsClusterContentView) bgVar.findViewById(R.id.top_charts_cluster_content_id)).a(a2, this.c, this.f, this.k, this.u, bgVar.getParentOfChildren());
    }

    private void c(int i, View view) {
        WarmWelcomeCard warmWelcomeCard = (WarmWelcomeCard) view;
        Document a2 = this.r.a(i);
        sw swVar = a2.aC() ? a2.aJ().w : null;
        List<ds> b2 = a2.b(4);
        warmWelcomeCard.a(a2.f1963a.i, a2.u(), this.C ? null : (b2 == null || b2.isEmpty()) ? null : b2.get(0), a2.f1963a.g, this.e, a2.f1963a.R);
        int i2 = 0;
        while (i2 < swVar.f4408a.length) {
            bx bxVar = swVar.f4408a[i2];
            warmWelcomeCard.a(bxVar.c, bxVar.e, a(a2, bxVar, warmWelcomeCard, warmWelcomeCard), i2 == 0);
            i2++;
        }
        if (swVar.f4408a.length < 2) {
            warmWelcomeCard.b();
        }
        by.a(warmWelcomeCard, this.d, 0, this.d, 0);
        warmWelcomeCard.setIdentifier(a2.f1963a.f3890a);
    }

    private void d(int i, View view) {
        int i2;
        WarmWelcomeV2Card warmWelcomeV2Card = (WarmWelcomeV2Card) view;
        Document a2 = this.r.a(i);
        sw swVar = a2.aD() ? a2.aJ().K : null;
        List<ds> b2 = a2.b(4);
        ds dsVar = (b2 == null || b2.isEmpty()) ? null : b2.get(0);
        String str = a2.f1963a.i;
        CharSequence u = a2.u();
        int i3 = a2.f1963a.g;
        cy cyVar = this.e;
        byte[] bArr = a2.f1963a.R;
        warmWelcomeV2Card.f3384a.setText(str);
        warmWelcomeV2Card.f3385b.setText(u);
        if ((i3 == 0 || i3 == 9) ? false : true) {
            i2 = com.google.android.finsky.utils.ai.b(i3);
        } else {
            i2 = R.color.status_bar_multi;
        }
        warmWelcomeV2Card.j.getCardViewGroupDelegate().a(warmWelcomeV2Card.j, warmWelcomeV2Card.getResources().getColor(i2));
        if (dsVar != null) {
            warmWelcomeV2Card.c.a(dsVar.f, dsVar.l, FinskyApp.a().d);
            warmWelcomeV2Card.d.setVisibility(0);
        } else {
            warmWelcomeV2Card.d.setVisibility(8);
        }
        warmWelcomeV2Card.h = com.google.android.finsky.a.i.a(516);
        com.google.android.finsky.a.i.a(warmWelcomeV2Card.h, bArr);
        warmWelcomeV2Card.i = cyVar;
        warmWelcomeV2Card.f.setVisibility(8);
        warmWelcomeV2Card.g.setVisibility(8);
        warmWelcomeV2Card.e.setVisibility(8);
        warmWelcomeV2Card.getParentNode().a(warmWelcomeV2Card);
        int i4 = 0;
        while (i4 < swVar.f4408a.length) {
            bx bxVar = swVar.f4408a[i4];
            String str2 = bxVar.c;
            View.OnClickListener a3 = a(a2, bxVar, warmWelcomeV2Card, warmWelcomeV2Card);
            TextView textView = i4 == 0 ? warmWelcomeV2Card.f : warmWelcomeV2Card.g;
            textView.setVisibility(0);
            textView.setText(str2.toUpperCase());
            textView.setOnClickListener(a3);
            warmWelcomeV2Card.e.setVisibility(0);
            i4++;
        }
        by.a(warmWelcomeV2Card, this.d, 0, this.d, 0);
        warmWelcomeV2Card.setIdentifier(a2.f1963a.f3890a);
    }

    private View.OnClickListener a(Document document, bx bxVar, View view, cy cyVar) {
        return new j(this, bxVar, cyVar, document, view);
    }

    private void a(Document document, com.google.android.finsky.layout.play.as asVar, PlayCardClusterView playCardClusterView, boolean z) {
        playCardClusterView.a(document).a(asVar, this.l, this.f, this.u, this.c, s(), this.j, this.e);
        View.OnClickListener a2 = z ? a(document, playCardClusterView.getPlayStoreUiElementNode()) : null;
        if (playCardClusterView.f()) {
            playCardClusterView.a(document.f1963a.g, document.f1963a.i, document.f1963a.k, a(this.t, document, asVar.a(), a2), a2, this.d);
        }
        playCardClusterView.setCardContentHorizontalPadding(this.d);
        playCardClusterView.setIdentifier(document.f1963a.f3890a);
    }

    protected View.OnClickListener a(Document document, cy cyVar) {
        if (com.google.android.finsky.navigationmanager.b.b(document)) {
            return this.u.a(document, cyVar);
        }
        return null;
    }

    protected static String a(Context context, Document document, int i, View.OnClickListener onClickListener) {
        return ik.a(context, document, i, onClickListener, null, false);
    }

    protected void d(int i, eq eqVar) {
        int i2;
        PlayCardMerchClusterView playCardMerchClusterView = (PlayCardMerchClusterView) eqVar.f795a;
        Document a2 = this.r.a(i);
        if (a2.a() > 0) {
            i2 = a2.a(0).f1963a.e;
        } else {
            i2 = a2.f1963a.e;
        }
        a(a2, bd.a(i2, this.h, this.z), (PlayCardClusterView) playCardMerchClusterView, true);
        playCardMerchClusterView.a(this.c, 0, a2.b(14).get(0), a2.f1963a.i, a(a2, playCardMerchClusterView.getPlayStoreUiElementNode()));
    }

    private void e(int i, View view) {
        PlayCardBannerWithContentClusterView playCardBannerWithContentClusterView = (PlayCardBannerWithContentClusterView) view;
        Document a2 = this.r.a(i);
        com.google.android.finsky.layout.play.as a3 = a(a2, 0);
        playCardBannerWithContentClusterView.a(a2.f1963a.g, a2.f1963a.i, a2.f1963a.k, null, null, this.d);
        gx[] gxVarArr = a2.aW().f3602a;
        Document[] documentArr = new Document[gxVarArr.length];
        for (int i2 = 0; i2 < gxVarArr.length; i2++) {
            documentArr[i2] = new Document(gxVarArr[i2]);
        }
        playCardBannerWithContentClusterView.a(Arrays.asList(documentArr), a2.f1963a.f3890a).a(a3, this.l, this.f, this.u, this.c, s(), this.j, this.e);
        playCardBannerWithContentClusterView.setCardContentHorizontalPadding(this.d);
        Document a4 = a2.a(0);
        View.OnClickListener a5 = a(a4, playCardBannerWithContentClusterView.getPlayStoreUiElementNode());
        playCardBannerWithContentClusterView.setIdentifier(a4.f1963a.f3890a);
        playCardBannerWithContentClusterView.a(this.c, a4.b(14).get(0), a4.f1963a.i, a5);
    }

    protected void a(com.google.android.finsky.layout.play.ag agVar, Spinner spinner, View view) {
        Document document = this.r.f1988a.f1970a;
        agVar.setIdentifier(document.f1963a.f3890a);
        spinner.setBackgroundResource(com.google.android.finsky.utils.ai.e(document.f1963a.g));
        if (view != null) {
            view.setBackgroundColor(com.google.android.finsky.utils.ai.a(this.t, document.f1963a.g));
        }
        int dimensionPixelSize = this.d + spinner.getResources().getDimensionPixelSize(R.dimen.search_spinner_selected_margin_left);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) spinner.getLayoutParams();
        marginLayoutParams.leftMargin = dimensionPixelSize;
        marginLayoutParams.rightMargin = dimensionPixelSize;
        spinner.setLayoutParams(marginLayoutParams);
        eu[] euVarArr = document.f1963a.y.m;
        spinner.setAdapter(new w(this.t, euVarArr));
        int i = 0;
        while (true) {
            if (i >= euVarArr.length) {
                break;
            }
            if (!euVarArr[i].f3800a) {
                i++;
            } else {
                spinner.setSelection(i);
                break;
            }
        }
        spinner.setOnItemSelectedListener(new k(this, spinner, euVarArr));
    }

    protected void b(int i, View view) {
        bg bgVar = (bg) view;
        Document a2 = this.r.a(i);
        bgVar.a(a2, this.c, this.u, this.e, d(view), 427, R.drawable.ic_h2o_youtube, null, false);
        bgVar.setContentHorizontalPadding(this.d);
        ((PlayYoutubeCardContentView) bgVar.findViewById(R.id.video_card_container)).a(a2, this.c, bgVar.getParentOfChildren());
    }

    public final void g(int i) {
        if (this.K) {
            if (i == 0) {
                this.J = 0;
            } else {
                this.J = i - (j() ? this.O : 0);
            }
            c(this.I);
        }
    }

    protected final com.google.android.finsky.layout.play.az d(View view) {
        return new f(this, view);
    }

    @Override // android.support.v7.widget.dt
    public void a(eq eqVar) {
        this.q.remove(eqVar);
        KeyEvent.Callback callback = eqVar.f795a;
        if (callback instanceof ap) {
            ((ap) callback).ab_();
        }
        if (callback instanceof PlayCardClusterView) {
            this.j.a((PlayCardClusterView) callback);
        }
    }

    @Override // com.google.android.finsky.adapters.ac
    public final void r() {
        for (eq eqVar : (eq[]) this.q.toArray(new eq[this.q.size()])) {
            a(eqVar);
        }
        super.r();
    }

    @Override // android.support.v7.widget.dt
    public final boolean b() {
        return true;
    }

    protected com.google.android.finsky.layout.play.az s() {
        return this;
    }

    @Override // com.google.android.finsky.layout.play.az
    public final void a(Document document, com.google.android.play.layout.a aVar) {
        this.l.d(document.f1963a.f3890a);
        this.f774a.a();
    }

    protected static int b(Document document) {
        if (document.a() < 2) {
            FinskyLog.c("Not enough children in cluster.", new Object[0]);
            return 0;
        }
        Document a2 = document.a(0);
        Document a3 = document.a(1);
        nd a4 = fe.a(a2.ar());
        nd a5 = fe.a(a3.ar());
        if (a4 != null) {
            return a4.e != null ? (a5 == null || a5.e == null) ? 2 : 4 : a4.d != null ? 3 : 0;
        }
        return 0;
    }

    public class ItemEntry implements Parcelable {
        public static final Parcelable.Creator<ItemEntry> CREATOR = new o();

        /* renamed from: a, reason: collision with root package name */
        int f1879a = -1;

        /* renamed from: b, reason: collision with root package name */
        int f1880b = -1;
        int c = -1;
        int d = -1;
        int e = -1;

        public final boolean a() {
            return this.d != -1;
        }

        public final boolean b() {
            return this.c == 6 || this.c == 23;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1879a);
            parcel.writeInt(this.f1880b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
        }
    }

    @Override // android.support.v7.widget.dt
    public int a(int i) {
        if (i()) {
            if (i == 0) {
                return 21;
            }
            i--;
        }
        if (j()) {
            if (i == 0) {
                return 22;
            }
            i--;
        }
        int v = v();
        if (v != 0 && i == (w() + x()) - 1) {
            if (v == 1) {
                return 1;
            }
            if (v == 2) {
                return 0;
            }
            if (v == 3) {
                return 28;
            }
            FinskyLog.e("Unexpected footer mode: %d", Integer.valueOf(v));
            return 0;
        }
        if (this.K) {
            if (i == 0) {
                return 39;
            }
            i--;
        }
        if (this.P > 0) {
            if (i == 0) {
                return 2;
            }
            i--;
        }
        if (this.L) {
            if (i == 0) {
                return 17;
            }
            i--;
        }
        if (this.H) {
            if (i == 0) {
                return 16;
            }
            i--;
        }
        if (z()) {
            if (i == 0) {
                return 7;
            }
            i--;
        }
        if (k()) {
            if (i == 0) {
                return 8;
            }
            i--;
        }
        if (h()) {
            if (i == 0) {
                return 29;
            }
            i--;
        }
        ItemEntry itemEntry = this.m.get(i);
        if (this.r.a(itemEntry.f1879a) == null) {
            return 25;
        }
        return itemEntry.c;
    }

    private com.google.android.finsky.layout.play.as a(Document document, int i) {
        boolean z = true;
        int i2 = document.f1963a.e;
        if (this.i && b(document) == 0) {
            if (document.a() > 0 && !(fe.a(document.a(0).ar()) == null && TextUtils.isEmpty(document.a(0).as()))) {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            return be.a(i2, this.h + 1);
        }
        return com.google.android.finsky.layout.play.av.a(i2, this.h, this.z, i);
    }

    private static boolean a(com.google.android.finsky.utils.ac acVar, Document document, boolean z) {
        gx gxVar = document.f1963a;
        int intValue = z ? com.google.android.finsky.c.d.dD.b().intValue() : 0;
        for (int i = 0; i < gxVar.x.length; i++) {
            gx gxVar2 = gxVar.x[i];
            if (gxVar2 != null && !acVar.c(gxVar2.f3890a)) {
                ny a2 = acVar.a(gxVar2.f3890a, (ny) null);
                if (a2 == null) {
                    return false;
                }
                if (z && a2.d >= intValue) {
                    return false;
                }
            }
        }
        return true;
    }

    static /* synthetic */ void a(CardRecyclerViewAdapter cardRecyclerViewAdapter, Document document, View view) {
        cardRecyclerViewAdapter.l.d(document.f1963a.f3890a);
        ik.a(view, cardRecyclerViewAdapter.V, 0L);
    }
}
