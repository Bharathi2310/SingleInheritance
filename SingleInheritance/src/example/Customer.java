package example;

public class Customer extends People {

	private int cid;
	private int orderid;
	private float price;
	public Customer()
	{
		super();
		cid=121;
		orderid=2345;
		price=670.6f;
	}
	public Customer(int pid, String pname, int cid, int orderid, float price) {
		super(pid, pname);
		this.cid = cid;
		this.orderid = orderid;
		this.price = price;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String toString() {
		return "Person name: "+super.getPname()+"\nPersonid: "+super.getPid()+"\nCustid: "+cid+"\norderid: "+orderid+"\nPrice: "+price;
	}

}
