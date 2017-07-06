package com.example.admin.netdatalist.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

import com.aspsine.swipetoloadlayout.SwipeRefreshHeaderLayout;

/**
 * Created by horizony on 2017/4/25.
 */

public class RefreshHeaderView extends SwipeRefreshHeaderLayout {
    private Context mContext;
    private TextView mTextView;

    public RefreshHeaderView(Context context) {
        super(context);
        mContext = context;
        init();

    }

    public RefreshHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    public RefreshHeaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        init();
    }

    private void init() {
        mTextView = new TextView(mContext);
        mTextView.setGravity(Gravity.CENTER);
        LayoutParams textParam = new LayoutParams(-1, -1);
        addView(mTextView, textParam);
    }


    @Override
    public void onRefresh() {
        mTextView.setText("正在刷新");
    }


    @Override
    public void onPrepare() {
        mTextView.setText("");
    }

    @Override
    public void onMove(int yScrolled, boolean isComplete, boolean automatic) {
        if (!isComplete) {
          if (yScrolled >= getHeight()) {
                mTextView.setText("放开我，我要刷新");
            } else {
                mTextView.setText("用力下拉，我要刷新");
            }
        } else {
            mTextView.setText("");
        }
    }

    @Override
    public void onRelease() {
        mTextView.setText("");
    }

    @Override
    public void onComplete() {
        mTextView.setText("刷新完成");
    }

    @Override
    public void onReset() {
        mTextView.setText("");
    }

}
