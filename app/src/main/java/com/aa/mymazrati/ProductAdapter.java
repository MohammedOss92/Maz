package com.aa.mymazrati;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdView;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context mContext;
    List<Products_item> m_product;
    List<Object> recycleritem = new ArrayList<>();
    private static final int ITEM_FR=0;
    private static final int ITEM_BANNER_AD=1;
    public ProductAdapter(Context mContext, List<Products_item> m_product) {
        this.mContext = mContext;
        this.m_product = m_product;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        switch (viewType)
        {
            case ITEM_FR:
                View layout = LayoutInflater.from(mContext).inflate(R.layout.items_prpduct,parent,false);
                return new FViewHolder(layout);
            case  ITEM_BANNER_AD:

            default:
                View lay = LayoutInflater.from(mContext).inflate(R.layout.banner,parent,false);
                return new BannerAdViewHolder(lay);
        }


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
// bind data here




        // lets create the animation for the whole card
        // first lets create a reference to it
        // you ca use the previous same animation like the following

        // but i want to use a different one so lets create it ..
//        holder.container.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_scale_animation));





        int viewType = getItemViewType(position);
        switch (viewType){
            case ITEM_FR:
                FViewHolder viewHolder = (FViewHolder) holder;
                Products_item products_item = (Products_item)recycleritem.get(position);
                // we apply animation to views here
                // first lets create an animation for user photo
                viewHolder.img_pro.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_transition_animation));
                viewHolder.tv_title.setText(m_product.get(position).getTitlt());
                viewHolder.tv_title.setVisibility(View.INVISIBLE);
                viewHolder.img_pro.setImageResource(m_product.get(position).getProduct_photo());
                break;

            case ITEM_BANNER_AD:
            default:
                BannerAdViewHolder bannerAdViewHolder= (BannerAdViewHolder) holder;
                AdView adView = (AdView) recycleritem.get(position);
                ViewGroup adCardView = (ViewGroup) bannerAdViewHolder.itemView;

                if (adCardView.getChildCount()>0){
                    adCardView.removeAllViews();
                }
                if (adCardView.getParent()!= null){
                    ((ViewGroup)adView.getParent()).removeView(adView);

                }
                adCardView.addView(adView);
        }


    }

    @Override
    public int getItemCount() {
        return recycleritem.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position%OneFragment.ITEM_PER_AD==0)
        return ITEM_BANNER_AD;
        else
            return ITEM_FR;
    }

    public class FViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title;
        ImageView img_pro;
        RelativeLayout container;

        public FViewHolder(@NonNull View itemView) {
            super(itemView);
            container = itemView.findViewById(R.id.container);
            tv_title = itemView.findViewById(R.id.tv_title);
            img_pro = itemView.findViewById(R.id.img_pro);
        }
    }

    public static class BannerAdViewHolder extends RecyclerView.ViewHolder
    {

        public BannerAdViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
