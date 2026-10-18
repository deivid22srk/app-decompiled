package com.google.android.finsky.layout.play;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gc;
import com.google.android.play.layout.StarRatingBar;

/* loaded from: classes.dex */
public class DiscoveryBadgeSocialRating extends a {
    private StarRatingBar f;
    private View g;
    private Drawable h;

    public DiscoveryBadgeSocialRating(Context context) {
        this(context, null);
    }

    public DiscoveryBadgeSocialRating(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = android.support.v4.c.a.a.c(android.support.v4.b.g.a(context, R.drawable.social_rating_background).mutate());
        setWillNotDraw(false);
    }

    @Override // com.google.android.finsky.layout.play.a, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f = (StarRatingBar) findViewById(R.id.user_rating_bar);
        this.g = findViewById(R.id.user_rating_bar_container);
    }

    @Override // com.google.android.finsky.layout.play.a
    @TargetApi(16)
    public final void a(gc gcVar, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, Document document, DfeToc dfeToc, PackageManager packageManager, cy cyVar) {
        super.a(gcVar, eVar, bVar, document, dfeToc, packageManager, cyVar);
        this.f.setRating(gcVar.o);
        android.support.v4.c.a.a.a(this.h, com.google.android.finsky.utils.ai.a(getContext(), document.f1963a.g));
        if (Build.VERSION.SDK_INT >= 16) {
            this.g.setBackground(this.h);
        } else {
            this.g.setBackgroundDrawable(this.h);
        }
        this.f.setContentDescription(null);
    }

    @Override // com.google.android.finsky.layout.play.a
    protected int getPlayStoreUiElementType() {
        return 1803;
    }
}
