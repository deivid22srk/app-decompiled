package com.google.android.finsky.detailspage;

import android.graphics.Bitmap;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.play.image.FifeImageView;
import java.util.List;

/* loaded from: classes.dex */
final class ae extends android.support.v4.app.cy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f2532a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2533b;

    ae(z zVar) {
        this.f2532a = zVar;
    }

    @Override // android.support.v4.app.cy
    public final void a(List<String> list, List<View> list2) {
        FifeImageView fifeImageView;
        Bitmap bitmap;
        Bitmap bitmap2;
        FifeImageView fifeImageView2;
        FifeImageView fifeImageView3;
        Bitmap bitmap3;
        FifeImageView fifeImageView4;
        FifeImageView fifeImageView5;
        int i;
        int i2;
        int i3 = 0;
        this.f2533b = this.f2532a.R == null;
        if (!list2.isEmpty()) {
            if (!this.f2533b) {
                while (true) {
                    if (i3 >= list.size()) {
                        fifeImageView = null;
                        break;
                    } else if (!list.get(i3).startsWith("transition_card_details:cover:")) {
                        i3++;
                    } else {
                        fifeImageView = (FifeImageView) list2.get(i3);
                        break;
                    }
                }
                bitmap = this.f2532a.aC;
                if (bitmap != null && fifeImageView != null) {
                    fifeImageView.d = true;
                    bitmap2 = this.f2532a.aC;
                    fifeImageView.setImageBitmap(bitmap2);
                    fifeImageView.measure(View.MeasureSpec.makeMeasureSpec(fifeImageView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(fifeImageView.getMeasuredHeight(), 1073741824));
                    fifeImageView.layout(fifeImageView.getLeft(), fifeImageView.getTop(), fifeImageView.getRight(), fifeImageView.getBottom());
                    fifeImageView2 = this.f2532a.aD;
                    if (fifeImageView2 != null) {
                        fifeImageView3 = this.f2532a.aD;
                        bitmap3 = this.f2532a.aC;
                        fifeImageView3.setImageBitmap(bitmap3);
                        fifeImageView4 = this.f2532a.aD;
                        fifeImageView4.d = true;
                    }
                }
                z.k(this.f2532a);
                return;
            }
            for (int i4 = 0; i4 < list.size(); i4++) {
                String str = list.get(i4);
                View view = list2.get(i4);
                if (str.startsWith("transition_card_details:cover:")) {
                    this.f2532a.aD = (FifeImageView) view;
                    fifeImageView5 = this.f2532a.aD;
                    fifeImageView5.setAlpha(0.0f);
                    int[] iArr = new int[2];
                    View view2 = view;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (view2 == null) {
                            break;
                        }
                        int id = view2.getId();
                        if (id == R.id.play_card || id == R.id.order_history_row) {
                            view2.getLocationInWindow(iArr);
                            i = iArr[0];
                            i2 = iArr[1];
                            this.f2532a.aH = view2.getMeasuredWidth();
                            this.f2532a.aG = view2.getMeasuredHeight();
                        } else {
                            i = i6;
                            i2 = i5;
                        }
                        if (id == R.id.drawer_layout) {
                            i5 = i2;
                            i6 = i;
                            break;
                        } else {
                            view2 = (View) view2.getParent();
                            i5 = i2;
                            i6 = i;
                        }
                    }
                    view2.getLocationInWindow(iArr);
                    this.f2532a.aF = i6 - iArr[0];
                    this.f2532a.aE = i5 - iArr[1];
                }
            }
        }
    }

    @Override // android.support.v4.app.cy
    public final void a() {
        FifeImageView fifeImageView;
        FifeImageView fifeImageView2;
        this.f2533b = false;
        fifeImageView = this.f2532a.aD;
        if (fifeImageView != null && this.f2532a.R != null) {
            fifeImageView2 = this.f2532a.aD;
            fifeImageView2.a(false);
            this.f2532a.aD = null;
        }
    }
}
