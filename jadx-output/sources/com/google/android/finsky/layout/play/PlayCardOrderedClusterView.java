package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.BucketRow;
import com.google.android.finsky.layout.IdentifiableLinearLayout;
import com.google.android.finsky.utils.fe;

/* loaded from: classes.dex */
public class PlayCardOrderedClusterView extends IdentifiableLinearLayout implements cy {

    /* renamed from: a, reason: collision with root package name */
    protected LinearLayout f3325a;

    /* renamed from: b, reason: collision with root package name */
    protected PlayCardClusterViewHeader f3326b;
    public com.google.android.finsky.a.ai c;
    public cy d;
    private int e;
    private int f;
    private int g;

    public PlayCardOrderedClusterView(Context context) {
        this(context, null);
    }

    public PlayCardOrderedClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = com.google.android.finsky.a.i.a(400);
        this.d = null;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3325a = (LinearLayout) findViewById(R.id.cluster_content);
        this.f3326b = (PlayCardClusterViewHeader) findViewById(R.id.cluster_header);
    }

    public final void a(int i, int i2, int i3) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        LayoutInflater from = LayoutInflater.from(getContext());
        for (int i4 = 0; i4 < this.e; i4++) {
            BucketRow bucketRow = (BucketRow) from.inflate(R.layout.bucket_row, (ViewGroup) null, false);
            bucketRow.setContentHorizontalPadding(i3);
            for (int i5 = 0; i5 < this.f; i5++) {
                View inflate = from.inflate(R.layout.play_card_listing, (ViewGroup) bucketRow, false);
                inflate.setVisibility(8);
                bucketRow.addView(inflate);
            }
            this.f3325a.addView(bucketRow);
        }
    }

    private int a(int i) {
        return Math.min((int) Math.ceil(i / this.f), this.e);
    }

    public final void a(Document document, Document[] documentArr, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar) {
        int min;
        int length = documentArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.e) {
                ViewGroup viewGroup = (ViewGroup) this.f3325a.getChildAt(i2);
                if (i2 >= a(length)) {
                    viewGroup.setVisibility(8);
                } else {
                    viewGroup.setVisibility(0);
                    if (i2 >= a(length)) {
                        min = 0;
                    } else {
                        min = Math.min(length - (this.f * i2), this.f);
                    }
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 < this.f) {
                            com.google.android.play.layout.a aVar = (com.google.android.play.layout.a) viewGroup.getChildAt(i4);
                            if (i4 < min) {
                                fe.a(aVar, documentArr[(this.f * i2) + i4], document.f1963a.f3890a, eVar, bVar, this);
                                aVar.setVisibility(0);
                            } else {
                                aVar.setVisibility(4);
                            }
                            i3 = i4 + 1;
                        }
                    }
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public final void a(int i, int i2, String str, View.OnClickListener onClickListener) {
        String string;
        if (i > 0) {
            string = String.format(getResources().getString(R.string.more_results, Integer.valueOf(i)), Integer.valueOf(i));
        } else {
            string = onClickListener != null ? getResources().getString(R.string.more_results_no_count) : null;
        }
        this.f3326b.a(i2, str, null, string, onClickListener);
        this.f3326b.setExtraHorizontalPadding(this.g);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.c;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return this.d;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }
}
