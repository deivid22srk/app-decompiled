package com.google.android.finsky.activities;

import android.content.Intent;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.RateReviewEditor;

/* loaded from: classes.dex */
final class fa implements com.google.android.finsky.layout.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f1735a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RateReviewActivity f1736b;

    fa(RateReviewActivity rateReviewActivity, boolean z) {
        this.f1736b = rateReviewActivity;
        this.f1735a = z;
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        boolean z;
        com.google.android.finsky.a.i iVar;
        boolean z2;
        String str;
        RateReviewEditor rateReviewEditor;
        RateReviewEditor rateReviewEditor2;
        RateReviewEditor rateReviewEditor3;
        boolean z3;
        boolean z4;
        Document document;
        Document document2;
        Document document3;
        String str2;
        String str3;
        String str4;
        RateReviewEditor rateReviewEditor4;
        RateReviewEditor rateReviewEditor5;
        RateReviewEditor rateReviewEditor6;
        Document document4;
        z = this.f1736b.w;
        if (!z) {
            RateReviewActivity.b(this.f1736b);
            int i = this.f1735a ? 1205 : 1204;
            iVar = this.f1736b.u;
            iVar.a(i, (byte[]) null, this.f1736b);
            z2 = this.f1736b.q;
            if (z2) {
                str2 = this.f1736b.k;
                str3 = this.f1736b.m;
                str4 = this.f1736b.n;
                rateReviewEditor4 = this.f1736b.y;
                int userRating = rateReviewEditor4.getUserRating();
                rateReviewEditor5 = this.f1736b.y;
                String userTitle = rateReviewEditor5.getUserTitle();
                rateReviewEditor6 = this.f1736b.y;
                String userComment = rateReviewEditor6.getUserComment();
                document4 = this.f1736b.p;
                com.google.android.finsky.utils.gx.a(str2, str3, str4, userRating, userTitle, userComment, document4, this.f1736b, null, 1203);
            }
            Intent intent = new Intent();
            str = this.f1736b.m;
            intent.putExtra("doc_id", str);
            rateReviewEditor = this.f1736b.y;
            intent.putExtra("rating", rateReviewEditor.getUserRating());
            rateReviewEditor2 = this.f1736b.y;
            intent.putExtra("review_title", rateReviewEditor2.getUserTitle());
            rateReviewEditor3 = this.f1736b.y;
            intent.putExtra("review_comment", rateReviewEditor3.getUserComment());
            z3 = this.f1736b.q;
            if (!z3) {
                document3 = this.f1736b.p;
                intent.putExtra("author", document3);
            }
            z4 = this.f1736b.r;
            if (!z4) {
                document = this.f1736b.p;
                intent.putExtra("author_title", document.f1963a.i);
                document2 = this.f1736b.p;
                intent.putExtra("author_profile_image_url", document2.b(4).get(0).f);
            }
            this.f1736b.setResult(1, intent);
            this.f1736b.finish();
        }
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        boolean z;
        com.google.android.finsky.a.i iVar;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        z = this.f1736b.w;
        if (!z) {
            RateReviewActivity.b(this.f1736b);
            iVar = this.f1736b.u;
            iVar.a(1206, (byte[]) null, this.f1736b);
            z2 = this.f1736b.q;
            if (z2) {
                str2 = this.f1736b.k;
                str3 = this.f1736b.m;
                str4 = this.f1736b.n;
                com.google.android.finsky.utils.gx.a(str2, str3, str4, this.f1736b, null);
            }
            Intent intent = new Intent();
            str = this.f1736b.m;
            intent.putExtra("doc_id", str);
            this.f1736b.setResult(2, intent);
            this.f1736b.finish();
        }
    }
}
