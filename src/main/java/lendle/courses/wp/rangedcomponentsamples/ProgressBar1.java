/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.rangedcomponentsamples;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class ProgressBar1 {

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
        //試試看
        //minimum, maximum, value, stringPainted, indeterminate
        //這幾個屬性
        
        
        ////////////////////////////////////////////////////////
        frame.add(progressBar);
        frame.setVisible(true);
    }

}
