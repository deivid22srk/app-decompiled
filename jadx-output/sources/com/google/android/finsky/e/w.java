package com.google.android.finsky.e;

import android.os.Bundle;
import com.google.android.finsky.api.model.DfeToc;

/* loaded from: classes.dex */
public abstract class w extends q {
    public String aA;

    @Override // com.google.android.finsky.e.q, android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.aA = this.r.getString("finsky.UrlBasedPageFragment.url");
    }

    public final void a(DfeToc dfeToc, String str) {
        a("finsky.PageFragment.toc", dfeToc);
        b("finsky.UrlBasedPageFragment.url", str);
    }
}
