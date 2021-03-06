package com.example.module_home.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.module_base.bean.Asia;
import com.example.module_base.bean.Europe;
import com.example.module_base.util.GlideUtil;
import com.example.module_home.R;

import java.util.List;


public class EuropeVideoListAdapter extends BaseQuickAdapter<Europe, BaseViewHolder> {
    private Context context;

    public EuropeVideoListAdapter(@Nullable List<Europe> data, Context context) {
        super(R.layout.item_video_list_layout, data);
        this.context=context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Europe item) {
        helper.setText(R.id.tv_video_name,item.getVideoName());
        helper.setText(R.id.tv_video_time,item.getDate());
        GlideUtil.loadRoundCornerAvatarImage(item.getPicture(), (ImageView) helper.getView(R.id.iv_video_pic),10);
    }
}
