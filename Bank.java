import java.util.*;
class Bank
{
        private int ifsc,accno ;
        private String cname,bname,accname,acctype;
        
		public Bank() {
			super();
			this.ifsc = ifsc;
			this.cname = cname;
			this.bname = bname;
			this.accno = accno;
			this.accname = accname;
			this.acctype = acctype;
		}

		public int getIfsc() {
			return ifsc;
		}

		public void setIfsc(int ifsc) {
			this.ifsc = ifsc;
		}

		public int getAccno() {
			return accno;
		}

		public void setAccno(int accno) {
			this.accno = accno;
		}

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getBname() {
			return bname;
		}

		public void setBname(String bname) {
			this.bname = bname;
		}

		public String getAccname() {
			return accname;
		}

		public void setAccname(String accname) {
			this.accname = accname;
		}

		public String getAcctype() {
			return acctype;
		}

		public void setAcctype(String acctype) {
			this.acctype = acctype;
		}
}