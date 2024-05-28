package mbeumo.mendjana.pregnancyadviceapp.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import mbeumo.mendjana.pregnancyadviceapp.databinding.FragmentDoctorBinding;

public class DoctorFragment extends Fragment {
    private FragmentDoctorBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){
        binding = FragmentDoctorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
}
