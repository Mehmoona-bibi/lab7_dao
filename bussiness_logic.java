/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_6_new;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author boss
 */
public class bussiness_logic {
     public static Set<String> userParticipation(String withoutScheme) throws Exception {
        // Create a hash map
        Set<String> userIDs = new TreeSet<String>();
        String[] schemes = new String[3];
        schemes[0] = "CHC";
        schemes[1] = "CO-CHC";
        schemes[2] = "Rogue CHC";

        List<Passwords> results = new LinkedList<Passwords>();
        for (int i = 0; i < 3; i++) {
            if (schemes[i].equals(withoutScheme)) {
                continue;
            }
            results.addAll(PasswordDao.getAllPasswordsByScheme(schemes[i]));
        }

        for (int i = 0; i < results.size(); i++) {
            userIDs.add(results.get(i).getUserid());
        }

        return userIDs;
    }

    public static float meanLoginSuccessTime(String whichScheme) throws Exception {
        List<Passwords> results = PasswordDao.getAllPasswordsByScheme(whichScheme);
        int count = 0;
        float sum = 0;
        for (int i = 0; i < results.size(); i++) {
            Passwords temp = results.get(i);
            if (temp.getState().equals("TRUE")) {
                sum += temp.getTimeTaken();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return sum/count;
    }

//    public static float meanLoginSuccessPercentage(String whichScheme) throws Exception {
//        List<Passwords> results = PasswordDao.getAllPasswordsByScheme(whichScheme);
//        int count = results.size();
//        float success = 0;
//        for (int i = 0; i < results.size(); i++) {
//            Passwords temp = results.get(i);
//            if (temp.getState().equals("TRUE")) {
//                success++;
//            }
//        }
//        return (success / count) * 100;
//    }
//    
}
