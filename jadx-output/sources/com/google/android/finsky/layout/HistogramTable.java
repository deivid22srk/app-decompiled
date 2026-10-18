package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.android.vending.R;
import java.text.NumberFormat;
import java.util.List;

/* loaded from: classes.dex */
public class HistogramTable extends TableLayout {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3001a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3002b;
    private final int c;
    private final int d;
    private final List<HistogramBar> e;

    public HistogramTable(Context context) {
        this(context, null);
    }

    public HistogramTable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = com.google.android.finsky.utils.cz.a(5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.HistogramTable);
        this.f3001a = obtainStyledAttributes.getBoolean(0, false);
        this.f3002b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        this.d = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        obtainStyledAttributes.recycle();
    }

    public void setHistogram(int[] iArr) {
        int i;
        removeAllViews();
        this.e.clear();
        double d = 0.0d;
        int i2 = 0;
        while (i2 < 5) {
            double d2 = ((double) iArr[i2]) > d ? iArr[i2] : d;
            i2++;
            d = d2;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        Resources resources = getResources();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < 5) {
                TableRow tableRow = (TableRow) from.inflate(R.layout.histogram_row, (ViewGroup) this, false);
                StarLabel starLabel = (StarLabel) tableRow.findViewById(R.id.star_label);
                TextView textView = (TextView) tableRow.findViewById(R.id.count_label);
                starLabel.setMaxStars(5);
                starLabel.setStarHeight(this.f3002b);
                if (this.f3001a) {
                    starLabel.setNumStars(5 - i4);
                    textView.setText(integerInstance.format(iArr[i4]));
                    tableRow.setBaselineAlignedChildIndex(2);
                } else {
                    starLabel.setVisibility(8);
                    textView.setVisibility(8);
                    tableRow.setBaselineAlignedChildIndex(1);
                }
                HistogramBar histogramBar = (HistogramBar) tableRow.findViewById(R.id.histogram_bar);
                histogramBar.setMaxBarWidth(this.c);
                histogramBar.setBarHeight(this.f3002b);
                histogramBar.setWidthPercentage(iArr[i4] / d);
                TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(-2, -2);
                if (i4 != 0) {
                    layoutParams.setMargins(0, this.d, 0, 0);
                }
                switch (i4) {
                    case 0:
                        i = R.color.review_histogram_5_bar;
                        break;
                    case 1:
                        i = R.color.review_histogram_4_bar;
                        break;
                    case 2:
                        i = R.color.review_histogram_3_bar;
                        break;
                    case 3:
                        i = R.color.review_histogram_2_bar;
                        break;
                    case 4:
                        i = R.color.review_histogram_1_bar;
                        break;
                    default:
                        i = R.color.review_histogram_1_bar;
                        break;
                }
                histogramBar.setColor(i);
                this.e.add(histogramBar);
                tableRow.setContentDescription(resources.getQuantityString(R.plurals.content_description_review_histogram_row, iArr[i4], Integer.valueOf(iArr[i4]), Integer.valueOf(5 - i4)));
                addView(tableRow, layoutParams);
                i3 = i4 + 1;
            } else {
                return;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        if (childCount != 0) {
            View childAt = getChildAt(childCount - 1);
            return (measuredHeight - childAt.getMeasuredHeight()) + childAt.getBaseline();
        }
        return measuredHeight;
    }

    @Override // android.widget.TableLayout, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3001a && !this.e.isEmpty()) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < getChildCount()) {
                View childAt = getChildAt(i3);
                if (childAt instanceof TableRow) {
                    TableRow tableRow = (TableRow) childAt;
                    int i5 = 0;
                    for (int i6 = 0; i6 < tableRow.getChildCount(); i6++) {
                        View childAt2 = tableRow.getChildAt(i6);
                        TableRow.LayoutParams layoutParams = (TableRow.LayoutParams) childAt2.getLayoutParams();
                        i5 += layoutParams.rightMargin + childAt2.getMeasuredWidth() + layoutParams.leftMargin;
                    }
                    if (i5 - tableRow.getMeasuredWidth() > i4) {
                        i4 = i5 - tableRow.getMeasuredWidth();
                    }
                }
                i3++;
                i4 = i4;
            }
            if (i4 > 0) {
                for (int i7 = 0; i7 < this.e.size(); i7++) {
                    this.e.get(i7).setMaxBarWidth(this.c - i4);
                }
                this.e.clear();
            }
        }
    }
}
