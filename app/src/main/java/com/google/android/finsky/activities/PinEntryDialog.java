package com.google.android.finsky.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.ButtonBar;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class PinEntryDialog extends android.support.v7.a.ae implements TextView.OnEditorActionListener, com.google.android.finsky.layout.r {
    private TextView k;
    private EditText l;
    private ButtonBar m;
    private String n;
    private boolean o;
    private boolean p;
    private com.google.android.finsky.apkg.i r;
    private com.google.android.finsky.layout.play.ad q = new com.google.android.finsky.layout.play.ad(311);
    private TextWatcher s = new eu(this);

    public static Intent a(Context context, int i, int i2, String str, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) PinEntryDialog.class);
        intent.putExtra("PinEntryDialog.isInEnterAndConfirmMode", false);
        intent.putExtra("PinEntryDialog.titleStringId", i);
        intent.putExtra("PinEntryDialog.promptStringId", i2);
        intent.putExtra("PinEntryDialog.pinToMatch", str);
        intent.putExtra("PinEntryDialog.extraParams", bundle);
        return intent;
    }

    public static Intent a(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) PinEntryDialog.class);
        intent.putExtra("PinEntryDialog.isInEnterAndConfirmMode", true);
        intent.putExtra("PinEntryDialog.titleStringId", R.string.pin_setup_label);
        intent.putExtra("PinEntryDialog.promptStringId", R.string.pin_setup_summary);
        intent.putExtra("PinEntryDialog.confirmTitleStringId", R.string.pin_confirm_label);
        intent.putExtra("PinEntryDialog.confirmPromptStringId", R.string.pin_confirm_summary);
        intent.putExtra("PinEntryDialog.extraParams", bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.pin_entry_dialog);
        Intent intent = getIntent();
        this.o = intent.getBooleanExtra("PinEntryDialog.isInEnterAndConfirmMode", false);
        int intExtra = intent.getIntExtra("PinEntryDialog.titleStringId", -1);
        int intExtra2 = intent.getIntExtra("PinEntryDialog.promptStringId", -1);
        this.n = intent.getStringExtra("PinEntryDialog.pinToMatch");
        this.k = (TextView) findViewById(R.id.prompt);
        this.l = (EditText) findViewById(R.id.passcode);
        this.m = (ButtonBar) findViewById(R.id.button_bar);
        setTitle(intExtra);
        this.k.setText(intExtra2);
        this.m.setPositiveButtonTitle(R.string.content_filter_ok);
        this.m.setNegativeButtonTitle(R.string.content_filter_cancel);
        this.m.setClickListener(this);
        this.l.addTextChangedListener(this.s);
        this.l.setOnEditorActionListener(this);
        this.r = FinskyApp.a().h();
        if (bundle == null) {
            this.r.a(0L, (com.google.android.finsky.layout.play.cy) this.q);
        }
        this.l.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("PinEntryDialog.keyIsInSetupConfirmStage", this.p);
        if (this.p) {
            bundle.putString("PinEntryDialog.keyCurrentPin", this.n);
        }
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.o && bundle != null) {
            this.p = bundle.getBoolean("PinEntryDialog.keyIsInSetupConfirmStage", false);
            if (this.p) {
                this.n = bundle.getString("PinEntryDialog.keyCurrentPin");
                Intent intent = getIntent();
                setTitle(intent.getIntExtra("PinEntryDialog.confirmTitleStringId", -1));
                this.k.setText(intent.getIntExtra("PinEntryDialog.confirmPromptStringId", -1));
            }
        }
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        this.r.a(258, (byte[]) null, this.q);
        String g = g();
        if (this.n != null && !this.n.equals(g)) {
            this.r.a(501, false);
            this.l.setText("");
            ik.a(this.l, getString(R.string.pin_label), getString(R.string.pin_entry_hint_wrong_passcode));
            return;
        }
        this.r.a(501, true);
        if (this.o && !this.p) {
            this.n = g;
            this.p = true;
            Intent intent = getIntent();
            setTitle(intent.getIntExtra("PinEntryDialog.confirmTitleStringId", -1));
            this.k.setText(intent.getIntExtra("PinEntryDialog.confirmPromptStringId", -1));
            ik.a(getBaseContext(), this.k.getText(), (View) this.k, true);
            this.l.setText("");
            this.l.requestFocus();
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("PinEntryDialog.resultPin", g);
        intent2.putExtra("PinEntryDialog.extraParams", getIntent().getBundleExtra("PinEntryDialog.extraParams"));
        setResult(-1, intent2);
        finish();
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        this.r.a(259, (byte[]) null, this.q);
        setResult(0);
        finish();
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onResume() {
        super.onResume();
        h();
    }

    private String g() {
        return this.l.getText().toString().trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.m.setPositiveButtonEnabled(g().length() >= 4);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if ((keyEvent != null && keyEvent.getKeyCode() == 66) || i == 6) {
            z_();
            return false;
        }
        return false;
    }
}
