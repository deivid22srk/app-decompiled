package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gc;

/* loaded from: classes.dex */
public class DiscoveryBadgeFamilyCategory extends a {
    private ImageView f;

    public DiscoveryBadgeFamilyCategory(Context context) {
        this(context, null);
    }

    public DiscoveryBadgeFamilyCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.a, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f = (ImageView) findViewById(R.id.overlay_icon);
    }

    @Override // com.google.android.finsky.layout.play.a
    public final void a(gc gcVar, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, Document document, DfeToc dfeToc, PackageManager packageManager, cy cyVar) {
        int i = R.drawable.family_apps_mini_badge;
        super.a(gcVar, eVar, bVar, document, dfeToc, packageManager, cyVar);
        ImageView imageView = this.f;
        switch (document.f1963a.g) {
            case 1:
                i = R.drawable.family_books_mini_badge;
                break;
            case 4:
                i = R.drawable.family_movies_mini_badge;
                break;
        }
        imageView.setImageResource(i);
    }

    @Override // com.google.android.finsky.layout.play.a
    protected int getPlayStoreUiElementType() {
        return 1801;
    }

    @Override // com.google.android.finsky.layout.play.a
    protected final void a() {
        this.f3386a.setBitmapTransformation(com.google.android.play.image.a.b(getResources(), this.c));
    }
}
