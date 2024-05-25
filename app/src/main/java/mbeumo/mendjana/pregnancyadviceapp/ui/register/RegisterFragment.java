package mbeumo.mendjana.pregnancyadviceapp.ui.register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import mbeumo.mendjana.pregnancyadviceapp.databinding.FragmentRegisterBinding;
import mbeumo.mendjana.pregnancyadviceapp.databinding.FragmentSeemoreBinding;

public class RegisterFragment extends Fragment {
    private FragmentRegisterBinding binding;
    String name,address;
    int Age;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // PreventiveViewModel preventiveViewModel =
        //     new ViewModelProvider(this).get(PreventiveViewModel.class);

        binding = FragmentRegisterBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
