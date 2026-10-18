package com.google.android.finsky.activities;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public class ScreenshotsActivityV2 extends com.android.ex.photo.g implements com.android.ex.photo.t {
    public static void a(Context context, Document document, int i, int i2) {
        com.android.ex.photo.f fVar = new com.android.ex.photo.f(context, ScreenshotsActivityV2.class, (byte) 0);
        fVar.f1159a = Integer.valueOf(i);
        fVar.c = com.android.ex.photo.dpkg.b.f1149a;
        fVar.e = true;
        fVar.a(10.0f).f = true;
        Intent a2 = fVar.a();
        a2.putExtra("document", document);
        a2.putExtra("imageType", i2);
        context.startActivity(a2);
    }

    @Override // com.android.ex.photo.g
    public final com.android.ex.photo.k g() {
        return new fr(this, ((Document) getIntent().getParcelableExtra("document")).b(getIntent().getIntExtra("imageType", 1)));
    }

    @Override // com.android.ex.photo.g, com.android.ex.photo.t
    public final com.android.ex.photo.a j() {
        return null;
    }
}
