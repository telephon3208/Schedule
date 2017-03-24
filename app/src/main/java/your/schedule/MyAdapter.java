package your.schedule;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;



public class MyAdapter extends ArrayAdapter {

    private ArrayList<String> list;
    private GridView grid;
   // private View v;

    public MyAdapter(@NonNull Context context, @LayoutRes int resource, ArrayList<String> arrayList) {
        super(context, resource, arrayList);

        this.list = arrayList;
    }

/*    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return grid.getChildAt(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       // v = convertView;
        grid = (GridView) parent;

        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        textView.setText(list.get(position));

        return convertView;
    }*/
}
