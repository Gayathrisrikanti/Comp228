package exercise1;

public class Singers {
     //IN
		  String id;
		  String name;
		  String address;
		  String Dateofbirth;
		  String Numberofalbumspublished;
//condector 
		public Singers() 
		{
			
		}
		 public Singers( String id  )
			{	
				this.id=id;
				
			}	 public Singers(String id,String name,String address, String Dateofbirth, String Numberofalbumspublished  )
			{
				
				this.Numberofalbumspublished=Numberofalbumspublished;
				
			} public Singers( String Dateofbirth, String Numberofalbumspublished  )
			{
				
				
				this.Dateofbirth=Dateofbirth;
				this.Numberofalbumspublished=Numberofalbumspublished;
				
			} public Singers(String address, String Dateofbirth, String Numberofalbumspublished  )
			{
				
				
				this.address=address;
				this.Dateofbirth=Dateofbirth;
				this.Numberofalbumspublished=Numberofalbumspublished;
				
			}
			// to show the values 
		 public Singers(String name,String address, String Dateofbirth, String Numberofalbumspublished  )
			{
				
			
				this.name=name;
				this.address=address;
				this.Dateofbirth=Dateofbirth;
				this.Numberofalbumspublished=Numberofalbumspublished;
				
			}
		//•	Create Setters and getters //
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getDateofbirth() {
			return Dateofbirth;
		}

		public void setDateofbirth(String dateofbirth) {
			Dateofbirth = dateofbirth;
		}

		public String getNumberofalbumspublished() {
			return Numberofalbumspublished;
		}

		public void setNumberofalbumspublished(String numberofalbumspublished) {
			Numberofalbumspublished = numberofalbumspublished;
		}
			
		}
		



