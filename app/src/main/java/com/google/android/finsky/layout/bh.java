package com.google.android.finsky.layout;

import android.widget.TextView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class bh extends com.google.android.finsky.jpkg.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FreeSongOfTheDaySummary f3159a;

    bh(FreeSongOfTheDaySummary freeSongOfTheDaySummary) {
        this.f3159a = freeSongOfTheDaySummary;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.jpkg.k
    public final void a(int i, boolean z) {
        SongIndex songIndex;
        TextView textView;
        TextView textView2;
        TextView textView3;
        songIndex = this.f3159a.d;
        songIndex.setState(i);
        this.f3159a.setHighlighted(z);
        switch (i) {
            case 2:
                textView2 = this.f3159a.e;
                textView2.setText(R.string.track_pause);
                break;
            case 3:
                textView = this.f3159a.e;
                textView.setText(R.string.track_play);
                break;
            default:
                textView3 = this.f3159a.e;
                textView3.setText((CharSequence) null);
                break;
        }
    }
}
