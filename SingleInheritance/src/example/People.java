package example;
import java.util.*;
public class People {
	private int pid;
	private String pname;
	public People()
	{
		pid=121;
		pname="avinash";
	}
	
	public People(int pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}

 public String toString()
 {
	 return "Person id: "+pid+"Person name: "+pname;
 }
}
