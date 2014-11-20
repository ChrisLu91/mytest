/**
 * 
 */
package chris.design.proxy.impl;

import chris.design.proxy.MyRunnable;

/**
 * @author 卢俊铭
 *
 */
public class Proxy implements MyRunnable{
	private MyRunnable my;
	public Proxy(){
		this.my = this;
	}
	public Proxy(MyRunnable run){
		this.my = run;
	}
	public void run(){
		System.out.println("I am proxy run");
	}
	
	public void start(){
		my.run();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proxy p1 = new Proxy();
		Proxy r1 = new Proxy(new Run1());
		Proxy r2 = new Proxy(new Run2());
		p1.start();
		r1.start();
		r2.start();
	}

}
