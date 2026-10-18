package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public class FreeSongOfTheDaySummary extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f2995a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f2996b;
    public PlayActionButton c;
    public SongIndex d;
    public TextView e;
    private final com.google.android.finsky.j.b f;
    private final com.google.android.finsky.j.l g;

    public FreeSongOfTheDaySummary(Context context) {
        this(context, null);
    }

    public FreeSongOfTheDaySummary(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new bh(this);
        this.f = new com.google.android.finsky.j.b(this.g);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2995a = (TextView) findViewById(R.id.title);
        this.f2996b = (TextView) findViewById(R.id.creator);
        this.c = (PlayActionButton) findViewById(R.id.buy_button);
        this.d = (SongIndex) findViewById(R.id.song_index);
        this.e = (TextView) findViewById(R.id.playback_legend);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f.a();
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighlighted(boolean z) {
        int[] iArr = {android.support.v4.view.by.n(this), getPaddingTop(), android.support.v4.view.by.o(this), getPaddingBottom()};
        Resources resources = getContext().getResources();
        if (z) {
            setBackgroundColor(resources.getColor(R.color.song_highlighted_background));
        } else {
            setBackgroundResource(R.drawable.play_highlight_overlay_light);
        }
        android.support.v4.view.by.a(this, iArr[0], iArr[1], iArr[2], iArr[3]);
    }
}
