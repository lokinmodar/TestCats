import com.sun.jndi.toolkit.url.Uri;

import java.util.Collections;
import java.util.List;

public class CatsHelper {

    ApiWrapper apiWrapper;

    public void saveTheCutestCat(String query, Callback<Uri> cutestCatCallback){
        apiWrapper.queryCats(query, new Callback<List<Cat>>() {
            @Override
            public void onResult(List<Cat> cats) {
                Cat cutest = findCutest(cats);
                apiWrapper.store(cutest, cutestCatCallback);
            }

            @Override
            public void onError(Exception e) {
                cutestCatCallback.onError(e);
            }
        });
    }


    private Cat findCutest(List<Cat> cats) {
        return Collections.max(cats);

    }


}
