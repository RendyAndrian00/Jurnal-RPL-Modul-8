
package nomor1;

import java.util.ArrayList;

public class datafibonaci {
    ArrayList<Integer> al = new ArrayList<>();
    
    public void performReverseFibonaci(int i){
        for (int j = 0; j < i; j++) {   
            if ( j == 0 || j == 1){
                al.add(1);
                continue;
            }
            al.add(al.get(j-1)+al.get(j-2));
        }
        
        for (int j = i-1; j >= 0; j--) {
            System.out.print (" " + al.get(j));
        }
        
    }
}

