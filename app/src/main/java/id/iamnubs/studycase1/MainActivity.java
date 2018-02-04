package id.iamnubs.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    int uangSaya = 65500;

    @BindView(R.id.tv_menu)
    TextView tMenu;
    @BindView(R.id.tv_porsi)
    TextView tPorsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @OnClick(R.id.bt_eatbus)
    void eatbus() {
        if (checkValue()) {
            startActivity(new Intent(this, ResultActivity.class));
        }
    }

    @OnClick(R.id.bt_abnormal)
    void abnomral() {
        if (checkValue()) {
            if (checkValue()) {
                startActivity(new Intent(this, ResultActivity.class).putExtra("isOk", true));
            }
        }
    }

    boolean checkValue() {
        if (!tMenu.getText().toString().toLowerCase().equals("nasi uduk")) {
            Toast.makeText(this, "Makan Nasi uduk aja tong", Toast.LENGTH_SHORT).show();
            return false;
        } else if (!tPorsi.getText().toString().equals("2")) {
            Toast.makeText(this, "untuk Berdua tong", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    @Override
    public int getContent() {
        return R.layout.activity_main;
    }
}
