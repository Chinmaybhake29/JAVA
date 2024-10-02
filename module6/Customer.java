package module6;

public class Customer 
{
        private
        	int custid;
            String name;
            int mobileno;
            String address;
        public Customer()
        {
        	custid=0;
        	name=null;
        	mobileno=0;
        	address=null;
        }
		public Customer(int custid, String name, int mobileno, String address) {
			super();
			this.custid = custid;
			this.name = name;
			this.mobileno = mobileno;
			this.address = address;
		}
		public int getCustid() {
			return custid;
		}
		public void setCustid(int custid) {
			this.custid = custid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMobileno() {
			return mobileno;
		}
		public void setMobileno(int mobileno) {
			this.mobileno = mobileno;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Customer [custid=" + custid + ", name=" + name + ", mobileno=" + mobileno + ", address=" + address
					+ "]";
		}
		
}
