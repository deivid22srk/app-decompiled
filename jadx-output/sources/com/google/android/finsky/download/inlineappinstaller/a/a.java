package com.google.android.finsky.download.inlineappinstaller.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.ai;
import com.google.android.finsky.a.i;
import com.google.android.finsky.adapters.y;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class a extends com.google.android.finsky.billing.lightpurchase.b.f<com.google.android.finsky.download.inlineappinstaller.a> implements View.OnClickListener, com.google.android.finsky.download.inlineappinstaller.d {

    /* renamed from: a, reason: collision with root package name */
    private final ai f2703a = i.a(5101);

    /* renamed from: b, reason: collision with root package name */
    private TextView f2704b;
    private TextView c;
    private Document d;
    private ImageView e;
    private ProgressBar f;
    private View g;

    public static a a(Document document) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("appDoc", document);
        aVar.f(bundle);
        return aVar;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final boolean x() {
        return false;
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        ik.a(e(), f_(R.string.installing_app), this.g);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final String a(Resources resources) {
        return null;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.b.f
    public final void u() {
        FinskyLog.e("onContinueButtonClicked clicked", new Object[0]);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2703a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != this.e) {
            return;
        }
        String str = this.d.f1963a.c;
        if (str != null) {
            FinskyApp.a().k.k(str);
        }
        ((com.google.android.finsky.download.inlineappinstaller.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).a(5106, (cy) this);
        ((com.google.android.finsky.download.inlineappinstaller.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).b(false);
    }

    private String y() {
        return this.d.f1963a.c;
    }

    @Override // com.google.android.finsky.download.inlineappinstaller.d
    public final void c_(int i) {
        boolean z;
        int i2 = R.string.install_failed_title;
        int i3 = 0;
        switch (i) {
            case 0:
            case 1:
            case 4:
                y.a(e(), FinskyApp.a().k.j(y()), this.c, this.f2704b, this.f);
                this.e.setVisibility(i == 1 ? 0 : 8);
                z = false;
                break;
            case 2:
                this.c.setText(R.string.canceling_download);
                z = false;
                i3 = R.string.canceling_download;
                break;
            case 3:
            case 5:
                if (i != 5) {
                    i2 = R.string.error_while_downloading_title;
                }
                this.c.setText(i2);
                i3 = i2;
                z = true;
                break;
            case 6:
                com.google.android.finsky.download.inlineappinstaller.c cVar = ((com.google.android.finsky.download.inlineappinstaller.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).f2701a;
                if (cVar.as != 7) {
                    FinskyLog.e("switchToDownloadStep() called in state %d", Integer.valueOf(cVar.as));
                }
                cVar.a(8, 0);
                z = false;
                break;
            default:
                FinskyLog.e("Install package event %s: unexpected %d", y(), Integer.valueOf(i));
                z = false;
                i3 = R.string.install_failed_title;
                break;
        }
        if (z) {
            this.f.setVisibility(4);
            ((com.google.android.finsky.download.inlineappinstaller.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).f2701a.a(f_(i3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0098  */
    @Override // android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r7 = -1
            r1 = 1
            r3 = 0
            android.os.Bundle r0 = r8.r
            java.lang.String r2 = "appDoc"
            android.os.Parcelable r0 = r0.getParcelable(r2)
            com.google.android.finsky.api.model.Document r0 = (com.google.android.finsky.api.model.Document) r0
            r8.d = r0
            r0 = 2130968798(0x7f0400de, float:1.754626E38)
            android.view.View r0 = r9.inflate(r0, r10, r3)
            r8.g = r0
            android.view.View r0 = r8.g
            r2 = 2131886245(0x7f1200a5, float:1.9407063E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2 = 2131362274(0x7f0a01e2, float:1.8344324E38)
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.google.android.finsky.api.model.Document r5 = r8.d
            com.google.android.finsky.protos.gx r5 = r5.f1963a
            java.lang.String r5 = r5.i
            r4[r3] = r5
            java.lang.String r2 = r8.a(r2, r4)
            r0.setText(r2)
            android.view.View r0 = r8.g
            r2 = 2131886690(0x7f120262, float:1.9407966E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r8.f = r0
            android.view.View r0 = r8.g
            r2 = 2131886460(0x7f12017c, float:1.94075E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r8.e = r0
            android.widget.ImageView r0 = r8.e
            r0.setOnClickListener(r8)
            android.view.View r0 = r8.g
            r2 = 2131886461(0x7f12017d, float:1.9407501E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f2704b = r0
            android.view.View r0 = r8.g
            r2 = 2131886689(0x7f120261, float:1.9407964E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.c = r0
            com.google.android.finsky.api.model.Document r0 = r8.d
            android.view.View r2 = r8.g
            com.google.android.finsky.navigationmanager.a.a(r0, r2)
            android.support.v4.app.Fragment r0 = r8.E
            com.google.android.finsky.billing.lightpurchase.b.a r0 = (com.google.android.finsky.billing.lightpurchase.b.a) r0
            com.google.android.finsky.download.inlineappinstaller.a r0 = (com.google.android.finsky.download.inlineappinstaller.a) r0
            com.google.android.finsky.download.inlineappinstaller.c r2 = r0.f2701a
            int r2 = r2.c
            if (r2 != r7) goto Lc3
            com.google.android.finsky.FinskyApp r4 = com.google.android.finsky.FinskyApp.a()
            com.google.android.finsky.receivers.f r4 = r4.k
            com.google.android.finsky.api.model.Document r5 = r8.d
            com.google.android.finsky.protos.gx r5 = r5.f1963a
            java.lang.String r5 = r5.c
            int r4 = r4.i(r5)
            r5 = 2
            if (r4 != r5) goto La5
        L96:
            if (r1 == r7) goto L9b
            r8.c_(r1)
        L9b:
            com.google.android.finsky.download.inlineappinstaller.c r0 = r0.f2701a
            java.util.List<com.google.android.finsky.download.inlineappinstaller.d> r0 = r0.d
            r0.add(r8)
            android.view.View r0 = r8.g
            return r0
        La5:
            r5 = 3
            if (r4 != r5) goto Laa
            r1 = 4
            goto L96
        Laa:
            android.content.Context r4 = r0.e()
            com.google.android.finsky.api.model.Document r5 = new com.google.android.finsky.api.model.Document
            com.google.android.finsky.protos.gx r6 = r0.f2702b
            r5.<init>(r6)
            android.accounts.Account r6 = r0.i
            boolean r4 = com.google.android.finsky.navigationmanager.a.a(r4, r5, r6)
            if (r4 != 0) goto Lc1
        Lbd:
            if (r1 == 0) goto Lc3
            r1 = 6
            goto L96
        Lc1:
            r1 = r3
            goto Lbd
        Lc3:
            r1 = r2
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.download.inlineappinstaller.a.a.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // android.support.v4.app.Fragment
    public final void d() {
        ((com.google.android.finsky.download.inlineappinstaller.a) ((com.google.android.finsky.billing.lightpurchase.b.a) this.E)).f2701a.d.remove(this);
        super.d();
    }
}
