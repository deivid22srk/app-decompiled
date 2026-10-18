package com.android.a.a;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    String f1109a;
    e d;
    public View f;
    List<av> c = new ArrayList();
    e e = null;

    /* renamed from: b, reason: collision with root package name */
    public j f1110b = j.EDIT;

    h(e eVar) {
        this.d = eVar;
    }

    final void a(List<av> list) {
        this.c = list;
        if (list.size() > 1) {
            this.f1110b = j.SPINNER;
            switch (this.d) {
                case DEPENDENT_LOCALITY:
                    this.e = e.LOCALITY;
                    break;
                case LOCALITY:
                    this.e = e.ADMIN_AREA;
                    break;
                case ADMIN_AREA:
                    this.e = e.COUNTRY;
                    break;
            }
        }
    }
}
