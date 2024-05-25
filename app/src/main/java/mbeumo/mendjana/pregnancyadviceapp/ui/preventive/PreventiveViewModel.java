package mbeumo.mendjana.pregnancyadviceapp.ui.preventive;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PreventiveViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public void PreventiveViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Preventive menu");
    }

    public LiveData<String> getText() {
        return mText;
    }
}