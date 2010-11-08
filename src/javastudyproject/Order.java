/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javastudyproject;

import java.util.ArrayList;
import java.util.Date;
import javastudyproject.users.User;

/**
 *
 * @author AlonPisnoy
 */
public class Order {

    private static int runid;
    private User user;
    private Date orderDate;
    private Date deliveryDate;
    private double totalPrice;
    private ArrayList<Product> products;
    private DeliveryType deliveryType;
    private StateType state;

    //constructor
    public Order(User user, Date deliveryDate, DeliveryType deliveryType)
    {
        runid++;
        this.user = user;
        orderDate = new Date(System.currentTimeMillis());
        this.deliveryDate = deliveryDate;
        this.deliveryType = deliveryType;
        state = StateType.New;
    }

    public Order addProduct(Product product)
    {
        products.add(product);
        return this;
    }

    public void updateState(StateType state)
    {
        if (this.state != state) this.state = state;
    }

    public void updateTotalPrice(double price)
    {
        totalPrice += price;
    }

   public enum DeliveryType {Self, Shipping};
   public enum StateType {New, Pending, Ready, InProgress, Finished};
}
