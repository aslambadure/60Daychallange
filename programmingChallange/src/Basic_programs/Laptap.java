package objectclass;


import java.util.Objects;

public class Laptap {
String brand;
String processor;
int ram;
public Laptap(String brand,String processor,int ram) {
	this.brand=brand;
	this.processor=processor;
	this.ram=ram;
}
@Override
public String toString() {
	return brand;
	
}
@Override
public boolean equals(Object o) {
	Laptap l=(Laptap)o;
	if(this.brand==l.brand&&this.processor==l.processor&&this.ram==l.ram)
		return true;
	else 
		return false;
}
         @Override
public int hashCode() {
	int h=Objects.hash(brand,processor,ram);
			return h;
	
}

}
