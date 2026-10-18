package com.google.android.finsky.activities;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class z extends gj {
    private aa aj;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(android.support.v4.app.aa aaVar, Activity activity) {
        if (aaVar.a("bg_data_dialog") == null) {
            z zVar = new z();
            if (activity instanceof aa) {
                zVar.aj = (aa) activity;
            }
            new gn().c(R.string.background_data_prompt_title).e(R.string.background_data_prompt_cancel).b(activity.getString(R.string.background_data_error, new Object[]{com.google.android.finsky.cpkg.d.aq.b()})).a(false).a(320, null, -1, -1, FinskyApp.a().i()).a(zVar);
            zVar.a(aaVar, "bg_data_dialog");
        }
    }

    public static void a(android.support.v4.app.aa aaVar) {
        Fragment a2 = aaVar.a("bg_data_dialog");
        if (a2 == null) {
            return;
        }
        ((android.support.v4.app.r) a2).a(false);
    }

    @Override // com.google.android.finsky.activities.gj
    protected final void u() {
        super.u();
        if (this.aj != null) {
            this.aj.u_();
        }
    }
}
