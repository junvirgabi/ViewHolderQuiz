package sidespell.tech.viewholderquiz.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import sidespell.tech.viewholderquiz.MainActivity;
import sidespell.tech.viewholderquiz.R;

/**
 * A placeholder fragment containing a {@link android.widget.GridView}.
 */
public class GridViewFragment extends Fragment {

    public static GridViewFragment newInstance() {
        return new GridViewFragment();
    }

   private GridView mGridview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gridview,container,false);
        mGridview = (GridView) view.findViewById(R.id.gridView);
        mGridview.setAdapter(new ImageAdapter(getContext()));

        mGridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

            }
        });
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gridview, container, false);
    }



    public class ImageAdapter extends BaseAdapter {
        private Context mContext;

        // Keep all Images in array
        public Integer[] mThumbIds = {

                R.drawable.thir, R.drawable.fif,
                R.drawable.suicide, R.drawable.assassins,
                R.drawable.batmanvssuperman, R.drawable.captainamerica,
               R.drawable.deadpool, R.drawable.forest,
                R.drawable.starwars, R.drawable.xmen,
        };

        // Constructor
        public ImageAdapter(Context c){
            mContext = c;
        }


        @Override
        public int getCount() {
            return mThumbIds.length;
        }

        @Override
        public Object getItem(int position) {
            return mThumbIds[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(mContext);
            imageView.setImageResource(mThumbIds[position]);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(new GridView.LayoutParams(70, 70));
            return imageView;
        }

    }

    }


