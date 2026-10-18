package com.google.android.finsky.activities;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.DecoratedTextView;
import com.google.android.finsky.layout.play.PlayCardClusterViewHeader;
import com.google.android.finsky.protos.ol;
import com.google.android.finsky.utils.ik;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public final class dx extends bh implements View.OnClickListener, com.google.android.finsky.installer.p, com.google.android.finsky.layout.play.da {
    private ViewGroup aB;
    private ViewGroup aC;
    private TextView aD;
    private TextView aE;
    private ProgressBar aF;
    private ImageView aG;
    private TextView aH;
    private TextView aI;
    private Handler aJ;
    private com.google.android.finsky.api.model.i ai;
    private TextView aj;
    private ViewGroup ak;
    private DecoratedTextView al;
    private ViewGroup am;
    private ViewGroup an;
    private ol i;
    private long aK = com.google.android.finsky.a.i.g();
    private FinskyApp g = FinskyApp.a();
    private com.google.android.finsky.receivers.f h = this.g.k;

    public static dx a(FinskyApp finskyApp, Document document, String str) {
        dx dxVar = new dx();
        dxVar.a(finskyApp.g, com.google.android.finsky.api.s.a(document.f1963a.f3890a));
        dxVar.f(str);
        dxVar.a("finsky.DetailsDataBasedFragment.document", document);
        return dxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.q
    public final int w() {
        return R.layout.inline_app_post_purchase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.bh
    public final int l_() {
        return 5401;
    }

    private <V extends View> V b(int i) {
        return (V) this.av.findViewById(i);
    }

    @Override // com.google.android.finsky.activities.bh, com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        this.aj = (TextView) b(R.id.title_title);
        this.ak = (ViewGroup) b(R.id.title_creator_panel);
        this.al = (DecoratedTextView) this.ak.findViewById(R.id.title_creator);
        this.am = (ViewGroup) b(R.id.title_details_summary);
        this.an = (ViewGroup) b(R.id.title_details_summary_dynamic);
        this.aB = (ViewGroup) this.an.findViewById(R.id.button_container);
        this.aC = (ViewGroup) this.an.findViewById(R.id.download_progress_panel);
        this.aD = (TextView) this.aC.findViewById(R.id.downloading_bytes);
        this.aE = (TextView) this.aC.findViewById(R.id.downloading_percentage);
        this.aF = (ProgressBar) this.aC.findViewById(R.id.progress_bar);
        this.aG = (ImageView) this.aC.findViewById(R.id.cancel_download);
        this.aH = (TextView) this.an.findViewById(R.id.summary_dynamic_status);
        this.aI = (TextView) b(R.id.cont);
        this.h.a(this);
        return a2;
    }

    @Override // com.google.android.finsky.activities.bh, com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void d() {
        this.h.b(this);
        super.d();
    }

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public final void a(Activity activity) {
        this.aJ = new Handler(activity.getMainLooper());
        super.a(activity);
    }

    private void H() {
        this.an.setVisibility(0);
        com.google.android.finsky.receivers.g j = this.h.j(((bh) this).f1612a.E().w);
        switch (j.f4476a) {
            case 0:
                this.aH.setVisibility(4);
                this.aC.setVisibility(4);
                PlayActionButton playActionButton = (PlayActionButton) this.aB.findViewById(R.id.launch_button);
                Document document = ((bh) this).f1612a;
                a aVar = new a(document.E().w, this.g.s, this.g.p);
                if (aVar.j && !aVar.k) {
                    playActionButton.a(document.f1963a.g, R.string.open, this.as.a(document, this.aq.b(), this));
                    playActionButton.setActionStyle(0);
                    playActionButton.setVisibility(0);
                } else {
                    playActionButton.setVisibility(8);
                    if (!aVar.f1527a) {
                        c(R.string.generic_get_app_error);
                    } else {
                        c(R.string.app_install_success);
                    }
                }
                ik.a(this.aB, 4);
                break;
            case 1:
            case 2:
            default:
                this.aB.setVisibility(4);
                this.aH.setVisibility(4);
                com.google.android.finsky.adapters.y.a(this.ap, j, this.aD, this.aE, this.aF);
                this.aG.setOnClickListener(this);
                if (j.f4476a == 1) {
                    this.aD.setText(R.string.download_pending);
                }
                this.aC.setVisibility(0);
                break;
            case 3:
                c(R.string.installing);
                break;
            case 4:
                c(R.string.uninstalling);
                break;
        }
    }

    private void c(int i) {
        this.aB.setVisibility(4);
        this.aC.setVisibility(4);
        this.aH.setText(this.ap.getResources().getString(i));
        this.aH.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.aI) {
            f().finish();
        } else if (view == this.aG) {
            this.h.k(((bh) this).f1612a.E().w);
            this.aC.setVisibility(4);
        }
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.layout.play.da
    public final void p_() {
        this.aK = com.google.android.finsky.a.i.g();
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.layout.play.da
    public final void i() {
        com.google.android.finsky.a.i.a(this.aJ, this.aK, this);
    }

    @Override // com.google.android.finsky.e.q, com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this.aJ, this.aK, this, cyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.bh
    public final void k_() {
        Document document = ((bh) this).f1612a;
        this.aj.setText(document.f1963a.i);
        this.ak.setVisibility(0);
        this.al.setText(document.f1963a.m);
        H();
        if (x() && this.i == null) {
            ol[] o = ((bh) this).f1612a.o();
            if (o.length > 0) {
                this.i = o[o.length / 2];
            }
            if (this.i != null) {
                this.ai = new com.google.android.finsky.api.model.i(this.aq, this.i.e, false);
                this.ai.a(new dy(this));
                this.ai.q();
            }
        }
        this.aI.setText(f_(R.string.continue_text).toUpperCase());
        this.aI.setOnClickListener(this);
    }

    @Override // com.google.android.finsky.installer.p
    public final void a(String str, int i, int i2) {
        if (str.equals(((bh) this).f1612a.E().w)) {
            if (i == 2) {
                f().finish();
            } else {
                H();
            }
        }
    }

    static /* synthetic */ void a(dx dxVar) {
        String str;
        Document document = ((com.google.android.finsky.api.model.d) dxVar.ai).f1970a;
        com.google.android.finsky.layout.play.ad adVar = new com.google.android.finsky.layout.play.ad(400, document.f1963a.R, dxVar);
        LayoutInflater from = LayoutInflater.from(dxVar.ap);
        ViewGroup viewGroup = (ViewGroup) dxVar.b(R.id.suggestion_cluster);
        viewGroup.removeAllViews();
        PlayCardClusterViewHeader playCardClusterViewHeader = (PlayCardClusterViewHeader) from.inflate(R.layout.play_card_cluster_header, viewGroup, false);
        Document document2 = ((com.google.android.finsky.api.model.d) dxVar.ai).f1970a;
        if (!TextUtils.isEmpty(dxVar.i.f4213a)) {
            str = dxVar.i.f4213a;
        } else {
            str = document2.f1963a.i;
        }
        dz dzVar = new dz(dxVar, str, adVar);
        playCardClusterViewHeader.a(dxVar.ai.c(), str, null, ik.a(dxVar.ap, document2, 3, dzVar, dxVar.i.g, true), dzVar);
        viewGroup.addView(playCardClusterViewHeader);
        int min = Math.min(dxVar.ai.p(), 3);
        for (int i = 0; i < min; i++) {
            Document c = dxVar.ai.c(i);
            ViewGroup viewGroup2 = (ViewGroup) from.inflate(R.layout.bucket_row, viewGroup, false);
            com.google.android.play.layout.a aVar = (com.google.android.play.layout.a) from.inflate(R.layout.play_card_listing, viewGroup2, false);
            com.google.android.finsky.utils.fe.a(aVar, c, document.f1963a.f3890a, dxVar.ar, dxVar.as, adVar);
            viewGroup2.addView(aVar);
            viewGroup.addView(viewGroup2);
        }
        viewGroup.requestLayout();
    }
}
