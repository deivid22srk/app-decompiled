package com.google.android.finsky.layout.play;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.layout.PlayTextView;

/* loaded from: classes.dex */
final class bb implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardFriendReviewHeaderView f3426a;

    bb(PlayCardFriendReviewHeaderView playCardFriendReviewHeaderView) {
        this.f3426a = playCardFriendReviewHeaderView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PlayTextView playTextView;
        PlayTextView playTextView2;
        PlayTextView playTextView3;
        PlayTextView playTextView4;
        PlayTextView playTextView5;
        int i;
        TextView textView;
        PlayTextView playTextView6;
        PlayTextView playTextView7;
        PlayTextView playTextView8;
        TextView textView2;
        View.OnClickListener onClickListener;
        PlayTextView playTextView9;
        View.OnClickListener onClickListener2;
        PlayTextView playTextView10;
        playTextView = this.f3426a.f3321a;
        if (playTextView.getLineCount() <= 3) {
            playTextView2 = this.f3426a.f3321a;
            playTextView3 = this.f3426a.f3321a;
            int n = android.support.v4.view.by.n(playTextView3);
            playTextView4 = this.f3426a.f3321a;
            int paddingTop = playTextView4.getPaddingTop();
            playTextView5 = this.f3426a.f3321a;
            int o = android.support.v4.view.by.o(playTextView5);
            i = this.f3426a.P;
            android.support.v4.view.by.a(playTextView2, n, paddingTop, o, i);
            textView = this.f3426a.G;
            textView.setVisibility(8);
            playTextView6 = this.f3426a.f3321a;
            playTextView6.setBackgroundResource(0);
            playTextView7 = this.f3426a.f3321a;
            playTextView7.setOnClickListener(null);
            playTextView8 = this.f3426a.f3321a;
            playTextView8.setClickable(false);
        } else {
            PlayCardFriendReviewHeaderView.b(this.f3426a);
            textView2 = this.f3426a.G;
            onClickListener = this.f3426a.R;
            textView2.setOnClickListener(onClickListener);
            playTextView9 = this.f3426a.f3321a;
            onClickListener2 = this.f3426a.R;
            playTextView9.setOnClickListener(onClickListener2);
            playTextView10 = this.f3426a.f3321a;
            playTextView10.setBackgroundResource(R.drawable.play_highlight_overlay_light);
        }
        this.f3426a.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
