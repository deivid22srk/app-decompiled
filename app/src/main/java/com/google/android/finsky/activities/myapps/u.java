package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.PlayCardViewMyApps;
import com.google.android.finsky.layout.play.cc;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.ea;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aj;
import com.google.android.finsky.utils.fe;
import com.google.android.play.layout.PlayCardLabelView;
import com.google.android.play.layout.PlayTextView;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class u extends BaseAdapter implements AbsListView.RecyclerListener, t {

    /* renamed from: a, reason: collision with root package name */
    final List<w> f1842a = new ArrayList();
    private final Context c;
    private final LayoutInflater d;
    private final com.google.android.play.image.e e;
    private final View.OnClickListener f;
    private final int g;
    private cy h;
    private static final Collator i = Collator.getInstance();

    /* renamed from: b, reason: collision with root package name */
    static final Comparator<w> f1841b = new v();

    public u(Context context, LayoutInflater layoutInflater, com.google.android.play.image.e eVar, View.OnClickListener onClickListener, cy cyVar) {
        this.h = null;
        this.c = context;
        this.d = layoutInflater;
        this.e = eVar;
        this.f = onClickListener;
        this.h = cyVar;
        this.g = FinskyHeaderListLayout.a(this.c, 0);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1842a.size() + 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i2) {
        return i2 == 0 ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        if (i2 == 0) {
            return null;
        }
        return this.f1842a.get(i2 - 1).f1843a;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        switch (getItemViewType(i2)) {
            case 0:
                PlayCardViewMyApps inflate = view == null ? this.d.inflate(R.layout.play_card_myapps, viewGroup, false) : view;
                w wVar = this.f1842a.get(i2 - 1);
                com.google.android.finsky.gpkg.u uVar = wVar.c;
                Document document = wVar.f1843a;
                Document document2 = wVar.f1844b;
                Resources resources = this.c.getResources();
                PlayCardViewMyApps playCardViewMyApps = inflate;
                fe.a(playCardViewMyApps, document2, "my_apps:subscription", this.e, null, this.h);
                playCardViewMyApps.a(false, (cc) null);
                playCardViewMyApps.getTitle().setText(document.f1963a.i);
                playCardViewMyApps.getSubtitle().setText(document2.f1963a.i);
                PlayCardLabelView label = playCardViewMyApps.getLabel();
                PlayTextView itemBadge = playCardViewMyApps.getItemBadge();
                int i3 = document.f1963a.g;
                if (uVar.e) {
                    if (System.currentTimeMillis() < uVar.d) {
                        label.a(R.string.subscription_trial, i3);
                    } else {
                        label.a(R.string.subscription_renewing, i3);
                    }
                    if (itemBadge != null) {
                        ea N = document.N();
                        if (N != null && N.G != null) {
                            String str = N.G.e;
                            if (!TextUtils.isEmpty(str)) {
                                itemBadge.setVisibility(0);
                                itemBadge.setText(str);
                            } else {
                                itemBadge.setVisibility(8);
                                FinskyLog.e("Document for %s does not contain a formatted price.", document.f1963a.f3890a);
                            }
                        } else {
                            itemBadge.setVisibility(8);
                            FinskyLog.e("Document for %s does not contain a subscription offer or terms.", document.f1963a.f3890a);
                        }
                    }
                } else {
                    label.a(R.string.subscription_canceled, i3);
                    if (itemBadge != null) {
                        itemBadge.setText(Html.fromHtml(resources.getString(R.string.subscription_expires_on, aj.a(uVar.n))));
                        itemBadge.setVisibility(0);
                    }
                }
                playCardViewMyApps.getRatingBar().setVisibility(8);
                inflate.setTag(document2);
                inflate.setOnClickListener(this.f);
                inflate.findViewById(R.id.loading_progress_bar).setVisibility(8);
                return inflate;
            case 1:
                if (view == null) {
                    view = this.d.inflate(R.layout.play_list_vspacer, viewGroup, false);
                }
                view.getLayoutParams().height = this.g;
                view.setId(R.id.play_header_spacer);
                return view;
            default:
                throw new IllegalStateException("Unknown type for getView " + i2);
        }
    }

    @Override // com.google.android.finsky.activities.myapps.t
    public final Document a(int i2) {
        if (i2 == 0) {
            return null;
        }
        return this.f1842a.get(i2 - 1).f1844b;
    }

    @Override // android.widget.AbsListView.RecyclerListener
    public final void onMovedToScrapHeap(View view) {
        if (view instanceof com.google.android.play.layout.a) {
            fe.a((com.google.android.play.layout.a) view);
        }
    }
}
