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
import javax.swing.ProgressMonitor;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class ProgressBar3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        //建立 ProgressMonitor
        ProgressMonitor progressBar=new ProgressMonitor(frame, "123", "downloading......", 0, 100);
        /////////////////////////
        Thread t=new Thread(){
            public void run(){
                int i=0;
                for(i=0; i<=100; i++){
                    progressBar.setProgress(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProgressBar3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        t.start();
        
        frame.setVisible(true);
    }

}
