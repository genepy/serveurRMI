package server;





/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import interface1.Hello;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {

    public HelloImpl() throws RemoteException {
    }

    public String sayHello() {
        return "Hello World!";
    }
}