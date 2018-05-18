package com.testandroid.miguelbaena.voccesandroidtest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FieldUserInfoView extends LinearLayout {

    private ImageView fieldIcon;
    private TextView fieldTitle;
    private TextView fieldUserInfo;

    public FieldUserInfoView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        setOrientation(LinearLayout.HORIZONTAL);
        setGravity(Gravity.CENTER_VERTICAL);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.user_field_info_view, this, true);

        fieldIcon = (ImageView) getChildAt(0);
        fieldTitle = (TextView)getChildAt(1);
        fieldUserInfo = (TextView)getChildAt(2);
    }

    public FieldUserInfoView(Context context) {
        this(context, null);
    }

    public void setFieldIcon(int iconResourceId) {
        fieldIcon.setImageResource(iconResourceId);
    }

    public void setFieldTitleValue(String textValue) {
        fieldTitle.setText(textValue);
    }

    public void setFieldUserValue(String textValue) {
        fieldUserInfo.setText(textValue);
    }


}
