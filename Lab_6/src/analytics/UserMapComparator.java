package analytics;

import java.util.Comparator;
import java.util.HashMap;
import model.User;

public class UserMapComparator implements Comparator<User> {

    HashMap<Integer, Integer> userPostMap;
    
    
    public UserMapComparator(HashMap<Integer, Integer> userpostMap) {
        this.userPostMap = userpostMap;
    }
    
    @Override
    public int compare(User o1, User o2) {
        
        return Integer.compare(
        ((userPostMap.get (o1.getId())== null) ? 0 : userPostMap.get(o1.getId())),
        ((userPostMap.get (o2.getId()) == null) ? 0 : userPostMap.get(o2.getId()))
        );
    }
    

}
