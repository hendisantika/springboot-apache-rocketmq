package com.hendisantika.springbootapacherocketmq.event;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-apache-rocketmq
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/01/20
 * Time: 07.29
 */
public class CartItemEvent {
    private String itemId;
    private int quantity;

    public CartItemEvent(String itemId, int quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItemEvent{" + "itemId='" + itemId + '\'' + ", quantity=" + quantity + '}';
    }
}