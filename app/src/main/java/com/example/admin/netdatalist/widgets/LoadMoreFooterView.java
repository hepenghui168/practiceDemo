package com.example.admin.netdatalist.widgets;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

import com.aspsine.swipetoloadlayout.SwipeLoadMoreFooterLayout;
import com.example.admin.netdatalist.R;

/**
 * Created by horizony on 2017/4/25.
 */

public class LoadMoreFooterView extends SwipeLoadMoreFooterLayout {
    private Context mContext;
    private TextView mTextView;

    private String completeText;

    public LoadMoreFooterView(Context context) {
        super(context);
        mContext = context;
        init();
    }

    public LoadMoreFooterView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    public LoadMoreFooterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        init();
    }

    private void init() {
        completeText = mContext.getString(R.string.loading_finish);
        mTextView = new TextView(mContext);
        mTextView.setGravity(Gravity.CENTER);
        LayoutParams textParam = new LayoutParams(-1, -1);
        addView(mTextView, textParam);
        mTextView.setText(mContext.getString(R.string.loading_more));
    }

    @Override
    public void onLoadMore() {
        mTextView.setText(mContext.getString(R.string.is_loading));
    }

    @Override
    public void onPrepare() {

    }

    @Override
    public void onMove(int i, boolean b, boolean b1) {

    }

    @Override
    public void onRelease() {

    }

    @Override
    public void onComplete() {
        mTextView.setText(completeText);
    }

    @Override
    public void onReset() {
        mTextView.setText(mContext.getString(R.string.loading_more));
    }

    public void setCompleteText(String completeText) {
        this.completeText = completeText;
    }
}
