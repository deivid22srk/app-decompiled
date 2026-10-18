package com.google.android.finsky.activities.myapps;

import android.view.KeyEvent;
import android.widget.Checkable;
import com.google.android.finsky.layout.play.PlayListView;

/* loaded from: classes.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f1840a;

    s(q qVar) {
        this.f1840a = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar;
        o oVar2;
        n nVar;
        oVar = this.f1840a.f1837a;
        PlayListView playListView = oVar.c;
        oVar2 = this.f1840a.f1837a;
        nVar = oVar2.f1835b;
        nVar.a(false);
        playListView.clearChoices();
        for (int i = 0; i < playListView.getChildCount(); i++) {
            KeyEvent.Callback childAt = playListView.getChildAt(i);
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(false);
            }
        }
        playListView.setChoiceMode(0);
    }
}
