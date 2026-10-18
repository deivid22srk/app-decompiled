package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class PlayCardViewMyAppsDownloading extends PlayCardViewMyApps {
    private TextView E;
    private ProgressBar F;

    /* renamed from: a, reason: collision with root package name */
    private TextView f3342a;

    public PlayCardViewMyAppsDownloading(Context context) {
        this(context, null);
    }

    public PlayCardViewMyAppsDownloading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.PlayCardViewMyApps, com.google.android.play.layout.a, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3342a = (TextView) findViewById(R.id.downloading_bytes);
        this.E = (TextView) findViewById(R.id.downloading_percentage);
        this.F = (ProgressBar) findViewById(R.id.progress_bar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.layout.play.PlayCardViewMyApps, com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        b(i2);
        super.onMeasure(i, i2);
    }

    public final void a(com.google.android.finsky.receivers.g gVar) {
        com.google.android.finsky.adapters.y.a(getContext(), gVar, this.f3342a, this.E, this.F);
    }
}
