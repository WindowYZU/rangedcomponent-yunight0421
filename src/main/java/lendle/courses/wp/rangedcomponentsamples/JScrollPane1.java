/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.rangedcomponentsamples;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ProgressMonitor;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class JScrollPane1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JTextArea textArea=new JTextArea();
        JScrollPane scrollPane=new JScrollPane();
        scrollPane.getViewport().add(textArea);
        
        //試試看將 textArea 或 scrollPane 加入 frame 的區別
        frame.add(scrollPane);
        ///////////////////////////////////////////////
        frame.setVisible(true);
    }

}
