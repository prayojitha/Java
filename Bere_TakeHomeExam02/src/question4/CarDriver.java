/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author keerthi prayojitha bere
 */
public class CarDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 4:");
        Car car = new Bmw("Dark Graphite Metallic","X5","Sports");//polymorphic substitution
        System.out.println(car);//jvm deciding at run-time which method toString() to invoke -- late binding polymorphism
        
    }
    
}
