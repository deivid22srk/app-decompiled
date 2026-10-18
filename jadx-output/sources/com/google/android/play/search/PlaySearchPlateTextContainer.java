package com.google.android.play.search;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class PlaySearchPlateTextContainer extends FrameLayout implements TextWatcher, TextView.OnEditorActionListener, n {

    /* renamed from: a, reason: collision with root package name */
    EditText f7017a;

    /* renamed from: b, reason: collision with root package name */
    private final InputMethodManager f7018b;
    private l c;
    private ai d;
    private ImageView e;
    private TextView f;
    private boolean g;

    public PlaySearchPlateTextContainer(Context context) {
        this(context, null);
    }

    public PlaySearchPlateTextContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchPlateTextContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7018b = (InputMethodManager) context.getSystemService("input_method");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.e = (ImageView) findViewById(com.google.android.play.k.search_box_idle_text);
        this.f = (TextView) findViewById(com.google.android.play.k.search_box_active_text_view);
        this.f7017a = (EditText) findViewById(com.google.android.play.k.search_box_text_input);
        q qVar = new q(this);
        this.e.setOnClickListener(qVar);
        this.f.setOnClickListener(qVar);
    }

    public void setPlaySearchController(l lVar) {
        if (this.c != null) {
            this.c.b(this);
        }
        this.c = lVar;
        this.c.a(this);
        this.d = new ai(this.c);
    }

    public void setHint(CharSequence charSequence) {
        if (charSequence != null) {
            this.f.setHint(charSequence);
            this.f7017a.setHint(charSequence);
        } else {
            this.f.setHint(com.google.android.play.m.play_search_box_hint);
            this.f7017a.setHint(com.google.android.play.m.play_search_box_hint);
        }
    }

    @Override // com.google.android.play.search.n
    public final void a(String str, boolean z) {
        this.f.setText(str);
        setText(str);
    }

    @Override // com.google.android.play.search.n
    public final void a(v vVar) {
    }

    @Override // com.google.android.play.search.n
    public final boolean b(v vVar) {
        return false;
    }

    @Override // com.google.android.play.search.n
    public final void a(String str) {
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            a();
            return true;
        }
        if (keyEvent != null) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 66 || keyCode == 160 || keyCode == 84) {
                if (keyEvent.getAction() != 1) {
                    return true;
                }
                a();
                return true;
            }
        }
        return false;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.c == null || this.g) {
            return;
        }
        this.c.a(charSequence.toString(), true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.c != null && this.c.f7048b == 4) {
            if (this.d != null) {
                this.d.b(getContext());
            }
            if (!TextUtils.isEmpty(this.c.d)) {
                this.c.c();
            } else if (hasFocus()) {
                this.c.a(3);
            } else {
                this.c.b();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            this.d.b(getContext());
        }
    }

    private void a() {
        if (TextUtils.getTrimmedLength(this.c.d) > 0) {
            this.c.c();
        }
    }

    private void setText(String str) {
        if (this.c.f7048b == 3 && !this.f7017a.getText().toString().equals(str)) {
            this.g = true;
            this.f7017a.setText(str);
            this.f7017a.setSelection(str.length());
            this.g = false;
        }
    }

    @Override // com.google.android.play.search.n
    public final void a(int i) {
        switch (i) {
            case 1:
                this.e.setVisibility(0);
                this.f.setVisibility(8);
                this.f7017a.setVisibility(8);
                this.f7017a.setOnEditorActionListener(null);
                this.f7017a.setOnClickListener(null);
                break;
            case 2:
                this.e.setVisibility(8);
                this.f.setVisibility(0);
                this.f7017a.setVisibility(8);
                this.f7017a.setOnEditorActionListener(null);
                break;
            case 3:
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.f7017a.setVisibility(0);
                this.f7017a.addTextChangedListener(this);
                this.f7017a.setOnEditorActionListener(this);
                this.f7017a.setOnClickListener(null);
                this.f7017a.requestFocus();
                this.f7018b.showSoftInput(this.f7017a, 0);
                if (this.c != null) {
                    this.c.a(true);
                }
                setText(this.c.d);
                return;
            case 4:
                if (this.c != null) {
                    this.c.a("", true);
                }
                if (this.c != null && this.d != null) {
                    ai aiVar = this.d;
                    Context context = getContext();
                    Intent intent = new Intent("com.google.android.play.search.VOICE_SEARCH_RESULT");
                    intent.setPackage(context.getPackageName());
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 1073741824);
                    Intent intent2 = new Intent(ai.f7031a);
                    intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                    intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", broadcast);
                    if (!aiVar.f7032b) {
                        context.registerReceiver(aiVar, new IntentFilter("com.google.android.play.search.VOICE_SEARCH_RESULT"));
                        aiVar.f7032b = true;
                    }
                    context.startActivity(intent2);
                    break;
                }
                break;
            default:
                return;
        }
        this.f7018b.hideSoftInputFromWindow(this.f7017a.getWindowToken(), 0);
        this.f7017a.removeTextChangedListener(this);
    }
}
