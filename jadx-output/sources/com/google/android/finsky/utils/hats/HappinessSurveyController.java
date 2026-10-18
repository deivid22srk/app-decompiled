package com.google.android.finsky.utils.hats;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.support.v4.app.r;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import com.android.vending.R;
import com.google.android.finsky.c.o;
import com.google.android.finsky.e.q;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.jm;
import com.google.android.libraries.happiness.HatsSurveyManager;

/* loaded from: classes.dex */
public class HappinessSurveyController implements com.google.android.libraries.happiness.a {
    private static String e;
    private static boolean f = false;

    /* renamed from: a, reason: collision with root package name */
    public final String f4933a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f4934b;
    private final aa c;
    private final ViewGroup d;
    private boolean g;
    private HatsSurveyManager h;

    public HappinessSurveyController(q qVar, String str, boolean z) {
        this.g = false;
        this.f4934b = qVar.f();
        this.c = qVar.B;
        this.d = (ViewGroup) qVar.f().findViewById(R.id.outer_content_frame);
        this.f4933a = str;
        this.g = z;
    }

    public void start() {
        byte b2 = 0;
        if (e == null) {
            if (!f) {
                jm.a(new d(this, b2), new Void[0]);
                f = true;
                return;
            }
            return;
        }
        if (this.h == null && this.f4934b != null) {
            this.h = new HatsSurveyManager(this.f4934b, this, new com.google.android.libraries.happiness.l(e, this.f4933a));
            this.h.b();
        }
    }

    public String getSiteId() {
        return this.f4933a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSurveyDialog() {
        lockScreen();
        Fragment a2 = this.c.a("hats-survey");
        if (a2 != null) {
            this.c.a().a(a2).b();
        }
        this.c.a().a(this.h.a(), "hats-survey").b();
    }

    private void showSurveyPrompt() {
        if (this.f4934b != null && this.h != null && this.d != null && this.d.findViewById(R.id.survey_prompt) == null) {
            View inflate = LayoutInflater.from(this.f4934b).inflate(R.layout.survey_prompt, this.d, false);
            ((TextView) inflate.findViewById(R.id.title)).setText(R.string.survey_prompt_title_improve);
            ((TextView) inflate.findViewById(R.id.subtitle)).setText(R.string.survey_prompt_subtitle_survey);
            inflate.findViewById(R.id.take_survey).setOnClickListener(new a(this));
            inflate.findViewById(R.id.decline_survey_button).setOnClickListener(new b(this));
            this.d.addView(inflate);
            if (Build.VERSION.SDK_INT >= 11) {
                inflate.measure(View.MeasureSpec.makeMeasureSpec(this.d.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.d.getHeight(), Integer.MIN_VALUE));
                inflate.setTranslationY(inflate.getMeasuredHeight());
                ObjectAnimator.ofFloat(inflate, "translationY", 0.0f).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSurveyPrompt() {
        View findViewById;
        o<Long> b2;
        if (this.d != null && (findViewById = this.d.findViewById(R.id.survey_prompt)) != null) {
            if (Build.VERSION.SDK_INT >= 11) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "translationY", findViewById.getHeight());
                ofFloat.addListener(new c(this, findViewById));
                ofFloat.start();
            } else {
                this.d.removeView(findViewById);
            }
            if (this.f4934b == null || (b2 = bg.az.b(this.f4933a)) == null) {
                return;
            }
            b2.a((o<Long>) Long.valueOf(System.currentTimeMillis()));
        }
    }

    private void dismissSurvey() {
        r a2 = this.h != null ? this.h.a() : null;
        if (a2 != null && a2.B != null) {
            a2.a(false);
        }
        this.f4934b.setRequestedOrientation(-1);
        removeSurveyPrompt();
    }

    private void lockScreen() {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f4934b.setRequestedOrientation(14);
        }
        switch (((WindowManager) this.f4934b.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 1:
                this.f4934b.setRequestedOrientation(0);
                break;
            case 2:
                this.f4934b.setRequestedOrientation(9);
                break;
            case 3:
                this.f4934b.setRequestedOrientation(8);
                break;
            default:
                this.f4934b.setRequestedOrientation(1);
                break;
        }
    }

    @Override // com.google.android.libraries.happiness.a
    public void onWindowError() {
    }

    @Override // com.google.android.libraries.happiness.a
    public void onSurveyReady() {
        if (this.g) {
            showSurveyDialog();
        } else {
            showSurveyPrompt();
        }
    }

    @Override // com.google.android.libraries.happiness.a
    public void onSurveyComplete(boolean z, boolean z2) {
        Activity activity;
        dismissSurvey();
        if (z && (activity = this.f4934b) != null) {
            Toast.makeText(activity, R.string.survey_completed_toast, 0).show();
        }
    }

    @Override // com.google.android.libraries.happiness.a
    public void onSurveyResponse(String str, String str2) {
    }

    @Override // com.google.android.libraries.happiness.a
    public void onSurveyCanceled() {
        dismissSurvey();
    }
}
