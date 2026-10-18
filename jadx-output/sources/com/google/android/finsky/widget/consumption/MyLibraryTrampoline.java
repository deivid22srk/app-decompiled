package com.google.android.finsky.widget.consumption;

import android.content.Intent;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.pt;
import com.google.android.finsky.utils.cr;

/* loaded from: classes.dex */
public class MyLibraryTrampoline extends com.google.android.finsky.widget.f {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.f
    public final boolean h() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.f
    public final boolean c(int i) {
        return (i == 3 || !cr.a(getPackageManager(), i) || cr.a(FinskyApp.a().v, i)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.f
    public final String b(int i) {
        pt a2;
        DfeToc dfeToc = FinskyApp.a().g;
        return (dfeToc == null || (a2 = dfeToc.a(i)) == null) ? getString(R.string.widget_now_playing) : a2.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.f
    public final int i() {
        return R.string.widget_now_playing;
    }

    @Override // com.google.android.finsky.widget.f
    public final void a(int i, String str) {
        if (i == -1) {
            int a2 = com.google.android.finsky.widget.s.a(str);
            Intent intent = getIntent();
            if (intent != null && intent.hasExtra("appWidgetId")) {
                int intExtra = intent.getIntExtra("appWidgetId", -1);
                Intent intent2 = new Intent(this, (Class<?>) NowPlayingWidgetProvider.class);
                intent2.setAction("NowPlayingWidgetProvider.WarmWelcome");
                intent2.putExtra("appWidgetId", intExtra);
                intent2.putExtra("backendId", a2);
                sendBroadcast(intent2);
            } else {
                startActivity(cr.a(this, a2, FinskyApp.a().j()));
            }
        }
        finish();
    }
}
