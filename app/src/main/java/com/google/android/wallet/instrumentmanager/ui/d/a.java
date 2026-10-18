package com.google.android.wallet.instrumentmanager.ui.d;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.analytics.f;
import com.google.android.wallet.instrumentmanager.ui.common.ImInfoMessageTextView;
import com.google.android.wallet.ui.common.InfoMessageTextView;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.bq;
import com.google.android.wallet.ui.common.e;
import com.google.b.a.a.a.b.a.apkg.bpkg.apkg.u;
import com.google.b.a.a.a.b.a.j;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends ah<u> implements e {

    /* renamed from: a, reason: collision with root package name */
    ImInfoMessageTextView f7345a;

    /* renamed from: b, reason: collision with root package name */
    private final f f7346b = new f(1700);

    public static a a(u uVar, int i) {
        a aVar = new a();
        aVar.f(a(i, uVar));
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.d
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(com.google.android.wallet.instrumentmanager.f.fragment_dcb_verify_association, (ViewGroup) null);
        this.f7345a = (ImInfoMessageTextView) viewGroup2.findViewById(com.google.android.wallet.instrumentmanager.e.required_message_text);
        if (((u) this.aw).c != null) {
            this.f7345a.setVisibility(0);
            this.f7345a.setParentUiNode(this);
            this.f7345a.setUrlClickListener(this);
            this.f7345a.setInfoMessage(((u) this.aw).c.f7606a);
        }
        u();
        a(1, Bundle.EMPTY);
        return viewGroup2;
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean a(j jVar) {
        return false;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final void u() {
        if (this.f7345a != null) {
            this.f7345a.setEnabled(this.av);
        }
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean v() {
        return true;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final List<ai> w() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.wallet.analytics.e
    public final f getUiElement() {
        return this.f7346b;
    }

    @Override // com.google.android.wallet.analytics.e
    public final List<com.google.android.wallet.analytics.e> getChildren() {
        if (this.f7345a.getVisibility() == 0) {
            return Collections.singletonList(this.f7345a);
        }
        return null;
    }

    @Override // com.google.android.wallet.ui.common.e
    public final void a(View view, String str) {
        if (view == this.f7345a && this.B.a("tagTosWebViewDialog") == null) {
            bq.a(str, this.aI).a(this.B, "tagTosWebViewDialog");
        }
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final boolean z() {
        return (((InfoMessageTextView) this.f7345a).f7455a || ((InfoMessageTextView) this.f7345a).f7456b) ? false : true;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final void A() {
        this.f7345a.a(true);
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final String B() {
        return this.f7345a.getExpandLabel();
    }
}
