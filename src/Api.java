import com.sun.jndi.toolkit.url.Uri;

import java.util.List;

public interface Api {
    interface CatsQueryCallback{
        void onCatListReceived(List<Cat> cats);
        void onError(Exception e);
    }

    void queryCats(String query, CatsQueryCallback catsQueryCallback);


    Uri store(Cat cat);

}
