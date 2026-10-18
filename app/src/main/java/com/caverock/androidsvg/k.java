package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    public f f1379a;

    /* renamed from: b, reason: collision with root package name */
    public String f1380b;
    public List<c> c = null;
    public List<String> d = null;

    public k(f fVar, String str) {
        this.f1379a = null;
        this.f1380b = null;
        this.f1379a = fVar == null ? f.DESCENDANT : fVar;
        this.f1380b = str;
    }

    public final void a(String str, d dVar, String str2) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(new c(str, dVar, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f1379a == f.CHILD) {
            sb.append("> ");
        } else if (this.f1379a == f.FOLLOWS) {
            sb.append("+ ");
        }
        sb.append(this.f1380b == null ? "*" : this.f1380b);
        if (this.c != null) {
            for (c cVar : this.c) {
                sb.append('[').append(cVar.f1321a);
                switch (b.f1302a[cVar.f1322b.ordinal()]) {
                    case 1:
                        sb.append('=').append(cVar.c);
                        break;
                    case 2:
                        sb.append("~=").append(cVar.c);
                        break;
                    case 3:
                        sb.append("|=").append(cVar.c);
                        break;
                }
                sb.append(']');
            }
        }
        if (this.d != null) {
            Iterator<String> it = this.d.iterator();
            while (it.hasNext()) {
                sb.append(':').append(it.next());
            }
        }
        return sb.toString();
    }
}
