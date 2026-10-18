package com.google.android.finsky.utils.hats;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.protos.pj;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f4940a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f4941b;
    public pj c;

    public e(Activity activity, ViewGroup viewGroup) {
        this.f4940a = activity;
        this.f4941b = viewGroup;
    }

    public final void a() {
        View findViewById;
        if (this.f4941b != null && (findViewById = this.f4941b.findViewById(R.id.survey_prompt)) != null && findViewById.getVisibility() != 8) {
            if (Build.VERSION.SDK_INT >= 11) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "translationY", findViewById.getHeight());
                ofFloat.addListener(new g(this, findViewById));
                ofFloat.start();
                return;
            }
            findViewById.setVisibility(8);
        }
    }
}
