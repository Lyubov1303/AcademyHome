package by.academy.lesson21.classwork;

public class Order {
	private String orderNo;
	OrderItem[] myOrderItem;

    public Order() {
    	myOrderItem = new OrderItem[10];
    }

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
}


