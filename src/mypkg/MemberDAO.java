package mypkg;

public class MemberDAO {
	
	private MemberDAO() {}
	
	public static MemberDAO getInstance() {
		return LazyHolder.INSTANCE;
	}
	private static class LazyHolder{
		private static final MemberDAO INSTANCE = new MemberDAO();
	}
	
}
