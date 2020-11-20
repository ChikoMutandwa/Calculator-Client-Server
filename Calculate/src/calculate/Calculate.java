package calculate;

import java.rmi.*;

/**
 *
 * @author chiko
 *
 * CLient.java, Server.java, & Calculate.java
 */
public interface Calculate extends Remote {

    public int add(int num1, int num2) throws RemoteException;

    public int subtract(int num1, int num2) throws RemoteException;

    public int divide(int num1, int num2) throws RemoteException;

    public int multiply(int num1, int num2) throws RemoteException;

}
