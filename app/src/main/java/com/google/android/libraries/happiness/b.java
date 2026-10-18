package com.google.android.libraries.happiness;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.r;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public final class b extends r {
    WebView ai;
    Runnable aj;
    private ViewGroup ak;
    private int al;
    private int am;
    private boolean an;

    @Override // android.support.v4.app.r, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.al = R.layout.survey_dialog;
        this.am = R.id.survey_container;
        if (bundle != null) {
            this.an = bundle.getBoolean("showSurveyPrompt.HATS_SURVEY_RENDERED");
        }
    }

    @Override // android.support.v4.app.r, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("showSurveyPrompt.HATS_SURVEY_RENDERED", this.an);
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        b(true);
        View inflate = layoutInflater.inflate(this.al, viewGroup);
        this.ak = (ViewGroup) inflate.findViewById(this.am);
        u();
        return inflate;
    }

    @Override // android.support.v4.app.r, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        if (this.an && this.ai == null) {
            f().setRequestedOrientation(-1);
            a(false);
        }
    }

    @Override // android.support.v4.app.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.aj != null) {
            this.aj.run();
        }
    }

    final void u() {
        if (this.ai != null && this.ak != null) {
            ViewGroup viewGroup = (ViewGroup) this.ai.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.ai);
            }
            this.ak.addView(this.ai, 0, new ViewGroup.LayoutParams(-1, -1));
            this.an = true;
        }
    }
}
