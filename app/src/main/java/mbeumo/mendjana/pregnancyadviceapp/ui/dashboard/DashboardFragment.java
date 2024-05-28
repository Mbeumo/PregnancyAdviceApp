package mbeumo.mendjana.pregnancyadviceapp.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import mbeumo.mendjana.pregnancyadviceapp.R;
import mbeumo.mendjana.pregnancyadviceapp.databinding.FragmentDashboardBinding;
import mbeumo.mendjana.pregnancyadviceapp.ui.preventive.PreventiveFragment;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;
    private Button buttonpreventive,buttonDoctor;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        buttonpreventive = root.findViewById(R.id.buttonpreventive);
        buttonpreventive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Fragment fragment =new PreventiveFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.addToBackStack(null).replace(R.id.container,fragment).commit();
            }
        });
        buttonDoctor = root.findViewById(R.id.button_doc);
        buttonpreventive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Fragment fragment =new DoctorFragment();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.addToBackStack(null).replace(R.id.container,fragment).commit();
            }
        });

       // final TextView textView = binding.textDashboard;
        //dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}