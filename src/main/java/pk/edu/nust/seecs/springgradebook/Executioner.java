/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.springgradebook;

import javax.swing.JFrame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Sayyed Shozib Abbas
 */
public class Executioner extends JFrame implements Runnable {
    public static void main(String[] args) {
        Executioner admin = new Executioner();
        Thread t = new Thread(admin);
        t.start();
    }
    
    Executioner() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Override
    public void run() {
        this.setVisible(true);
    }
}
