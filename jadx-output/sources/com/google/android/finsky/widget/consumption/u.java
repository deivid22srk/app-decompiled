package com.google.android.finsky.widget.consumption;

import android.content.Context;
import android.content.res.Resources;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class u implements Comparator<List<g>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f5199a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ NowPlayingWidgetProvider f5200b;

    u(NowPlayingWidgetProvider nowPlayingWidgetProvider, Context context) {
        this.f5200b = nowPlayingWidgetProvider;
        this.f5199a = context;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(List<g> list, List<g> list2) {
        List<g> list3 = list;
        List<g> list4 = list2;
        if (list3 == list4) {
            return 0;
        }
        int a2 = a(list3, this.f5199a);
        int a3 = a(list4, this.f5199a);
        if (a2 != a3) {
            return a2 >= a3 ? -1 : 1;
        }
        int a4 = a(list3);
        int a5 = a(list4);
        return a4 != a5 ? a4 >= a5 ? -1 : 1 : list3.hashCode() <= list4.hashCode() ? -1 : 1;
    }

    private static int a(List<g> list) {
        int i = 0;
        Iterator<g> it = list.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                i = it.next().f5180b + i2;
            } else {
                return i2;
            }
        }
    }

    private static int a(List<g> list, Context context) {
        Resources resources = context.getResources();
        int i = 0;
        int i2 = 0;
        for (g gVar : list) {
            int i3 = gVar.f5180b;
            int i4 = 0;
            while (i4 < i3) {
                int dimensionPixelSize = resources.getDimensionPixelSize(gVar.b(i4)) + i;
                i4++;
                i = dimensionPixelSize;
            }
            i2 += i3;
        }
        return i / i2;
    }
}
