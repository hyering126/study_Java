package package_14;

import java.io.Serializable;

public class Member implements Serializable {
	private static final long serialVersonUID = -62228456102671924L;
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() { return id + ": " + name; }

}
