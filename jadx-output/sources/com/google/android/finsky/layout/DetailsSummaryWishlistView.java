package com.google.android.finsky.layout;

import android.accounts.Account;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.js;
import com.google.android.finsky.utils.jx;

/* loaded from: classes.dex */
public class DetailsSummaryWishlistView extends ImageView implements jx {

    /* renamed from: a, reason: collision with root package name */
    private Document f2964a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2965b;

    public DetailsSummaryWishlistView(Context context) {
        this(context, null);
    }

    public DetailsSummaryWishlistView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(Document document, com.google.android.finsky.navigationmanager.b bVar) {
        if (js.a(document, FinskyApp.a().b((String) null))) {
            setVisibility(8);
            return;
        }
        this.f2964a = document;
        setVisibility(0);
        Account i = FinskyApp.a().i();
        a(js.a(document, i), document.f1963a.g);
        setOnClickListener(new ao(this, document, i, bVar));
        this.f2965b = true;
    }

    private void a(boolean z, int i) {
        int i2;
        if (z) {
            setImageResource(com.google.android.finsky.utils.ai.g(i));
            setContentDescription(getContext().getString(R.string.content_description_wishlist_remove));
            return;
        }
        switch (i) {
            case 1:
                i2 = R.drawable.ic_menu_wish_books_off;
                break;
            case 2:
                i2 = R.drawable.ic_menu_wish_music_off;
                break;
            case 3:
                if (!com.google.android.finsky.utils.ai.a()) {
                    i2 = R.drawable.ic_menu_wish_apps_off;
                    break;
                } else {
                    i2 = R.drawable.ic_menu_wish_apps_off_ent;
                    break;
                }
            case 4:
                i2 = R.drawable.ic_menu_wish_movies_off;
                break;
            case 5:
            default:
                throw new IllegalArgumentException("Unsupported backend ID (" + i + ")");
            case 6:
                i2 = R.drawable.ic_menu_wish_newsstand_off;
                break;
        }
        setImageResource(i2);
        setContentDescription(getContext().getString(R.string.content_description_wishlist_add));
    }

    @Override // com.google.android.finsky.utils.jx
    public final void a(String str, boolean z, boolean z2) {
        if (this.f2965b && str.equals(this.f2964a.f1963a.f3890a)) {
            a(z, this.f2964a.f1963a.g);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        js.a(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        js.b(this);
        super.onDetachedFromWindow();
    }
}
