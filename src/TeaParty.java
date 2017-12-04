
public class TeaParty{
String ms = "Hello Ms. ";
String mr = "Hello Mr. ";
String sir = "Hello Sir ";
	public String welcome(String name, boolean iswomen, boolean isknighted) {
		if (iswomen == true) {
			System.out.println(ms + name);
			return ms + name;
			
		}
		if(iswomen == false && isknighted == false){
			System.out.println(mr + name);
			return mr + name;
		}
		if( isknighted == true){
			System.out.println(sir + name);
			return sir + name;
		}
		return "";
	}

}
