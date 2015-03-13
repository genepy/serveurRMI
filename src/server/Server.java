package server;





/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.Naming;

/**
 *
 * @author jfdenise
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            HelloImpl obj = new HelloImpl();

            // Bind this object instance to the name "HelloServer"
            Naming.rebind("//localhost/HelloServer", obj);

            System.out.println("HelloServer bound in registry");
        } catch (Exception e) {
            System.out.println("HelloImpl err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
