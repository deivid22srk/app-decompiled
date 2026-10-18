package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    List<h> f1376a = null;

    public final void a(h hVar) {
        if (this.f1376a == null) {
            this.f1376a = new ArrayList();
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f1376a.size()) {
                if (this.f1376a.get(i2).f1374a.f1378b <= hVar.f1374a.f1378b) {
                    i = i2 + 1;
                } else {
                    this.f1376a.add(i2, hVar);
                    return;
                }
            } else {
                this.f1376a.add(hVar);
                return;
            }
        }
    }

    public final void a(i iVar) {
        if (iVar.f1376a != null) {
            if (this.f1376a == null) {
                this.f1376a = new ArrayList(iVar.f1376a.size());
            }
            Iterator<h> it = iVar.f1376a.iterator();
            while (it.hasNext()) {
                this.f1376a.add(it.next());
            }
        }
    }

    public final String toString() {
        if (this.f1376a == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<h> it = this.f1376a.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString()).append('\n');
        }
        return sb.toString();
    }
}
