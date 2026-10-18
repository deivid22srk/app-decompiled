package com.google.android.finsky.widget;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.a.ae;
import android.text.TextUtils;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.pt;
import com.google.android.finsky.utils.cz;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
/* loaded from: classes.dex */
public class WidgetConfigurationActivity extends ae {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.widget_configuration);
        setResult(0);
        Intent intent = getIntent();
        setTitle(intent.getIntExtra("dialog_title", R.string.app_name));
        GridView gridView = (GridView) findViewById(R.id.container);
        List<pt> b2 = ((DfeToc) intent.getParcelableExtra("dfeToc")).b();
        ArrayList a2 = cz.a(b2.size());
        if (intent.getBooleanExtra("enableMultiCorpus", true)) {
            pt ptVar = new pt();
            ptVar.f4268a = 0;
            ptVar.f4269b = true;
            ptVar.c = b(0);
            ptVar.d = true;
            a2.add(ptVar);
        }
        for (pt ptVar2 : b2) {
            if (intent.getBooleanExtra("backend_" + ptVar2.f4268a, true)) {
                String b3 = b(ptVar2.f4268a);
                if (!TextUtils.isEmpty(b3)) {
                    ptVar2.c = b3;
                    ptVar2.d = true;
                }
                a2.add(ptVar2);
            }
        }
        gridView.setNumColumns(Math.min(a2.size(), 3));
        gridView.setAdapter((ListAdapter) new i(this, a2, intent.getIntExtra("appWidgetId", -1)));
    }

    private String b(int i) {
        return getIntent().getStringExtra("name_" + i);
    }
}
