package fr.futurdigital.apps.android.textview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;

/**
 * <br>
 * <i>This class is for smartcar app</i>
 * <br>
 * <br>
 * Class : <b>TextView</b>
 * <br>
 * Subject : load custom font
 *
 * @author Hivinau GRAFFE
 * @version 1.0
 *
 * Created by Hivinau on 12/11/2015.
 */
public class TextView extends android.widget.TextView
{

    /**
     * Constructor : create a new instance of {@link TextView}
     * @param context context
     */
    public TextView(Context context) {
        super(context);

        initFont(null);
    }

    /**
     * Constructor : create a new instance of {@link TextView}
     * @param context context
     * @param attrs attrs
     */
    public TextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        initFont(attrs);
    }

    /**
     * Constructor : create a new instance of {@link TextView}
     * @param context context
     * @param attrs attrs
     * @param defStyleAttr defattr
     */
    public TextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        initFont(attrs);
    }

    /**
     * Init default value of font
     * @param attrs a collection of attributes associated with xml
     */
    private void initFont(AttributeSet attrs){
        if(!isInEditMode()) {
            if (attrs == null) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), Constant.FONT_BEBAS_NEUE));
            } else {
                TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.TextView, 0, 0);

                int index = a.getInt(R.styleable.TextView_font, 0);

                String path = Constant.FONT_BEBAS_NEUE;

                switch (index) {
                    case 1:
                        path = Constant.FONT_GLYPHICONS_HALFLINGS_REGULAR;
                        break;
                    case 2:
                        path = Constant.FONT_PHILOSOPHER_BOLD;
                        break;
                    case 3:
                        path = Constant.FONT_PHILOSOPHER_BOLD_ITALIC;
                        break;
                    case 4:
                        path = Constant.FONT_PHILOSOPHER_ITALIC;
                        break;
                    case 5:
                        path = Constant.FONT_PHILOSOPHER_REGULAR;
                        break;
                }
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), path));

                a.recycle();
            }
        }
    }

    /**
     * Constructor : create a new instance of {@link TextView}
     * @param context context
     * @param attrs attrs
     * @param defStyleAttr defattr
     * @param defStyleRes res
     */
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        setTypeface(Typeface.createFromAsset(context.getAssets(), Constant.FONT_BEBAS_NEUE));
    }
}
