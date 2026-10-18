package com.google.android.finsky.download.inlineappinstaller.apkg;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.apkg.i;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.gx;
import com.google.android.finsky.protos.p;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class e extends com.google.android.finsky.billing.lightpurchase.bpkg.f<com.google.android.finsky.download.inlineappinstaller.a> {

    /* renamed from: a, reason: collision with root package name */
    public final ai f2711a = i.a(5101);

    /* renamed from: b, reason: collision with root package name */
    public View f2712b;
    public gx c;

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        ik.a(e(), f_(com.google.android.finsky.navigationmanager.a.a(this.c.g)), this.f2712b);
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f
    public final String a(Resources resources) {
        return resources.getString(R.string.install);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f2711a;
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Bundle bundle2 = this.r;
        this.c = (gx) ParcelableProto.a(bundle2, "mediaDoc");
        p pVar = (p) ParcelableProto.a(bundle2, "installStep");
        this.f2712b = layoutInflater.inflate(R.layout.inline_consumption_app_installer, viewGroup, false);
        TextView textView = (TextView) this.f2712b.findViewById(R.id.top_info_text);
        TextView textView2 = (TextView) this.f2712b.findViewById(R.id.body_text);
        int i2 = this.c.g;
        switch (i2) {
            case 1:
                i = R.string.books_download_required_with_link_highlighting;
                break;
            case 6:
                i = R.string.newsstand_download_required_with_link_highlighting;
                break;
            default:
                i = com.google.android.finsky.navigationmanager.a.a(i2);
                break;
        }
        if (pVar != null) {
            textView.setText(Html.fromHtml(pVar.f4233a));
            textView2.setText(Html.fromHtml(f_(i)));
        } else {
            textView.setText(Html.fromHtml(f_(i)));
            textView2.setVisibility(8);
            textView2 = textView;
        }
        textView2.setOnClickListener(new f(this));
        return this.f2712b;
    }

    @Override // com.google.android.finsky.billing.lightpurchase.bpkg.f
    public final void u() {
        ((com.google.android.finsky.download.inlineappinstaller.a) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E)).a(5112, (cy) this);
        com.google.android.finsky.download.inlineappinstaller.a aVar = (com.google.android.finsky.download.inlineappinstaller.a) ((com.google.android.finsky.billing.lightpurchase.bpkg.a) this.E);
        Document document = aVar.f2701a.f2714a;
        if (Build.VERSION.SDK_INT > 22 && document.T() > 22) {
            aVar.f2701a.u();
        } else {
            aVar.f2701a.a(6, 0);
        }
    }

    public static /* synthetic */ com.google.android.finsky.billing.lightpurchase.bpkg.a a(e eVar) {
        return (com.google.android.finsky.billing.lightpurchase.bpkg.a) eVar.E;
    }
}
