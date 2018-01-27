package view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.leiyang.iosdialog.R;

/**
 * Created by 24436 on 2018/1/28.
 */

public class MDialog extends Dialog {
    private Button btn_cancel,btn_determine;
    private TextView tv_info;
    public MDialog(@NonNull Context context) {
        super(context, R.style.mDialogTheme);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.mdiialog_layout,null);
        tv_info = view.findViewById(R.id.title_info);
        btn_cancel = view.findViewById(R.id.cancel);
        btn_determine = view.findViewById(R.id.determine);
        setContentView(view);
    }

    public void setOnCancelListener(View.OnClickListener listener){
        btn_cancel.setOnClickListener(listener);
    }

    public void setOnExitListener(View.OnClickListener listener){
        btn_determine.setOnClickListener(listener);
    }
}
