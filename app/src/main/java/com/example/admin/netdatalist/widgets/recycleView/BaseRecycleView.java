package com.example.admin.netdatalist.widgets.recycleView;

/**
 * Created by admin on 2017/7/6.
 */

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

import com.example.admin.netdatalist.R;

public class BaseRecycleView extends RecyclerView {

    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public static final int INVALID_OFFSET = 2;
    public static final int GRID = 3;

    private int layoutMode;
    private int spanCount;
    private boolean rowDivider;
    private boolean spanDivider;
    private boolean inner;
    private int dividerWidth;
    private int dividerHeight;
    private int marginLeft, marginTop, marginRight, marginBottom;
    private int dividerColor;

    private LayoutManager layoutManager;

    public BaseRecycleView(Context context) {
        this(context, null);
    }

    public BaseRecycleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseRecycleView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initStyleable(context, attrs);
        initView(context);
    }

    private void initStyleable(Context context, AttributeSet attrs) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.BaseRecycleView);
        layoutMode = array.getInt(R.styleable.BaseRecycleView_layoutMode, VERTICAL);
        spanCount = array.getInt(R.styleable.BaseRecycleView_span_divider, 3);
        rowDivider = array.getBoolean(R.styleable.BaseRecycleView_row_divider, false);
        spanDivider = array.getBoolean(R.styleable.BaseRecycleView_span_divider, false);

        inner = array.getBoolean(R.styleable.BaseRecycleView_inner, false);
        dividerWidth = (int) array.getDimension(R.styleable.BaseRecycleView_divider_width, 1f);
        dividerHeight = (int) array.getDimension(R.styleable.BaseRecycleView_divider_height, 1f);
        marginLeft = (int) array.getDimension(R.styleable.BaseRecycleView_divider_margin_left, 0f);
        marginRight = (int) array.getDimension(R.styleable.BaseRecycleView_divider_margin_right, 0f);
        marginTop = (int) array.getDimension(R.styleable.BaseRecycleView_divider_margin_top, 0f);
        marginBottom = (int) array.getDimension(R.styleable.BaseRecycleView_divider_margin_bottom, 0f);
        dividerColor = array.getColor(R.styleable.BaseRecycleView_divider_color, Color.parseColor("#00000000"));
        array.recycle();
    }

    private void initView(Context context) {
        setOverScrollMode(OVER_SCROLL_NEVER);
        switch (layoutMode) {
            case HORIZONTAL:
                if (!inner) {
                    layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
                } else {

                }
                break;
            case VERTICAL:
                if (!inner) {
                    layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
                } else {

                }
                break;
            case INVALID_OFFSET:
                if (!inner)
                    layoutManager = new LinearLayoutManager(context, LinearLayoutManager.INVALID_OFFSET, false);
                else {

                }
                break;
            case GRID:
                if (!inner) {
                    layoutManager = new GridLayoutManager(context, spanCount);
                } else {
                }
                break;
        }
        setLayoutManager(layoutManager);
        if (rowDivider) {
            HorizontalDividerItemDecoration decoration = new HorizontalDividerItemDecoration.Builder(context)
                    .color(dividerColor)
                    .size(dividerHeight)
                    .margin(marginLeft, marginRight)
                    .build();
            addItemDecoration(decoration);
        }
        if (spanDivider) {
            VerticalDividerItemDecoration decoration = new VerticalDividerItemDecoration.Builder(context)
                    .color(dividerColor)
                    .size(dividerWidth)
                    .margin(marginTop, marginBottom)
                    .build();
            addItemDecoration(decoration);
        }
        setHasFixedSize(true);
    }
}

