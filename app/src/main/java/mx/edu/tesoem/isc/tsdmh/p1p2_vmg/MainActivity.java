package mx.edu.tesoem.isc.tsdmh.p1p2_vmg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre;
    Button btnsaluda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txtnombre = findViewById(R.id.txtnombre);
        btnsaluda = findViewById(R.id.btnp1saluda);

        btnsaluda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bienvenido" + txtnombre.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}