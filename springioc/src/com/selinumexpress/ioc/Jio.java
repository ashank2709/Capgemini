package com.selinumexpress.ioc;

public class Jio  implements Sim{

		
		public Jio() {
			System.out.println("jio constr called");
		}

		@Override
		public void calling() {
			
			System.out.println("calling using jio sim");
		}

		@Override
		public void data() {
			System.out.println("browsing internet using jio sim");
			
		}


}
