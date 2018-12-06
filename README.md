# RatingBar
a custom ratingbar with you can set Image and count ,一个星星的评分控件，可以设置图片和个数，可以设置半个星星，或一个星星

# SuperChartView

#### 1、添加依赖和配置

* 根目录build.gradle文件添加如下配置：

```Java
allprojects {
    repositories {
       	maven { url 'https://jitpack.io' }
    }
}
```

* APP目录build.gradle文件添加如下配置：

```Java
dependencies {
    implementation 'com.github.liujianguangnice:RatingBar:2.0.0'
}
```

#### 2、效果展示
![点我查看效果图](https://github.com/liujianguangnice/RatingBar/blob/master/screenshot/tste_20181206175419.png?raw=true)

#### 3、核心代码


<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:paddingLeft="15dp">

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp">

        <TextView
            android:id="@+id/textView"
            android:layout_width="50dp"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_marginRight="10dp"
            android:gravity="left"
            android:text="星级"
            android:textSize="12dp" />

        <!--上面RatingBar属性设置代码是使用的关键 对星星数量，大小，位置，星星样式，间距，默认星级等均做了设置-->

        <com.ljg.ratingbar.RatingBar
            android:id="@+id/star"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_toRightOf="@+id/textView"
            app:clickable="false"
            app:starCount="5"
            app:starEmpty="@drawable/rating_small_empty"
            app:starFill="@drawable/rating_small_full"
            app:starHalf="@drawable/rating_small_half"
            app:starImageSize="16dp"
            app:starPadding="4dp"
            app:starStep="2.5"
            app:stepSize="Half" />

    </LinearLayout>


    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:gravity="center_vertical">

        <TextView
            android:layout_width="50dp"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_marginRight="10dp"
            android:gravity="left"
            android:text="带点击事件的星级"
            android:textSize="12dp" />

        <!--上面RatingBar属性设置代码是使用的关键 对星星数量，大小，位置，星星样式，间距，默认星级等均做了设置-->

        <com.ljg.ratingbar.RatingBar
            android:id="@+id/star_have_click"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_toRightOf="@+id/textView"
            app:starCount="5"
            app:starEmpty="@drawable/rating_small_empty"
            app:starFill="@drawable/rating_small_full"
            app:starHalf="@drawable/rating_small_half"
            app:starImageSize="16dp"
            app:starPadding="4dp"
            app:starStep="2.5"
            app:stepSize="Half" />

    </LinearLayout>


    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:gravity="center_vertical">

        <TextView
            android:layout_width="50dp"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_marginRight="10dp"
            android:gravity="left"
            android:text="点击增加或删除整个星星"
            android:textSize="10dp" />

        <!--上面RatingBar属性设置代码是使用的关键 对星星数量，大小，位置，星星样式，间距，默认星级等均做了设置-->

        <com.ljg.ratingbar.RatingBar
            android:id="@+id/star_have_click_all"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_toRightOf="@+id/textView"
            app:starCount="5"
            app:starEmpty="@drawable/rating_small_empty"
            app:starFill="@drawable/rating_small_full"
            app:starHalf="@drawable/rating_small_half"
            app:starImageSize="16dp"
            app:starPadding="4dp"
            app:starStep="2.5"
            app:stepSize="Full" />

    </LinearLayout>


    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:gravity="center_vertical">

        <TextView
            android:layout_width="50dp"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_marginRight="10dp"
            android:gravity="left"
            android:text="点击增加或删除半个星星"
            android:textSize="10dp" />

        <!--上面RatingBar属性设置代码是使用的关键 对星星数量，大小，位置，星星样式，间距，默认星级等均做了设置-->

        <com.ljg.ratingbar.RatingBar
            android:id="@+id/star_have_click_half"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_toRightOf="@+id/textView"
            app:starCount="5"
            app:starEmpty="@drawable/rating_small_empty"
            app:starFill="@drawable/rating_small_full"
            app:starHalf="@drawable/rating_small_half"
            app:starImageSize="16dp"
            app:starPadding="4dp"
            app:starStep="3.5"
            app:stepSize="Half" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:gravity="center_vertical">

        <TextView
            android:layout_width="50dp"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_marginRight="10dp"
            android:gravity="left"
            android:text="设置星星间距"
            android:textSize="10dp" />

        <!--上面RatingBar属性设置代码是使用的关键 对星星数量，大小，位置，星星样式，间距，默认星级等均做了设置-->

        <com.ljg.ratingbar.RatingBar
            android:id="@+id/star_have_click_pading"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_toRightOf="@+id/textView"
            app:starCount="5"
            app:starImageSize="16dp"
            app:starPadding="20dp"
            app:starStep="3.5"
            app:stepSize="Half" />

    </LinearLayout>
</LinearLayout>


public class RatingBar extends LinearLayout {

    /**
     * 是否可点击
     */
    private boolean mClickable;
    /**
     * 星星总数
     */
    private int starCount;
    /**
     * 星星的点击事件
     */
    private OnRatingChangeListener onRatingChangeListener;
    /**
     * 每个星星的大小
     */
    private float starImageSize;
    /**
     * 每个星星的间距
     */
    private float starPadding;
    /**
     * 星星的显示数量，支持小数点
     */
    private float starStep;
    /**
     * 空白的默认星星图片
     */
    private Drawable starEmptyDrawable;
    /**
     * 选中后的星星填充图片
     */
    private Drawable starFillDrawable;
    /**
     * 半颗星的图片
     */
    private Drawable starHalfDrawable;
    /**
     * 每次点击星星所增加的量是整个还是半个
     */
    private StepSize stepSize;

    /**
     * 设置半星的图片资源文件
     */
    public void setStarHalfDrawable(Drawable starHalfDrawable) {
        this.starHalfDrawable = starHalfDrawable;
    }

    /**
     * 设置满星的图片资源文件
     */
    public void setStarFillDrawable(Drawable starFillDrawable) {
        this.starFillDrawable = starFillDrawable;
    }

    /**
     * 设置空白和默认的图片资源文件
     */
    public void setStarEmptyDrawable(Drawable starEmptyDrawable) {
        this.starEmptyDrawable = starEmptyDrawable;
    }

    /**
     * 设置星星是否可以点击操作
     */
    public void setClickable(boolean clickable) {
        this.mClickable = clickable;
    }

    /**
     * 设置星星点击事件
     */
    public void setOnRatingChangeListener(OnRatingChangeListener onRatingChangeListener) {
        this.onRatingChangeListener = onRatingChangeListener;
    }

    /**
     * 设置星星的大小
     */
    public void setStarImageSize(float starImageSize) {
        this.starImageSize = starImageSize;
    }

    public void setStepSize(StepSize stepSize) {
        this.stepSize = stepSize;
    }


    /**
     * 构造函数
     * 获取xml中设置的资源文件
     */
    public RatingBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOrientation(LinearLayout.HORIZONTAL);
        TypedArray mTypedArray = context.obtainStyledAttributes(attrs, R.styleable.RatingBar);
        starImageSize = mTypedArray.getDimension(R.styleable.RatingBar_starImageSize, 20);
        starPadding = mTypedArray.getDimension(R.styleable.RatingBar_starPadding, 10);
        starStep = mTypedArray.getFloat(R.styleable.RatingBar_starStep, 1.0f);
        stepSize = StepSize.fromStep(mTypedArray.getInt(R.styleable.RatingBar_stepSize, 1));
        starCount = mTypedArray.getInteger(R.styleable.RatingBar_starCount, 5);
        Log.i("TAG", "RatingBar: RatingBar_starEmpty="+ mTypedArray.getDrawable(R.styleable.RatingBar_starEmpty));
        starEmptyDrawable = mTypedArray.getDrawable(R.styleable.RatingBar_starEmpty)==null?getResources().getDrawable(R.drawable.rating_small_empty):mTypedArray.getDrawable(R.styleable.RatingBar_starEmpty);
        starFillDrawable = mTypedArray.getDrawable(R.styleable.RatingBar_starFill)==null?getResources().getDrawable(R.drawable.rating_small_full):mTypedArray.getDrawable(R.styleable.RatingBar_starFill);
        starHalfDrawable = mTypedArray.getDrawable(R.styleable.RatingBar_starHalf)==null?getResources().getDrawable(R.drawable.rating_small_half):mTypedArray.getDrawable(R.styleable.RatingBar_starHalf);
        mClickable = mTypedArray.getBoolean(R.styleable.RatingBar_clickable, true);
        mTypedArray.recycle();
        for (int i = 0; i < starCount; ++i) {
            final ImageView imageView = getStarImageView();
            //imageView.setImageDrawable(starEmptyDrawable);
            imageView.setOnClickListener(
                    new OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (mClickable) {
                                //浮点数的整数部分
                                int fint = (int) starStep;
                                BigDecimal b1 = new BigDecimal(Float.toString(starStep));
                                BigDecimal b2 = new BigDecimal(Integer.toString(fint));
                                //浮点数的小数部分
                                float fPoint = b1.subtract(b2).floatValue();
                                if (fPoint == 0) {
                                    fint -= 1;
                                }
                                int index = indexOfChild(v);
                                if (indexOfChild(v) > fint) {
                                    setStar(indexOfChild(v) + 1);
                                } else if (indexOfChild(v) == fint) {
                                    if (stepSize == StepSize.Full) {//如果是满星 就不考虑半颗星了
                                        if(imageView.getDrawable().getCurrent().getConstantState().equals(starFillDrawable.getConstantState())) {
                                            setStar(indexOfChild(v));
                                        }else if(imageView.getDrawable().getCurrent().getConstantState().equals(starEmptyDrawable.getConstantState())) {
                                            setStar(indexOfChild(v) + 1);
                                        }

                                        return;
                                    }
                                    //点击之后默认每次先增加一颗星，再次点击变为半颗星
                                    if (imageView.getDrawable().getCurrent().getConstantState().equals(starHalfDrawable.getConstantState())) {
                                        setStar(indexOfChild(v));
                                    } else if(imageView.getDrawable().getCurrent().getConstantState().equals(starFillDrawable.getConstantState())) {
                                        setStar(indexOfChild(v) +0.5f);
                                    }else if(imageView.getDrawable().getCurrent().getConstantState().equals(starEmptyDrawable.getConstantState())) {
                                        setStar(indexOfChild(v) + 1);
                                    }
                                } else {
                                    setStar(indexOfChild(v) + 1f);
                                }

                            }
                        }
                    }
            );
            addView(imageView);
        }
        setStar(starStep);
    }

    /**
     * 设置每颗星星的参数
     */
    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());

        LayoutParams layout = new LayoutParams(
                Math.round(starImageSize), Math.round(starImageSize));//设置每颗星星在线性布局的大小
        layout.setMargins(0, 0,Math.round(starPadding), 0);//设置每颗星星在线性布局的间距
        imageView.setLayoutParams(layout);
        /*如果您希望ImageView调整其边界，请将此设置为true以保持其可绘图的纵横比*/
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageDrawable(starEmptyDrawable);
        imageView.setMinimumWidth(10);
        imageView.setMaxHeight(10);
        return imageView;

    }

    /**
     * 设置星星的个数
     */

    public void setStar(float rating) {

        if (onRatingChangeListener != null) {
            onRatingChangeListener.onRatingChange(rating);
        }
        this.starStep = rating;
        //浮点数的整数部分
        int fint = (int) rating;
        BigDecimal b1 = new BigDecimal(Float.toString(rating));
        BigDecimal b2 = new BigDecimal(Integer.toString(fint));
        //浮点数的小数部分
        float fPoint = b1.subtract(b2).floatValue();

        //设置选中的星星
        for (int i = 0; i < fint; ++i) {
            ((ImageView) getChildAt(i)).setImageDrawable(starFillDrawable);
        }
        //设置没有选中的星星
        for (int i = fint; i < starCount; i++) {
            ((ImageView) getChildAt(i)).setImageDrawable(starEmptyDrawable);
        }
        //小数点默认增加半颗星
        if (fPoint > 0) {
            ((ImageView) getChildAt(fint)).setImageDrawable(starHalfDrawable);
        }
    }

    /**
     * 操作星星的点击事件
     */
    public interface OnRatingChangeListener {
        /**
         * 选中的星星的个数
         */
        void onRatingChange(float ratingCount);

    }

    /**
     * 星星每次增加的方式整星还是半星，枚举类型
     * 类似于View.GONE
     */
    public enum StepSize {
        Half(0), Full(1);
        int step;

        StepSize(int step) {
            this.step = step;
        }

        public static StepSize fromStep(int step) {
            for (StepSize f : values()) {
                if (f.step == step) {
                    return f;
                }
            }
            throw new IllegalArgumentException();
        }
    }


    /**
     * dip转换px
     */
    public static int dp2px(Context context, int dip) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dip * scale + 0.5f);
    }

    /**
     * pxz转换dip
     */
    public static int px2dp(Context context, int px) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (px / scale + 0.5f);
    }
}

