package android.support.v4.app;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    private static final bq f194a;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f194a = new bs();
            return;
        }
        if (Build.VERSION.SDK_INT >= 20) {
            f194a = new br();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            f194a = new by();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            f194a = new bx();
            return;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            f194a = new bw();
            return;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            f194a = new bv();
        } else if (Build.VERSION.SDK_INT >= 9) {
            f194a = new bu();
        } else {
            f194a = new bt();
        }
    }

    static /* synthetic */ void a(bg bgVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bgVar.a((bj) it.next());
        }
    }

    static /* synthetic */ void a(bh bhVar, bz bzVar) {
        if (bzVar != null) {
            if (bzVar instanceof bm) {
                bm bmVar = (bm) bzVar;
                cj.a(bhVar, bmVar.e, bmVar.g, bmVar.f, bmVar.f199a);
            } else if (bzVar instanceof bp) {
                bp bpVar = (bp) bzVar;
                cj.a(bhVar, bpVar.e, bpVar.g, bpVar.f, bpVar.f202a);
            } else {
                if (!(bzVar instanceof bl)) {
                    return;
                }
                bl blVar = (bl) bzVar;
                cj.a(bhVar, blVar.e, blVar.g, blVar.f, blVar.f197a, blVar.f198b, blVar.c);
            }
        }
    }
}
