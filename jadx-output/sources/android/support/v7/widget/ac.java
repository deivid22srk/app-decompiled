package android.support.v7.widget;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.keyczar.Keyczar;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes.dex */
final class ac extends AsyncTask<Object, Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f644a;

    private ac(x xVar) {
        this.f644a = xVar;
    }

    /* synthetic */ ac(x xVar, byte b2) {
        this(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Object... objArr) {
        String str;
        Context context;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        List list = (List) objArr[0];
        String str8 = (String) objArr[1];
        try {
            context = this.f644a.g;
            FileOutputStream openFileOutput = context.openFileOutput(str8, 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument(Keyczar.DEFAULT_ENCODING, true);
                    newSerializer.startTag(null, "historical-records");
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        aa aaVar = (aa) list.remove(0);
                        newSerializer.startTag(null, "historical-record");
                        newSerializer.attribute(null, "activity", aaVar.f642a.flattenToString());
                        newSerializer.attribute(null, "time", String.valueOf(aaVar.f643b));
                        newSerializer.attribute(null, "weight", String.valueOf(aaVar.c));
                        newSerializer.endTag(null, "historical-record");
                    }
                    newSerializer.endTag(null, "historical-records");
                    newSerializer.endDocument();
                    x.c(this.f644a);
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (Throwable th) {
                    x.c(this.f644a);
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                str6 = x.c;
                StringBuilder sb = new StringBuilder("Error writing historical recrod file: ");
                str7 = this.f644a.h;
                Log.e(str6, sb.append(str7).toString(), e3);
                x.c(this.f644a);
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e4) {
                    }
                }
            } catch (IllegalArgumentException e5) {
                str4 = x.c;
                StringBuilder sb2 = new StringBuilder("Error writing historical recrod file: ");
                str5 = this.f644a.h;
                Log.e(str4, sb2.append(str5).toString(), e5);
                x.c(this.f644a);
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e6) {
                    }
                }
            } catch (IllegalStateException e7) {
                str2 = x.c;
                StringBuilder sb3 = new StringBuilder("Error writing historical recrod file: ");
                str3 = this.f644a.h;
                Log.e(str2, sb3.append(str3).toString(), e7);
                x.c(this.f644a);
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException e8) {
                    }
                }
            }
        } catch (FileNotFoundException e9) {
            str = x.c;
            Log.e(str, "Error writing historical recrod file: " + str8, e9);
        }
        return null;
    }
}
