package com.google.android.play.onboard;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.widget.BindingFrameLayout;
import com.google.android.play.k;

/* loaded from: classes.dex */
public class OnboardTutorialPage extends BindingFrameLayout implements c {
    public static final int d = k.play_onboard__OnboardTutorialPage_backgroundColor;
    public static final int e = k.play_onboard__OnboardTutorialPage_titleText;
    public static final int f = k.play_onboard__OnboardTutorialPage_bodyText;
    public static final int g = k.play_onboard__OnboardTutorialPage_iconDrawableId;
    protected b h;

    public OnboardTutorialPage(Context context) {
        this(context, null);
    }

    public OnboardTutorialPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnboardTutorialPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setOnboardHostControl(b bVar) {
        this.h = bVar;
    }

    public d getPageInfo() {
        Data data = getData();
        return (d) (data == null ? null : data.b(c.f7006b));
    }
}
