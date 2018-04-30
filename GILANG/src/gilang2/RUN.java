
package gilang2;

import com.sun.javafx.applet.Splash;
import java.io.IOException;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author 41varro
 */
public class RUN {
    public static void main(String[] args) throws IOException {
        
    
    LOADING A = new LOADING();
    A.setVisible(true);
    Login login = new Login();
    
        try {
            for(int i = 0; i <=100; i++){
                Thread.sleep(100);
                A.loadingnum.setText(Integer.toString(i)+"%");
                A.loadingbar.setValue(i);
                A.loadingbar1.setValue(i);
                if(i==100){
                    A.setVisible(false);
                    login.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
} 
}