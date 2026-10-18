package com.google.android.finsky.layout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.activities.go;

/* loaded from: classes.dex */
public class PlayGamesInstallView extends LinearLayout implements go {
    public PlayGamesInstallView(Context context) {
        super(context);
    }

    public PlayGamesInstallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @SuppressLint({"NewApi"})
    public PlayGamesInstallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.google.android.finsky.activities.go
    public final void a(Bundle bundle) {
        ((TextView) findViewById(R.id.bullet_list)).setText(Html.fromHtml(getContext().getString(R.string.play_games_install_suggestion_bullets)));
    }

    @Override // com.google.android.finsky.activities.go
    public Bundle getResult() {
        return null;
    }
}
