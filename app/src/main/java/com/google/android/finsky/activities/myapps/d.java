package com.google.android.finsky.activities.myapps;

import com.google.android.finsky.api.model.Document;
import java.text.Collator;
import java.util.Comparator;

/* loaded from: classes.dex */
final class d implements Comparator<Document> {
    d() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Document document, Document document2) {
        Collator collator;
        Document document3 = document;
        Document document4 = document2;
        String str = document3.f1963a.i;
        String str2 = document4.f1963a.i;
        collator = c.r;
        int compare = collator.compare(str, str2);
        if (compare != 0) {
            return compare;
        }
        return document3.E().w.compareTo(document4.E().w);
    }
}
