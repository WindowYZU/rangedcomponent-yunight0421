/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.rangedcomponentsamples;

import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class ProgressBar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JProgressBar progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setStringPainted(true);
        progressBar.setMaximum(100);
        
        Thread t=new Thread(){
            public void run(){
                int i=0;
                while(true){
                    //累加 i 的值，顯示在 progressBar，注意超過100要拉回來
                    progressBar.setValue(i);
                    i=(i+1)%100;
                    ////////////////////////////////////////////////
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProgressBar2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        t.setDaemon(true);
        t.start();
        
        frame.add(progressBar);
        frame.setVisible(true);
    }

}
