import com.sun.jndi.toolkit.url.Uri;

import java.util.Collections;
import java.util.List;

public class CatsHelper {
    Api api;

    public Uri saveTheCutestCat(String query){
        List<Cat> cats = api.queryCats(query);
        Cat cutest = findCutest(cats);
        Uri savedUrl = api.store(cutest);
        return savedUrl;

    }

    private Cat findCutest(List<Cat> cats) {
        return Collections.max(cats);

    }


}
