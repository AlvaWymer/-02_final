class Member{ //员工
	// 两个字段
	private String memId;
	private String memName;

	private Dept dept;

	// 构造方法
	public Member(){}
	public Member(String memId,String memName){
			this.memId = memId;
			this.memName = memName;
	}

	public void setDept(Dept dept){
		this.dept = dept ;
	}
	public Dept getDept(){
		return this.dept;
	}

	public String getMemInfo(){
		return "【Member】memId="+memId+",memName="+memName;
	}



}
class Dept{ //部门
	private String deptId;
	private String deptName;

	private Member[] members;

	private Role role;

	// 构造方法
	public Dept(){}
	public Dept(String deptId,String deptName){
		this.deptId = deptId;
		this.deptName = deptName ;
	}

	public void setMember(Member[] members){
		this.members = members;
	}
	public Member[] getMember(){
		return this.members;
	}

	public void setRole(Role role){
		this.role = role;
	}
	public Role getRole(){
		return this.role;
	}
	public String getDeptInfo(){
		return "【Dept】deptId="+deptId+",deptName="+deptName;
	}

}
class Role{//角色
	private String roleId;
	private String roleName;

	private Dept[] depts;
	private Permission[] permissions;

	public Role(){}
	public Role(String roleId,String roleName){
		this.roleId = roleId;
		this.roleName = roleName ;
	}

	public void setDept(Dept[] depts){
		this.depts = depts;
	}
	public Dept[] getDept(){
		return this.depts;
	}
	public void setPermission(Permission[] permissions){
		this.permissions = permissions;
	}
	public Permission[] getPermission(){
		return permissions;
	}
	public String getRoleInfo(){
		return "【Role】roleId="+roleId+",roleName="+roleName;
	}


}
class Permission{//权限
	private String perId;
	private String perName;
	private String perMark;

	private Role[] roles;

	public Permission (){}
	public Permission (String perId,String perName,String perMark){
		this.perId=perId;
		this.perName = perName;
		this.perMark = perMark;
	}

	public void setRole(Role[] roles){
		this.roles = roles;

	}
	public Role[] getRole(){
		return this.roles;
	}


	public String getPermissInfo(){
		return "【Permission】perId="+perId+",perName="+perName+",perMark="+perMark;
	}





}

public class TestThree{
	public static void main(String[] args) {
		//部门 和员工
		Dept dept1 = new Dept("001","生产部");
		Dept dept2 = new Dept("002","销售部");
		Dept dept3 = new Dept("003","技术部");


		Member mem1 = new Member("001","jack");
		Member mem2 = new Member("002","ellen");
		Member mem3 = new Member("003","eric");
		Member mem4 = new Member("004","Paul");
		Member mem5 = new Member("005","Jade");



		dept1.setMember(new Member[]{mem1,mem4});
		dept2.setMember(new Member[]{mem2,mem3});
		dept3.setMember(new Member[]{mem5});

		mem1.setDept(dept1);
		mem2.setDept(dept2);
		mem3.setDept(dept2);
		mem4.setDept(dept1);
		mem5.setDept(dept3);

		// 部门和角色
		Role role1 = new Role("1000","员工");
		Role role2 = new Role("1001","经理");

		role1.setDept(new Dept[]{dept1,dept3});
		role2.setDept(new Dept[]{dept2});

		dept1.setRole(role1);
		dept2.setRole(role2);
		dept3.setRole(role1);


		// 角色和权限 互相塞数据
		Permission per1 = new Permission("88001","广告","编辑");
		Permission per2 = new Permission("88002","文件","修改");
		Permission per3 = new Permission("88003","招聘","删除");
		Permission per4 = new Permission("88004","招聘","编辑");
		Permission per5 = new Permission("88005","广告","增加");


		per1.setRole(new Role[]{role1});
		per2.setRole(new Role[]{role1,role2});
		per3.setRole(new Role[]{role2});
		per4.setRole(new Role[]{role2});
		per5.setRole(new Role[]{role1});

		role1.setPermission(new Permission[]{per1,per2,per5});
		role2.setPermission(new Permission[]{per3,per4});


// ==============================第一问=============================================
		System.out.println("==========第一问=======");
		System.out.println(mem1.getMemInfo());
		System.out.println("\t|-"+mem1.getDept().getDeptInfo());
		System.out.println("\t|-"+mem1.getDept().getRole().getRoleInfo());
		// System.out.println(mem1.getDept().getRole().getPermission().length) ;

		for(int x = 0 ; x < mem1.getDept().getRole().getPermission().length; x++){
			System.out.println("\t\t|-"+mem1.getDept().getRole().getPermission()[x].getPermissInfo());
		}


// ================================第二问===========================================
		System.out.println("==========第二问=======");
		System.out.println(role1.getRoleInfo());
		// System.out.println(role2.getDept().length);
		for (int x = 0; x < role1.getDept().length; x++) {
			System.out.println("\t\t|-"+role1.getDept()[x].getDeptInfo());
			
		}
// ================================第三问===========================================
		System.out.println("==========第三问=======");
		// System.out.println(per2.getRole().length);
		for (int x = 0; x < per2.getRole().length ; x++ ) {
			System.out.println(per2.getRole()[x].getRoleInfo());
			 for(int y = 0 ; y < per2.getRole()[x].getDept().length; y++){
			 	  System.out.println("\t"+per2.getRole()[x].getDept()[y].getDeptInfo());

			 	  for (int z = 0; z < per2.getRole()[x].getDept()[y].getMember().length ;z++ ) {
			 	  	System.out.println("\t\t"+per2.getRole()[x].getDept()[y].getMember()[z].getMemInfo());
			 	  	
			 	  }

			 }
			
		}






		

















		
	}

}