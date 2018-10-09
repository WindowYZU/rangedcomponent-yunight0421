/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.rangedcomponentsamples;

import java.awt.FlowLayout;
import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author lendle
 */
public class Slider2 {

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
        slider.setMinimum(0);
        slider.setMaximum(100);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(20);
        slider.setPaintLabels(true);
        frame.add(slider);
        
        JTextField textField=new JTextField();
        textField.setColumns(20);
        frame.add(textField);
        //攔截 ChangeListener
        //並將 slider.getValue() 填入 textField
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                textField.setText(""+slider.getValue());
            }
        });
        
        ///////////////////////////////////////
        
        frame.setVisible(true);
    }
    
}
