package com.aa.mymazrati;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class TowFragment extends Fragment {
    RecyclerView Rv;
    List<Products_item> m_product;
    ProductAdapter productAdapter;
    View view;
    private StaggeredGridLayoutManager manager;
    public TowFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.content_main, container, false);


        Rv=view.findViewById(R.id.recyclerView);
        m_product = new ArrayList<>();
//        Rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        Rv.setLayoutManager(manager);


//
//        m_product.add(new Products_item("",R.drawable.illustration));
//        m_product.add(new Products_item("",R.drawable.clothes));
        m_product.add(new Products_item("تفاح أبيض صيني",R.drawable.a));
        m_product.add(new Products_item("كاكا اسباني",R.drawable.aa));
        m_product.add(new Products_item("موز صغير دل مونتي",R.drawable.aaa));
        m_product.add(new Products_item("جوز هند يونج",R.drawable.aaaa));
        m_product.add(new Products_item("تفاح جولد روز",R.drawable.aaaaa));
        m_product.add(new Products_item("تفاح فوجي",R.drawable.aaaaaa));
        m_product.add(new Products_item("تفاح أخضر جراني سميث إيطالي",R.drawable.aaaaaaa));
        m_product.add(new Products_item("تفاح أحمر امريكي",R.drawable.aaaaaaaa));
        m_product.add(new Products_item("تفاح أصفر",R.drawable.aaaaaaaaa));
        m_product.add(new Products_item("مشمش مستورد",R.drawable.aaaaaaaaaa));
        m_product.add(new Products_item("مشمش إيطالي وسط علبة",R.drawable.aaaaaaaaaaa));
        m_product.add(new Products_item("موز يوني فروتي",R.drawable.aaaaaaaaaaaaaaaa));
        m_product.add(new Products_item("موز دلمونتي",R.drawable.aaaaaaaaaaaaa));
        m_product.add(new Products_item("موز",R.drawable.aaaaaaaaaaaaaaa));
        m_product.add(new Products_item("توت اسود ديسكولز",R.drawable.s));
        m_product.add(new Products_item("كستناء ابو فروه صينية",R.drawable.ss));
        m_product.add(new Products_item("دريسكولز توت بري أزرق",R.drawable.sss));
        m_product.add(new Products_item("دريسكولز فراولة",R.drawable.ssss));
        m_product.add(new Products_item("دريسكولز فراولة علبة كبيرة",R.drawable.sssss));
        m_product.add(new Products_item("عنب اسود",R.drawable.ssssss));
        m_product.add(new Products_item("مانجا كيت",R.drawable.sssssss));
        m_product.add(new Products_item("جريب فروت",R.drawable.ssssssss));
        m_product.add(new Products_item("جوافه مصرية",R.drawable.sssssssss));
        m_product.add(new Products_item("كيوي حبة كبيرة",R.drawable.ssssssssss));
        m_product.add(new Products_item("يوسفي كلمنتينا استرالي",R.drawable.sssssssssss));
        m_product.add(new Products_item("يوسفي كلمنتينا مصري",R.drawable.d));
        m_product.add(new Products_item("مندلينا مستوردة",R.drawable.dd));
        m_product.add(new Products_item("مندلينا مغربية",R.drawable.ddd));
        m_product.add(new Products_item("مانجا تيمور",R.drawable.dddd));
        m_product.add(new Products_item("مانجو قلب الثور",R.drawable.ddddd));
        m_product.add(new Products_item("برتقال عصير مصري",R.drawable.dddddd));
        m_product.add(new Products_item("برتقال أبو صرة مستورد",R.drawable.ddddddd));
        m_product.add(new Products_item("أناناس",R.drawable.dddddddd));
        m_product.add(new Products_item("كمثرى أفريقي",R.drawable.ddddddddd));
        m_product.add(new Products_item("بابايا طري",R.drawable.dddddddddd));
        m_product.add(new Products_item("رمان يمني",R.drawable.ff));
        m_product.add(new Products_item("بوملي ",R.drawable.fff));
        m_product.add(new Products_item("سفرجل",R.drawable.ffff));
        m_product.add(new Products_item("دريسكولز توت بري أحمر",R.drawable.fffff));
        m_product.add(new Products_item("عنب احمر",R.drawable.ffffff));
        m_product.add(new Products_item("خوخ أحمر",R.drawable.fffffff));
        m_product.add(new Products_item("تفاح رويال غالا",R.drawable.ffffffff));
        m_product.add(new Products_item("مندلينا يوسفي اسباني",R.drawable.g));
        m_product.add(new Products_item("تفاح كنزي",R.drawable.h));

        productAdapter = new ProductAdapter(getActivity(),m_product);
        Rv.setAdapter(productAdapter);

        return view;
    }

}
