package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.api.model.Document;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public final class at implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.a.i f3140a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.layout.play.cy f3141b;
    final /* synthetic */ com.google.android.finsky.navigationmanager.b c;
    final /* synthetic */ Document d;
    final /* synthetic */ DetailsTitleCreatorBlock e;

    public at(DetailsTitleCreatorBlock detailsTitleCreatorBlock, com.google.android.finsky.a.i iVar, com.google.android.finsky.layout.play.cy cyVar, com.google.android.finsky.navigationmanager.b bVar, Document document) {
        this.e = detailsTitleCreatorBlock;
        this.f3140a = iVar;
        this.f3141b = cyVar;
        this.c = bVar;
        this.d = document;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FifeImageView fifeImageView;
        FifeImageView fifeImageView2;
        this.f3140a.a(126, (byte[]) null, this.f3141b);
        if (com.google.android.finsky.navigationmanager.b.h()) {
            fifeImageView = this.e.f2969a;
            if (fifeImageView.getVisibility() == 0) {
                com.google.android.finsky.navigationmanager.b bVar = this.c;
                Document document = this.d;
                fifeImageView2 = this.e.f2969a;
                bVar.a(document, fifeImageView2);
                return;
            }
        }
        this.c.a(this.d);
    }
}
