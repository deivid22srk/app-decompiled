package com.google.android.finsky.activities.myapps;

import android.os.Bundle;
import com.deivid22srk.store.R;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.cc;
import com.google.android.finsky.utils.cz;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class p implements cc {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f1836a;

    p(o oVar) {
        this.f1836a = oVar;
    }

    @Override // com.google.android.finsky.layout.play.cc
    public final void a(Document document) {
        ac acVar;
        String f_;
        acVar = this.f1836a.m;
        ArrayList a2 = cz.a(document);
        if (acVar.B.a("archive_confirm") != null) {
            return;
        }
        if (a2.size() == 1) {
            f_ = acVar.a(R.string.archiving_no_uninstall_confirmation, ((Document) a2.get(0)).f1963a.i);
        } else {
            f_ = acVar.f_(R.string.archiving_no_uninstall_confirmation_multiple);
        }
        gn gnVar = new gn();
        gnVar.a(f_).d(R.string.ok).e(R.string.cancel);
        ArrayList<String> a3 = ac.a(a2);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("docid_list", a3);
        gnVar.a(acVar, 6, bundle);
        gnVar.a(317, null, 269, 270, null);
        gnVar.b().a(acVar.B, "archive_confirm");
    }
}
