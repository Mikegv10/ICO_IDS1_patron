package ico.Aragon.factory;


public class MobileFactory {
    public static Mobile createMobile(String type){
		if(type.equals(Mobile.IPHONE)){
			return new IPhone(2, "A9", "A9 GPu");
		}else if(type.equals(Mobile.SONY)){
			return new Sony(2,"ARM");
		}else if(type.equals(Mobile.SAMSUNG)){
			return new Samsung(4,"Intel");
		}else if(type.equals(Mobile.NOKIA)){
			return new Nokia(5.5, "Qualcomm", "Android");
                }else if(type.equals(Mobile.MOTOROLA)){
			return new Motorola(4, "SnapDragon", "4G");
                }else if(type.equals(Mobile.ZTE)){
			return new ZTE(2, "MediaTek 6737", 1894.66);
                }
                else{
			return null;
		}
	}
}
