package com.ailyan.androidnotifications;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

class Notifications {
    public static void infoDialog(Context ctx, String title, String message) {
        AlertDialog.Builder b = new AlertDialog.Builder(ctx);
        b.setMessage(message);
        b.setCancelable(false);
        b.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        b.setTitle(title);
        AlertDialog ad = b.create();
        ad.show();
    }
}