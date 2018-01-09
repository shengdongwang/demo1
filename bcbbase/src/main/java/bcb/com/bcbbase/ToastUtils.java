package bcb.com.bcbbase;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/1/9.
 */

public class ToastUtils {
    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

}
