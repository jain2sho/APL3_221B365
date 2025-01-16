

public class LE0 {
		int age ;
		String name ;
		public String getname() {
			return this.name;
		}
		public int getage() {
			return this.age;
		}
		public void setname(String name) {
			this.name = name;
		}
		public void setage(int age) {
			this.age = age;
		}
	public static void main(String[] args) {
	    juet obj = new juet();
	    obj.setname("jain ji");
	    obj.setage(20);
		System.out.println(" age = " + obj.getage() + ", name = " + obj.getname() );
	}
}
