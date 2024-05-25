package mbeumo.mendjana.pregnancyadviceapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import mbeumo.mendjana.pregnancyadviceapp.R;
import mbeumo.mendjana.pregnancyadviceapp.databinding.FragmentHomeBinding;
import mbeumo.mendjana.pregnancyadviceapp.ui.preventive.SeeMore;
import mbeumo.mendjana.pregnancyadviceapp.ui.register.RegisterFragment;

public class HomeFragment extends Fragment {
    private Button Register;
    private EditText password;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textHome;
        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        ImageView imageView5 = binding.imageView2;
        //imageView5.setImageResource(R.drawable._6e042078_ddbd_4d2a_80c3_79d9605f8d88);
        final TextView textView1 = binding.textName;
        //TextView textView2 = binding.textCondoms;
        //textView.setText("Name");
        final EditText editText1 = binding.editTextName;
        TextView textView2 = binding.textPassword;
        //apperently it is not obliged to et the values again here a it has been already defined in the corresponding xml file
        //textView2.setText("Password");
        //password = binding.editTextPassword;

        Register =root.findViewById(R.id.buttonreg);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new instance of the other fragment
                Fragment fragment =new RegisterFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.addToBackStack("home").replace(R.id.container,fragment).commit();

            }
        });
//        FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
//        fragmentManager.popBackStack("home",0);
        return root;
    }
   /* @Override
    public void onBackPressed(){

    }
*/
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}