package com.google.android.finsky.billing.promptforfop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.e.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public final class f extends m implements View.OnClickListener {
    public static f a(String str, String str2, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("PromptForFopMessageFragment.message", str2);
        bundle.putInt("PromptForFopMessageFragment.playlog_ui_element_type", i);
        f fVar = new f();
        fVar.f(bundle);
        return fVar;
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.prompt_for_fop_message_fragment, viewGroup, false);
        ((TextView) viewGroup2.findViewById(R.id.message)).setText(this.r.getString("PromptForFopMessageFragment.message"));
        ((PlayActionButton) viewGroup2.findViewById(R.id.positive_button)).a(3, R.string.continue_text, this);
        return viewGroup2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (f() instanceof g) {
            b(1006);
            ((g) f()).m();
        } else {
            FinskyLog.e("Parent activity expected to implement Listener interface.", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.e.m
    public final int u() {
        return this.r.getInt("PromptForFopMessageFragment.playlog_ui_element_type");
    }
}
