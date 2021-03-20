package Bank.service;

import java.util.*;

import Bank.AccountController;

public class Auth {
    public int[] LoginAs(int no, int psc, List<AccountController> ctr) {
        int[] rt = {0,0};
        for (int i = 0; i < ctr.size(); i++) {
            if (ctr.get(i).getAccountNo() == no) {
                for (int j = 0; j < ctr.size(); j++) {
                    if(ctr.get(j).getPasscode() == psc) {
                        rt[0] = 1; rt[1] = i;
                        return rt;
                    }
                }
            }
        }
        return rt;
    }    
}
