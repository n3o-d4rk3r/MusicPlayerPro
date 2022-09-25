package co.applabltd.musicplayerbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import co.applabltd.musicplayerbd.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    /*
     ************************
     * Start of Declar Android View Binding
     * **************************
     */
    private ActivityMainBinding binding;

    /*
     ************************
     * End of Declar Android View Binding
     * **************************
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.refreshBtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Playing Music",Toast.LENGTH_SHORT).show();
            }
        });

    }
}