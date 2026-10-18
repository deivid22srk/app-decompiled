package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.fe;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public class PlayBundleContainerView extends ci {

    /* renamed from: a, reason: collision with root package name */
    private LinearLayout f3301a;

    /* renamed from: b, reason: collision with root package name */
    private PlayActionButton f3302b;
    private TextView c;
    private String d;

    public PlayBundleContainerView(Context context) {
        this(context, null);
    }

    public PlayBundleContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3301a = (LinearLayout) findViewById(R.id.install_list);
        this.c = (TextView) findViewById(R.id.title);
        this.f3302b = (PlayActionButton) findViewById(R.id.bulk_install_button);
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 421;
    }

    public final void a(com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, Document document, View.OnClickListener onClickListener, cy cyVar, int i, String str) {
        boolean z;
        if (this.d == document.f1963a.f3890a) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.f3301a.getChildCount()) {
                    ((PlayBundleContainerViewRow) this.f3301a.getChildAt(i3)).a(i, str);
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        } else {
            a(document.f1963a.R, cyVar);
            this.d = document.f1963a.f3890a;
            this.c.setText(document.f1963a.i);
            this.f3302b.a(3, R.string.install_all, onClickListener);
            LayoutInflater from = LayoutInflater.from(getContext());
            boolean z2 = false;
            Document[] b2 = document.b();
            int length = b2.length;
            int i4 = 0;
            while (i4 < length) {
                Document document2 = b2[i4];
                PlayBundleContainerViewRow playBundleContainerViewRow = (PlayBundleContainerViewRow) from.inflate(R.layout.play_bundle_container_view_row, (ViewGroup) this.f3301a, false);
                fe.a(playBundleContainerViewRow, document2, document2.f1963a.f3890a, eVar, bVar, getPlayStoreUiElementNode());
                playBundleContainerViewRow.a(i, str);
                this.f3301a.addView(playBundleContainerViewRow);
                if (!z2 && document2.f1963a.g == 3) {
                    com.google.android.finsky.b.b a2 = FinskyApp.a().s.a(document2.f1963a.f3890a);
                    if (!((a2 == null || a2.c == null || a2.c.c == -1) ? false : true)) {
                        z = true;
                        i4++;
                        z2 = z;
                    }
                }
                z = z2;
                i4++;
                z2 = z;
            }
            this.f3302b.setVisibility(z2 ? 0 : 4);
        }
    }
}
