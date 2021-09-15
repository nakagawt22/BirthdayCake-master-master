package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener{
    private CakeView myCakeView;
    private CakeModel myCakeModel;

    public CakeController(CakeView cakeView) {
        myCakeView = cakeView;
        myCakeModel = cakeView.getMyCake();
    }
}
public void onClick(View v)
        {
        Log.d("on click", "recieved");
        myCakeView.invalidate();
        }
}
