/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author Student
 */
public class LAB5 {

    public static void main(String[] args) {
        System.out.println("Main method call method doThis()");
        try {
            doThis();
        } catch (Exception e) {
            System.out.println("Main method receive exception " + e.getMessage());
        }
    }

    public static void doThis() throws Exception {
        System.out.println("Method doThis() call method doThat()");
        doThat();
    }

    public static void doThat() throws Exception {
//        throw new Exception("Hello Exception");
        System.out.println(1/0);

    }

}
