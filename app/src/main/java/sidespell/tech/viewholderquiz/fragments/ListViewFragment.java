package sidespell.tech.viewholderquiz.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sidespell.tech.viewholderquiz.R;

/**
 * A placeholder fragment containing a {@link android.widget.ListView}.
 */
public class ListViewFragment extends Fragment {

    public static ListViewFragment newInstance() {
        return new ListViewFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_listview, container, false);
    }
}
