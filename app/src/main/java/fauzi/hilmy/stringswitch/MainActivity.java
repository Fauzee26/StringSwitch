package fauzi.hilmy.stringswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNomor;
    Button btnHasil;
    TextView lblHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomor = (EditText)findViewById(R.id.editText);
        btnHasil = (Button)findViewById(R.id.button);
        lblHasil = (TextView)findViewById(R.id.textView);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = etNomor.getText().toString();

                switch (nomor) {
                    case "1":
                        lblHasil.setText("Naik Pesawat Terbang");
                        break;
                    case "2":
                        lblHasil.setText("Naik Kereta Api");
                        break;
                    case "3":
                        lblHasil.setText("Naik Bus");
                        break;
                    case "4":
                        lblHasil.setText("Naik Taksi");
                        break;
                    case "5":
                        lblHasil.setText("Naik Mobil Pribadi");
                        break;
                    case "6":
                        lblHasil.setText("Naik Motor");
                        break;
                    default:
                        lblHasil.setText("Anda Salah Memilih");
                }
            }
        });
    }
}
