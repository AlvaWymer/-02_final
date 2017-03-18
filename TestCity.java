class Pro{
	private String proId;
	private String proName;
	private City[] citys;

	public void setCity(City[] citys){
		this.citys = citys;
	}

	public City[] getCity(){
		return this.citys;
	}

	public Pro(){}
	public Pro(String proId,String proName){
		this.proId = proId;
		this.proName = proName;
	}

	public String getInfo(){
	return "【Pro】proId="+proId+"proName="+proName;
	}
}
class City{
	private String cityId;
	private String cityName;
	private Pro pro;


	public City(){}
	public City(String cityId,String cityName){
		this.cityId = cityId;
		this.cityName = cityName;
	}
	public void setPro(Pro pro){
		this.pro = pro;

	}
	public Pro getPro(){
		return this.pro;
	}
	public String getInfo(){
		return "【City】cityId="+cityId+"cityName="+cityName;
	}
}
public class TestCity{
	public static void main(String[] args){
		Pro pro = new Pro("001","山东省");

		City city1 = new City("0531","济南市");
		City city2 = new City("0532","青岛市");
		City city3 = new City("0536","潍坊市");
		City city4 = new City("0633","日照市");

		pro.setCity(new City[]{city1,city2,city3,city4});


		city1.setPro(pro);
		city2.setPro(pro);
		city3.setPro(pro);
		city4.setPro(pro);

		for (int x = 0; x < pro.getCity().length ; x++) {
			System.out.println(pro.getCity()[x].getInfo());
			
		}







	}
	
}