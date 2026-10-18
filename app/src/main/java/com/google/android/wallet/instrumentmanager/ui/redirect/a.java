package com.google.android.wallet.instrumentmanager.ui.redirect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.analytics.e;
import com.google.android.wallet.analytics.f;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.ai;
import com.google.b.a.a.a.b.a.j;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends ah<com.google.b.a.a.a.b.a.apkg.dpkg.b> {

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.apkg.dpkg.c f7347a;

    /* renamed from: b, reason: collision with root package name */
    private final f f7348b = new f(1745);

    public static a a(com.google.b.a.a.a.b.a.apkg.dpkg.b bVar, int i) {
        a aVar = new a();
        aVar.f(a(i, bVar));
        return aVar;
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.ag
    public final void a(int i, Bundle bundle) {
        switch (i) {
            case 4:
                break;
            default:
                super.a(i, bundle);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.ah
    public final void u() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.d
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean a(j jVar) {
        return false;
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean v() {
        return this.f7347a != null;
    }

    @Override // com.google.android.wallet.analytics.e
    public final f getUiElement() {
        return this.f7348b;
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
