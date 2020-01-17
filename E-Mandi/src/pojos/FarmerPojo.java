package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="FARMERS")
public class FarmerPojo {
	
	
	private Integer f_Id;
	
	private String f_name;
	
	private String f_adhaarId;
	
	private String f_email;
	
	private String f_contact;
	
	private String f_address;
	
	private String f_city;
	
	private String f_state;
	
	private String f_pincode;
	
	private String f_password;
	
	public FarmerPojo()
	{
		super();
		System.out.println("In Farmer default constructor");
		
	}
	
	
	public FarmerPojo(Integer f_Id, String f_name, String f_adhaarId, String f_email, String f_contact,
			String f_address, String f_city, String f_state, String f_pincode, String f_password)
	{
		super();
		this.f_Id = f_Id;
		this.f_name = f_name;
		this.f_adhaarId = f_adhaarId;
		this.f_email = f_email;
		this.f_contact = f_contact;
		this.f_address = f_address;
		this.f_city = f_city;
		this.f_state = f_state;
		this.f_pincode = f_pincode;
		this.f_password = f_password;
	}


	public void setF_Id(Integer f_Id) 
	{
		this.f_Id = f_Id;
	}
	
	public void setF_adhaarId(String f_adhaarId)
	{
		this.f_adhaarId = f_adhaarId;
	}
	
	public void setF_email(String f_email) 
	{
		this.f_email = f_email;
	}
	
	public void setF_contact(String f_contact)
	{
		this.f_contact = f_contact;
	}
	
	public void setF_address(String f_address)
	{
		this.f_address = f_address;
	}
	
	public void setF_city(String f_city) 
	{
		this.f_city = f_city;
	}
	
	public void setF_state(String f_state)
	{
		this.f_state = f_state;
	}
	
	public void setF_pincode(String f_pincode) 
	{
		this.f_pincode = f_pincode;
	}
	
	public void setF_password(String f_password)
	{
		this.f_password = f_password;
	}
	
	public void setF_name(String f_name)
	{
		this.f_name = f_name;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getF_Id() 
	{
		return f_Id;
	}
	
	@NotEmpty(message = "Name may not be Null")
	@Column(name="FARMER_NAME",length = 60,nullable = false)
	public String getF_name() 
	{
		return f_name;
	}




	
	@NotNull
	@Column(name="ADHAAR_ID",length = 12,unique = true, nullable = false)
	public String getF_adhaarId() {
		return f_adhaarId;
	}
	
	@Column(name="FARMER_EMAIL",length = 50)
	public String getF_email()
	{
		return f_email;
	}
	@Size(min = 10,max = 13)
	@Column(name="FARMER_CONTACT",unique = true, nullable = false)
	public String getF_contact() {
		return f_contact;
	}
	
	
	@Column(name="FARMER_ADDRESS")
	public String getF_address()
	{
		return f_address;
	}
	
	@Column(name="FARMER_CITY",length = 20)
	public String getF_city() 
	{
		return f_city;
	}
	
	@Column(name="FARMER_STATE",length = 20)
	public String getF_state()
	{
		return f_state;
	}
	
	@Column(name="FARMER_PINCODE",length = 6)
	public String getF_pincode()
	{
		return f_pincode;
	}
	
	@NotNull
	@Column(name="FARMER_PASSWORD",nullable = false)
	public String getF_password()
	{
		return f_password;
	}
	
	
	
	@Override
	public String toString() 
	{
		return "FarmerPojo [f_Id=" + f_Id + ", f_adhaarId=" + f_adhaarId + ", f_email=" + f_email + ", f_contact="
				+ f_contact + ", f_address=" + f_address + ", f_city=" + f_city + ", f_state=" + f_state
				+ ", f_pincode=" + f_pincode + "]";
	}
	

}
