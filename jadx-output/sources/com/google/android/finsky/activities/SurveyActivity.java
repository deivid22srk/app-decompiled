package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.pl;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.hats.PlayHappinessSurvey;
import com.google.android.play.image.FifeImageView;
import java.util.Iterator;

/* loaded from: classes.dex */
public class SurveyActivity extends android.support.v7.a.ae implements com.google.android.play.hats.b {
    private PlayHappinessSurvey k;
    private com.google.android.play.hats.c l;
    private long m;
    private int n;

    public static Intent a(long j, int i, pl plVar) {
        Intent intent = new Intent(FinskyApp.a(), (Class<?>) SurveyActivity.class);
        intent.putExtra("SurveyActivity.survey_id", j);
        intent.putExtra("SurveyActivity.survey_context", i);
        intent.putExtra("SurveyActivity.survey_content", ParcelableProto.a(plVar));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.survey_activity);
        this.k = (PlayHappinessSurvey) findViewById(R.id.play_happiness_survey);
        Intent intent = getIntent();
        this.m = intent.getLongExtra("SurveyActivity.survey_id", -1L);
        this.n = intent.getIntExtra("SurveyActivity.survey_context", -1);
        this.l = new com.google.android.play.hats.c((pl) ParcelableProto.a(intent, "SurveyActivity.survey_content"));
        PlayHappinessSurvey playHappinessSurvey = this.k;
        com.google.android.play.hats.c cVar = this.l;
        com.google.android.play.image.e eVar = FinskyApp.a().d;
        playHappinessSurvey.f6881b.setText(cVar.f6884a);
        playHappinessSurvey.c.setText(cVar.f6885b);
        playHappinessSurvey.d.removeAllViews();
        Iterator<com.google.android.play.hats.d> it = cVar.c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().c != null) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        for (int i = 0; i < cVar.c.size(); i++) {
            com.google.android.play.hats.d dVar = cVar.c.get(i);
            View inflate = playHappinessSurvey.f6880a.inflate(com.google.android.play.l.play_happiness_survey_answer_option, (ViewGroup) playHappinessSurvey.d, false);
            FifeImageView fifeImageView = (FifeImageView) inflate.findViewById(com.google.android.play.k.icon);
            if (dVar.c != null) {
                fifeImageView.a(dVar.c, dVar.d, eVar);
            } else {
                fifeImageView.setVisibility(z ? 4 : 8);
            }
            ((TextView) inflate.findViewById(com.google.android.play.k.text_content)).setText(dVar.f6887b);
            inflate.setVisibility(0);
            inflate.setOnClickListener(new com.google.android.play.hats.a(playHappinessSurvey, dVar));
            playHappinessSurvey.d.addView(inflate);
        }
        this.k.setSurveyEventListener(this);
        com.google.android.finsky.utils.hats.h.a(5, this.m, -1, this.n);
    }

    @Override // com.google.android.play.hats.b
    public final void a(com.google.android.play.hats.d dVar) {
        Toast.makeText(this, R.string.survey_completed_toast, 0).show();
        com.google.android.finsky.utils.hats.h.a(3, this.m, dVar.f6886a, this.n);
        com.google.android.finsky.utils.hats.h.a(this.m, 3);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onStop() {
        super.onStop();
        FinskyApp a2 = FinskyApp.a();
        a2.a(a2.j()).b().f4946a = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        FinskyApp a2 = FinskyApp.a();
        a2.a(a2.j()).b().f4946a = true;
    }
}
