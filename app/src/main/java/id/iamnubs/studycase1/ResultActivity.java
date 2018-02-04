package id.iamnubs.studycase1;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;

/**
 * Created by iamnubs on 04/02/2018.
 */

public class ResultActivity extends BaseActivity {

    @BindView(R.id.tv_tempat)
    TextView tempat;
    @BindView(R.id.tv_harga)
    TextView harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean isOk = getIntent().getBooleanExtra("isOk", false);
        if (isOk) {
            tempat.setText("Abnormal");
            harga.setText("Rp 60.000");
            Toast.makeText(this, "Disini Oke Tong", Toast.LENGTH_SHORT).show();
        } else {
            tempat.setText("Eatbus");
            harga.setText("Rp 100.000");
            Toast.makeText(this, "Mahal Coeg Pergi sana", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public int getContent() {
        return R.layout.activity_result;
    }
}
