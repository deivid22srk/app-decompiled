package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.by;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.model.d;
import com.google.android.finsky.layout.BucketRow;
import com.google.android.finsky.layout.EditorialDescriptionSection;
import com.google.android.finsky.layout.EditorialHeroSpacerView;
import com.google.android.finsky.layout.HeroGraphicView;
import com.google.android.finsky.layout.InsetsFrameLayout;
import com.google.android.finsky.layout.play.PlayCardClusterViewHeader;
import com.google.android.finsky.layout.play.cx;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.su;
import com.google.android.finsky.utils.ik;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z<T extends com.google.android.finsky.api.model.d<?>> extends CardRecyclerViewAdapter<T> {
    private final Document x;
    private final int y;
    private final int z;

    public z(Context context, com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, DfeToc dfeToc, com.google.android.finsky.utils.ac acVar, Document document, com.google.android.finsky.api.model.s<T> sVar, boolean z, cy cyVar) {
        super(context, bVar, bVar2, eVar, dfeToc, acVar, sVar, null, z, false, cyVar);
        Resources resources = context.getResources();
        this.y = resources.getInteger(R.integer.editorial_bucket_columns);
        this.z = resources.getDimensionPixelSize(R.dimen.play_collection_edge_padding_minus_card_half_spacing);
        this.x = document;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final void a(Resources resources) {
        this.o = this.r.f1988a.c() == 3 ? R.layout.editorial_app_bucket_entry : R.layout.editorial_nonapp_bucket_entry;
        this.n = resources.getInteger(R.integer.editorial_bucket_columns);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    public final boolean j() {
        return false;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, com.google.android.finsky.activities.gy
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    public final int f() {
        int a2 = HeroGraphicView.a(this.t, this.t.getResources().getDisplayMetrics().widthPixels, HeroGraphicView.c(this.x) != null, HeroGraphicView.a(this.x.f1963a.e));
        if (InsetsFrameLayout.f3009a) {
            return a2 - ik.d(this.t);
        }
        return a2;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, com.google.android.finsky.activities.gy
    public final void a(HeroGraphicView heroGraphicView) {
        heroGraphicView.a(this.x, this.c, this.e);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, android.support.v7.widget.dt
    public final eq a(ViewGroup viewGroup, int i) {
        View a2;
        switch (i) {
            case 40:
                a2 = a(R.layout.editorial_text_description, viewGroup, false);
                break;
            case 41:
                a2 = a(R.layout.play_card_cluster_header, viewGroup, false);
                break;
            case 42:
                a2 = a(R.layout.bucket_row, viewGroup, false);
                for (int i2 = 0; i2 < this.y; i2++) {
                    ViewGroup viewGroup2 = (ViewGroup) a(R.layout.editorial_video_footer_entry, (ViewGroup) a2, false);
                    aa aaVar = new aa(this, (byte) 0);
                    aaVar.f1883a = viewGroup2;
                    aaVar.f1884b = (HeroGraphicView) viewGroup2.findViewById(R.id.videoimage);
                    aaVar.c = (TextView) viewGroup2.findViewById(R.id.video_text);
                    aaVar.d = (TextView) viewGroup2.findViewById(R.id.video_description);
                    viewGroup2.setTag(aaVar);
                    ((ViewGroup) a2).addView(viewGroup2);
                }
                break;
            default:
                return super.a(viewGroup, i);
        }
        return new cx(a2);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, android.support.v7.widget.dt
    public final int a(int i) {
        if (i == 0) {
            return 21;
        }
        int w = w();
        boolean z = w > 0;
        int i2 = w + 1;
        if (i == 1) {
            return 40;
        }
        if (z && !O_()) {
            int a2 = a();
            if (i == a2 - i2) {
                return 41;
            }
            if (i >= a2 - w) {
                return 42;
            }
        }
        return super.a(i - 1);
    }

    private int w() {
        return (int) Math.ceil(this.x.ap().k.length / this.y);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    public final int p() {
        return super.p() + 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    public final int o() {
        int o = super.o();
        int w = w();
        if (w > 0) {
            return o + w + 1;
        }
        return o;
    }

    @Override // com.google.android.finsky.adapters.al
    protected final View f(ViewGroup viewGroup) {
        return a(R.layout.editorial_hero_spacer, viewGroup, false);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final void a(View view) {
        EditorialHeroSpacerView editorialHeroSpacerView = (EditorialHeroSpacerView) view;
        boolean z = HeroGraphicView.c(this.x) != null;
        float a2 = HeroGraphicView.a(this.x.f1963a.e);
        editorialHeroSpacerView.f2975a = z;
        editorialHeroSpacerView.f2976b = a2;
        view.setId(R.id.play_header_spacer);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final void a(BucketRow bucketRow) {
        bucketRow.setSameChildHeight(true);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, android.support.v7.widget.dt
    public final void a(eq eqVar, int i) {
        int i2 = eqVar.e;
        View view = eqVar.f795a;
        switch (i2) {
            case 40:
                EditorialDescriptionSection editorialDescriptionSection = (EditorialDescriptionSection) view;
                int color = editorialDescriptionSection.getResources().getColor(R.color.white);
                if (this.x.c(1)) {
                    color = ik.a(this.x.ap(), color);
                }
                editorialDescriptionSection.a(this.u, this.x, color);
                break;
            case 41:
                PlayCardClusterViewHeader playCardClusterViewHeader = (PlayCardClusterViewHeader) view;
                playCardClusterViewHeader.a(this.r.f1988a.c(), this.t.getString(R.string.related_videos), null, null, null);
                playCardClusterViewHeader.setExtraHorizontalPadding(this.z);
                break;
            case 42:
                BucketRow bucketRow = (BucketRow) view;
                int o = (((i - super.o()) - super.p()) - 3) * this.y;
                bucketRow.setSameChildHeight(true);
                su[] suVarArr = this.x.ap().k;
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 < this.y) {
                        aa aaVar = (aa) bucketRow.getChildAt(i4).getTag();
                        int i5 = o + i4;
                        if (i5 > suVarArr.length - 1) {
                            aaVar.f1883a.setVisibility(4);
                        } else {
                            su suVar = suVarArr[i5];
                            aaVar.f1883a.setVisibility(0);
                            aaVar.c.setText(suVar.f4405b);
                            aaVar.d.setText(suVar.d);
                            String str = null;
                            for (ds dsVar : suVar.f4404a) {
                                if (dsVar.f3746a == 3) {
                                    str = dsVar.f;
                                } else if (dsVar.f3746a == 1) {
                                    arrayList.add(dsVar);
                                }
                            }
                            if (!TextUtils.isEmpty(str) && arrayList.size() > 0) {
                                aaVar.f1884b.a(this.c, arrayList);
                                aaVar.f1884b.a(str, suVar.f4405b, false, this.x.f1963a.T, this.x.f1963a.g, this.e);
                            }
                            arrayList.clear();
                        }
                        i3 = i4 + 1;
                    } else {
                        by.a(view, this.z, view.getPaddingTop(), this.z, view.getPaddingBottom());
                        break;
                    }
                }
                break;
            default:
                super.a(eqVar, i);
                break;
        }
    }
}
