package mbeumo.mendjana.pregnancyadviceapp.ui.register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import mbeumo.mendjana.pregnancyadviceapp.Model.Database;
import mbeumo.mendjana.pregnancyadviceapp.R;
import mbeumo.mendjana.pregnancyadviceapp.databinding.FragmentRegisterBinding;
import mbeumo.mendjana.pregnancyadviceapp.ui.preventive.PreventiveFragment;

public class RegisterFragment extends Fragment {
    private FragmentRegisterBinding binding;
    EditText nameraw,addressraw,pass,age;
    String name,address,password;
    private Button Register;
    int Age;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // PreventiveViewModel preventiveViewModel =
        //     new ViewModelProvider(this).get(PreventiveViewModel.class);

        binding = FragmentRegisterBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        name=root.findViewById(R.id.name).toString();
        address=root.findViewById(R.id.EmailAddress).toString();
        password=root.findViewById(R.id.Age).toString();
        age=root.findViewById(R.id.Age);
        try {
            Age=Integer.parseInt(age.toString());

        }catch (NumberFormatException t){
            Toast.makeText(getActivity().getApplicationContext(),"Invalid input in age.please enter a valid interger", Toast.LENGTH_SHORT).show();
        }
        String pass;
        pass=hashPasword(password);
        Database obj = new Database(getActivity());
        Register =root.findViewById(R.id.button2);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new instance of the other fragment
                boolean result=obj.insertUserData(name,Age,address,pass);
                if(result==true) {
                    Toast.makeText(getActivity().getApplicationContext(), "Login sucessfull", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getActivity().getApplicationContext(), "Login failed ", Toast.LENGTH_SHORT).show();

                }
                Fragment fragment =new PreventiveFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.addToBackStack("preventive").replace(R.id.container,fragment).commit();

            }
        });

        return root;
    }
    public String hashPasword(String plain){
        try {
            MessageDigest md=MessageDigest.getInstance("SHA-256");
            byte[] hashbytes=md.digest(plain.getBytes());
            StringBuilder hexString = new StringBuilder();
            for(byte b : hashbytes){
                String hex = Integer.toHexString(0xFF & b);
                if(hex.length()==1){
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        }catch (NoSuchAlgorithmException e){
         e.printStackTrace();
         return null;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
