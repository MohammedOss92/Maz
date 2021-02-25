package com.aa.mymazrati;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;

public class OneFragment extends Fragment {

    RecyclerView Rv;
    List<Products_item> m_product;
    List<Object> recycleritem = new ArrayList<>();
    ProductAdapter productAdapter;
    View view;
    public static final int ITEM_PER_AD=4;
    public static final String BANNER_AD_ID="ca-app-pub-3940256099942544/6300978111";
    private StaggeredGridLayoutManager manager;
    public OneFragment() {
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


        getData();
        BannerAds();
        loadBanner();
        productAdapter = new ProductAdapter(getActivity(),m_product);
        Rv.setAdapter(productAdapter);

        return view;
    }

    public void getData(){

        m_product.add(new Products_item("",R.drawable.q));
        m_product.add(new Products_item("",R.drawable.qq));
        m_product.add(new Products_item("",R.drawable.qqq));
        m_product.add(new Products_item("",R.drawable.qqqq));
        m_product.add(new Products_item("",R.drawable.w));
        m_product.add(new Products_item("",R.drawable.ww));
        m_product.add(new Products_item("",R.drawable.www));
        m_product.add(new Products_item("",R.drawable.wwww));
        m_product.add(new Products_item("",R.drawable.e));
        m_product.add(new Products_item("",R.drawable.ee));
        m_product.add(new Products_item("",R.drawable.eee));
        m_product.add(new Products_item("",R.drawable.eeee));
        m_product.add(new Products_item("",R.drawable.r));
        m_product.add(new Products_item("",R.drawable.rr));
        m_product.add(new Products_item("",R.drawable.rrr));
        m_product.add(new Products_item("",R.drawable.rrrr));
        m_product.add(new Products_item("",R.drawable.t));
        m_product.add(new Products_item("",R.drawable.tt));
        m_product.add(new Products_item("",R.drawable.ttt));
        m_product.add(new Products_item("",R.drawable.tttt));
        m_product.add(new Products_item("",R.drawable.y));
        m_product.add(new Products_item("",R.drawable.yy));
        m_product.add(new Products_item("",R.drawable.yyy));
        m_product.add(new Products_item("",R.drawable.yyyy));
        m_product.add(new Products_item("",R.drawable.u));
        m_product.add(new Products_item("",R.drawable.uu));
        m_product.add(new Products_item("",R.drawable.uuu));
        m_product.add(new Products_item("",R.drawable.uuuu));
        m_product.add(new Products_item("",R.drawable.i));
        m_product.add(new Products_item("",R.drawable.ii));
        m_product.add(new Products_item("",R.drawable.iii));
        m_product.add(new Products_item("",R.drawable.iiii));
        m_product.add(new Products_item("",R.drawable.iiiii));

        int count =0;
        for(Products_item fName : m_product)
        {
            recycleritem.add(new Products_item(fName));
            count++;
        }
    }

    private void BannerAds(){
        for (int i = 0; i<recycleritem.size();  i +=ITEM_PER_AD){
            final AdView adView = new AdView(getActivity());
            adView.setAdSize(AdSize.BANNER);
            adView.setAdUnitId(BANNER_AD_ID);
            recycleritem.add(adView);
        }
    }

    private void loadBanner(){
        for(int i=0; i<recycleritem.size();i++){
            Object item = recycleritem.get(i);
            if (item instanceof AdView){
                final AdView adView = (AdView) item ;
                adView.loadAd(new AdRequest.Builder().build());
            }
        }
    }

    }
