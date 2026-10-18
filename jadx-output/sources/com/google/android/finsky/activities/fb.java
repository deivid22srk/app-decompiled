package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.android.vending.R;
import com.google.android.finsky.protos.ny;

/* loaded from: classes.dex */
public final class fb extends android.support.v4.app.r {
    ff ai = null;

    public static fb a(String str, ny nyVar) {
        fb fbVar = new fb();
        Bundle bundle = new Bundle();
        bundle.putString("doc_id", str);
        bundle.putString("review_id", nyVar.f4191a);
        fbVar.f(bundle);
        return fbVar;
    }

    @Override // android.support.v4.app.r
    public final Dialog c(Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(f(), R.style.FinskyTheme);
        Bundle bundle2 = this.r;
        String string = bundle2.getString("review_id");
        String string2 = bundle2.getString("doc_id");
        if (bundle == null) {
            bundle = bundle2;
        }
        int i = bundle.getInt("previous_rating", -1);
        this.ai = b(i);
        CharSequence[] charSequenceArr = new CharSequence[ff.values().length];
        for (ff ffVar : ff.values()) {
            charSequenceArr[ffVar.e] = contextThemeWrapper.getString(ffVar.f);
        }
        com.google.android.wallet.ui.common.a aVar = new com.google.android.wallet.ui.common.a(contextThemeWrapper);
        aVar.a(R.string.review_feedback_dialog_title);
        aVar.a(true);
        aVar.a(charSequenceArr, i, new fc(this));
        aVar.a(android.R.string.ok, new fd(this, string2, string));
        aVar.b(android.R.string.cancel, (DialogInterface.OnClickListener) null);
        return aVar.a();
    }

    private static ff b(int i) {
        for (ff ffVar : ff.values()) {
            if (ffVar.e == i) {
                return ffVar;
            }
        }
        return null;
    }

    @Override // android.support.v4.app.r, android.support.v4.app.Fragment
    public final void g_() {
        super.g_();
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        ((android.support.v7.a.ac) this.f).f472a.n.setEnabled(this.ai != null);
    }

    @Override // android.support.v4.app.r, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        if (this.ai != null) {
            bundle.putInt("previous_rating", this.ai.e);
        }
    }

    static /* synthetic */ void a(fb fbVar, int i) {
        fbVar.ai = b(i);
        fbVar.u();
    }

    static /* synthetic */ fe b(fb fbVar) {
        ComponentCallbacks componentCallbacks = fbVar.s;
        if (componentCallbacks instanceof fe) {
            return (fe) componentCallbacks;
        }
        android.support.v4.app.c f = fbVar.f();
        if (f instanceof fe) {
            return (fe) f;
        }
        return null;
    }
}
