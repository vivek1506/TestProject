package real.self.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "first commit", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "first commit", Toast.LENGTH_SHORT).show();

    }
}