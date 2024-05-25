package mbeumo.mendjana.pregnancyadviceapp.ui.preventive;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import mbeumo.mendjana.pregnancyadviceapp.R;
import mbeumo.mendjana.pregnancyadviceapp.databinding.FragmentSeemoreBinding;

public class SeeMore extends Fragment {
    private FragmentSeemoreBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       // PreventiveViewModel preventiveViewModel =
           //     new ViewModelProvider(this).get(PreventiveViewModel.class);

        binding = FragmentSeemoreBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        ImageView imageView = binding.imageView4;
//        imageView.setImageResource(R.drawable.pills);
//        TextView textView2 = binding.textPills;
//        textView2.setText("Also known as birth control pills, are a safe, simple, and convenient\n" +
//                "        method to prevent pregnancy.\n" +
//                "        They work by releasing hormones (estrogen and progestin) that prevent ovulation, meaning there’s\n" +
//                "        no egg for sperm to fertilize.Effectiveness: When used correctly, contraceptive pills offer great protection against pregnancy.\n" +
//                "        Ease of Use: All you need to do is take one pill every day. It’s even easier if you take it at the same time each day.\n" +
//                "        Additional Benefits: Besides preventing pregnancy, contraceptive pills can also reduce acne, make your periods lighter and more regular,\n" +
//                "        and ease menstrual cramps. They can even reduce your risk of certain cancers.\n" +
//                "        Control: If you decide you want to get pregnant, you can simply stop taking the pill");
//        ImageView imageView2 = binding.imageView5;
//        imageView2.setImageResource(R.drawable.contraception_hormonal_iud);
//        TextView textView3 = binding.textUid;
//        textView3.setText("The device is a T-shaped plastic frame that releases a type of hormone called progestin12. This hormone prevents pregnancy in two ways: it thickens the mucus on your cervix to block sperm, and it can also stop eggs from\n" +
//                "        leaving your ovaries (ovulation), which means there’s no egg for a sperm to fertilize");
//
//        TextView textView6 = binding.textLookup;
//        textView6.setText("The ultimate control. It’s not about missing out, it’s about choosing your moment.\n" +
//                "        It’s the only method that’s 100% effective against pregnancy and STIs. It’s not just a choice, it’s a lifestyle of\n" +
//                "        self-discipline and respect for your future. Remember, your body, your rules.” Stay informed, stay safe</string>\n");
//
//        TextView textView7 = binding.textMore;
//        textView3.setText("more info look at this");
//        TextView textView4 = binding.textseemore;
//        textView4.setText("https://www.bing.com/");

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
