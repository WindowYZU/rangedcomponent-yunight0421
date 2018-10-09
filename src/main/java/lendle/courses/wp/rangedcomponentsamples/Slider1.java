/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.rangedcomponentsamples;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class Slider1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        JSlider slider=new JSlider();
        //set min to 0
        //max to 100
        //value to 5
        //paintTicks to true
        //paintTracks to true
        //minorTickSpacing to 10
        //majorTickSpacing to 
        //
        //and then add the slider to frame
        slider.setMinimum(0);
        slider.setMaximum(100);
        slider.setValue(5);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setPaintLabels(true);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        frame.add(slider);
       
        //////////////////////////////////
        
        frame.setVisible(true);
    }
    
}
