package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public final class bc extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    private bd f688a;

    /* renamed from: b, reason: collision with root package name */
    private ao f689b;

    public bc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.b.b.seekBarStyle);
    }

    private bc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f689b = ao.a();
        this.f688a = new bd(this, this.f689b);
        this.f688a.a(attributeSet, i);
    }
}
