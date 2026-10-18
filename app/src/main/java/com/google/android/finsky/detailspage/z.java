package com.google.android.finsky.detailspage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.transition.ArcMotion;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.play.image.FifeImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(22)
/* loaded from: classes.dex */
public final class z extends w {
    private Interpolator aB;
    private Bitmap aC;
    private FifeImageView aD;
    private int aE;
    private int aF;
    private int aG;
    private int aH;

    static /* synthetic */ Bitmap k(z zVar) {
        zVar.aC = null;
        return null;
    }

    public static z a(Document document, String str, String str2, String str3, boolean z, View view) {
        FinskyApp a2 = FinskyApp.a();
        z zVar = new z();
        zVar.f(str3);
        zVar.a(a2.g, str);
        zVar.a("finsky.DetailsDataBasedFragment.document", (Parcelable) document);
        zVar.b("finsky.DetailsFragment.continueUrl", str2);
        zVar.b("finsky.DetailsFragment.acquisitionOverride", z);
        if (view != null) {
            String transitionName = view.getTransitionName();
            if (!TextUtils.isEmpty(transitionName)) {
                zVar.am = transitionName;
                if (transitionName.startsWith("transition_card_details:cover:")) {
                    TransitionInflater from = TransitionInflater.from(a2);
                    zVar.aB = AnimationUtils.loadInterpolator(a2, android.R.interpolator.fast_out_slow_in);
                    Transition inflateTransition = from.inflateTransition(com.deivid22srk.store.R.transition.details_transition);
                    inflateTransition.setInterpolator(zVar.aB);
                    inflateTransition.addListener(new aa(zVar));
                    inflateTransition.setDuration(400L);
                    zVar.ac = inflateTransition;
                    zVar.ag = new ae(zVar);
                    Drawable drawable = ((ImageView) view).getDrawable();
                    if (drawable != null) {
                        zVar.aC = ((BitmapDrawable) drawable).getBitmap();
                    }
                } else {
                    int i = document.f1963a.g;
                    zVar.aB = AnimationUtils.loadInterpolator(a2, android.R.interpolator.fast_out_slow_in);
                    com.google.android.finsky.kpkg.a aVar = new com.google.android.finsky.kpkg.a(com.google.android.finsky.utils.ai.a(a2, i));
                    aVar.setInterpolator(zVar.aB);
                    aVar.setPathMotion(new ArcMotion());
                    aVar.f2899a = a2.getResources().getDimensionPixelSize(com.deivid22srk.store.R.dimen.circle_transition_avatar_cap);
                    aVar.addListener(new ac(zVar));
                    aVar.setDuration(400L);
                    zVar.ac = aVar;
                    zVar.ag = new af(zVar);
                    zVar.ah = new ad(zVar);
                }
                zVar.an = true;
            }
        }
        return zVar;
    }

    @Override // com.google.android.finsky.detailspage.w, com.google.android.finsky.activities.bh, com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        if (this.al != null && !TextUtils.isEmpty(this.am) && this.am.startsWith("transition_generic_circle:")) {
            this.al.setTransitionName(this.am);
        }
        return a2;
    }

    @Override // com.google.android.finsky.detailspage.w, com.google.android.finsky.activities.bh, com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d() {
        this.aC = null;
        this.aD = null;
        this.ac = null;
        super.d();
    }

    @Override // com.google.android.finsky.detailspage.w
    protected final boolean b(bd bdVar) {
        if (!this.an || (bdVar instanceof ai)) {
            return bdVar.W_();
        }
        return false;
    }

    @Override // com.google.android.finsky.detailspage.w
    protected final boolean Z_() {
        return this.am != null && this.am.startsWith("transition_card_details:cover:");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.finsky.epkg.q
    public final boolean G() {
        if (!TextUtils.isEmpty(this.am)) {
            TransitionSet transitionSet = new TransitionSet();
            if (this.aj != null && this.aj.getTransitionName() == null) {
                if (this.f) {
                    Transition fade = new Fade();
                    fade.setInterpolator(this.aB);
                    fade.addTarget(this.aj);
                    fade.setDuration(400L);
                    transitionSet.addTransition(fade);
                } else {
                    Transition mVar = new com.google.android.finsky.kpkg.m();
                    mVar.setInterpolator(this.aB);
                    mVar.addTarget(this.aj);
                    mVar.setDuration(600L);
                    transitionSet.addTransition(mVar);
                }
            }
            Transition fade2 = new Fade();
            com.google.android.finsky.kpkg.l lVar = new com.google.android.finsky.kpkg.l();
            lVar.setInterpolator(this.aB);
            ArrayList arrayList = new ArrayList();
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                bw bwVar = this.h.get(i);
                if (bwVar.t != null) {
                    View view = bwVar.t.f795a;
                    if (view instanceof com.google.android.finsky.layout.aj) {
                        ((com.google.android.finsky.layout.aj) view).a(arrayList);
                    } else {
                        lVar.addTarget(view);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fade2.addTarget(((Integer) it.next()).intValue());
            }
            fade2.setDuration(133L);
            lVar.setDuration(600L);
            Transition fade3 = new Fade();
            fade3.addTarget(com.deivid22srk.store.R.id.title_background);
            fade3.setDuration(133L);
            transitionSet.addTransition(fade3);
            transitionSet.addTransition(fade2);
            transitionSet.addTransition(lVar);
            this.Y = transitionSet;
        }
        return super.G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(z zVar, Bitmap bitmap) {
        int size = zVar.h.size();
        for (int i = 0; i < size; i++) {
            bw bwVar = zVar.h.get(i);
            if (bwVar.t != null && (bwVar instanceof er)) {
                ((er) bwVar).a(bitmap);
                return;
            }
        }
    }

    static /* synthetic */ Drawable b(z zVar) {
        int size = zVar.h.size();
        for (int i = 0; i < size; i++) {
            bw bwVar = zVar.h.get(i);
            if (bwVar.t != null && (bwVar instanceof er)) {
                return bwVar.t.f795a.getBackground();
            }
        }
        return null;
    }

    static /* synthetic */ List c(z zVar) {
        ArrayList arrayList = new ArrayList();
        int size = zVar.h.size();
        for (int i = 0; i < size; i++) {
            bw bwVar = zVar.h.get(i);
            if (bwVar.t != null) {
                KeyEvent.Callback callback = bwVar.t.f795a;
                if (callback instanceof com.google.android.finsky.layout.aj) {
                    ((com.google.android.finsky.layout.aj) callback).b(arrayList);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void i(z zVar) {
        int size = zVar.h.size();
        for (int i = 0; i < size; i++) {
            bw bwVar = zVar.h.get(i);
            if (bwVar.t != null && (bwVar instanceof er)) {
                ((er) bwVar).a();
                return;
            }
        }
    }
}
