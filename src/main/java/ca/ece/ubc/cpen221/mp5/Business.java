package ca.ece.ubc.cpen221.mp5;

/**
 * Rep Invariant:
 * - url of one Business cannot be the same as the url of any other Business
 * - intersection of latitude and longitude must be located in the city
 * - city must be located in the state of the Business
 * - business_id of one Business cannot be the same as the business_id of any other Business
 * 
 */
public class Business {
	private boolean open; //represents if the business is still running or not
	private String url; //the the link which points to the business's page in the database
	private double latitude; //represents the geographic location of the business on the map
	private double longitude; //collection of neighborhoods a business is a part of
	private String[] neighborhoods; //string that represents each business's business ID
	private String business_id; //string that represents the name of the business
	private String name; //collection of tags that the business is associated to
	private String[] categories; //state the business is located in
	private String state; //state the business is located in
	private String type; //represents the type of datatype in the database
	private String city; //the city the business is located in
	private String full_address; //the address of the business
	
	public Business(boolean open, String url, double latitude, double longitude, 
			String[] neighborhoods,String business_id,String name, String[] categories,
			String state, String type, String city, String full_address)
	{
		this.open=open;
		this.url=url;
		this.latitude=latitude;
		this.longitude=longitude;
		this.neighborhoods=neighborhoods;
		this.business_id=business_id;
		this.name=name;
		this.categories=categories;
		this.state=state;
		this.type=type;
		this.city=city;
		this.full_address=full_address;
	}
	
	/**
	 * 
	 * @return whether open is true or false
	 */
	public boolean isOpen() {
		return open;
	}
	
	/**
	 * changes the open field of the business to status
	 * @param open
	 */
	public void setOpen(boolean open) {
		this.open = open;
	}
}
