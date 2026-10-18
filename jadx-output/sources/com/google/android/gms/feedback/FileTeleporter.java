package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class FileTeleporter implements SafeParcelable {
    public static final Parcelable.Creator<FileTeleporter> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    final int f5800a;

    /* renamed from: b, reason: collision with root package name */
    ParcelFileDescriptor f5801b;
    final String c;
    final String d;
    public File e;
    private byte[] f;

    FileTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.f5800a = i;
        this.f5801b = parcelFileDescriptor;
        this.c = str;
        this.d = str2;
    }

    private FileOutputStream a() {
        if (this.e == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            File createTempFile = File.createTempFile("teleporter", ".tmp", this.e);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                this.f5801b = ParcelFileDescriptor.open(createTempFile, 268435456);
                createTempFile.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted");
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Could not create temporary file", e2);
        }
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.f5801b == null) {
            DataOutputStream dataOutputStream = new DataOutputStream(a());
            try {
                try {
                    dataOutputStream.writeInt(this.f.length);
                    dataOutputStream.writeUTF(this.c);
                    dataOutputStream.writeUTF(this.d);
                    dataOutputStream.write(this.f);
                } catch (IOException e) {
                    throw new IllegalStateException("Could not write into unlinked file", e);
                }
            } finally {
                a(dataOutputStream);
            }
        }
        d.a(this, parcel, i);
    }
}
