package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.deivid22srk.store.R;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    protected ProgressBar f3249a;

    /* renamed from: b, reason: collision with root package name */
    protected LinearLayout f3250b;
    protected ProgressBar c;

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void setFields(List<View> list);

    public abstract void setOnHeightOffsetChangedListener(co coVar);

    public e(Context context) {
        this(context, null);
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3249a = (ProgressBar) findViewById(R.id.address_progress_bar);
        this.f3250b = (LinearLayout) findViewById(R.id.address_inner_layout);
        this.c = (ProgressBar) findViewById(R.id.upper_right_progress_bar);
    }

    public void e() {
    }
}
