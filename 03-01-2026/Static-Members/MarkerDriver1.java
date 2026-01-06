class MarkerDriver1

{
	public static void main(String[] args) 
	{
		Marker.name="Blue";
		System.out.println(Marker.name);
		Marker.write();
		Marker.name="Red";
		System.out.println(Marker.name);//single copy execution  (once the value is replaced it cannot be taken again)
		System.out.println(Marker.name);
	}
}
