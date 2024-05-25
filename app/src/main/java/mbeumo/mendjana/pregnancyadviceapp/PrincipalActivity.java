package mbeumo.mendjana.pregnancyadviceapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import mbeumo.mendjana.pregnancyadviceapp.databinding.FragmentHomeBinding;
import mbeumo.mendjana.pregnancyadviceapp.databinding.PrincipalActivityBinding;
import mbeumo.mendjana.pregnancyadviceapp.ui.home.HomeViewModel;

public class PrincipalActivity extends AppCompatActivity {
    private PrincipalActivityBinding binding;
    private TextView text;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = PrincipalActivityBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*Animation fade_in= AnimationUtils.loadAnimation(this,R.anim.first_anim);
        Animation fade_out= AnimationUtils.loadAnimation(this,R.anim.fade_out);
        text = root.findViewById(R.id.textView10);
        text.startAnimation(fade_in);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                text.startAnimation(fade_out);
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 5000);*/
        return root;
    }

}
