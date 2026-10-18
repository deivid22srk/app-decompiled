package com.google.android.play.hats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.play.k;
import com.google.android.play.layout.CardLinearLayout;

/* loaded from: classes.dex */
public class PlayHappinessSurvey extends CardLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutInflater f6880a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f6881b;
    public TextView c;
    public LinearLayout d;
    private b e;

    public PlayHappinessSurvey(Context context) {
        this(context, null);
    }

    public PlayHappinessSurvey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6880a = LayoutInflater.from(context);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6881b = (TextView) findViewById(k.play_happiness_survey_header);
        this.c = (TextView) findViewById(k.play_happiness_survey_question);
        this.d = (LinearLayout) findViewById(k.play_happiness_survey_answer_option_container);
    }

    public void setSurveyEventListener(b bVar) {
        this.e = bVar;
    }
}
