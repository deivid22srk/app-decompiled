package com.google.android.finsky.gpkg;

import com.google.android.finsky.utils.cz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ar extends f {
    public ar(int i, s sVar) {
        super(i, sVar);
    }

    public final List<aq> b() {
        ArrayList a2 = cz.a(g());
        Iterator<r> it = iterator();
        while (it.hasNext()) {
            r next = it.next();
            if (!e(next)) {
                a2.add((aq) next);
            }
        }
        return a2;
    }

    public boolean e(r rVar) {
        return !(rVar instanceof aq);
    }
}
