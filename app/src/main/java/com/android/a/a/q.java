package com.android.a.a;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.text.Collator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    Spinner f1123a;

    /* renamed from: b, reason: collision with root package name */
    e f1124b;
    e c;
    ArrayAdapter<String> d;
    List<av> e;

    public q(Spinner spinner, e eVar, e eVar2) {
        this.f1123a = spinner;
        this.f1124b = eVar;
        this.c = eVar2;
    }

    public final void a(List<av> list, String str) {
        this.e = list;
        this.d.clear();
        Iterator<av> it = list.iterator();
        while (it.hasNext()) {
            this.d.add(it.next().a());
        }
        this.d.sort(Collator.getInstance(Locale.getDefault()));
        if (str.length() == 0) {
            this.f1123a.setSelection(0);
        } else {
            this.f1123a.setSelection(this.d.getPosition(str));
        }
    }

    final av a(String str) {
        for (av avVar : this.e) {
            if (avVar.f1087a.equalsIgnoreCase(str)) {
                return avVar;
            }
        }
        return null;
    }
}
