package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements aa {

    /* renamed from: a, reason: collision with root package name */
    private m f579a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f580b;
    private RadioButton c;
    private TextView d;
    private CheckBox e;
    private TextView f;
    private Drawable g;
    private int h;
    private Context i;
    private boolean j;
    private int k;
    private Context l;
    private LayoutInflater m;
    private boolean n;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.l = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.b.l.MenuView, i, 0);
        this.g = obtainStyledAttributes.getDrawable(android.support.v7.b.l.MenuView_android_itemBackground);
        this.h = obtainStyledAttributes.getResourceId(android.support.v7.b.l.MenuView_android_itemTextAppearance, -1);
        this.j = obtainStyledAttributes.getBoolean(android.support.v7.b.l.MenuView_preserveIconSpacing, false);
        this.i = context;
        obtainStyledAttributes.recycle();
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundDrawable(this.g);
        this.d = (TextView) findViewById(android.support.v7.b.g.title);
        if (this.h != -1) {
            this.d.setTextAppearance(this.i, this.h);
        }
        this.f = (TextView) findViewById(android.support.v7.b.g.shortcut);
    }

    @Override // android.support.v7.view.menu.aa
    public final void a(m mVar) {
        String sb;
        this.f579a = mVar;
        this.k = 0;
        setVisibility(mVar.isVisible() ? 0 : 8);
        setTitle(mVar.a((aa) this));
        setCheckable(mVar.isCheckable());
        boolean d = mVar.d();
        mVar.c();
        int i = (d && this.f579a.d()) ? 0 : 8;
        if (i == 0) {
            TextView textView = this.f;
            char c = this.f579a.c();
            if (c == 0) {
                sb = "";
            } else {
                StringBuilder sb2 = new StringBuilder(m.f);
                switch (c) {
                    case '\b':
                        sb2.append(m.h);
                        break;
                    case '\n':
                        sb2.append(m.g);
                        break;
                    case ' ':
                        sb2.append(m.i);
                        break;
                    default:
                        sb2.append(c);
                        break;
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f.getVisibility() != i) {
            this.f.setVisibility(i);
        }
        setIcon(mVar.getIcon());
        setEnabled(mVar.isEnabled());
    }

    public void setForceShowIcon(boolean z) {
        this.n = z;
        this.j = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
                return;
            }
            return;
        }
        if (this.d.getVisibility() != 8) {
            this.d.setVisibility(8);
        }
    }

    @Override // android.support.v7.view.menu.aa
    public m getItemData() {
        return this.f579a;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.c != null || this.e != null) {
            if (this.f579a.e()) {
                if (this.c == null) {
                    b();
                }
                compoundButton = this.c;
                compoundButton2 = this.e;
            } else {
                if (this.e == null) {
                    c();
                }
                compoundButton = this.e;
                compoundButton2 = this.c;
            }
            if (z) {
                compoundButton.setChecked(this.f579a.isChecked());
                int i = z ? 0 : 8;
                if (compoundButton.getVisibility() != i) {
                    compoundButton.setVisibility(i);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.e != null) {
                this.e.setVisibility(8);
            }
            if (this.c != null) {
                this.c.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f579a.e()) {
            if (this.c == null) {
                b();
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                c();
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    private void setShortcut$25d965e(boolean z) {
        String sb;
        int i = (z && this.f579a.d()) ? 0 : 8;
        if (i == 0) {
            TextView textView = this.f;
            char c = this.f579a.c();
            if (c == 0) {
                sb = "";
            } else {
                StringBuilder sb2 = new StringBuilder(m.f);
                switch (c) {
                    case '\b':
                        sb2.append(m.h);
                        break;
                    case '\n':
                        sb2.append(m.g);
                        break;
                    case ' ':
                        sb2.append(m.i);
                        break;
                    default:
                        sb2.append(c);
                        break;
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f.getVisibility() != i) {
            this.f.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f579a.f597b.i || this.n;
        if (z || this.j) {
            if (this.f580b != null || drawable != null || this.j) {
                if (this.f580b == null) {
                    this.f580b = (ImageView) getInflater().inflate(android.support.v7.b.i.abc_list_menu_item_icon, (ViewGroup) this, false);
                    addView(this.f580b, 0);
                }
                if (drawable != null || this.j) {
                    ImageView imageView = this.f580b;
                    if (!z) {
                        drawable = null;
                    }
                    imageView.setImageDrawable(drawable);
                    if (this.f580b.getVisibility() != 0) {
                        this.f580b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f580b.setVisibility(8);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f580b != null && this.j) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f580b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    private void b() {
        this.c = (RadioButton) getInflater().inflate(android.support.v7.b.i.abc_list_menu_item_radio, (ViewGroup) this, false);
        addView(this.c);
    }

    private void c() {
        this.e = (CheckBox) getInflater().inflate(android.support.v7.b.i.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        addView(this.e);
    }

    @Override // android.support.v7.view.menu.aa
    public final boolean a() {
        return false;
    }

    private LayoutInflater getInflater() {
        if (this.m == null) {
            this.m = LayoutInflater.from(this.l);
        }
        return this.m;
    }
}
