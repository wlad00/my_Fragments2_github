package vsevolod.my_fragments2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Vsevolod on 01.03.17.
 */

public class MyFragment extends Fragment{

    private TextView titleTxt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment,null);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        titleTxt = (TextView) view.findViewById(R.id.title_txt);
    }

    public void changeTitleColor(int color){
        titleTxt.setTextColor(color);
    }
}






















