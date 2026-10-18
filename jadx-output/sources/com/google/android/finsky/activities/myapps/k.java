package com.google.android.finsky.activities.myapps;

import android.view.View;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f1827a;

    /* renamed from: b, reason: collision with root package name */
    public final PlayActionButton f1828b;
    public final View c;
    public final TextView d;

    public k(View view) {
        this.f1827a = (TextView) view.findViewById(R.id.header_text);
        this.f1828b = (PlayActionButton) view.findViewById(R.id.bulk_action_button);
        this.c = view.findViewById(R.id.loading_progress);
        this.d = (TextView) view.findViewById(R.id.count);
        view.setTag(this);
    }
}
