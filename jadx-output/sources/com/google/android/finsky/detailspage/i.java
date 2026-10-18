package com.google.android.finsky.detailspage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public class i extends bd<j> implements ai, er {
    @Override // com.google.android.finsky.detailspage.bd
    public final boolean W_() {
        return this.f2559b != 0;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final int c() {
        return R.layout.avatar_title_module;
    }

    @Override // com.google.android.finsky.detailspage.bw
    public final void a(View view) {
        AvatarTitleModuleLayout avatarTitleModuleLayout = (AvatarTitleModuleLayout) view;
        String str = ((j) this.f2559b).f2657a;
        com.google.android.finsky.protos.ds dsVar = ((j) this.f2559b).f2658b;
        String str2 = this.o;
        String str3 = ((j) this.f2559b).c;
        com.google.android.play.image.e eVar = this.h;
        boolean z = this.p;
        avatarTitleModuleLayout.f2480a.setText(str);
        avatarTitleModuleLayout.f2480a.setSelected(true);
        if (dsVar != null) {
            avatarTitleModuleLayout.c = !TextUtils.isEmpty(str2);
            if (com.google.android.finsky.navigationmanager.b.h() && avatarTitleModuleLayout.c) {
                avatarTitleModuleLayout.f2481b.setTransitionName(str2);
            }
            if (!z) {
                avatarTitleModuleLayout.f2481b.setBitmapTransformation(com.google.android.play.image.a.a(avatarTitleModuleLayout.getResources()));
                avatarTitleModuleLayout.f2481b.a(dsVar.f, dsVar.l, eVar);
            }
            avatarTitleModuleLayout.f2481b.setContentDescription(str3);
            avatarTitleModuleLayout.f2481b.setVisibility(0);
        } else {
            avatarTitleModuleLayout.f2481b.setVisibility(4);
        }
        avatarTitleModuleLayout.f2481b.setContentDescription(str3);
    }

    @Override // com.google.android.finsky.detailspage.er
    public final void a() {
        if (((j) this.f2559b).f2658b != null) {
            AvatarTitleModuleLayout avatarTitleModuleLayout = (AvatarTitleModuleLayout) this.t.f795a;
            com.google.android.finsky.protos.ds dsVar = ((j) this.f2559b).f2658b;
            com.google.android.play.image.e eVar = this.h;
            avatarTitleModuleLayout.f2481b.setBitmapTransformation(com.google.android.play.image.a.a(avatarTitleModuleLayout.getResources()));
            avatarTitleModuleLayout.f2481b.a(dsVar.f, dsVar.l, eVar);
        }
    }

    @Override // com.google.android.finsky.detailspage.bd
    public final void a(boolean z, Document document, com.google.android.finsky.api.model.h hVar, Document document2, com.google.android.finsky.api.model.h hVar2) {
        boolean z2;
        switch (document.f1963a.e) {
            case 3:
            case 8:
            case 30:
            case 34:
                z2 = true;
                break;
            default:
                z2 = false;
                break;
        }
        if (z2) {
            this.f2559b = new j();
            ((j) this.f2559b).f2657a = document.f1963a.i;
            ((j) this.f2559b).f2658b = document.c(4) ? document.b(4).get(0) : null;
            ((j) this.f2559b).c = com.google.android.finsky.utils.ai.a(document, this.c.getResources());
        }
    }

    @Override // com.google.android.finsky.detailspage.er
    public final void a(Bitmap bitmap) {
        AvatarTitleModuleLayout avatarTitleModuleLayout = (AvatarTitleModuleLayout) this.t.f795a;
        avatarTitleModuleLayout.f2481b.setUseCachedPlaceholder(false);
        avatarTitleModuleLayout.f2481b.setToFadeInAfterLoad(false);
        avatarTitleModuleLayout.f2481b.setBitmapTransformation(null);
        avatarTitleModuleLayout.f2481b.setImageBitmap(bitmap);
        avatarTitleModuleLayout.f2481b.setDefaultDrawable(new BitmapDrawable(avatarTitleModuleLayout.getResources(), bitmap));
    }
}
