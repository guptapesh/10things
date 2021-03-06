package rightarrows.com.tenthings.Adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import rightarrows.com.tenthings.Model.FoodPojo;
import rightarrows.com.tenthings.Model.PlacePojo;
import rightarrows.com.tenthings.R;

public class PlaceAdapter extends ArrayAdapter {

    private Context context;
    private int layResource;
    private ArrayList<PlacePojo> arrayList;
    private LayoutInflater inflater;
    TextView desc;

    public PlaceAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<PlacePojo> objects) {
        super(context, resource, objects);

        this.context = context;
        this.layResource = resource;
        this.arrayList = objects;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public View getView(int position, final View convertView, ViewGroup parent)
    {
        View view = inflater.inflate(layResource, null);
        desc= view.findViewById(R.id.text_food);
        Log.d("hey",position+"dasdas");
        PlacePojo pojo= arrayList.get(position);
        desc.setText(pojo.getCategory());
        return  view ;
    }


}
