package com.example.admin.netdatalist.animals.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.netdatalist.R;
import com.example.admin.netdatalist.animals.model.model.ArticleListBean;
import com.example.admin.netdatalist.widgets.recycleView.BaseAdapter;
import com.example.admin.netdatalist.widgets.recycleView.BaseViewHolder;

import java.text.ParseException;
import java.util.List;

import butterknife.BindView;

/**
 * Created by admin on 2017/7/6.
 */

public class ArticleListAdapter extends BaseAdapter<ArticleListBean, BaseViewHolder> {


    public ArticleListAdapter(Context context, List<ArticleListBean> articleListBeen) {
        super(context, articleListBeen);
    }

    @Override
    public int getLayoutId(int viewType) {
        return R.layout.layout_article_list_item;
    }

    @Override
    public BaseViewHolder getViewHolder(View itemView, int viewType) {
        return null;
    }

    @Override
    public void onBindItem(BaseViewHolder holder, ArticleListBean articleListBean, int position) throws ParseException {

    }

    static class ArticleListViewHolder extends BaseViewHolder {

        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_detail)
        TextView tvDetail;
        @BindView(R.id.img_icon)
        ImageView imgIcon;

        public ArticleListViewHolder(View itemView) {
            super(itemView);
        }
    }
}
