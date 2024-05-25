package mbeumo.mendjana.pregnancyadviceapp.ui.preventive;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import mbeumo.mendjana.pregnancyadviceapp.MainActivity;
import mbeumo.mendjana.pregnancyadviceapp.R;
import mbeumo.mendjana.pregnancyadviceapp.databinding.FragmentPreventiveBinding;

public class PreventiveFragment extends Fragment {

    private FragmentPreventiveBinding binding;
    private TextView textView5;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PreventiveViewModel preventiveViewModel =
                new ViewModelProvider(this).get(PreventiveViewModel.class);

        binding = FragmentPreventiveBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        /*final TextView textView = binding.textName;
        textView.setText("Preventive measures");
        //preventiveViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        ImageView imageView = binding.imageView3;
        imageView.setImageResource(R.drawable._5b3073e2_8bac_471a_be92_c1d8c2868162);
        ImageView imageView4 = binding.imageView4;
        imageView4.setImageResource(R.drawable.cond);
        TextView textView2 = binding.textCondoms;
        textView2.setText("Knowledge is power, and safety is paramount. Unwrap the facts, protect your futurem");
        ImageView imageView5 = binding.imageView5;
        imageView5.setImageResource(R.drawable.dia);
        TextView textView3 = binding.textDiagphragm;
        textView3.setText("The diaphragm is a shallow, bendable silicone cup that you insert inside\n" +
                "        your vagina. It covers your cervix during sex to prevent pregnancy1. When used correctly with spermicide\n" +
                "        (a cream or gel that kills sperm), it can be an effective method of contraception1. However, it’s important\n" +
                "        to note that diaphragms are not as effective as some other methods of contraception, such as the pill, implant,\n" +
                "        and intrauterine devices (IUDs)");
        ImageView imageView6 = binding.imageView6;
        imageView6.setImageResource(R.drawable.abs);
        TextView textView4 = binding.textAbstinence;
        textView4.setText("The ultimate control. It’s not about missing out, it’s about choosing your moment." +
                "        It’s the only method that’s 100% effective against pregnancy and STIs. It’s not just a choice, it’s a lifestyle of" +
                "        self-discipline and respect for your future. Remember, your body, your rules.” Stay informed, stay safe.");*/
        textView5 = binding.textSeemore;
        ///textView5.setText("see more >>");
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new instance of the other fragment
                Fragment fragment =new SeeMore();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.addToBackStack("name").replace(R.id.preventive,fragment).commit();

                // Use the FragmentManager to start a FragmentTransaction
                // Replace the current fragment with the new one


                // Add the transaction to the back stack so the user can navigate back

                // Commit the transaction

            }
        });
        // Now you can set an OnClickListener for myTextView

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}