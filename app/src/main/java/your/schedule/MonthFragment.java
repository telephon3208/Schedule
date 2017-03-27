package your.schedule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Calendar;


public class MonthFragment extends Fragment {

    View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.view = inflater.inflate(R.layout.month_fragment, container, false);
        GridView gv = (GridView) view.findViewById(R.id.gridView);
        BaseAdapter adapter = new MyAdapter(getActivity(), R.layout.grid_item, getArrayList());
        gv.setAdapter(adapter);
        return view;
    }

    //получаем множество дней недели для displayMonth
    private ArrayList<String> getArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        Calendar calendar = (Calendar) MainActivity.displayMonth.clone();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        //у америкосов неделя начинается с воскресенья
        if (dayOfWeek == 1) {
            dayOfWeek = 7;
        } dayOfWeek = dayOfWeek - 1;

        for (int i = 0; i < dayOfWeek - 1; i++) {
            arrayList.add(i, "");
        }

        calendar.add(Calendar.MONTH, 1);
        //   calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        int lastDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int index = dayOfWeek - 1;
        for (int day = 1; day <= lastDayOfMonth; day++) {
            arrayList.add(index, Integer.toString(day));
            index++;
        }

        return arrayList;

    }
}
