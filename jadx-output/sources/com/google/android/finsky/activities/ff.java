package com.google.android.finsky.activities;

import com.android.vending.R;

/* loaded from: classes.dex */
public enum ff {
    SPAM(3, 2, R.string.review_feedback_dialog_choice_spam),
    HELPFUL(1, 0, R.string.review_feedback_dialog_choice_helpful),
    NOT_HELPFUL(2, 1, R.string.review_feedback_dialog_choice_unhelpful);

    public int d;
    int e;
    int f;

    ff(int i, int i2, int i3) {
        this.d = i;
        this.e = i2;
        this.f = i3;
    }
}
