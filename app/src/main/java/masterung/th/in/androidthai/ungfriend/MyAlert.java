package masterung.th.in.androidthai.ungfriend;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

public class MyAlert {
    private Context context;  //ทำ context ก่อน

    public MyAlert(Context context) {   //สร้าง constructor
        this.context = context;
    }
    public void normalDialog(String title,String message){

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });
        builder.show();



    }


}
