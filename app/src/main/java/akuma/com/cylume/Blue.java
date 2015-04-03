package akuma.com.cylume;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by kaltuku1 on 4/3/15.
 */
public class Blue extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blue);

        ActionBar actionBar = getActionBar();
        actionBar.hide();

        Button btn = (Button) findViewById(R.id.changeBlue);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), Yellow.class);
                startActivity(intent);
            }
        });
    }
}
