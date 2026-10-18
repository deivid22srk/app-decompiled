package com.android.vending;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.BackupManager;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.d;
import com.google.android.finsky.c.o;
import com.google.android.finsky.services.RestoreService;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.jn;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

/* loaded from: classes.dex */
public class VendingBackupAgent extends BackupAgentHelper {
    public static void a(Context context) {
        if (!jn.e.a().booleanValue()) {
            new BackupManager(context).dataChanged();
        }
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        long longValue = d.p.b().longValue();
        FinskyLog.a("Backing up aid: %s", FinskyLog.a(Long.toHexString(longValue)));
        dataOutputStream.writeLong(longValue);
        a(backupDataOutput, byteArrayOutputStream, "vending");
        a(backupDataOutput, byteArrayOutputStream, dataOutputStream, "auto_update_enabled", bg.t.a().booleanValue());
        a(backupDataOutput, byteArrayOutputStream, dataOutputStream, "update_over_wifi_only", bg.u.a().booleanValue());
        a(backupDataOutput, byteArrayOutputStream, dataOutputStream, "auto_add_shortcuts", jn.l.a().booleanValue());
        a(backupDataOutput, byteArrayOutputStream, dataOutputStream, "notify_updates", jn.h.a().booleanValue());
        a(backupDataOutput, byteArrayOutputStream, dataOutputStream, "notify_updates_completion", jn.i.a().booleanValue());
        dataOutputStream.writeInt(bg.f4774b.a().intValue());
        a(backupDataOutput, byteArrayOutputStream, "content-filter-level");
        jn.e.a((o<Boolean>) true);
    }

    private static void a(BackupDataOutput backupDataOutput, ByteArrayOutputStream byteArrayOutputStream, DataOutputStream dataOutputStream, String str, boolean z) {
        dataOutputStream.writeBoolean(z);
        a(backupDataOutput, byteArrayOutputStream, str);
    }

    private static void a(BackupDataOutput backupDataOutput, ByteArrayOutputStream byteArrayOutputStream, String str) {
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        backupDataOutput.writeEntityHeader(str, byteArray.length);
        backupDataOutput.writeEntityData(byteArray, byteArray.length);
        byteArrayOutputStream.reset();
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        FinskyLog.a("Entered onRestore", new Object[0]);
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        boolean z = false;
        while (backupDataInput.readNextHeader()) {
            int dataSize = backupDataInput.getDataSize();
            byte[] bArr = new byte[dataSize];
            backupDataInput.readEntityData(bArr, 0, dataSize);
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
            String key = backupDataInput.getKey();
            FinskyLog.a("Restoring key %s", key);
            if ("vending".equals(key)) {
                String hexString = Long.toHexString(dataInputStream.readLong());
                FinskyLog.a("Restored aid: %s", FinskyLog.a(hexString));
                RestoreService.a(this, hexString, (String) null);
                jn.f.a((o<String>) hexString);
                z = true;
            } else if ("auto_update_enabled".equals(key)) {
                bool2 = Boolean.valueOf(dataInputStream.readBoolean());
            } else if ("auto_update_default".equals(key)) {
                bool3 = Boolean.valueOf(dataInputStream.readBoolean());
            } else if ("update_over_wifi_only".equals(key)) {
                bool = Boolean.valueOf(dataInputStream.readBoolean());
            } else if ("auto_add_shortcuts".equals(key)) {
                jn.l.a((o<Boolean>) Boolean.valueOf(dataInputStream.readBoolean()));
            } else if ("notify_updates".equals(key)) {
                jn.h.a((o<Boolean>) Boolean.valueOf(dataInputStream.readBoolean()));
            } else if ("notify_updates_completion".equals(key)) {
                jn.i.a((o<Boolean>) Boolean.valueOf(dataInputStream.readBoolean()));
            } else if ("content-filter-level".equals(key)) {
                bg.f4774b.a((o<Integer>) Integer.valueOf(dataInputStream.readInt()));
            }
        }
        if (bg.t.b()) {
            FinskyLog.a("Skip restore auto-update - already set locally.", new Object[0]);
        } else if (bool2 != null) {
            bg.t.a((o<Boolean>) bool2);
        } else if (bool3 != null) {
            jn.k.a((o<Boolean>) bool3);
            com.google.android.finsky.b.a aVar = FinskyApp.a().s;
            aVar.a(new c(this, aVar));
        }
        if (bool != null && bg.u.b()) {
            bg.u.a((o<Boolean>) bool);
        }
        if (!z) {
            FinskyLog.c("Restore completed, no Market aid was found", new Object[0]);
        }
        FinskyLog.a("Finished onRestore", new Object[0]);
    }
}
