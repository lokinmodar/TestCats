import com.sun.jndi.toolkit.url.Uri;

import java.util.List;

public interface Api {
    List<Cat> queryCats(String query);
    Uri store(Cat cat);

}
