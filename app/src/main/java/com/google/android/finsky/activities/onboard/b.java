package com.google.android.finsky.activities.onboard;

import android.util.Property;
import android.widget.TextView;

/* loaded from: classes.dex */
final class b extends Property<TextView, Integer> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AnimatedEntertainmentOnboardPage f1857a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(AnimatedEntertainmentOnboardPage animatedEntertainmentOnboardPage, Class cls, String str) {
        super(cls, str);
        this.f1857a = animatedEntertainmentOnboardPage;
    }

    @Override // android.util.Property
    public final /* synthetic */ Integer get(TextView textView) {
        return Integer.valueOf(textView.getCurrentTextColor());
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(TextView textView, Integer num) {
        textView.setTextColor(num.intValue());
    }
}
