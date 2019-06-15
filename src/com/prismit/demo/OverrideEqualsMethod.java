package com.prismit.demo;

public class OverrideEqualsMethod {

	
		public boolean equals(Object obj) {
		    if (obj == null) return false;
		    if (!(obj instanceof hashcodeExample))
		        return false;
		    if (obj == this)
		        return true;
		    return this.getId() == ((hashcodeExample) obj).getId();
		}

		private int getId() {
			// TODO Auto-generated method stub
			return 0;
		}
		

}
