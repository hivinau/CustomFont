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

        initTypeface();
        initFont(null);
    }

    /**
     * Constructor : create a new instance of {@link TextView}
     * @param context context
     * @param attrs attrs
     */
    public TextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        initTypeface();
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

        initTypeface();
        initFont(attrs);
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

        initTypeface();
        initFont(attrs);
    }

    /**
     * Init default typeface : if not, when instanciate programmatically, all characters wiil be BOLD
     */
    private void initTypeface(){
        if(!isInEditMode()) {
            this.setTypeface(null, Typeface.NORMAL);
        }
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
                    case 6:
                        path = Constant.FONT_ALTEREBRO_PIXEL;
                        break;
                    case 7:
                        path = Constant.FONT_PIXELSPLITTER_BOLD;
                        break;
                    case 8:
                        path = Constant.FONT_ROBOTO_BLACK;
                        break;
                    case 9:
                        path = Constant.FONT_ROBOTO_BLACKITALIC;
                        break;
                    case 10:
                        path = Constant.FONT_ROBOTO_BOLD;
                        break;
                    case 11:
                        path = Constant.FONT_ROBOTO_BOLDITALIC;
                        break;
                    case 12:
                        path = Constant.FONT_ROBOTO_ITALIC;
                        break;
                    case 13:
                        path = Constant.FONT_ROBOTO_LIGHT;
                        break;
                    case 14:
                        path = Constant.FONT_ROBOTO_LIGHTITALIC;
                        break;
                    case 15:
                        path = Constant.FONT_ROBOTO_MEDIUM;
                        break;
                    case 16:
                        path = Constant.FONT_ROBOTO_MEDIUMITALIC;
                        break;
                    case 17:
                        path = Constant.FONT_ROBOTO_REGULAR;
                        break;
                    case 18:
                        path = Constant.FONT_ROBOTO_THIN;
                        break;
                    case 19:
                        path = Constant.FONT_ROBOTO_THINITALIC;
                        break;
                    case 20:
                        path = Constant.FONT_BEBAS_NEUE_BOLD;
                        break;
                    case 21:
                        path = Constant.FONT_BEBAS_NEUE_BOOK;
                        break;
                    case 22:
                        path = Constant.FONT_BEBAS_NEUE_LIGHT;
                        break;
                    case 23:
                        path = Constant.FONT_BEBAS_NEUE_REGULAR;
                        break;
                    case 24:
                        path = Constant.FONT_BEBAS_NEUE_THIN;
                        break;
                }

                setTypeface(Typeface.createFromAsset(getContext().getAssets(), path));

                a.recycle();
            }
        }
    }
}
