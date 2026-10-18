package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.play.layout.PlayActionButton;
import java.util.Arrays;

/* loaded from: classes.dex */
public class PlayBundleContainerViewRow extends com.google.android.play.layout.a {
    private View E;
    private Document F;
    private View G;
    private boolean H;

    /* renamed from: a, reason: collision with root package name */
    private PlayActionButton f3303a;

    public PlayBundleContainerViewRow(Context context) {
        this(context, null, 0);
    }

    public PlayBundleContainerViewRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayBundleContainerViewRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3303a = (PlayActionButton) findViewById(R.id.install_button);
        this.E = findViewById(R.id.loading_progress_bar);
        this.G = findViewById(R.id.bottom_row);
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 19;
    }

    public void setExtraInfo(Document document) {
        this.F = document;
        b();
    }

    private void b() {
        ao aoVar = new ao(this, Arrays.asList(this.F));
        if (this.F.f1963a.g == 3) {
            com.google.android.finsky.bpkg.b a2 = FinskyApp.a().s.a(this.F.f1963a.f3890a);
            boolean z = (a2 == null || a2.c == null || a2.c.c == -1) ? false : true;
            this.f3303a.setVisibility(0);
            if (z) {
                this.f3303a.setClickable(false);
                this.f3303a.a(3, R.string.my_apps_tab_installed, (View.OnClickListener) null);
                this.f3303a.setDrawAsLabel(true);
                return;
            } else {
                this.f3303a.a(3, R.string.install, aoVar);
                this.f3303a.setDrawAsLabel(false);
                return;
            }
        }
        this.f3303a.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r1 = 0
            com.google.android.finsky.api.model.Document r0 = r3.F
            com.google.android.finsky.protos.gx r0 = r0.f1963a
            java.lang.String r0 = r0.f3890a
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Le
        Ld:
            return
        Le:
            r0 = -1
            if (r4 == r0) goto L14
            switch(r4) {
                case 0: goto L29;
                case 1: goto L29;
                case 2: goto L14;
                case 3: goto L14;
                case 4: goto L29;
                default: goto L14;
            }
        L14:
            r0 = r1
        L15:
            boolean r2 = r3.H
            if (r0 == r2) goto Ld
            r3.H = r0
            if (r0 == 0) goto L2b
            android.view.View r0 = r3.G
            r2 = 4
            r0.setVisibility(r2)
            android.view.View r0 = r3.E
            r0.setVisibility(r1)
            goto Ld
        L29:
            r0 = 1
            goto L15
        L2b:
            android.view.View r0 = r3.E
            r2 = 8
            r0.setVisibility(r2)
            android.view.View r0 = r3.G
            r0.setVisibility(r1)
            r3.b()
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layout.play.PlayBundleContainerViewRow.a(int, java.lang.String):void");
    }
}
