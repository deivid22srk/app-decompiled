package com.google.android.wallet.common.e;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.analytics.e;
import com.google.android.wallet.analytics.f;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.ai;
import com.google.b.a.a.a.b.a.j;
import com.google.protobuf.nano.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends ah<c> {

    /* renamed from: a, reason: collision with root package name */
    private final f f7280a = new f(1760);

    /* renamed from: b, reason: collision with root package name */
    private boolean f7281b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.ah
    public final void u() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.d
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.f7281b = bundle.getBoolean("errorShown");
        }
    }

    @Override // com.google.android.wallet.ui.common.ah, android.support.v4.app.Fragment
    public final void o() {
        super.o();
        if (!this.f7281b) {
            a(5, this.r.getBundle("errorDetails"));
            this.f7281b = true;
        }
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("errorShown", this.f7281b);
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean a(j jVar) {
        return false;
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean v() {
        return true;
    }

    @Override // com.google.android.wallet.analytics.e
    public final f getUiElement() {
        return this.f7280a;
    }

    @Override // com.google.android.wallet.analytics.e
    public final List<e> getChildren() {
        return null;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final List<ai> w() {
        return Collections.EMPTY_LIST;
    }
}
