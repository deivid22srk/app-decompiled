package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.by;
import android.support.v7.widget.eq;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.model.d;
import com.google.android.finsky.layout.IdentifiableTextView;
import com.google.android.finsky.layout.play.PeopleDetailsProfileInfoView;
import com.google.android.finsky.layout.play.WarmWelcomeCard;
import com.google.android.finsky.layout.play.cx;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.gq;
import com.google.android.finsky.utils.bg;

/* loaded from: classes.dex */
public final class an<T extends com.google.android.finsky.api.model.d<?>> extends CardRecyclerViewAdapter<T> {
    private final int A;
    private final boolean B;
    boolean x;
    private final Document y;
    private final boolean z;

    public an(Document document, Context context, com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, DfeToc dfeToc, com.google.android.finsky.utils.ac acVar, com.google.android.finsky.api.model.s<T> sVar, boolean z, cy cyVar) {
        super(context, bVar, bVar2, eVar, dfeToc, acVar, sVar, document.f(), z, true, cyVar);
        this.y = document;
        gq L = this.y.L();
        this.z = L != null && L.f3876a;
        Resources resources = context.getResources();
        this.A = resources.getInteger(R.integer.warm_welcome_card_columns);
        this.B = this.A == 1 && !resources.getBoolean(R.bool.play_warm_welcome_single_column_shows_graphic);
        this.x = this.z && !bg.am.a().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    public final boolean i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    public final boolean j() {
        return false;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final boolean l() {
        return true;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final boolean m() {
        return true;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    public final int p() {
        int p = super.p();
        int i = 1;
        if (this.x) {
            i = 2;
        }
        if (this.m.size() == 0) {
            i++;
        }
        return i + p;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, android.support.v7.widget.dt
    public final eq a(ViewGroup viewGroup, int i) {
        View a2;
        switch (i) {
            case 40:
                a2 = a(R.layout.people_details_profile_info, viewGroup, false);
                break;
            case 41:
                a2 = a(R.layout.profile_no_activity, viewGroup, false);
                break;
            case 42:
                a2 = a(this.A == 1 ? R.layout.warm_welcome_card_single_column : R.layout.warm_welcome_card_double_column, viewGroup, false);
                break;
            default:
                return super.a(viewGroup, i);
        }
        return new cx(a2);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, android.support.v7.widget.dt
    public final int a(int i) {
        if (i == 0) {
            return 40;
        }
        int i2 = i - 1;
        if (this.x) {
            if (i2 == 0) {
                return 42;
            }
            i2--;
        }
        if (this.m.size() == 0) {
            return 41;
        }
        return super.a(i2);
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final boolean a(Document document) {
        return false;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter
    protected final com.google.android.finsky.layout.play.az s() {
        return null;
    }

    @Override // com.google.android.finsky.adapters.CardRecyclerViewAdapter, android.support.v7.widget.dt
    public final void a(eq eqVar, int i) {
        int i2 = eqVar.e;
        View view = eqVar.f795a;
        switch (i2) {
            case 40:
                PeopleDetailsProfileInfoView peopleDetailsProfileInfoView = (PeopleDetailsProfileInfoView) view;
                peopleDetailsProfileInfoView.setId(R.id.play_header_spacer);
                peopleDetailsProfileInfoView.setIdentifier("profile_info");
                Document document = this.y;
                cy cyVar = this.e;
                peopleDetailsProfileInfoView.e = document;
                peopleDetailsProfileInfoView.f = cyVar;
                com.google.android.play.image.e eVar = FinskyApp.a().d;
                ds dsVar = peopleDetailsProfileInfoView.e.b(4).get(0);
                peopleDetailsProfileInfoView.f3295a.a(dsVar.f, dsVar.l, eVar);
                String str = peopleDetailsProfileInfoView.e.f1963a.i;
                peopleDetailsProfileInfoView.f3296b.setText(str);
                peopleDetailsProfileInfoView.c.a(peopleDetailsProfileInfoView.e, FinskyApp.a().j(), cyVar);
                gq L = peopleDetailsProfileInfoView.e.L();
                if (L != null) {
                    if (L.f3876a) {
                        peopleDetailsProfileInfoView.c.setVisibility(8);
                    } else {
                        peopleDetailsProfileInfoView.c.setVisibility(0);
                    }
                }
                Resources resources = peopleDetailsProfileInfoView.getResources();
                peopleDetailsProfileInfoView.d.a(resources.getString(R.string.gplus_view_profile), R.drawable.ic_person, R.drawable.play_highlight_overlay_light);
                peopleDetailsProfileInfoView.d.setOnClickListener(peopleDetailsProfileInfoView);
                peopleDetailsProfileInfoView.d.setContentDescription(resources.getString(R.string.content_description_view_gplus_profile, str));
                break;
            case 41:
                IdentifiableTextView identifiableTextView = (IdentifiableTextView) view;
                identifiableTextView.setText(this.z ? R.string.own_profile_empty_message : R.string.other_profile_empty_message);
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.play_profile_empty_state_hmargin) + this.d;
                by.a(identifiableTextView, dimensionPixelSize, view.getPaddingTop(), dimensionPixelSize, view.getPaddingBottom());
                identifiableTextView.setIdentifier("empty_state");
                break;
            case 42:
                WarmWelcomeCard warmWelcomeCard = (WarmWelcomeCard) view;
                String string = this.t.getString(R.string.warm_welcome_own_profile_title);
                String string2 = this.t.getString(R.string.warm_welcome_own_profile_body);
                String string3 = this.t.getString(R.string.warm_welcome_own_profile_got_it);
                ds dsVar2 = new ds();
                dsVar2.f3746a = 4;
                dsVar2.f3747b = true;
                dsVar2.f = com.google.android.finsky.c.d.dE.b();
                dsVar2.g = true;
                ds dsVar3 = new ds();
                dsVar3.f3746a = 4;
                dsVar3.f3747b = true;
                dsVar3.f = com.google.android.finsky.c.d.dF.b();
                dsVar3.g = true;
                warmWelcomeCard.a(string, string2, this.B ? null : dsVar2, 9, this.e, null);
                warmWelcomeCard.a(string3, dsVar3, new ao(this, warmWelcomeCard, i), true);
                warmWelcomeCard.b();
                by.a(warmWelcomeCard, this.d, 0, this.d, 0);
                warmWelcomeCard.setIdentifier("self_warm_welcome");
                break;
            default:
                super.a(eqVar, i);
                break;
        }
    }
}
