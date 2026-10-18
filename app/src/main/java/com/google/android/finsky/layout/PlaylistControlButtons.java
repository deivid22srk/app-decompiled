package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.play.layout.PlayActionButton;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public class PlaylistControlButtons extends PlayActionButton implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Collection<Document> f3045a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.finsky.jpkg.b f3046b;
    private boolean c;
    private final com.google.android.finsky.jpkg.l d;

    public PlaylistControlButtons(Context context) {
        this(context, null);
    }

    public PlaylistControlButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3045a = new ArrayList();
        this.c = false;
        this.d = new cy(this);
        this.f3046b = new com.google.android.finsky.jpkg.b(this.d);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setIsPlaying(com.google.android.finsky.jpkg.b.d() > 0);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.f3046b.a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!this.c) {
            com.google.android.finsky.jpkg.b.a(this.f3045a);
            setIsPlaying(true);
        } else {
            com.google.android.finsky.jpkg.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPlaying(boolean z) {
        this.c = z;
        a(2, this.c ? R.string.skip_track : R.string.play_all, (View.OnClickListener) null);
    }
}
