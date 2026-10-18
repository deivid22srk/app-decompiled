package com.google.android.wallet.ui.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class d extends Fragment implements r {

    /* renamed from: a, reason: collision with root package name */
    private am f7521a;
    public int aI;
    public ContextThemeWrapper aJ;
    public LayoutInflater aK;

    public abstract View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public static Bundle c(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("themeResourceId", i);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.app.Fragment
    public void a(Activity activity) {
        com.google.android.wallet.common.a aVar;
        super.a(activity);
        if (getExpandable() != null) {
            Fragment fragment = this;
            while (true) {
                if (fragment == 0) {
                    aVar = null;
                    break;
                } else {
                    if (fragment instanceof com.google.android.wallet.common.b) {
                        aVar = ((com.google.android.wallet.common.b) fragment).b();
                        break;
                    }
                    fragment = fragment.E;
                }
            }
            if (aVar == null && (activity instanceof com.google.android.wallet.common.b)) {
                aVar = ((com.google.android.wallet.common.b) activity).b();
            }
            getExpandable().a(activity, aVar);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.aI = this.r.getInt("themeResourceId");
        if (this.aI <= 0) {
            throw new IllegalArgumentException(new StringBuilder(38).append("Invalid theme resource id: ").append(this.aI).toString());
        }
        this.aJ = new ContextThemeWrapper(f(), this.aI);
        if (bundle != null && bundle.containsKey("expandableSavedInstance")) {
            getExpandable().a(bundle.getParcelable("expandableSavedInstance"));
        }
        if (bundle != null) {
            this.f7521a = am.b(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aK = layoutInflater.cloneInContext(this.aJ);
        return c(this.aK, viewGroup, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        if (getExpandable() != null) {
            bundle.putParcelable("expandableSavedInstance", getExpandable().a());
        }
        if (this.f7521a != null) {
            this.f7521a.a(bundle);
        }
    }

    public q getExpandable() {
        return null;
    }

    public final am O() {
        if (this.f7521a == null) {
            this.f7521a = am.b();
        }
        return this.f7521a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.support.v4.app.Fragment] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final void b(Intent intent, int i) {
        d r1 = this;
        while (r1.E != null) {
            r1 = r1.E;
        }
        r1.a(intent, i);
    }
}
