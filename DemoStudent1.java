package com.te.maven;

public class DemoStudent1 {
	
	public int demostudentid;
	public String demostudentname;
	public DemoStudent1(int demostudentid, String demostudentname) {
		super();
		this.demostudentid = demostudentid;
		this.demostudentname = demostudentname;
	}
	@Override
	public String toString() {
		return "DemoStudent1 [demostudentid=" + demostudentid + ", demostudentname=" + demostudentname + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + demostudentid;
		result = prime * result + ((demostudentname == null) ? 0 : demostudentname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DemoStudent1 other = (DemoStudent1) obj;
		if (demostudentid != other.demostudentid)
			return false;
		if (demostudentname == null) {
			if (other.demostudentname != null)
				return false;
		} else if (!demostudentname.equals(other.demostudentname))
			return false;
		return true;
	}
	
	

}
